<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>my cart</title>
    <jsp:include page="header.jsp"/>
    <jsp:include page="libs.jsp"/>
    <script>
      function productDeletedFromShoppingCartMsg() {
        window.confirm("Продукт удален из корзины!");
      }
    </script>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<h2 style="text-align: center">Ваша корзина </h2>
<div class="container-fluid mb-4">
    <c:forEach items="${sessionScope.cart.getProducts()}" var="product">
        <c:if test="${empty product}">
            <h3><p class="text-center">В корзине нет товаров</p></h3>
        </c:if>
        <div class="card w-25 m-1" type="product">
            <div class="card-body">
                <img class="mx-auto d-block" style="height:auto; max-width: 400px;"
                     src="${contextPath}/images/${product.getImageName()}"
                     alt="cart">
                <h4 class="card-title">${product.getName()}</h4>
                <h4 class="card-title">${product.getDescription()}</h4>
                <h4 class="card-title">${product.getPrice()}</h4>
                <br>
                <a href="${contextPath}/cart/delete?product_id=${product.getId()}">
                    <button id="deleteProductTFromCart" type="submit" onclick="productDeletedFromShoppingCartMsg()">Удалить</button>
                </a>
            </div>
        </div>
    </c:forEach>
</div>
<c:if test="${empty product}">
    <h3><p class="text-center">В корзине нет товаров</p></h3>
</c:if>
<a href="${contextPath}/cart/open">
    <button id="cartRedirect" type="submit">Корзина</button>
</a>
</body>
</html>


