<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">Slot Machine</a>
				</div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#">Instructions</a></li>
					<li><a href="#">Credits</a></li>
				</ul>
			</div>
		</nav>
	
		<h1> Slot Machine Game </h1>
		<div class="row">
			<div class="col-sm-4">
				<h2> Coins: ${coins}</h2>
		  	</div>
	  	</div>
	  	
	  	<div class="row">
	  		<c:if test="${coins ge 5}">
	  			<c:forEach items="${slotMachine.slots}" var="slot">
	  			<div class="col-sm-4">
	  				<img src="resources/${slot}.png" class="img-circle" alt="slot">
	  			</div>
	  			</c:forEach>
	  		</c:if>
	  	</div>
	  	
	  	<c:if test="${coins ge 5}">
		  	<div class="row">
		  		<div class="col-sm-4">
			  		<form action="beat">
			    		<div class="form-group">
							<label for="sel1">Select beat:</label>
							<select class="form-control" id="beat" name="beat">
								<option>5</option>
								<option>10</option>
								<option>20</option>
							</select>
						</div>
						<button type="submit" class="btn btn-success">Beat!</button>
		  			</form>
	  			</div>
		  	</div>
	  	</c:if>
	  	
	</div>
</body>
</html>