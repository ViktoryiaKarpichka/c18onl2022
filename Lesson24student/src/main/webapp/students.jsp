<html>
<head>
    <meta charset="utf-8">
    <title>Table of Students</title>
</head>
<body>
<h1>Student</h1>
<table border="1">
    <caption>Table of Students</caption>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Course</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.name}</td>
            <td>${student.surname}</td>
            <td>${student.course}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
