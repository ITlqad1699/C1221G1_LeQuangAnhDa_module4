<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lqad1
  Date: 5/5/2022
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table style="border: 1px solid">
        <thead>
            <tr>
                <th>#</th>
                <th>name</th>
                <th>citizenId</th>
                <th>detail</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="list" items="${list}" varStatus="count">
                <td>${count.count}</td>
                <td>${list.name}</td>
                <td>${list.citizenId}</td>
                <td></td>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
