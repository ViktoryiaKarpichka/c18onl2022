<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>product</title>
    <jsp:include page="libs.jsp"/>
    <script>
      function productAddedToShoppingCartMsg() {
        window.confirm("Продукт добавлен в корзину!");
      }
    </script>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<c:if test="${not empty product}">
<div class="container-fluid">
    <h2 class="text-center">${product.getName()}</h2><br>
    <img class="mx-auto d-block" style="height:auto; max-width: 400px;"
         src="${contextPath}/images/${product.getImageName()}"
         alt="${product.getImageName()}">
    <br>
    <div class="container">
        <h2>Информация о продукте:</h2>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th class="text-center" style="vertical-align: middle">Описание</th>
                <th class="text-center" style="vertical-align: middle">Цена, руб.</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>${product.getDescription()}</td>
                <td class="text-center" style="vertical-align: middle">${product.getPrice()}</td>
            </tr>
            </tbody>
        </table>
        </c:if>
    </div>
    <a href="${contextPath}/cart/add?product_id=${product.getId()}">
        <button id="addProductToCart" type="submit" onclick="productAddedToShoppingCartMsg()">Купить</button>
    </a>

    <a href="${contextPath}/cart/open">
        <button id="cartRedirect" type="submit">Корзина</button>
    </a>
</div>
</body>
</html>
