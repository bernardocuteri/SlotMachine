<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Login</title>
</head>
<body>

<form action="login" method="POST">
<label> Username : </label>
<input type="text" name="uname"/>

<label> Password: </label>
<input type="password" name="psw"/>

<button type="submit"> Login</button>
</form>

<c:if test="${ not empty error }">
<div class="alert alert-warning">
    <button type="button" class="close" data-dismiss="alert"> &times; </button>
    <strong>Warning!</strong> ${ error }
</div>
</c:if>

</body>
</html>