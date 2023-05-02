<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>my cart</title>
    <jsp:include page="header.jsp"/>
    <jsp:include page="libs.jsp"/>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<h2 style="text-align: center">Ваша корзина </h2>
<
<div class="container-fluid mb-4">
    <c:forEach items="${sessionScope.cart.getProducts()}" var="product">
        <div class="card w-25 m-1" type="product">
            <div class="card-body">
                <h4 class="card-title">${product.getName()}</h4>
                <h4 class="card-title">${product.getDescription()}</h4>
                <h4 class="card-title">${product.getPrice()}</h4>
            </div>
        </div>
    </c:forEach>
</div>
<%--<c:if test="${empty myProducts}">
    <h3><p class="text-center">В корзине нет товаров</p></h3>
</c:if>--%>
</body>
</html>
