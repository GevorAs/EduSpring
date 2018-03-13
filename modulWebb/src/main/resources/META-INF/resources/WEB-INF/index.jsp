<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<spring:form action="/" method="post">

        <input type="text" id="vEmail" placeholder="E-Mail"  name="j_email"/>
        <label for="vEmail">E-Mail</label>


        <input type="password" id="vPassword" placeholder="Password" name="j_password"/>
        <label for="vPassword">Password</label>

    <input type="submit" value="LOGIN"/>
</spring:form>

</body>
</html>
