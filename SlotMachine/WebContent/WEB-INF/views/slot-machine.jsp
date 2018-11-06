<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Slot Slot</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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


<div class="container">
  <div class="col-md-12">
  	<h1> Coins: ${coins} </h1>

<c:if test="${coins >0}" >
	<form action="slot-machine">
		<input type="number" name="bets">
		<input type="submit"  value="Gioca">
	</form>
</c:if>

<c:if test="${coins <0}" >
		<h1> You loose all your money... Change your life style please!</h1>
</c:if>



<c:if test="${not empty message }" >
	<h1>Message: ${message}</h1>	
	
	<table>
		<tr>
			<td>
			<img src="resources/${num1}.png" class="img-fluid" alt="Responsive image">
			</td>
			<td>
			<img src="resources/${num2}.png" class="img-fluid" alt="Responsive image">
			</td>
			<td>
				    	<img src="resources/${num3}.png" class="img-fluid" alt="Responsive image">
			</td>
		</tr>
	</table>
	</c:if>
  
  </div>
</div>



</body>
</html>