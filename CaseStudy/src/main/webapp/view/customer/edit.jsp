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

<p> <a href="/customer?action=list">Back to List</a></p>
<form method="post">
    <fieldset>
        <legend>Edit Customer</legend>
        <table border="1" cellpadding="5">
            <tr>
                <td>Name :</td>
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
                <td> <button type="submit">SAVE</button> </td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
