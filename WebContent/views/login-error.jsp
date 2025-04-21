<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<title>ログインエラー</title>
</head>
<body>
	<h2>ログイン失敗</h2>
	<p>IDもしくはパスワードが違います</p>
<%--	<form action="${pageContext.request.contextPath}/views/login-in.jsp"> --%>
	<form action="login-in.jsp">
		<input type="submit" value="ログイン画面へ戻る">
	</form>
</body>
</html>
