<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Login to Slot Machine</title>
<style type="text/css">
	form {
    border: 3px solid #f1f1f1;
}
</style>
</head>
<body>
	<div class="container text-center">		
		<form action="doLogin" method="post">
			<h1>LogIn into Log Machine</h1>
<!-- 			<div class="imgcontainer">
				<img src="img_avatar2.png" alt="Avatar" class="avatar">
			</div> -->

			<div class="container">
				<label for="username"><b>Username</b></label> 
				<input type="text" placeholder="Enter Username" name="username" required> 
				<br>
				<label for="password"><b>Password</b></label> 
				<input type="password" placeholder="Enter Password" name="password" required>
				<br>
				<button type="submit" class="btn btn-primary">Login</button>				
			</div>			
		</form>
	</div>
</body>
</html>