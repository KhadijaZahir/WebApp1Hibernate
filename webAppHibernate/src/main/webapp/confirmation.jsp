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
			<div class="card-header bg-primary">confirmation</div>
			<div class="card-body"></div>

			<div class="form-group">
				<label>ID:</label>
				 <label>${user.idUser}</label>
			</div>
			<div class="form-group">
				<label>name:</label>
				 <label>${user.name}</label>
			</div>
			<div class="form-group">
				<label>email:</label>
				 <label>${user.email}</label>
			</div>
			<div class="form-group">
				<label>phone:</label>
				 <label>${user.phone}</label>
			</div>
			<div class="form-group">
				<label>password:</label>
				 <label>${user.password}</label>
			</div>
		</div>
	</div>
</body>
</html>