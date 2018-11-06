<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Amazing Online Free Slot-Machine</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Set height of the grid so .sidenav can be 100% (adjust if needed) */
.row.content {
	height: 1500px
}

/* Set gray background color and 100% height */
.sidenav {
	background-color: #f1f1f1;
	height: 100%;
}

/* Set black background color, white text and some padding */
footer {
	background-color: #555;
	color: white;
	padding: 15px;
}

/* On small screens, set height to 'auto' for sidenav and grid */
@media screen and (max-width: 767px) {
	.sidenav {
		height: auto;
		padding: 15px;
	}
	.row.content {
		height: auto;
	}
}
</style>
</head>
<body>

	<div class="container-fluid">
		<div class="row content">
			<div class="col-sm-3 sidenav">
				<h4>Amazing Online Super MEGA ULTRA Fun-For-Free Slot-Machine</h4>
				<br>
				<div>
					<h4>Welcome ${user}</h4>
					<h4>Coins: ${coins}</h4>
					<form action="logout">
						<input type="submit" class="btn btn-danger" value="logout">
					</form>
				</div>
			</div>

			<div class="col-sm-9">
				<table class="table">
				    <thead>
				      <tr>
				        <th>Try</th>
				        <th>Your</th>
				        <th>Luck</th>
				      </tr>
				    </thead>
				    <tbody>
				      <tr>
				        <c:forEach items="${numbers}" var="number">
				        	<td>
					        	<hr>
								<img src="resources/${number }.png" class="img-rounded">
								<hr>
							</td>
				      	</c:forEach>
				      </tr>
				    </tbody>
				</table>
				<form action="playSlot">
					<div class="form-group">
						<label class="control-label col-sm-9" for="username">Choose how much coins you want to bet.  You can only bet 5, 10 or 20 coins:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="bet_input" placeholder="Enter your bet."  name="bet">
						</div>
					</div>
					<input type="submit" class="btn btn-primary" value="Play Slot">
					<c:if test="${not empty error}">
						<div class="alert alert-danger alert-dismissible" role="alert">
							<button type="button" class="close" data-dismiss="alert"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<strong>Warning !!! </strong>${error}
						</div>
					</c:if>
				</form>
			</div>
			<c:if test="${win}">
				<div class="alert alert-success alert-dismissible" role="alert">
					<button type="button" class="close" data-dismiss="alert" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
  					${win_msg}
				</div>
			</c:if>
			
		</div>
	</div>

</body>
</html>
