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
	<div class="row">
		<div class="panel panel-primary">
	        <div class="panel-heading"><h1>SlotMachine <small style="color:yellow;">&dollar;:${userGame.coins}</small></h1></div>
	        <div class="panel-body">
	        	
	        	<c:if test="${not empty userGame.lastResults}">
	        		<div class="row">
	        			<c:forEach items="${userGame.lastResults}" var="result">
	        				<div class="col-md-3">
								<img src="resources/${result}.png">
							</div>
	        			</c:forEach>
	        		</div>
	        	</c:if>
	        </div>
	    </div>
	</div>
	
	<div class="row">
		<div class="col-md-5">
			<c:if test="${userGame.lastBet ne 0 }">
				<c:if test="${not userGame.lastBetIsWin}">
					<div class="alert alert-warning">
					  You loose ${userGame.lastBet }!
					</div>
				</c:if>
				<c:if test="${userGame.lastBetIsWin}">
					<div class="alert alert-success">
					  You win ${userGame.lastBet * 9 }!
					</div>
				</c:if>
			</c:if>
			<c:if test="${not userGame.lastBetAdmitted}">
					<div class="alert alert-danger">
					  You can bet that amount!
					</div>
			</c:if>
		</div>
	</div>
	
	<div class="row">
		<c:choose>
			<c:when test="${userGame.coins eq 0 }">
				<div class="alert alert-danger">
					  You have finished your coins!
					</div>
			</c:when>
			<c:otherwise>
				<form action="game" method="post">
					<div class="col-md-3">
					<select class="form-control" id="exampleSelect1" name="bet_quantity" required>
						<option>5</option>
						<option>10</option>
						<option>20</option>
					</select>
					</div>
					<div class="col-md-2">
					<button type="submit" class="btn btn-success">BET</button>
					</div>
				</form>
			</c:otherwise>
		</c:choose>
	</div>
</div>
</body>
</html>