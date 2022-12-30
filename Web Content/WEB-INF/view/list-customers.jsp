<%@ taglib prefix="loop" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Customers</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<table border='2' width="80%">
				<thead>
					<th>id</th>
					<th>first Name</th>
					<th>last Name</th>
					<th>Email</th>
				</thead>

				<tbody>
					<loop:forEach var="temp" items="${customers}">

						<tr>
							<td>${temp.id}</td>
							<td>${temp.firstName}</td>
							<td>${temp.lastName}</td>
							<td>${temp.email}</td>
						</tr>
					</loop:forEach>
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>