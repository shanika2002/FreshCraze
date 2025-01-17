<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- External stylesheet link -->
<link rel="stylesheet" href="css/login.css">

<meta charset="ISO-8859-1">

<title>Insert title here</title>

<!-- JavaScript function for form validation -->
<script>
        function validateForm() {
            var username = document.getElementById("username").value;
            var password = document.getElementById("password").value;

            if (username === "shanika@gmail.com" && password === "shanika123") {
            	
            	window.location.href = 'profile.jsp';
			}
			else {
				alert("Invalid username or password!");
			}
		}
    			
        
    </script>

</head>
<body>
	<!-- Logo and Brand Name -->
	<img src="images\logo.png" class="logo">

	<h1 class="logo_topic">FreshCraze</h1>

	<nav class="navbar">
		<a href="index.jsp">Home</a> <a href="register.jsp">Sign Up</a> <a
			href="mainLogin.jsp">Sign In</a> <a href="item.jsp">Product</a> <a
			href="about.jsp">About Us</a> <a href="mainLogin.jsp">FAQs</a> <span></span>
	</nav>

	<hr class="topic_line">
	<!-- Login Form -->
	<div class="container">
		<h2>Login</h2>
		<form action="login" method="post" onsubmit="return validateForm()">
			<div class="form-group">
				<label for="username">UserName:</label> <input type="text"
					id="username" name="username" required>
			</div>
			<div class="form-group">
				<label for="password">Password:</label> <input type="password"
					id="password" name="password" required>
			</div>
			<div class="form-group">
				<input type="submit" value="Login">
			</div>
		</form>
	</div>



	<hr class="footer_line">
	<!-- Footer Section -->
	<div class="footer">
		<a href="link" target="_blank">
			<button type="button" class="help_button">Help and Support</button>
		</a>

		<!-- Social Media Icons -->
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