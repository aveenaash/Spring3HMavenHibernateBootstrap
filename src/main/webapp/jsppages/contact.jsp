<%--
  Created by IntelliJ IDEA.
  User: abastola
  Date: 5/23/14
  Time: 2:23 PM
  To change this template use File | Settings | File Templates.
--%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Spring 3 MVC Series - Contact Manager | viralpatel.net</title>
</head>
<body>
<h2>Contact Manager</h2>
<form:form method="post" action="add.html" commandName="contact">
    <table>
        <tr>
            <td><form:label path="firstname"></form:label></td>
            <td><form:input path="firstname" /></td>
        </tr>
        <tr>
            <td><form:label path="lastname"></form:label></td>
            <td><form:input path="lastname" /></td>
        </tr>
        <tr>
            <td><form:label path="email"></form:label></td>
            <td><form:input path="email" /></td>
        </tr>
        <tr>
            <td><form:label path="telephone"></form:label></td>
            <td><form:input path="telephone" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Add Contact"/>
            </td>
        </tr>
    </table>
</form:form>

<h3>Contacts</h3>
<c:if  test="${!empty contactList}">
    <table class="data">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Telephone</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${contactList}" var="contact">
            <tr>
                <td>${contact.lastname}, ${contact.firstname} </td>
                <td>${contact.email}</td>
                <td>${contact.telephone}</td>
                <td><a href="delete/${contact.id}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
