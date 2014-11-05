<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Login User</title>
</head>
<body>
	<form action="loginUser.shop" method="post">
		<input type="text" name="userId" />
		<input type="text" name="userPwd" />
		<input type="submit" value="로그인" />
	</form>
</body>
</html>