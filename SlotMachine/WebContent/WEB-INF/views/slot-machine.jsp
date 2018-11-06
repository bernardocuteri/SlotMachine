<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<style>
#header {
	background-color: #faebd7;
	padding-top: 23px;
	padding-bottom: 23px;
}
</style>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<head>
<title>Slot Machine Page</title>
</head>
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

<body>
	<div align="center">
		<div class="jumbotron text-center" id="header">
			<h1>SlotMachine Game</h1>
		</div>
	</div>
	<br>
	<form action="doBet" method="post">
		<div class="row" align="center">
			<div class="col-sm-6">
				<h3>Select your bet</h3>
				<label class="radio-inline"><input type="radio"
					name="optradio" id="optradio" checked value="5">5 coins</label> <label
					class="radio-inline"><input type="radio" name="optradio"
					value="10" id="optradio">10 coins</label> <label
					class="radio-inline"><input type="radio" name="optradio"
					id="optradio" value="20">20 coins</label>
			</div>
			<div class="col-sm-2">
				<h3>YOUR COINS:</h3>
				<c:choose>
					<c:when test="${not empty coins}">
						<h2>${coins}</h2>
					</c:when>
					<c:otherwise>
						<h2>200</h2>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
		<div class="container">
			<h2>Result Table</h2>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Value 1</th>
						<th>Value 2</th>
						<th>Value 3</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<%-- 	 PURTROPPO NON SONO RIUSCITO A FAR FUNZIONARE IL RADIO BUTTON
						
						<td>
					<c:choose>
						<c:when test="${value1.equals('0')}">
							<img class='team-icon' src='resources/0.png' width='64'
								height='64'>
						</c:when>
						<c:when test="${value1.equals('1')}">
							<img class='team-icon' src='resources/1.png' width='64'
								height='64'>
						</c:when>
						<c:otherwise>
							<img class='team-icon' src='resources/2.png' width='64'
								height='64'>
						</c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${value2.equals('0')}">
							<img class='team-icon' src='resources/0.png' width='64'
								height='64'>
						</c:when>
						<c:when test="${value2.equals('1')}">
							<img class='team-icon' src='resources/1.png' width='64'
								height='64'>
						</c:when>
						<c:otherwise>
							<img class='team-icon' src='resources/2.png' width='64'
								height='64'>
						</c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${value3.equals('0')}">
							<img class='team-icon' src='resources/0.png' width='64'
								height='64'>
						</c:when>
						<c:when test="${value3.equals('1')}">
							<img class='team-icon' src='resources/1.png' width='64'
								height='64'>
						</c:when>
						<c:otherwise>
							<img class='team-icon' src='resources/2.png' width='64'
								height='64'>
						</c:otherwise>
					</c:choose>
				</td> --%>
						<td>${value1 }</td>
						<td>${value2 }</td>
						<td>${value3 }</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="row" align="center">

			<button type="submit" class="btn btn-primary" id="bet" name="bet"
				value="bet">Bet</button>
			<button type="submit" class="btn btn-danger" id="logout"
				name="logout" value="logout">logout</button>

			<c:if test="${not empty result}">
				<div class="alert alert-info">
					<strong>Info!</strong> ${result} action.
				</div>
			</c:if>
		</div>
	</form>
</body>
</html>