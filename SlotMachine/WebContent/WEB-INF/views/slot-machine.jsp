<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style type="text/css">
.center {
	text-align: center;
}
</style>
<title>Slot Machine</title>
</head>
<body>


	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Guess a number</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="#">Instructions</a></li>
				<li><a href="#">Credits</a></li>
			</ul>
			<ul class="nav pull-right">
				<li class="divider-vertical"></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">${user } <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="logout">logout</a></li>

					</ul></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<c:choose>
			<c:when test="${not started }">
				<div class="center">
					<h1>Welcome to Slot Machine</h1>
					<form action="" method="post">

						<input class="btn btn-info" type="submit" value="Start game" />
					</form>
				</div>
			</c:when>
			<c:when test="${started and empty finished }">
				<div class="row">
					<h2>hello, your credits are ${credits }</h2>
					<div class="col-lg-3">
						<h3>choose your bet</h3>
					</div>
					<div class="col-lg-3">
						<form action="" method="post">
							<input type=hidden value="5" name="bet" /> <input type="submit"
								value="5 Dollars" class="btn btn-info">

						</form>
					</div>
					<div class="col-lg-3">
						<form action="" method="post">
							<input type=hidden value="10" name="bet" /> <input type="submit"
								value="10 Dollars" class="btn btn-info">

						</form>
					</div>
					<div class="col-lg-3">
						<form action="" method="post">
							<input type=hidden value="20" name="bet" /> <input type="submit"
								value="20 Dollars" class="btn btn-info">

						</form>
					</div>
				</div>
				<div class="row">
					<c:forEach items="${numbers }" var="number">
						<div class="col-lg-4">
							<img alt="${number }" src="resources/${number}.png">
						</div>
					</c:forEach>
				</div>
	${won }



	</c:when>
			<c:otherwise>
				<h2>${finished }</h2>
				<form action="" method="post">

					<input class="btn btn-info" type="submit" value="Restart" />
				</form>


			</c:otherwise>
		</c:choose>

	</div>

</body>
</html>