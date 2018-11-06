<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">

<div class="row" style="margin-top:100px">
    <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
		<form role="form" action="login" method="post">
			<fieldset>
				<h2>Inserire le Credenziali</h2>
				<hr >
				<div class="form-group">
                    <input type="email" name="email" id="email" class="form-control input-lg" placeholder="Email Address">
				</div>
				<div class="form-group">
                    <input type="password" name="pwd" id="password" class="form-control input-lg" placeholder="Password">
				</div>
				<hr >
				<div class="form-group">
					
                        <input type="submit" class="btn btn-lg btn-success btn-block" value="login">
					
				</div>
			</fieldset>
		</form>
	</div>
</div>
	<c:if test="${error }">
	<div class="alert alert-danger">
	<a href="#" class="close" data-dismiss="alert">&times;</a>
	  <strong>Error!</strong> <br> Check your credential
	</div>
	</c:if>
</div>
</body>
</html>