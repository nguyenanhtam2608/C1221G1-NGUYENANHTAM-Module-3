<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 19/04/2022
  Time: 8:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Thêm mới Khách hàng </title>
</head>
<body>

<div>

    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Customer</h2>
            </caption>

            <tr>
                <th>Name</th>
                <td><input type="text" name="customer_name" size="45"></td>
            </tr>

            <tr>
                <th>Id type Customer</th>
                <td><input type="text" name="customer_type_id" size="45"></td>
            </tr>

            <tr>
                <th>Birth Day</th>
                <td><input type="date" name="customer_birth_day" size="45"></td>
            </tr>
            <tr>
                <th>Gender</th>
                <td><input type="text" name="customer_gender" size="45"></td>
            </tr>
            <tr>
                <th>CMND</th>
                <td><input type="text" name="customer_id_card" size="45"></td>
            </tr>
            <tr>
                <th>Number phone</th>
                <td><input type="text" name="customer_phone" size="45"></td>
            </tr>
            <tr>
                <th>Email</th>
                <td><input type="text" name="customer_email" size="45"></td>
            </tr>
            <tr>
                <th>Address</th>
                <td><input type="text" name="customer_address" size="45"></td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save">
                </td>
            </tr>
        </table>
    </form>


</div>
</body>
</html>
