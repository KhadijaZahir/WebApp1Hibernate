<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>pharmacy</title>
<!-- <link rel="stylesheet" href="/css/bootstrap.min.css" type="text/css">
 -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">


</head>

<body>
	<%@include file="header.jsp"%>

	<div class="container col-md-8 col-md-offset-2 col-xs-12">
		<div class="card">
			<div class="card-header bg-primary">Ajouter un user</div>
			<div class="card-body"></div>
			<form action="SaveUser.php" method="post">
				<div class="form-group">
					<label class="control-label">name</label> <input type="text"
						name="name" value="${user.name}" class="form-control"
						required="required" /> <span></span>
				</div>

				<div class="form-group">
					<label class="control-label">email</label> <input type="text"
						name="email" value="${user.email}" class="form-control"
						required="required" /> <span></span>
				</div>

				<div class="form-group">
					<label class="control-label">phone</label> <input type="number"
						name="phone" value="${user.phone}" class="form-control"
						required="required" /> <span></span>
				</div>

				<div class="form-group">
					<label class="control-label">password</label> <input type="text"
						name="password" value="${user.password}" class="form-control"
						required="required" /> <span></span>
				</div>

				<div>
					<button type="submit" class="btn btn-primary">save</button>
				</div>
			</form>

		</div>
	</div>
</body>
</html>