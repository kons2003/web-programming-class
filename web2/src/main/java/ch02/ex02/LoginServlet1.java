package ch02.ex02;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login1")
public class LoginServlet1 extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("init() 호출");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		System.out.println("계정:" + user_id);
		System.out.println("암호:" + user_pw);
	}

	@Override
	public void destroy() {
		System.out.println("destroy() 호출");
	}
}