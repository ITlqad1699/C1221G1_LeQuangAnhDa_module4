<%@ page import="cg.wbd.grandemonstration.service.CustomerService" %>
<%@ page import="cg.wbd.grandemonstration.service.CustomerServiceFactory" %>
<%@ page import="cg.wbd.grandemonstration.model.Customer" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    List<Customer> customers = (List<Customer>) request.getAttribute("customers");
%>
<style>
    table {
        border: 1px solid #000;
    }

    th, td {
        border: 1px dotted #555;
    }
</style>

<table>
    <caption>Customers List</caption>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach var="c" items="${requestScope.customers}">
        <tr>
            <td>
                ${c.id}
            </td>
            <td>
                <a href="/detail?id=${c.id}">${c.name}</a>
            </td>
            <td>
                ${c.email}
            </td>
            <td>
               ${c.address}
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>