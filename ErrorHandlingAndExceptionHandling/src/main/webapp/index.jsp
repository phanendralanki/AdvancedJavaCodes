<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Module</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
			<form action="output.jsp">
				<div class="card">
					<div class="card-header bg-dark text-white">
						<h3>Provide me a two numbers</h3>
					</div>
					<div class="card-body bg-secondary">
						<div class="form-group">
							<input type="number" name="n1" class="form-control" placeholder="enter n1" />
						</div>
						<div class="form-group mt-3">
							<input type="number" name="n2" class="form-control" placeholder="enter n2" />
						</div>
					</div>
					<div class="card-footer text-center bg-dark text-white">
					<button type="submit" class="btn btn-outline-light">Divide two numbers</button>
					</div>
				</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>