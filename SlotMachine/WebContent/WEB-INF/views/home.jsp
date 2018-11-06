<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<title>Game - Slot Machine</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@ include file = "navbar.jsp" %>
<div class="container">
	<h1>Hi, ${user} !</h1>
	<div class="row">
		<div class="col-md-2"><a href="game" class="btn btn-success">Go to SlotMachine</a></div>
		<div class="col-md-2">
			<form method="post" action="home">
				<button class="btn btn-danger">Logout</button>
			</form>
		</div>
	</div>
</div>
</body>
</html>