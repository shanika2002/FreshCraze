<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<!-- External stylesheet link -->
<link rel="stylesheet" href="css/adminTable.css">
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

	<!-- Button Container -->
	<div class="button-container">

		<!-- Form to add items -->
		<form action="addItem.jsp" method="post">
			<button type="submit">+Add Items</button>
			<br>
			<br>
		</form>

		<!-- Form to check items -->
		<form action="checkItem.jsp" method="post">
			<button type="submit">Check Items</button>
			<br>
			<br>
		</form>
	</div>

	<!-- Admin Table -->
	<div class="admin-table">
		<table>
			<thead>
				<tr>
					<th>Item Code</th>
					<th>Item Name</th>
					<th>Category</th>
					<th>Quantity</th>
					<th>Price</th>
					<th>Description</th>
				</tr>
			</thead>
			<tbody>

				<!-- Loop through items -->
				<c:forEach var="item" items="${item}">
					<tr>

						<!-- Display item details -->
						<td>${item.itemCode }</td>
						<td>${item.itemName }</td>
						<td>${item.category }</td>
						<td>${item.quantity }</td>
						<td>${item.price }</td>
						<td>${item.description }</td>
						<td>
							<!-- Form to view single item data -->
							<form action="singleDataButton" method="post">
								<input type="hidden" name="itemCode" value="${item.itemCode }">
								<button type="submit">Update</button>
							</form>
						</td>

						<td>
							<!-- Form to delete item -->
							<form action="deleteItem" method="post">
								<input type="hidden" name="itemCode" value="${item.itemCode }">
								<button type="submit">Delete</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
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