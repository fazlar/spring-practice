<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>Name</td>
			<td>Email</td>
			<td>Age</td>
			<td>Gender</td>
			<td>Phone</td>
			<td>Home District</td>
			<td>Skill</td>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>

				<td>${user.name}</td>
				<td>${user.email}</td>
				<td>${user.age}</td>
				<td>${user.gender}</td>
				<td>${user.phoneNumber}</td>
				<td>${user.homDis}</td>
				<td>
					<ul>
						<c:forEach var="skill" items="${user.skill}">
							<li>${skill}</li>
						</c:forEach>
					</ul>
				</td>

			</tr>
		</c:forEach>
	</table>
	
	
</html>
</body>
</html>