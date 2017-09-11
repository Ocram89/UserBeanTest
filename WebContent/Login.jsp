<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean class="com.marco.bean.UserBean" id="userBean" scope="session"/>
<jsp:setProperty name="userBean" property="*"/>
<%
	if(request.getParameter("login") != null){
		if(userBean.login()){
			%>
			<jsp:forward page="UserInfo">
			<%
		}
	}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
<h1> User Login</h1>

<br><br>
<script type="text/javascript">window.alert("Hello World!");</script>

<form name="userForm" id="userFormId" action="Login" method="post">
<label id="usernameLabel">Insert User Name: </label>
<input type="text" name="username" required>
<br>
<label id="passwordLabel">Insert Password: </label>
<input type="password" name = "password" required>
<br>
<input type="submit" name="login" value="Login!">
</form>
<br>
<form name="signUpForm" id="signUpFormId" action="SignUp">
<label id="signUpLabel">Click Here to Register!</label>
<input type="submit" value="Sign Up!">
</form>

</body>
</html>
