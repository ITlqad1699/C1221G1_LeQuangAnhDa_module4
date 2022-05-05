<%--
  Created by IntelliJ IDEA.
  User: lqad1
  Date: 5/5/2022
  Time: 2:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <a href="/goUpload"> upload</a>
</div>
<div>
    <table>
        <thead>
        <tr>
            <th>#</th>
            <th>name</th>
            <th>singer</th>
            <th>type of music</th>
            <th>link</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="music_list" items="${listMusic}" varStatus="count">
            <tr>
                <td>${count.count}</td>
                <td>${music_list.name}</td>
                <td>${music_list.singer}</td>
                <td>${music_list.typeOfMusic}</td>
                <td>${music_list.path}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
