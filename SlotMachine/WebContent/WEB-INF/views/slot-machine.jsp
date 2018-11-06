<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>Slot Machine Page</h1>


	<h3>Benvenuto ${username}</h3>
	<br>
	<c:if test="${coins > 0}">
		<h4>Ti rimangono ${coins} coins da giocare</h4>
	</c:if>
	<c:if test="${coins == 0 }">Hai finito i coins !!!!</c:if>

	<c:if test="${coins > 4}">
		<p>
			Seleziona la putata 
			
		<form action="Play" >
			<select name="bet">
				<c:if test="${coins > 4}">
					<option value="5">Bet 5</option>
				</c:if>
				<c:if test="${coins > 9}">
					<option value="10">Bet 10</option>
				</c:if>
				<c:if test="${coins > 19}">
					<option value="20">Bet 20</option>
				</c:if>
			</select>


		<input style="width: 10%" type="submit" value="Gioca">
		</form>
		
		
		<form action="">
		 <input style="width: 10%"
			type="submit" formaction="restart" value="Restart">
		</form>
		<c:if test="${win != null}">
		<p>Sono usciti<br>   ${first}         ${second}        ${third}</p><br>
		<p>${win}</p>
		</c:if>
		

	</c:if>
</body>
</html>