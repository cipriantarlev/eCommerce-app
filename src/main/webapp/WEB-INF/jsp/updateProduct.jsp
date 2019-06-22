<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
			<li><a href="#">About</a></li>
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
	<div class="addressbar" style="height: 370px">
		<h1>Add Product</h1>
		<form:form action="/create-product" method="post" modelAttribute="product">
			<form:input type="hidden" path="id"/>
			<p>Name:</p>
			<form:input type="text" path="name" placeholder="Enter Product Name" required="required"/>
			<p>Type:</p>
			<form:input type="text" path="type" placeholder="Enter Product Type" required="required"/>
			<p>Price:</p>
			<form:input type="text" path="price" placeholder="Enter Product Price" required="required"/>
			<p>Stoc:</p>
			<form:input type="text" path="stoc" placeholder="Enter Product Stoc" required="required"/>
			<input type="submit" value="Submit"/>
		</form:form>
	</div>
	<footer>
		<div class="footerLeft">
			<a href="/home-privacy">Privacy</a> <a href="#">Contact us</a>
		</div>

		<div class="footerRight">All rights Reserved &copy 2019</div>
	</footer>
</body>
</html>