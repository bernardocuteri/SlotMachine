<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
  <title>Slot Machine</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Slot Machine</h2>
  <p>Tray your fortune</p> <h4>${user}</h4>
   <p>You have credit of</p> <h4>${credit}</h4><p>coins</p>
  <p>           
  <table class="table">
    <thead>
      <tr>
        <th>Select your bid</th>
       	<th>
       		 <div class="container">				
				  <form action = "slot-game">
				    <label class="radio-inline">
				      <input type="radio" name="optradio" checked>5 coins
				    </label>
				    <label class="radio-inline">
				      <input type="radio" name="optradio">10 coins
				    </label>
				    <label class="radio-inline">
				      <input type="radio" name="optradio">20 coins
				    </label>
				    <button type="submit" class="btn btn-default">Bid</button>
				  </form>
				</div>

       	</th>       	
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>
        	<c:if test = " ${result > 0}">
			 	<div class="alert alert-danger alert-dismissible fade in">
				    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				    <strong>You won!</strong> <h4>${error}</h4>
			  	</div>
			 </c:if>
        </td>
        
      
    </tbody>
  </table>
</div>

</body>
</html>
