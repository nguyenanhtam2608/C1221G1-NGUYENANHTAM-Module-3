<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 20/04/2022
  Time: 3:45 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<p><a href="/customer?action=list">Back to List</a></p>
<form method="post">
    <fieldset>
        <legend>Edit Customer</legend>
        <table border="1" cellpadding="5">

            <tr>

                <td>
                    <input type="text" name="id_customer" value="${customer.id_customer}">
                </td>

            </tr>

            <tr>
                <td>Name :</td>
                <td><input type="text" name="customer_name" size="45"
                           value="<c:out value="${customer.customer_name}">


</c:out>">
                    <p style="color:red;">${error.get("name")}</p></td>
            </tr>
            <tr>
                <td>Customer Type:</td>
                <td><select name="customer_type_id" id="type">

                    <c:forEach var="customerType" items="${customerTypeList}">
                        <option value="${customerType.idCustomerType}">
                                ${customerType.nameCustomerType}</option>
                    </c:forEach>
                </select></td>
            </tr>

            <tr>
                <th>Birth Day</th>
                <td><input type="date" name="customer_birth_day" size="45"
                           value="<c:out value="${customer.customer_birthday}">

</c:out>"></td>

            </tr>
            <td>Customer Gender:</td>
            <td><select name="customer_gender" id="gender">
                <option value="0">Female</option>
                <option value="1" selected>Male</option>
            </select></td>
            </tr>
            </tr>
            <tr>
                <th>CMND</th>
                <td><input type=" text" name="customer_id_card" size="45"
                           value="<c:out value="${customer.customer_id_card}">

</c:out>">
                    <p style="color:red;">${error.get("cmnd")}</p></td>
                </td>
            </tr>
            <tr>
                <th>Number phone</th>
                <td><input type=" text" name="customer_phone" size="45"
                           value="<c:out value="${customer.customer_phone}">

</c:out>">
                    <p style="color:red;">${error.get("phone")}</p></td>
                </td>
            </tr>
            <tr>
                <th>Email</th>
                <td><input type="text" name="customer_email" size="45"
                           value="<c:out value="${customer.customer_email}">

</c:out>"></td>
            </tr>
            <tr>
                <th>Address</th>
                <td><input type=" text" name="customer_address" size="45"
                           value="<c:out value="${customer.customer_address}">

</c:out>">
                </td>
            </tr>

            <tr>
                <td>
                    <button type="submit">SAVE</button>
                </td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
