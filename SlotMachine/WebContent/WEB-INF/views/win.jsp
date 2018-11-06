<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>YOU WIN</title>
</head>
<body>

<c:if test="${ not empty win}">
<p> Good, you won ${ prize }</p>
</c:if>

</body>
</html>