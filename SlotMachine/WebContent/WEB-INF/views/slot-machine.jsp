<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Slot Machine</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
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
			<form action="logout">
				<input type="submit" class="btn btn-danger" name="logout"
					value="logout" />
			</form>
		</div>
	</nav>

	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-2 ">
				<c:if test="${coinsRimanenti>0}">
					<h4>Il tuo saldo è ${coinsRimanenti}</h4>
				</c:if>
			</div>
			<div class="col-sm-8">
				<div>
					<c:if test="${coinsRimanenti>0}">
						<h1 style="display: inline;">${num1}</h1>
						<h1 style="display: inline;">${num2}</h1>
						<h1 style="display: inline;">${num3}</h1>
					</c:if>
				</div>
				<br> <br>
				<form class="form" action="play" name="value">
					<h3>Seleziona l'importo da giocare</h3>
					<div>
						<select name="importo">
							<option value="5">5</option>
							<option value="10">10</option>
							<option value="20">20</option>
						</select>
					</div>
					<br> <br>

					<div>
						<button type="submit" class="btn btn-primary">Play</button>
					</div>
					<br>
				</form>

			</div>
			<div class="col-sm-2 sidenav"></div>
		</div>
	</div>

</body>
</html>