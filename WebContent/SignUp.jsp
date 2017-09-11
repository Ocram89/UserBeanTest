<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="com.marco.bean.UserBean" id="userBean" scope="session"/>
<jsp:setProperty property="*" name="userBean"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign Up</title>
</head>
<body>
<%
	if(request.getParameter("save") != null){	
		if(userBean.save()){
			%>
			<jsp:forward page="UserInfo"/>
			<%
		}
		else{
			%>
			<p style="color:red;font-size:200%;">The chosen username is already taken</p>
			<%
		}
	}
%>
<form action="SignUp" method="post">
<br>
<label>Insert Username</label>
<input type="text" name="username"/>
<br>
<label>Insert Password</label>
<input type="password" name="password"/>
<br>
<label>Insert First Name</label>
<input type="text" name="firstName"/>
<br>
<label>Insert Last Name</label>
<input type="text" name="lastName"/>
<br>
<label>Insert Age</label>
<input type="text" name="age"/>
<br>
<br><hr><br>
<input type="submit" name="save" value="Register!">
</form>
</body>
</html>