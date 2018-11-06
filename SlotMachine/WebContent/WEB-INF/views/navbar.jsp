<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-default justify-content-between">
	<div class="container-fluid">
		<div class="navbar-header col-sm-4" style="text-align: center">
			<a class="navbar-brand" href="#">Slot Machine</a>
		</div>
		<c:if test="${not empty user}">
			<div class="mb-auto mt-auto col-sm-4">Credito rimasto ${player.credit}!!!</div>
			<div class="mb-auto mt-auto col-sm-4">
				<span class="navbar-text">Benvenuto ${user}</span>
				<form action="logout" class="form-inline my-2 my-lg-0">
					<input type="submit" class="btn btn-danger" value="logout">
				</form>
			</div>
		</c:if>
	</div>
</nav>