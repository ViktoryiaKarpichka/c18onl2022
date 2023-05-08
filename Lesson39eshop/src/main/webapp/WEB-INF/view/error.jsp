<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>exception</title>
    <jsp:include page="header.jsp"/>
    <jsp:include page="libs.jsp"/>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<h2> Error</h2>

<div class="container-fluid mb-4">
    <h1 class="alert alert-danger" role="alert">
        ${error}
    </h1>
    <a href="${contextPath}/login">
        <button type="button" class="btn btn-danger">Try again...</button>
    </a>
</div>
</body>
</html>
