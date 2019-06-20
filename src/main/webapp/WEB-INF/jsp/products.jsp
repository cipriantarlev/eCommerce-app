<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
<link rel="stylesheet" href="/css/style_products.css" type="text/css" />
</head>
<body>
	<nav>
		<ul>
			<li><a href="/">Home</a></li>
			<li><a href="#">About</a></li>
			<li><a href="/products">Our Products</a></li>
			<li style="float: right;"><a href="/register">Register</a></li>
			<li style="float: right;"><a href="/login">Sign in</a></li>
		</ul>
	</nav>
	<table align="center">
		<caption>Our Products</caption>
		<thead>
		<tr>
			<th style="width: 50%">Name</th>
			<th style="width: 25%">Type</th>
			<th>Price</th>
			<th>Stock</th>
		</tr>
		</thead>
		<tbody>
		 <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.name}</td>
                <td>${product.type}</td>
                <td>${product.price} RON</td>
                <td>${product.stoc}</td>
            </tr>
        </c:forEach>
		</tbody>
	</table>

	<footer>
		<div class="footerLeft">
			<a href="#">Privacy</a> <a href="#">Contact us</a>
		</div>

		<div class="footerRight">All rights Reserved &copy 2019</div>
	</footer>

</body>
</html>