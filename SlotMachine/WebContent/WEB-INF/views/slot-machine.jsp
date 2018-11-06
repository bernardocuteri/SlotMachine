<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title> Slot Machine </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<h1> Welcome to Slot Machine Game </h1>

	<c:choose>
		<c:when test="${numberLeft == 0}">
			<img src="resources/0.png" class="img-circle" height="65" width="65" alt="0">
		</c:when>
		<c:when test="${numberLeft == 1}">
			<img src="resources/1.png" class="img-circle" height="65" width="65" alt="0">
		</c:when>
		<c:when test="${numberLeft == 2}">
			<img src="resources/2.png" class="img-circle" height="65" width="65" alt="0">
		</c:when>
	</c:choose>
	
	<c:choose>
		<c:when test="${numberCenter == 0}">
			<img src="resources/0.png" class="img-circle" height="65" width="65" alt="0">
		</c:when>
		<c:when test="${numberCenter == 1}">
			<img src="resources/1.png" class="img-circle" height="65" width="65" alt="0">
		</c:when>
		<c:when test="${numberCenter == 2}">
			<img src="resources/2.png" class="img-circle" height="65" width="65" alt="0">
		</c:when>
	</c:choose>
	
	<c:choose>
		<c:when test="${numberRight == 0}">
			<img src="resources/0.png" class="img-circle" height="65" width="65" alt="0">
		</c:when>
		<c:when test="${numberRight == 1}">
			<img src="resources/1.png" class="img-circle" height="65" width="65" alt="0">
		</c:when>
		<c:when test="${numberRight == 2}">
			<img src="resources/2.png" class="img-circle" height="65" width="65" alt="0">
		</c:when>
	</c:choose>		
	<form action="play">
			<c:choose>
				<c:when test="${win}">
					<h2> Congrats, you win!</h2>
				</c:when>
				<c:otherwise>
					<h2> Sorry, you lose the bet.</h2>
				</c:otherwise>
			</c:choose>
	
			<c:choose>
				<c:when test="${balance > 0}">
					<h2> Your balance is ${balance}</h2>
				</c:when>
				<c:otherwise>
					<h2> Your balance is 0, you can not bet anymore. </h2>
				</c:otherwise>
			</c:choose>
		
		<input type="number" class="form-control" placeholder="Enter your bet" name="bet">
		<button type="submit" class="btn btn-primary">Play</button>
	</form>
</body>
</html>