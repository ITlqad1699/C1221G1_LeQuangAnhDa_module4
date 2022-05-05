<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <span>${msg}</span>
</div>
<form:form action="/settings" method="post" modelAttribute="settings">
    <div>
        languages:
        <form:select path="languages" itemValue="${settings.languages}">
            <form:option  value="english">
                English
            </form:option>
            <form:option  value="chinese">
                Chinese
            </form:option>
            <form:option  value="japanese">
                Japanese
            </form:option>
            <form:option  value="vietnamese">
                Vietnamese
            </form:option>
        </form:select>
    </div>
    <div>
        Page Size:
        <form:select path="pageSize" itemValue="${settings.pageSize}">
            <form:option  value="5">
                5
            </form:option>
            <form:option  value="10">
                10
            </form:option>
            <form:option  value="15">
                15
            </form:option>
            <form:option value="20">
                20
            </form:option>
            <form:option value="50">
                50
            </form:option>
            <form:option value="100">
                100
            </form:option>
        </form:select>
    </div>
    <div>
        spamFilter
        <form:checkbox path="spamFilter" value="yes" itemValue="${settings.spamFilter}"></form:checkbox >
    </div>
    <div>
        signature
        <form:textarea path="signature" itemValue="${settings.signature}"></form:textarea>
    </div>
    <div>
        <input type="submit" value="update" >
    </div>
    <div>
        <input type="reset" value="cancel">
    </div>
</form:form>
</body>
</html>
