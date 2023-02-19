<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Table of Students</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<h1>Student</h1>
<table border="1">
    <caption>Table of Students</caption>
    <tr>
        <th class="tcolor">Name</th>
        <th class="tcolor">Surname</th>
        <th class="tcolor">Course</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td class="trans">${student.name}</td>
            <td class="trans">${student.surname}</td>
            <td class="trans">${student.course}</td>
        </tr>
    </c:forEach>
    <form action="/index.jsp" target="_blank">
        <button>main page</button>
    </form>
</table>
</body>
</html>
