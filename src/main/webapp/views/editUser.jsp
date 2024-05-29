<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<body bgcolor="pink">
<h1>Edit user data</h1>
<form:form method="post" action="/editu">
<table>

<tr>
<td>Id:</td>
<td><form:input path="id"/></td>
</tr>

<tr>
<td>Name:</td>
<td><form:input path="name"/></td>
</tr>

<tr>
<td>Email:</td>
<td><form:input path="email"/></td>
</tr>

<tr>
<td>Password:</td>
<td><form:input path="password"/></td>
</tr>

<tr>
<td>Gender:</td>
<td><form:input path="gender"/></td>
</tr>

<tr>
<td>Country:</td>
<td><form:input path="country"/></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="edituser"/></td>
</tr>
</table>
</form:form>
<a href="/viewUsers">view all user</a><p></p>
<a href="/">Add New user here</a>
</body>