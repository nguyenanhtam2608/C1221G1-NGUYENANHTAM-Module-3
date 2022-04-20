<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 19/04/2022
  Time: 4:09 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Customer</title>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.11.5/css/dataTables.bootstrap4.min.css" type="text/css">
</head>
<body>
<a href="view/home.jsp">Về trang chủ </a>
<br>
<a href="customer?action=create">Thêm mới Customer</a>
<div><input type="text"></div>
<div style="text-align: center">
    <caption><h2>List of Customer</h2></caption>

    <table class="table" id="example">
        <thead class="thead-dark">
        <tr style="position: -webkit-sticky;
    position: sticky;
          top: 0;
     z-index: 2;">

            <th scope="col">Id</th>
            <th scope="col">ID Type</th>
            <th scope="col">Name</th>
            <th scope="col">BirthDay</th>
            <th scope="col">Gender</th>
            <th scope="col">CMND</th>
            <th scope="col">Phone</th>
            <th scope="col">Email</th>
            <th scope="col">Address</th>
            <th scope="col">Edit</th>
            <th scope="col">Delete</th>

        </tr>
        </thead>

        <c:forEach var="customer" items="${listCustomer}">
            <%--                               đằng sau var phải giống trong model--%>
        <tbody>
        <tr>
            <td><c:out value="${customer.id_customer}"></c:out></td>
            <td><c:out value="${customer.customer_type_id}"></c:out></td>
            <td><c:out value="${customer.customer_name}"></c:out></td>
            <td><c:out value="${customer.customer_birthday}"></c:out></td>

            <td><c:out value="${customer.customer_gender eq 1 ? 'nam' : 'nu'}"></c:out>
                    <%--                    eq 1 ? 'nam' : 'nu' toán tử 3 ngôi--%>
            </td>
            <td><c:out value="${customer.customer_id_card}"></c:out></td>
            <td><c:out value="${customer.customer_phone}"></c:out></td>
            <td><c:out value="${customer.customer_email}"></c:out></td>
            <td><c:out value="${customer.customer_address}"></c:out></td>
            <td>
                <a href="/customer?action=edit&id=${customer.id_customer}"
                   style="text-decoration: none">EDIT</a>
            </td>
            <td>
                <a href="/customer?action=delete&id=${customer.id_customer}"
                   style="text-decoration: none">DELETE</a>
            </td>
        </tr>
        </tbody>
        </c:forEach>

    </table>

</div>

</body>
</html>
<%--bootrap 4.6 + 3.5  + phân trang--%>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
        crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function  () {
        $('#example').DataTable(
            {
                "dom": 'lrtip',
                // "lengthChange": false,
                // "pageLength": 5
            }
        );
    });
</script>