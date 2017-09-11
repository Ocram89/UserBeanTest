<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean class="com.marco.bean.User" id="userBean" scope="session"/>
<jsp:setProperty name="userBean" property="*"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	userBean.login();
	if(!userBean.isLogged()){
%>
	<jsp:forward page="ErrorPage">
		<jsp:param value="wrong username or password" name="errorMessage"/>
	</jsp:forward>
<%
	}
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Information Page</title>
</head>
<body>
<p><c:out value="value= ${1+2+3}"/>
<h1>User Info</h1>
<br>
<h3>Username: </h3>
<p><jsp:getProperty name="userBean" property="username"/>
<br>
<h3>Password: </h3>
<p><jsp:getProperty name="userBean" property="password"/>
<br>
<h3>First Name: </h3>
<p><jsp:getProperty name="userBean" property="firstName"/>
<br>
<h3>Last Name: </h3>
<p><jsp:getProperty name="userBean" property="lastName"/>
<br>
<h3>Age: </h3>
<p><jsp:getProperty name="userBean" property="age"/>
<br>

<form action="HelloPage">
<input type="submit" value="Go To Hello Page"/>
</form>
<form action="Logout">
<input type="submit" value="Logout"/>
</form>
</body>
</html>