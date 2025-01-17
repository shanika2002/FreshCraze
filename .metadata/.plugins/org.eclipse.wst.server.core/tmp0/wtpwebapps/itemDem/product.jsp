<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<!-- Link to the product.css stylesheet -->
<link rel="stylesheet" href="css/product.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- FreshCraze logo and topic -->
	<img src="images\logo.png" class="logo">

	<h1 class="logo_topic">FreshCraze</h1>

	<!-- Navigation bar -->
	<nav class="navbar">
		<a href="index.jsp">Home</a> <a href="register.jsp">Sign Up</a> <a
			href="mainLogin.jsp">Sign In</a> <a href="item.jsp">Product</a> <a
			href="about.jsp">About Us</a> <a href="mainLogin.jsp">FAQs</a> <span></span>
	</nav>

	<hr class="topic_line">

	<h1>Products</h1>

	<!-- Set 'item' variable with the value from the model -->
	<c:set var="item" value="${item}" />


	<!-- Container for the product details -->
	<div class="container">


		<!-- Form fields for updating product details -->
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

		<!-- Form for updating the item -->
		<form action="updateItem.jsp" method="post">
			<!-- Hidden input fields to send item details to the updateItem.jsp page -->
			<input type="hidden" name="itemCode" value="${item.itemCode }">
			<input type="hidden" name="itemName" value="${item.itemName }">
			<input type="hidden" name="category" value="${item.category }">
			<input type="hidden" name="quantity" value="${item.quantity }">
			<input type="hidden" name="price" value="${item.price }"> 
			<input type="hidden" name="description" value="${item.description }">

			<!-- Submit button to update the item -->
			<input type="submit" value="Update">

		</form>
	</div>

	<hr class="footer_line">

	<!-- Footer section -->
	<div class="footer">
		<a href="link" target="_blank">
			<button type="button" class="help_button">Help and Support</button>
		</a>

		<!-- Social media icons -->
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

	<!-- Contact information -->
	<div class="contacts">
		<h1 class="link">www.freshcraze.lk</h1>
		<h1>Hotline: +94 225 225 25 / +94 225 225 35</h1>
	</div>
</body>
</html>