<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>내장 객체 - response</title>
</head>
<body>
<%
String id = request.getParameter("user_id");
String pwd = request.getParameter("user_pw"); 
if (id.equalsIgnoreCase("web") && pwd.equalsIgnoreCase("WEb")) {
    response.sendRedirect("ResponseWelcome.jsp");
}
else {
    request.getRequestDispatcher("ResponseMain.jsp?loginErr=1").forward(request, response); 
}
%>
</body>
</html>