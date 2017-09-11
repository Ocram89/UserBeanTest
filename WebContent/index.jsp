<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:useBean class="com.marco.bean.User" id="userBean" scope="session"/>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>Insert title here</title>
</head>
<body>

<h1>Starting Page</h1>
redirecting...

<% if(!userBean.isLogged()){ %>
	<jsp:forward page="Login">
		<jsp:param name="startingPage" value="index.jsp"/>
	</jsp:forward>

<% } else { %>
	<jsp:forward page="User"/>
<% } %>

</body>
</html>