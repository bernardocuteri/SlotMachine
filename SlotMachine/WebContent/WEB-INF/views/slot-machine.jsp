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
	
	<table align="right">
		<tr>
			<td><b>User</b></td>
			<td><i>${user}</i></td>
		</tr>
		<tr>
			<td><b>Credit</b></td>
			<td><i> ${credit}</i></td>
		</tr>
	</table>
	
	<c:forEach items="${lastSpin}" var="value">
 		 <c:if test = "${value == 0}">
	 		 <div class="col-sm-2 text-center">
				<img src="resources/0.png" class="img-circle" height="110"
					width="110" alt="0">
			</div>
		</c:if>
		 <c:if test = "${value == 1}">
	 		 <div class="col-sm-2 text-center">
				<img src="resources/1.png" class="img-circle" height="110"
					width="110" alt="1">
			</div>
		</c:if> <c:if test = "${value == 2}">
	 		 <div class="col-sm-2 text-center">
				<img src="resources/2.png" class="img-circle" height="110"
					width="110" alt="2">
			</div>
		</c:if>
		
 	</c:forEach><br>
 	
	<form class="form-horizontal" action="play">
		<div class="form-group">
			<div class="col-sm-10">
				<input type="number" class="form-control" id="betAmount"
					placeholder="Place your bet..." name="betAmount" min="5" max="20" step="5" width="50">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-primary">SPIN!</button>
			</div>
		</div>
	</form>
	<blockquote> ${SMMessage}</blockquote>


</body>
</html>