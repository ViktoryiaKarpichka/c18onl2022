<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<html>
<head>
    <title>Product</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<jsp:include page="libs.jsp"/>
<br>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<h2>${category.getName()}</h2>

<div class="container-fluid mb-4">
    <c:forEach items="${category.getProductList()}" var="product">
        <div class="card w-25 m-1" type="product">
            <div class="card-body">
                <a href="${contextPath}/product/${product.getId()}">
                    <img class="card-img" style="width:150px;height:120px"
                         src="../images/${product.getImageName()}" alt="Card image"></a>
                <h4 class="card-title">${product.getDescription()}</h4>
                <h4 class="card-title">${product.getPrice()}</h4>
            </div>
        </div>
    </c:forEach>
</div>

</body>
</html>