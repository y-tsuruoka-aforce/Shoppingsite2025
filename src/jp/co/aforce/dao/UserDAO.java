package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.UserBean;

public class UserDAO extends DAO {

	// 会員情報登録のメソッドも入れるので、メソッド名とDAO名を設計書に寄せる。
	// メソッド名=servlet名
	// loginCheck
	// DAO設計書_UserDAO　UserDAO


	/**
	 * 4/21
	 * 出戻りしたが、一応作成完了。
	 * DB接続と画面遷移URL諸々が動かない。
	 * ファイル名、Dao名、メソッド名辺りの認識が合っているか古賀さんと確認。★
	 *
	 *
	 *
	 * */

	// ログイン用メソッド
	public UserBean loginCheck(String member_id, String password) throws Exception {
		UserBean user = null;

		// コネクション
		// TODO DB接続のxml設定をしていない！！！
		Connection con = getConnection();
		// SQL
		PreparedStatement st;

		// SQL設定
		st = con.prepareStatement(
				"select * from customer where member_id = ? and password = ?"
				);

		// 検索条件を設定
		st.setString(1, member_id);
		st.setString(2, password);

		// SQL実行
		ResultSet rs = st.executeQuery();

		// 実行結果を格納
		while (rs.next()) {
			user = new UserBean();
			user.setMemberId(rs.getInt("member_id"));
			user.setPassword(rs.getString("password"));
			user.setLastName(rs.getString("last_name"));
			user.setFirstName(rs.getString("first_name"));
			user.setAddress(rs.getString("address"));
			user.setMailAddress(rs.getString("mail_address"));
		}
		return user;
	}


}
