<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
.card-product .img-wrap {
	border-radius: 3px 3px 0 0;
	overflow: hidden;
	position: relative;
	height: 220px;
	text-align: center;
}

.card-product .img-wrap img {
	max-height: 100%;
	max-width: 100%;
	object-fit: cover;
}

.card-product .info-wrap {
	overflow: hidden;
	padding: 15px;
	border-top: 1px solid #eee;
}

.card-product .bottom-wrap {
	padding: 15px;
	border-top: 1px solid #eee;
}

.label-rating {
	margin-right: 10px;
	color: #333;
	display: inline-block;
	vertical-align: middle;
}

.card-product .price-old {
	color: #999;
}
</style>
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
		<div class="row">
			<h1>Hi ${user}</h1>
			<div class="col-md-8">
				<form action="logout">
					<input type="submit" class="btn btn-danger" value="Logout">
				</form>
				<!--			</div>
			<div class="col-md-4"> -->
				<h2>Saldo: ${coins}</h2>
			</div>
		</div>
		<div class="row">
			<c:if test="${empty results}">
				<div class="col-md-offset-5 col-md-4">
					<figure class="card card-product">
						<div class="img-wrap">
							<img src="resources/slot.jpg">
						</div>
					</figure>
				</div>
			</c:if>
			<c:forEach items="${results}" var="result">
				<div class="col-md-4">
					<figure class="card card-product">
						<div class="img-wrap">
							<img src="resources/${result}.png">
						</div>
					</figure>
				</div>
			</c:forEach>
		</div>
		<c:choose>
			<c:when test="${status eq 'LOSE' }">
				<div class="alert alert-danger alert-dismissible" role="alert">
					<button type="button" class="close" data-dismiss="alert"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<strong>You LOSE! Play Again!</strong>
				</div>
			</c:when>
			<c:when test="${status eq 'WIN' }">
				<div class="alert alert-success alert-dismissible" role="alert">
					<button type="button" class="close" data-dismiss="alert"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<strong>Congrats! you WIN!!</strong>
				</div>
			</c:when>
		</c:choose>
		<c:choose>
			<c:when test="${coins > 0 }">
				<form class="form-horizontal" action="play">
					<div class="form-group">
						<div class="wrapper">
							<span class="group-btn">
								<button type="submit" name="bet" class="btn btn-success btn-lg"
									value="5">Play 5 coin</button>

								<button type="submit" name="bet" class="btn btn-success btn-lg"
									value="10">Play 10 coin</button>

								<button type="submit" name="bet" class="btn btn-success btn-lg"
									value="20">Play 20 coin</button>
							</span>
						</div>
					</div>
				</form>
			</c:when>
			<c:otherwise>
				<div class="alert alert-danger alert-dismissible" role="alert">
					<button type="button" class="close" data-dismiss="alert"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<strong>You lost Everything! Bye!</strong>
				</div>

				<form class="form-horizontal" action="newgame">
					<div class="form-group">
						<div class="wrapper">
							<span class="group-btn">
								<button type="submit" name="bet" class="btn btn-success btn-lg">New
									Game</button>
							</span>
						</div>
					</div>
				</form>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>