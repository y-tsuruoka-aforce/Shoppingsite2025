<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<title>会員情報</title>
</head>
<body>
	<h2>ようこそ、${user.first_name} さん！</h2>

	<form action="edit.jsp" method="get">
		<input type="submit" value="修正">
	</form>
	<form action="delete.jsp" method="get">
		<input type="submit" value="削除">
	</form>
	<a href="login-in.jsp">ログアウト</a>


</body>
</html>