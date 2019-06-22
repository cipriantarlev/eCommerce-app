<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart Page</title>
<link rel="stylesheet" href="/css/style_products.css" type="text/css" />

</head>
<body>
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

	<table cellpadding="2" cellspacing="2" border="1px">
		<caption>Your Cart</caption>
		<tr>
			<th>Option</th>
<!-- 			<th>Id</th> -->
			<th>Name</th>
			<th>Price</th>
			<th>Stoc</th>
			<th>Type</th>
			<th>Quantity</th>
			<th>Sub Total</th>
		</tr>
		<c:set var="total" value="0"></c:set>
		<c:forEach var="item" items="${sessionScope.cart }">
			<c:set var="total"
				value="${total + item.product.price * item.quantity }"></c:set>
			<tr>
				<td align="center"><a id="remove"
					href="${pageContext.request.contextPath }/cart/remove/${item.product.id }"
					onclick="return confirm('Are you sure?')">Remove</a></td>
<%-- 				<td>${item.product.id }</td> --%>
				<td>${item.product.name }</td>
				<td>${item.product.price }</td>
				<td>${item.product.stoc }</td>
				<td>${item.product.type }</td>
				<td>${item.quantity }</td>
				<td>${item.product.price * item.quantity }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="6" align="right">Sum</td>
			<td>${total }</td>
		</tr>

	</table>
	<a id="continue" href="${pageContext.request.contextPath }/product">>>> Continue
		Shopping >>></a>

	<a id="checkout" href="/checkout">>>> Check Out >>></a>

	<footer>
		<div class="footerLeft">
			<a href="/home-privacy">Privacy</a>
			<a href="/home-contact">Contact us</a>
		</div>

		<div class="footerRight">All rights Reserved &copy 2019</div>
	</footer>

</body>
</html>
