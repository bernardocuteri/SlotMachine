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
<title>Welcome to Slot Machine</title>
</head>
<body>
	<div class="container">
		<h1>Welcome to Slot Machine ${user.fullName}</h1>
		<h3>Current coins amount: ${user.availableCoins}</h3>
		<form action="doBet" method="post">
			<label for="betAmount">Select an amount to bet:</label> 
			<select name="betAmount" id="betAmount">
				<option value="5">5</option>
				<option value="10">10</option>
				<option value="20">20</option>
			</select> <input type="submit" class="btn btn-danger" value="Bet"/>
		</form>
	</div>
</body>
</html>