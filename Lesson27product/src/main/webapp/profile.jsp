<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>profile</title>
    <jsp:include page="libs.jsp"/>
    <jsp:include page="header.jsp"></jsp:include>
</head>
<body>
<p3>Welcome, <b class="font-italic">${username.getName()}</b>!</p3>
<p class="text-center">Ваш пароль: <b class="font-italic">${username.getPassword()}</b></p>
<button onclick="window.location.href = 'logout';" class="buttonQuit">
    <i class="fa fa-sign-out fa-lg" aria-hidden="true"></i> Выйти
</button>

</body>
</html>
