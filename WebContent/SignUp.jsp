<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="CreateUser" method="post">
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
<input type="submit" value="Register!">
</form>
</body>
</html>