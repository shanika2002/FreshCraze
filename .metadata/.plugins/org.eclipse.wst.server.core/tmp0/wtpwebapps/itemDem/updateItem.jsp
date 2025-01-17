<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Link to the updateItem.css stylesheet -->
<link rel="stylesheet" href="css/updateItem.css">
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

	<!-- Container for the form to add item -->
	<div class="container">
		<h2>Add Item</h2>

		<!-- Form to add item, action set to "updateItem" -->
		<form action="updateItem" method="post"
			onsubmit="return validateForm()">

			<!-- Input fields for item details -->
			<label for="item_code">Item Code:</label><br> <input type="text"
				id="item_code" name="itemCode" required value="${param.itemCode}"><br>
			<br> <label for="item_name">Item Name:</label><br> <input
				type="text" id="item_name" name="itemName" required
				value="${param.itemName}"><br> <br> <label
				for="category">Category:</label><br> <select id="category"
				name="category" required value="${param.category}">
				<option value="Beverages">Beverages</option>
				<option value="Choco & Snacks">Choco and Snacks</option>
				<option value="Food-Staples">Food-Staples</option>
				<option value="Laundry & Household">Laundry and Household</option>

			</select><br> <br> <label for="quantity">Quantity:</label><br>
			<input type="number" id="quantity" name="quantity" min="0" required
				value="${param.quantity}"><br> <br> <label
				for="price">Price:</label><br> <input type="text" id="price"
				name="price" required value="${param.price}"><br> <br>
			<label for="description">Description:</label><br> <input
				type="text" id="description" name="description" required
				value="${param.description }"><br> <br> <input
				type="submit" value="Add Item">
		</form>
	</div>

	<script>
		function validateForm() {
			var itemCode = document.getElementById("item_code").value;
			var itemName = document.getElementById("item_name").value;
			var category = document.getElementById("category").value;
			var quantity = document.getElementById("quantity").value;
			var price = document.getElementById("price").value;
			var description = document.getElementById("description").value;

			// Check if any field is empty
			if (itemCode == "" || itemName == "" || category == ""
					|| quantity == "" || price == "" || description == "") {
				alert("All fields must be filled out");
				return false;
			}

			if (/\d/.test(itemName)) {
				alert("Item name cannot contain numbers");
				return false;
			}

			// Check if price is a valid number
			if (!/^\d+(\.\d+)?$/.test(price) || parseFloat(price) <= 0) {
				alert("Price must be a valid positive number greater than 0");
				return false;
			}

			// Check if quantity is a valid number
			if (!/^[1-9]\d*$/.test(quantity)) {
				alert("Quantity must be a valid positive integer or greater than 0");
				return false;
			}

			return true;
		}
	</script>





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