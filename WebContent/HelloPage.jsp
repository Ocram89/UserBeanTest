<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="com.marco.bean.UserBean" id="userBean" scope="session"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello!</title>
</head>
<body>
<% if(!userBean.isLogged()){ %>
	<jsp:forward page="ErrorPage">
		<jsp:param value="User not logged" name="errorMessage"/>
	</jsp:forward>
<% } %>
Hello <jsp:getProperty name="userBean" property="firstName"/>! <br>
You are <jsp:getProperty name="userBean" property="age"/> years old!

</body>
</html>