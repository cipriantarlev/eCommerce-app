<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
			<li><a href="/">Home</a></li>
			<li><a href="/about">About</a></li>
			<li><a href="/products">Our Products</a></li>
			<li style="float: right;"><a href="/register">Register</a></li>
			<li style="float: right;"><a href="/login">Sign in</a></li>
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
    <a class="btn" href="/contact-sent">Send us</a>
  </div>
  
  <footer>
		<div class="footerLeft">
			<a href="/privacy">Privacy</a>
			<a href="/contact">Contact us</a>
		</div>

		<div class="footerRight">
			All rights Reserved &copy 2019
		</div>
	</footer>
</body>
</html>