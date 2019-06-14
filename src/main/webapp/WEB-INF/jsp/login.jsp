<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head th:include="layout :: head(title=~{::title},links=~{})">
<title>Login page</title>
<link rel="stylesheet" type="text/css" href="/css/style_login.css">
</head>
<body>
	<div class="loginbox" style="height: 410px">
		<img src="/css/avatar.jpg" class="avatar">
		<h1>Login Here</h1>

		<c:url value="/login" var="loginUrl" />
		<form name="form" th:action="@{/login}" method="post">


			<c:if test="${param.error != null}">
				<p style="color:red">Invalid username or password!</p>
			</c:if>
			<c:if test="${param.logout != null}">
				<p style="color:darkorange">You have been logged out!</p>
			</c:if>


			<p>Username</p>
			<input type="text" name="username" placeholder="Enter Username">
			<p>Password</p>
			<input type="password" name="password" placeholder="Enter Password">
			<input type="submit" name="" value="Login"> <input
				type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<a href="/register">Don'thave an account?</a><br>
			<a href="/">Back to welcome page</a>
		</form>
	</div>

</body>

</html>