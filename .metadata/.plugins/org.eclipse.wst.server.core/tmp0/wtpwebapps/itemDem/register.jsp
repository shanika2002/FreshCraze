<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Link to the regis.css stylesheet -->
<link rel="stylesheet" href="css/regis.css">

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

	<!-- Container for the sign up form -->
	<div class="container">
		<h2>Sign Up</h2>
		<form action="addAdmin" method="post">

			<!-- Input fields for admin details -->
			<div class="form-group">
				<label for="supplierid">ID:</label> <input type="text" id="adminid"
					name="adminid" required>
			</div>
			<div class="form-group">
				<label for="suppliername">Name:</label> <input type="text"
					id="adminname" name="adminname" required>
			</div>
			<div class="form-group">
				<label for="address">Address:</label> <input type="text"
					id="address" name="address" required>
			</div>
			<div class="form-group">
				<label for="phonenumber">Phone Number:</label> <input type="tel"
					id="phonenumber" name="phonenumber" pattern="[0-9]{10}" required>
			</div>
			<div class="form-group">
				<label for="email">Email:</label> <input type="email" id="email"
					name="email" required>
			</div>
			<div class="form-group">
				<label for="password">Password:</label> <input type="password"
					id="password" name="password" required>
			</div>
			<div class="form-group">
				<input type="submit" value="Submit">
			</div>
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