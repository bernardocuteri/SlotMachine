<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Slot Machine: Play!</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
		</div>
	</nav>
	
	User: ${user} , Credit: ${credit}<br>
	
	Last Spin:
	<c:forEach items="${lastSpin}" var="value">
 		 <li><c:out value="${value}"/></li>
 		 <c:if test = "${value == 0}">
	 		 <div class="col-sm-2 text-center">
				<img src="resources/0.png" class="img-circle" height="65"
					width="65" alt="0">
			</div>
		</c:if>
		 <c:if test = "${value == 1}">
	 		 <div class="col-sm-2 text-center">
				<img src="resources/1.png" class="img-circle" height="65"
					width="65" alt="1">
			</div>
		</c:if> <c:if test = "${value == 2}">
	 		 <div class="col-sm-2 text-center">
				<img src="resources/2.png" class="img-circle" height="65"
					width="65" alt="2">
			</div>
		</c:if>
		
 	</c:forEach><br>
 	
	Message: ${SMMessage}

	<form class="form-horizontal" action="play">
		<div class="form-group">
			<label class="control-label col-sm-2" for="betAmount">Bet:</label>
			<div class="col-sm-10">
				<input type="number" class="form-control" id="betAmount"
					placeholder="Place your bet..." name="betAmount">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-primary">SPIN!</button>
			</div>
		</div>
	</form>

</body>
</html>