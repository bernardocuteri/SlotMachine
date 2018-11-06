<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">

		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="/">Slot Machine</a>
				</div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="/">Home</a></li>
				</ul>
			</div>
		</nav>

		<c:choose>
			<c:when test="${empty error }">
				<c:if test="${not empty user }">
					<div>
						<strong>USER : ${user.username}</strong> <strong> COINS:
							${user.coins }</strong>
					</div>

					<br>
					<form action="takeasslot">

						<div class="row">
							<div class="col-sm-8">NUMERI DELLA FORTUNA</div>

						</div>

						<br>

						<div class="row">
							<div class="col-sm-4">${values.first }</div>
							<div class="col-sm-4">${values.second }</div>
							<div class="col-sm-4">${values.third }</div>
						</div>
						<br>

						<div class="row">
							<div class="col-sm-4">
								<div class="form-group">
									<label for="exampleFormControlSelect1">Inserisci la tua
										puntata</label> <select class="form-control" name="bet"
										id="exampleFormControlSelect1">
										<option>5</option>
										<option>10</option>
										<option>20</option>
									</select>
								</div>
							</div>
							<div class="col-sm-4">
								<button type="submit" class="btn btn-success">BET</button>
							</div>
						</div>
						<br>
						
					</form>
				</c:if>
			</c:when>

			<c:otherwise> ${error }</c:otherwise>
		</c:choose>

	</div>
</body>
</html>