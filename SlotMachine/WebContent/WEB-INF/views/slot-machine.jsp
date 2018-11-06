<!DOCTYPE html>
<html>
<head>
<title>SlotMachine</title>
</head>
<body>
<h1>Welcome ${player.name } your coins are : ${player.coins }</h1>

 <form action="play">
  <input type="radio" name="bet" value="5" checked> 5<br>
  <input type="radio" name="bet" value="10"> 10<br>
  <input type="radio" name="bet" value="20"> 20
  <input type="submit" value="Submit">
</form> 

 <form action="logout">
  <input type="submit" value="Esci">
</form> 

</body>
</html>