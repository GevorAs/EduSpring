<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<spring:form action="/update" modelAttribute="updateUser" method="post" >
        <spring:input type="text" id="name" path="name" placeholder="${updateUser.name}"></spring:input>
        <label for="name"></label>
        <spring:input type="text" id="name" path="surname" placeholder="${updateUser.surname}"></spring:input>
        <label for="name"></label>
        <spring:input type="text" id="email" path="email" placeholder="${updateUser.email}"></spring:input>
        <label for="email"></label>
        <spring:input type="text" id="password" path="password" placeholder="Password"></spring:input>
        <label for="password"></label>

    <input type="submit" value="UPDATE"/>
</spring:form>

</body>
</html>
