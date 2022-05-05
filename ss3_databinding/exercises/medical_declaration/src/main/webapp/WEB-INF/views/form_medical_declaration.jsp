<%--
  Created by IntelliJ IDEA.
  User: lqad1
  Date: 5/5/2022
  Time: 3:26 PM
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
<center>
    <h2>TỜ KHAI Y TẾ</h2>
    <h3>chung tay đẩy lùi covid, vì một cộng đồng không dịch bệnh hãy cố lên nào!</h3>
    <form:form action="" method="post" modelAttribute="medical_declaration">
        <div>
            họ và tên:
            <form:input type="text" path="name" />
        </div>
        <div>
            ngày sinh:
            <form:input type="text" path="birthDay" />
        </div>
        <div>
            giới tính:
            <form:radiobutton path="gender" value="nam"/>
            nam
            <form:radiobutton path="gender" value="nu"/>
            nữ
        </div>
        <div>
            quốc tịch:
            <form:input type="text" path="country" />
        </div>
        <div>
            số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác:
            <form:input path="citizenId"/>
        </div>
        <div>
            thông tin đi lại:
            <form:radiobutton path="travelingInfo" value="tau_bay"/>
            tàu bay
            <form:radiobutton path="travelingInfo" value="tau_thuyen"/>
            tàu thuyền
            <form:radiobutton path="travelingInfo" value="o_to"/>
            ô tô
            <form:radiobutton path="travelingInfo" value="khac"/>
            khác
        </div>
        <div>
            số phương tiện:
            <form:input type="text" path="transportationInfo" />
        </div>
        <div>
            số ghế:
            <form:input type="text" path="chairNum" />
        </div>
        <div>
            ngày bắt đầu:
            <form:input type="date" path="dateStart" />
        </div>
        <div>
            ngày kết thúc:
            <form:input type="date" path="dateEnd" />
        </div>
        <div>
            trong vòng 14 ngày anh chị đã đi đến thành phố nào?
            <form:input type="text" path="cityHasGone" />
        </div>
    </form:form>

</center>
</body>
</html>
