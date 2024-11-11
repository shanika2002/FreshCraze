<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<!-- External stylesheet link -->
<link rel="stylesheet" href="css/product.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Logo and Brand Name -->
	<img src="images\logo.png" class="logo">

	<h1 class="logo_topic">FreshCraze</h1>

	<!-- Navigation Bar -->
	<nav class="navbar">
		<a href="index.jsp">Home</a> <a href="register.jsp">Sign Up</a> <a
			href="mainLogin.jsp">Sign In</a> <a href="item.jsp">Product</a> <a
			href="about.jsp">About Us</a> <a href="mainLogin.jsp">FAQs</a> <span></span>
	</nav>

	<hr class="topic_line">

	<h1>Products</h1>

	<c:set var="item" value="${item}" />

	<!-- Container for product details -->
	<div class="container">

		<!-- Form fields for product details -->
		<label for="item_code">Item Code:</label><br> <input type="text"
			id="item_code" name="itemCode" required value="${item.itemCode }"><br>
		<br> <label for="item_name">Item Name:</label><br> <input
			type="text" id="item_name" name="itemName" required
			value="${item.itemName }"><br>
		<br> <label for="category">Category:</label><br> <select
			id="category" name="category" required value="${item.category }">
			<option value="Beverages">Beverages</option>
			<option value="Choco & Snacks">Choco and Snacks</option>
			<option value="Food-Staples">Food-Staples</option>
			<option value="Laundry & Household">Laundry and Household</option>

		</select><br>
		<br> <label for="quantity">Quantity:</label><br> <input
			type="number" id="quantity" name="quantity" min="0" required
			value="${item.quantity }"><br>
		<br> <label for="price">Price:</label><br> <input
			type="text" id="price" name="price" required value="${item.price }"><br>
		<br> <label for="description">Description:</label><br> <input
			type="text" id="description" name="description" required
			value="${item.description }"><br>
		<br>


	</div>

	<hr class="footer_line">

	<!-- Footer Section -->
	<div class="footer">
		<a href="link" target="_blank">
			<button type="button" class="help_button">Help and Support</button>
		</a>

		<div class="fb_icon">
			<a href="https://www.facebook.com/" target="_blank"><img
				src="images/facebook.png"></a>
		</div>

		<div class="insta_icon">
			<a href="https://www.instagram.com/" target="_blank"><img
				src="images/insta.png"></a>
		</div>

		<div class="twitt_icon">
			<a href="https://www.twitter.com/" target="_blank"><img
				src="images/Twitter.png"></a>
		</div>

		<div class="yt_icon">
			<a href="https://www.youtube.com/" target="_blank"><img
				src="images/yt.png"></a>
		</div>
	</div>

	<!-- Contact Information -->
	<div class="contacts">
		<h1 class="link">www.freshcraze.lk</h1>
		<h1>Hotline: +94 225 225 25 / +94 225 225 35</h1>
	</div>

</body>
</html>