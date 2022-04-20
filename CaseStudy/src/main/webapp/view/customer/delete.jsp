<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 20/04/2022
  Time: 2:01 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>DELETE</title>
</head>
<body>
<p>
    <a href="/customer">Back to Product list</a>
</p>
<form method="post">
    <h1> Are you sure ? </h1>
    <fieldset>
        <legend> Customer</legend>
        <table>
            <tr>
                <td> Name :</td>
                <td><c:out value="${customer.customer_name}"></c:out></td>
            </tr>
            <tr>
                <td> Customer Type ID :</td>
                <td><c:out value="${customer.customer_type_id}"></c:out></td>
            </tr>
            <tr>
                <td> Customer Birthday :</td>
                <td><c:out value="${customer.customer_birthday}"></c:out></td>
            </tr>
            <tr>
                <td> Customer Gender :</td>
                <td><c:out value="${customer.customer_gender}"></c:out></td>
            </tr>
            <tr>
                <td> Customer ID Card :</td>
                <td><c:out value="${customer.customer_id_card}"></c:out></td>
            </tr>
            <tr>
                <td> Customer phone :</td>
                <td><c:out value="${customer.customer_phone}"></c:out></td>
            </tr>
            <tr>
                <td> Customer email :</td>
                <td><c:out value="${customer.customer_email}"></c:out></td>
            </tr>
            <tr>
                <td> Customer address :</td>
                <td><c:out value="${customer.customer_address}"></c:out></td>
            </tr>

            <tr>
                <td><button type="submit">DELETE</button></td>
            </tr>
        </table>


    </fieldset>

</form>
</body>
</html>
