<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title> delete students</title>
</head>
<body>
<h1 style="color: brown;text-align: center"> Delete student</h1>
<form style="text-align: center;font-family:Verdana" method="post" action="delete" accept-charset="UTF-8">
    id student: <input type="text" name="id"><br>
    <input type="submit" value="delete student">
</form>
<form action="/index.jsp" target="_blank">
    <button>main page</button>
</form>
</body>
</html>
