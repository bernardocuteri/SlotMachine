<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Slot Machine</title>
</head>
<body>
<h1>Welcome, <%= session.getAttribute("user") %>, you have ${ totalCoins } coins !</h1>

<div>

<p> How many coins do you wanna bet? </p>

<form action="bet" method="POST">
 <div class="radio">
 	<label><input type="radio" name="coins" value="5">5</label>
</div>
<div class="radio">
 	<label><input type="radio" name="coins" value="10">10</label>
</div>
<div class="radio">
 	<label><input type="radio" name="coins" value="20">20</label>
</div>

<input class="btn btn-success" type="submit">
</form>
 
</div>

<div>

The magic numbers are :
<p>${ num1 }</p>
<p>${ num2 }</p>
<p>${ num3 }</p>
</div>




<div>
<form action="logout" method="POST">
<input class="btn btn-danger" type="submit" name="logout" value="logout">
</form>
</div>

</body>
</html>