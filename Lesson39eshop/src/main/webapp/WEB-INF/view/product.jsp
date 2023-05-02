<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<html>
<head>
    <title>product</title>
    <jsp:include page="libs.jsp"/>
    <script>
      function productAddedToShoppingCartMsg() {
        window.confirm("Продукт добавлен в корзину!");
      }

      function productDeletedFromShoppingCartMsg() {
        window.confirm("Продукт удален из корзины!");
      }
    </script>
</head>
<body>
<jsp:include page="header.jsp"/>
<br>
<h2>Product</h2><br>
<<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<h2>${product.getName()}</h2>

<div class="container-fluid mb-4">
    <div class="card w-25 m-1" type="product">
        <div class="card-body">
            <h4 class="card-title">${product.getName()}</h4>
            <h4 class="card-title">${product.getDescription()}</h4>
            <h4 class="card-title">${product.getPrice()}</h4>
        </div>
    </div>
</div>
<a href="${contextPath}/cart/add?product_id=${product.getId()}">
    <button id="addProductToCart" type="submit" onclick="productAddedToShoppingCartMsg()">Купить</button>
</a>

<a href="${contextPath}/cart/open">
    <button id="cartRedirect" type="submit">Корзина</button>
</a>
<a href="${contextPath}/cart/delete?product_id=${product.getId()}">
    <button id="deleteProductTFromCart" type="submit" onclick="productDeletedFromShoppingCartMsg()">Удалить</button>
</a>
</body>
</html>
