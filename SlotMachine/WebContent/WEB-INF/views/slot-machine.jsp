<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Slot Machine</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Set height of the grid so .sidenav can be 100% (adjust if needed) */
.row.content {
	height: 1500px
}

/* Set gray background color and 100% height */
.sidenav {
	background-color: #f1f1f1;
	height: 100%;
}

/* Set black background color, white text and some padding */
footer {
	background-color: #555;
	color: white;
	padding: 15px;
}

/* On small screens, set height to 'auto' for sidenav and grid */
@media screen and (max-width: 767px) {
	.sidenav {
		height: auto;
		padding: 15px;
	}
	.row.content {
		height: auto;
	}
}
</style>
</head>
<body>
<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="">Slot Machine</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="">Home</a></li>
			<li><a href="#">Instructions</a></li>
			<li><a href="#">Credits</a></li>
		</ul>
	</div>
</nav>

<div class="container">
	<div>
		<p>COINS: <strong>${coins}</strong></p>
	</div>
  		<form action="bet">
    		<div class="form-group">
      			<label for="number">Coins Amount</label>
      			<input type="text" class="form-control" id="number" placeholder="Coins" name="coins">
    		</div>
    		<button id="submit" type="submit" class="btn btn-primary">Bet</button>
  		</form>
	</div>
  	<div class="container">
  	<c:choose>
  		<c:when test="${not empty values}">
  			<p>${values[0]} ${values[1]} ${values[2]}</p>   
  		</c:when>
  		<c:when test="${not empty won}">
  			<div class="alert alert-success">
  				
  				<strong>You won the gamble!</strong>
  			</div>
  		</c:when>
  		<c:when test="${not empty lost}">
  			<div class="alert alert-warning">
  				<strong>You lost the gamble!</strong>
  			</div>
  		</c:when>
  		<c:when test="${not empty insufficient}">
  			<div class="alert alert-alert">
  				<strong> ${insufficient} </strong>
  			</div>
  		</c:when>
	</c:choose>

	</div>
</body>
</html>