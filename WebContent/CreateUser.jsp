<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="com.marco.bean.User" id="userBean" scope="session"/>
<jsp:setProperty name="userBean" property="*"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Creating User</title>
</head>
<body>
<% if(userBean.save()){ %>
<jsp:forward page="User.jsp"/>
<% } else { %>
<jsp:forward page="ErrorPage.jsp">
	<jsp:param value="Username already taken" name="errorMessage"/>
</jsp:forward>
<% } %>
</body>
</html>