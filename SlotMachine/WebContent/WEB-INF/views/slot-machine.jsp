<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Slot Machine</title>
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
	<jsp:include page="navbar.jsp" />

	<div class="container" style="padding-top: 10px">
		<div class="row">
			<div class="col-sm-4">One of three columns</div>
			<div class="col-sm-4">One of three columns</div>
			<div class="col-sm-4">One of three columns</div>
		</div>
	</div>
	<div class="form-group col-sm-4" style="padding-top: 20px">
		<input type="text" class="form-control" placeholder="Inserisci la puntata">
		<input type="submit" class="btn btn-primary">
	</div>
</body>
</html>