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
			<li><a href="/home-about">About</a></li>
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
			<li id="welcome"style="float: right;">Welcome, <b><sec:authentication property="principal.username" /></b></li>
		</ul>
	</nav>
<fieldset>
	
	<h2>About us</h2>
	
<p>Welcome to My Shop SRL, your number one source for all things that you need. We're dedicated to providing you the very best of new technologies, with an emphasis on quality, speed, quantity.</p>


<p>Founded in 2019 by Ciprian Tarlev, My Shop SRL has come a long way from its beginnings in Bucharest. When Ciprian  first started out, his passion for new technologies drove them to start their own business.</p>


<p>We hope you enjoy our products as much as we enjoy offering them to you. If you have any questions or comments, please don't hesitate to contact us.</p>


<p>Sincerely,<br>

Ciprian Tarlev</p>
</fieldset>


	<footer>
		<div class="footerLeft">
			<a href="/home-privacy">Privacy</a> 
			<a href="/home-contact">Contact us</a>
		</div>

		<div class="footerRight">All rights Reserved &copy 2019</div>
	</footer>
</body>
</html>