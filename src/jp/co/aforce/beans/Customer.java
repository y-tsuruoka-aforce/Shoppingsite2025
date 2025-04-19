package jp.co.aforce.beans;

// 顧客情報を格納するbean
public class Customer implements java.io.Serializable {

	// フィールドは作成したテーブルに合わせる。
	private int member_id;
	private String password;
	private int last_name;
	private int first_name;
	private int address;
	private int mail_address;

	// getter, setter
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getLast_name() {
		return last_name;
	}
	public void setLast_name(int last_name) {
		this.last_name = last_name;
	}
	public int getFirst_name() {
		return first_name;
	}
	public void setFirst_name(int first_name) {
		this.first_name = first_name;
	}
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	public int getMail_address() {
		return mail_address;
	}
	public void setMail_address(int mail_address) {
		this.mail_address = mail_address;
	}

}
