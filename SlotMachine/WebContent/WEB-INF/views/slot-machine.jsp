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
					<a class="navbar-brand" href="slot-machine">Slot Machine</a>
				</div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="slot-machine">Home</a></li>
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
							<div class="alert alert-info">
								<div class="col-sm-8">NUMERI DELLA FORTUNA</div>
							</div>
						</div>

						<br>

						<div class="row">

							<div class="col-sm-4">
								<div class="alert alert-success">${values.first }</div>
							</div>
							<div class="col-sm-4">${values.second }</div>

							<div class="col-sm-4">
								<div class="alert alert-danger">${values.third }</div>
							</div>
						</div>
						<br>

						<div class="row">
							<div class="col-sm-4">
								<div class="form-group">
									<div class="alert alert-warning">
										<label for="exampleFormControlSelect1">Inserisci la
											tua puntata</label> <select class="form-control" name="bet"
											id="exampleFormControlSelect1">
											<option>5</option>
											<option>10</option>
											<option>20</option>
										</select>
									</div>
								</div>
							</div>
							<div class="col-sm-4">
								<button type="submit" class="btn btn-success">BET</button>
							</div>
							<div class="col-sm-4">
								<c:if test="${not empty winlose}">
									<div class="alert alert-info">${winlose}</div>
								</c:if>
							</div>
						</div>
						<br>

					</form>
				</c:if>
			</c:when>

			<c:otherwise>
				<div class="row">
					<div class="col-sm-12">
						<div class="alert alert-danger alert-dismissible" role="alert">
							<button type="button" class="close" data-dismiss="alert"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<strong>${error}</strong>
						</div>
					</div>
				</div>
			</c:otherwise>
		</c:choose>

	</div>
</body>
</html>