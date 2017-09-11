<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

<form name="userForm" id="userFormId" action="User" method="post">
<label id="usernameLabel">Insert User Name: </label>
<input type="text" name="username">
<br>
<label id="passwordLabel">Insert Password: </label>
<input type="password" name = "password">
<br>
<input type="submit" value="Login!">
</form>
<br>
<form name="signUpForm" id="signUpFormId" action="SignUp">
<label id="signUpLabel">Click Here to Register!</label>
<input type="submit" value="Sign Up!">
</form>

</body>
</html>
