<!DOCTYPE html>
<html>
<head>
<title>Play</title>
<link rel="stylesheet" type="text/css" href="resources/styles.css">
</head>
<body>
   <jsp:include page="_header.jsp" />

	<div>
		<h1>Welcome ${user}</h1>
		<h2>You have ${coins} coins</h2>
	</div>
	
	<form class="form-horizontal" action="spin">
		<div class="form-group">
			<label class="control-label col-sm-2" for="bet">Bet:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="bet"
					placeholder="Enter betting" name="bet">
			</div>
		</div>
		<br>
		<strong>${error}</strong>		
		<br>				
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-primary">Spin</button>
			</div>
		</div>
	</form>
	<!-- >form class="form-horizontal" action="spin">
	<label class="control-label col-sm-2" for="bet">Bet:</label>
	<div class="radio">
		<label><input type="radio" name="bet" checked>5</label>
	</div>
	<div class="radio">
		<label><input type="radio" name="bet">10</label>
	</div>
	<div class="radio">
		<label><input type="radio" name="bet">20</label>
	</div>

		<input type="submit" class="btn btn-danger" value="Spin">

		</form-->
		<br>
	<form action="logout">
			<input type="submit" class="btn btn-danger" value="logout">
	</form>
</body>
</html>