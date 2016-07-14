<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: abursuc
  Date: 7/14/2016
  Time: 5:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirmation</title>
</head>
<body>

<h2>Confirmation</h2>
<c:choose>
    <c:when test="${username=='Andreea' && password=='fira'}">

        <c:out value="Authentication succeded!"/>
        <p>Welcome,</p>
        <p>${username}</p>
    </c:when>

    <c:otherwise>
        <c:out value="Error! Try again!"/>
    </c:otherwise>

</c:choose>



</body>
</html>
