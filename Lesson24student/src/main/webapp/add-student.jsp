<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title> add students</title>
    <link rel="stylesheet" href="add.css">
</head>
<body>
<h1> Add student</h1>
<form method="post" action="add" accept-charset="UTF-8">
    name: <input type="text" name="name"><br>
    surname: <input type="text" name="surname"><br>
    course: <input type="text" name="course"><br>
    <input type="submit" value="add student">
</form>
<form action="/index.jsp" target="_blank">
    <button>main page</button>
</form>
</body>
</html>
