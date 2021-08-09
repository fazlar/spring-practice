<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>  
<html>  
<body>  
<p>Your Registration successfully.</p>  
 Name : ${user.name} <br>  
age : ${user.age} <br>  
Gender: ${user.gender}<br>  
Email : ${user.email} <br>  
Phone : ${user.phoneNumber} <br> 
Home District : ${user.homDis} <br> 
Skill:   
<ul>  
<c:forEach var="skill" items="${user.skill}">  
<li>${skill}</li>  
</c:forEach>  
</ul>  
<a href="/reg-form">&lt; Go Back</a> | <a href="/all-users">all users.</a>
</body>  
</html>  