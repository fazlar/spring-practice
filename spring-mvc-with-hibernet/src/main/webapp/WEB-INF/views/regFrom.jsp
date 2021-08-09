<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>  
<html>  
<head>  
    <title>Reservation Form</title>  
</head>  
<h3>Registration From</h3>  
<body>  
    <form:form action="save"  method="POST" modelAttribute="user">
    
       name: <form:input path="name" />         
        <br><br>  
         Age: <form:input path="age" />         
        <br><br> 
         Email: <form:input path="email" />         
        <br><br> 
        Phone: <form:input path="phoneNumber" />         
        <br><br> 
        Gender:   
        Sex: <form:radiobuttons path="gender" items="${gender}"/><br><br>
        <br><br>  
        skill:  
        Java<form:checkbox path="skill" value="Java"/>  
        C++<form:checkbox path="skill" value="C++"/>  
        C<form:checkbox path="skill" value="C"/>  
        <br><br>  
        Home District:   
         <form:select path="homDis">
        <form:option selected="true" value="Please Select a Home District" />
        <form:options items="${homeDisList}" />
    </form:select><br><br> 
        <br><br>  
       
        <input type="submit" value="Submit" />  
    </form:form>  
</body>  
</html>  