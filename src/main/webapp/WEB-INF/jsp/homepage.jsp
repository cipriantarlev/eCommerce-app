<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<title>Home page</title>
<link rel="stylesheet" href="/css/style_welcome.css" type="text/css">
</head>
<body>

	<nav>
		<ul>
			<li><a href="/homepage">Home</a></li>
			<li><a href="#">About</a></li>
			<li><a href="/product">Our Products</a></li>
			<li style="float: right;">
				<form action="logout" method="post">
					<input type="submit" value="Sign out" /> <input type="hidden"
						name="${_csrf.parameterName}" value="${_csrf.token}" />
				</form>
			</li>
			<li id="welcome"style="float: right;">Welcome, <b><sec:authentication property="principal.username" /></b></li>
		</ul>
	</nav>

	<div id="content">
		<h1>Welcome to our shop</h1>
		<h4>The best shop in the entire world</h4>
	</div>

	<footer>
		<div class="footerLeft">
			<a href="#">Privacy</a> <a href="#">Contact us</a>
		</div>

		<div class="footerRight">All rights Reserver &copy 2019</div>
	</footer>
</body>
</html>