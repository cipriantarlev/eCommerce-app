<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
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
			<li><a href="/homepage">Home</a></li>
			<li><a href="#">About</a></li>
			<li><a href="/homepage-products">Our Products</a></li>
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
	<table align="center">
		<caption>Our Products</caption>
		<thead>
			<tr><th>Id</th>
				<th style="width: 50%">Name</th>
				<th style="width: 25%">Type</th>
				<th>Price</th>
				<th>Stock</th>
				<th>Buy</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${products}" var="product">
				<tr>
					<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.type}</td>
					<td>${product.price} RON</td>
					<td>${product.stoc}</td>
					<td align="center">
					<a href="${pageContext.request.contextPath }/cart/buy/${product.id}">Buy Now</a>
				</td>
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
