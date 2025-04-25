package jp.co.aforce.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.UserBean;
import jp.co.aforce.dao.UserDAO;

@WebServlet("/login")
//@WebServlet(urlPatterns = { "/jp.co.aforce.servlet/login" })
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("member_id");
		String password = request.getParameter("password");

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		UserDAO dao = new UserDAO();
		UserBean user = null;

		PrintWriter out = response.getWriter();

		try {
			user = dao.loginCheck(id, password);
		} catch (Exception e) {

			// TODO 自動生成された catch ブロック
			e.printStackTrace(out);
		}

		if (user != null) {
			// 実行結果が取得できた場合、ユーザ情報を画面に返却する。
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("user-menu.jsp");
		} else {
			// 実行結果が0件の場合、ログインエラー画面に遷移
			response.sendRedirect(request.getContextPath() + "/views/login-error.jsp");
		}
	}
}
