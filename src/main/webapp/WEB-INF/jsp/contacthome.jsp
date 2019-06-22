<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact us</title>

<link rel="stylesheet" href="/css/style_contactus.css" type="text/css">
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

  <div class="contact-form">
    <h1>Contact us</h1>
    <div class="textb">
      <label>Full Name: </label>
      <input type="text" placeholder="Enter your full name">
    </div>
    <div class="textb">
      <label>Email: </label>
      <input type="email" placeholder="Enter your Email">
    </div>
    <div class="textb">
      <label>Phone Number: </label>
      <input type="text" placeholder="Enter your phone number">
    </div>
    <div class="textb">
      <label>Your Message: </label>
      <textarea></textarea>
    </div>
    <a class="btn" href="/home-contact-sent">Send us</a>
  </div>
  
  <footer>
		<div class="footerLeft">
			<a href="/home-privacy">Privacy</a>
			<a href="/home-contact">Contact us</a>
		</div>

		<div class="footerRight">
			All rights Reserved &copy 2019
		</div>
	</footer>
</body>
</html>