<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Home page</title>
<link rel="stylesheet" href="/css/style_checkout.css" type="text/css">
</head>
<body>

	<nav>
		<ul>
			<li><a href="/homepage">Home</a></li>
			<li><a href="/home-about">About</a></li>
			<li><a href="/product">Our Products</a></li>
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
	<div class="addressbar" style="height: 410px">
		<h1>Order Form</h1>
		<form action="/checkoutsuccess">
			<p>First name:</p>
			<input type="text" name="firstname" placeholder="Enter First name">
			<p>Last name:</p>
			<input type="text" name="lastname" placeholder="Enter Last name">
			<p>City:</p>
			<input type="text" name="city" placeholder="Enter City">
			<p>Street (including zip code):</p>
			<input type="text" name="street" placeholder="Enter Street">
			<p>Phone number:</p>
			<input type="text" name="street" placeholder="Enter Phone number">
			<input type="submit" value="Submit">
		</form>
	</div>
	<footer>
		<div class="footerLeft">
			<a href="/home-privacy">Privacy</a>
			<a href="/home-contact">Contact us</a>
		</div>

		<div class="footerRight">All rights Reserved &copy 2019</div>
	</footer>
</body>
</html>