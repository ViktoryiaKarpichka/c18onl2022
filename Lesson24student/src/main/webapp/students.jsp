<%@ page import="com.tms.model.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Student</h1>
<table>
    <tr>
        <th>Name</th>
    </tr>
    <tbody>
    <%
        PrintWriter writer = response.getWriter();
        ((List<Student>) request.getAttribute("students"))
                .stream()
                .forEach(student -> writer.println("<tr><td>" + student.getName() + "</td></tr>"));
    %>
    <% for (Student student : (List<Student>) request.getAttribute("students")) {%>
    <tr>
        <td>
            <%=student.getName()%>
        </td>
    </tr>
    <%} %>
    </tbody>
</table>
</body>
</html>
