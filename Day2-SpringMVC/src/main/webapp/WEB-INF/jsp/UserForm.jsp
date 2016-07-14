<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: abursuc
  Date: 7/14/2016
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UserForm</title>
</head>
<body>

<form:form method="POST" action="User" modelAttribute="SpringWeb">
    <table>
        <tr>
            <td><label>Username</label></td>
            <td><form:input path="username" /></td>
        </tr>
        <tr>
            <td><label>Password</label></td>
            <td><form:input type="password" path="password" /></td>
        </tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>





</body>
</html>
