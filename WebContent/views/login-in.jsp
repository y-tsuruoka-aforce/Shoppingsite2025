<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>ログイン</title></head>
<body>
  <h2>ログイン画面</h2>
<%--① --%> <%-- <form action="login" method="post"> --%>
<%--② --%>  <form method="post">
    <p>ID: <input type="text" name="member_id"></p>
    <p>パスワード: <input type="password" name="password"></p>
<%--① --%><%--    <p><input type="submit" value="ログイン" formaction="../jp.co.aforce.servlet/login"></p> --%>
 <%--② --%>    <p><input type="submit" value="ログイン" formaction="${pageContext.request.contextPath}/login"></p>
  </form>


  <%-- 新規会員登録フォーム遷移ボタン --%>
    <form action="register.jsp">
    <p><input type="submit" value="新規会員登録はこちら"></p>
  </form>
</body>
</html>

