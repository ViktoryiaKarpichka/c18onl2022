<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Login form</title>
    <jsp:include page="libs.jsp"/>
    <%--  <link rel="stylesheet" type="text/css" href="../style.css">--%>
</head>
<body>


<div class="container">
    <div class="col-md-8 offset-md-4">
        <h2>Login</h2>
        <p>Please, enter your credentials</p>
        <form method="POST" action="/login">
            <div class="form-group">
                <label for="email">Username:</label>
                <input type="text" class="form-control w-25" id="email" placeholder="Enter username" name="email" required>
                <%--<span class="error">${emailError}</span>--%>
                <div class="invalid-feedback">Username should be entered!</div>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" class="form-control w-25" id="password" placeholder="Enter password" name="password" required>
                <%-- <span class="error">${passwordError}</span>--%>
                <div class="invalid-feedback">Password should be entered!</div>
            </div>
            <button type="submit" class="btn btn-primary">Login</button>
        </form>
    </div>
</div>
<script>
  // Disable form submissions if there are invalid fields
  (function () {
    'use strict';
    window.addEventListener('load', function () {
      // Get the forms we want to add validation styles to
      var forms = document.getElementsByClassName('needs-validation');
      // Loop over them and prevent submission
      var validation = Array.prototype.filter.call(forms, function (form) {
        form.addEventListener('submit', function (event) {
          if (form.checkValidity() === false) {
            event.preventDefault();
            event.stopPropagation();
          }
          form.classList.add('was-validated');
        }, false);
      });
    }, false);
  })();

</script>
</body>
</html>

