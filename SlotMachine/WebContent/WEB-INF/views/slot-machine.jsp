<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Card</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<style type="text/css">
.hidden{
  visibility: hidden;

}

</style>
</head>
<body> 
 <h1>${player.username }, ${player.coin }</h1>
<div class="container" style="margin-top: 10%">
  <div class="card-deck">
    <div class="card bg-success">
      <div class="card-body text-center">
        <p class="card-text">${result.n1 }</p>
      </div>
    </div>
    <div class="card bg-success">
      <div class="card-body text-center">
        <p class="card-text">${result.n2 }</p>
      </div>
    </div>
    <div class="card bg-success">
      <div class="card-body text-center">
        <p class="card-text">${result.n3 }</p>
      </div>
    </div>  
  </div>
</div>
<div class="container" style="margin-top: 10%">
  <div class="row">
  	<div class="col-4">
  	<form role="form" action="bet" method="post">
  	<div class="form-group">
  	<input class="hidden" value="5" name="bet"/>
    <input type="submit" class="btn btn-lg btn-primary btn-block" value="bet 5">
    </div>
    </form>
    </div>
    <div class="col-4">
    <form role="form" action="bet" method="post">
  	<div class="form-group">
  	<input class="hidden" value="10" name="bet"/>
    <input type="submit" class="btn btn-lg btn-primary btn-block" value="bet 10">
    </div>
    </form>
    </div>
    <div class="col-4">
    <form role="form" action="bet" method="post">
  	<div class="form-group">
  	<input class="hidden" value="20" name="bet"/>
    <input type="submit" class="btn btn-lg btn-primary btn-block" value="bet 20">
    </div>
    </form>
    </div>
  </div>
</div>
</body>
</html>