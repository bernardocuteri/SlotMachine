<!DOCTYPE html>
<html>
<head>
<title>SlotMachine</title>
</head>
<body>
<h1>Benvenuto ${player.nome } il tuo saldo è: ${player.saldo }</h1>

<div class="container">
		<h2>Giocata</h2>
		<form class="form-horizontal" action="gioca">
			<div class="form-group">
				<label class="control-label col-sm-2" for="giocata">Giocata:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="giocata"
						placeholder="Inserisci importo" name="giocata">
			
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-primary">Submit</button>
				</div>
			</div>
		</form>



</body>
</html>