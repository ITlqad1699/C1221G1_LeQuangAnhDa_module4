<%--
  Created by IntelliJ IDEA.
  User: lqad1
  Date: 5/5/2022
  Time: 1:41 PM
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
<h2>Upload Music</h2>
<form:form action="/upload" method="post" modelAttribute="music">
        <table>
            <tr>
                <td>name:</td>
                <td><form:input path="name"/></td>
            </tr>
            <tr>
                <td>singer</td>
                <td><form:input path="singer"/></td>
            </tr>
            <tr>
                <td>type of music</td>
                <td>
                    <form:select path="typeOfMusic" itemValue="${music.typeOfMusic}">
                        <form:option value="country">
                            country
                        </form:option>
                        <form:option value="rock">
                            rock
                        </form:option>
                        <form:option value="pop">
                            pop
                        </form:option>
                        <form:option value="vmusic">
                            vmusic
                        </form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td>link:</td>
                <td><form:input path="path"/></td>
            </tr>
            <tr>
                <td></td>
                <td><form:button>upload</form:button></td>
            </tr>
        </table>
</form:form>
</body>
</html>
