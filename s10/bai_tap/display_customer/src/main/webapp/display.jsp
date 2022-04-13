<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 13/04/2022
  Time: 10:50 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, th, td {
            text-align: center;
            border-bottom: 1px solid black;
            padding: 30px;
            width: 100%;
            height: auto;
        }

    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<link>
<table class="table table-striped">

    <tr class="row">
        <th class="col-3">Tên</th>
        <th class="col-3">Ngày sinh</th>
        <th class="col-3">Địa chỉ</th>
        <th class="col-3">Ảnh</th>
    </tr>
    <c:forEach var="items" items="${customer}">
        <tr class="row">
            <td class="col-3">${items.getTen()}</td>
            <td class="col-3">${items.getNgaySinh()}</td>
            <td class="col-3">${items.getDiaChi()}</td>
            <td class="col-3"><img width="200px" src="${items.getHinhAnh()}"></td>
        </tr>
    </c:forEach>

</table>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
        integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
        integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
        crossorigin="anonymous"></script>
</body>
</html>
