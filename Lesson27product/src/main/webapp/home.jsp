<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <script src="https://kit.fontawesome.com/yourcode.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
          integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    <header style="width: 100%; background-color: darkolivegreen">
        <nav class="nav">
            <a class="nav-link active;" href="home.jsp">Main <i class="fas fa-home"></i></a>
            <a class="nav-link active" href="#">User <i class="fas fa-user"></i></a>
            <a class="nav-link active" href="#">Cart <i class="fas fa-shopping-cart"></i></a>
        </nav>
    </header>
    <title>Categories</title>
    <meta charset="utf-8">
    <%--Данная строка необходима для того, чтобы ширина устройства, на котором открывается страница,
    правильно сопостовлялась с шириной, указанной в CSS.
    Она гарантирует, что пиксели устройства правильно сопоставляются с пикселями CSS,
    позволяя элементам и шрифтам корректно масштабироваться на мобильных устройствах.
    Атрибут initial-scale определяет начальный масштаб страницы при загрузке, значение 1.0 означает, что
    масштаб будет 100% --%>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/color.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<c:set var="categories" value="${sessionScope.get('categories')}"/>
<c:set var="products" value="${sessionScope.get('products')}"/>
<h2>Popular categories</h2>
<div class="container-fluid">
    <c:if test="${not empty categories}">
        <div class="row">
            <c:forEach items="${categories}" var="category">
                <%-- w-25 определяет ширину карты (25% от ширины родительского элемента, т.е. строки)
                m-1 означает внешинй отступ (margin) со всех 4 сторон. Измеряется специальной переменной $spacer(по умолчанию - 1rem (16px).
                1 = $spacer * .25 = 16 * 0.25 = 4px--%>
                <div class="card w-25 m-1" type="category">
                    <div class="card-body">
                        <a href="phones.jsp">
                            <h6 class="card-title">${category.getImageName()}</h6></a>
                        <img class="card-img" style="width:100px;height:60px"
                             src="${contextPath}/images/${category.getName()}" alt="Card image">
                    </div>
                </div>
            </c:forEach>
        </div>
    </c:if>
</div>
</div>
</body>
</html>
