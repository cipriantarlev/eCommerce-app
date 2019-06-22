<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forbidden</title>
<link rel="stylesheet" href="/css/style_forbidden.css" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Limelight"
	rel="stylesheet">
<link rel="stylesheet" href="/css/style_welcome.css" type="text/css">
</head>
<body>

	<nav>
		<ul>
			<li><a href="/homepage">Home</a></li>
			<li><a href="#">About</a></li>
			<li><a href="/product">Our Products</a></li>
			<sec:authorize access="hasRole('ADMIN')">
				<li><a href="/admin">Admin</a></li>
			</sec:authorize>
			<li style="float: right;">
				<form action="logout" method="post">
					<input type="submit" value="Sign out" /> <input type="hidden"
						name="${_csrf.parameterName}" value="${_csrf.token}" />
				</form>
			</li>
			<li id="welcome" style="float: right;">Welcome, <b><sec:authentication
						property="principal.username" /></b></li>
		</ul>
	</nav>

	<div class='hover'>
		<div class='background'>
			<div class='door'>403</div>
			<div class='rug'></div>
		</div>
		<div class='foreground'>
			<div class='bouncer'>
				<div class='head'>
					<div class='neck'></div>
					<div class='eye left'></div>
					<div class='eye right'></div>
					<div class='ear'></div>
				</div>
				<div class='body'></div>
				<div class='arm'></div>
			</div>
			<div class='poles'>
				<div class='pole left'></div>
				<div class='pole right'></div>
				<div class='rope'></div>
			</div>
		</div>
	</div>



</body>
</html>