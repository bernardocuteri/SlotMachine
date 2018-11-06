<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Slot Machine Game</title>
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

<h1>Remain Coins: ${coin}</h1>

		<c:if test="${not empty lose  }">
				<h2><strong>${lose }</strong></h2>
		</c:if>
		
		
   		<c:if test="${not empty win  }">
			<h2><strong>${win }</strong></h2>
		</c:if>


<div class="container-fluid">
  <div class="row">
    <div class="col-sm-4 col-xs-2" ><img class="img-responsive" src="resources/${number.n1 }.png"></div>
    <div class="col-sm-4 col-xs-2"><img class="img-responsive" src="resources/${number.n2 }.png" alt="Chania"></div>
    <div class="col-sm-4 col-xs-2" ><img class="img-responsive" src="resources/${number.n3 }.png" alt="Chania"></div>
  </div>

  <div class="row">
  		<div class="col-sm-2"><label class="control-label">Play</label></div>
   	 	<form action="five">
   	 	<div class="col-sm-1 col-xs-2" >
        	<button type="submit" class="btn btn-primary">5</button>
        </div>
        </form>
        <form action="ten">
      	<div class="col-sm-1 col-xs-2" >
        	<button type="submit" class="btn btn-primary">10</button>
        </div>
        </form>
        <form action="twenty">
    	<div class="col-sm-1 col-xs-2" >
        	<button type="submit" class="btn btn-primary">20</button>
        </div>
        </form>
  </div>

</div>


		

</body>
</html>
