<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<!DOCTYPE html>
<html>
<head>
<!-- Bootstrap -->
<link href="resources/css/bootstrap.css" rel="stylesheet">
<link rel="stylesheet"	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
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

<form action="logout">
		<input type="submit" value="logout"/>
	</form>
	
	<div class="container-fluid">
	<div class="row"> 
	<h1>HI ${user}, is it your lucky day?</h1>
	</div>
<div class="row">
<h1>Your current balance is ${wallet.amoutOfCoin }</h1>
</div>

<div class="row">

<div class="col-md-6">

<c:if test="${!firstTime}">
<h1>${numbers.number1 }</h1>
 <h1>${numbers.number2 }</h1>
 <h1>${numbers.number3 }</h1>
 </c:if>
 
 <c:if test="${numbers.number1 == 1}">
 <img src="resources/1.png"/>
 </c:if>
 <c:if test="${numbers.number1 == 2}">
 <img src="resources/2.png"/>
 </c:if>
 
 <c:if test="${numbers.number1 == 0}">
 <img src="resources/0.png"/>
 </c:if>
 

 <c:if test="${numbers.number2==1}">
 <img src="resources/1.png"/>
 </c:if>
 <c:if test="${numbers.number2==2}">
 <img src="resources/2.png"/>
 </c:if>
 
 <c:if test="${numbers.number2==0}">
 <img src="resources/0.png"/>
 </c:if>
 

 <c:if test="${numbers.number3==1}">
 <img src="resources/1.png"/>
 </c:if>
 <c:if test="${numbers.number3==2}">
 <img src="resources/2.png"/>
 </c:if>
 
 <c:if test="${numbers.number3==0}">
 <img src="resources/0.png"/>
 </c:if>
 
 </div>

 


<c:if test="${!wallet.emptyCoin}">
<form method="post">
<button type="submit" name="bet5" class="btn btn-info" >BET 5$</button>
<button type="submit" name="bet10" class="btn btn-info" >BET 10$</button>
<button type="submit" name="bet20" class="btn btn-info" >BET 20$</button>
</form>
</c:if>
</div>
</div>

<c:if test="${wallet.emptyCoin}">
<div class="alert alert-danger" role="alert">
 		You have finished the money !
		</div>
</c:if>
<c:if test="${!firstTime}">
<c:if test="${winMatch}">
<div class="alert alert-success" role="alert">
 		Good, You won !
		</div>
</c:if>

<c:if test="${!winMatch && !wallet.emptyCoin}">
<div class="alert alert-danger" role="alert">
 		Oh no, Try again!
		</div>
</c:if>
</c:if>


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> 
<script src="resources/js/jquery-1.11.3.min.js"></script>

<!-- Include all compiled plugins (below), or include individual files as needed --> 
<script src="resources/js/bootstrap.js"></script>
</body>
</html>