<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="com.marco.bean.UserBean" id="userBean" scope="session"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Logout</title>
</head>
<body>
<% 
	if(userBean.isLogged()){
		userBean.logout(); 
%>
	<h2>User successfully logout</h2>
<%
	} else {
%>
	<h2>No user is logged</h2>
<%
	}
%>
<br>
<form action="Login" id="returnForm" method="post">
	<input type="button" name="returnButton" value="Return">
</form>

</body>
</html>