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
<p3>Welcome, <b class="font-italic">${user.getEmail()}</b>!</p3>
<p class="text-center">Ваш пароль: <b class="font-italic">${user.getPassword()}</b></p>
<a href="${contextPath}/logout">
    <button id="redirect" type="submit">Exit</button>
</a>
</body>
</html>
