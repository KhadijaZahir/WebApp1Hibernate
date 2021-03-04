<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hibernate</title>
<!-- <link rel="stylesheet" href="/css/bootstrap.min.css" type="text/css">
 -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">


</head>

<body>
	<%@include file="header.jsp"%>

	<div class="container col-md-10 col-md-offset-1">
		<div class="card">
			<div class="card-header bg-primary">rechercher un user</div>
			<div class="card-body"></div>
			<form action="chercher.php" method="get">
				<label>mot cle</label> <input type="text" name="motCle"
					value="${model.motCle}" />
				<button type="submit" class="btn btn-primary">chercher</button>
			</form>
			<table class="table table-striped">
				<tr>
					<th>ID</th>
					<th>name</th>
					<th>email</th>
					<th>phone</th>
					<th>password</th>
				</tr>
				<c:forEach items="${model.users}" var="p">
					<tr>
						<td>${p.idUser}</td>
						<td>${p.name}</td>
						<td>${p.email}</td>
						<td>${p.phone}</td>
						<td>${p.password}</td>
						<td><a onclick="return confirm('etes vous sure?')" href="supprimer.php?id=${p.idUser}">Supprimer</a></td>
						<td><a href="edit.php?id=${p.idUser}">Edit</a></td>
					</tr>
				</c:forEach>

			</table>
		</div>
	</div>
</body>
</html>