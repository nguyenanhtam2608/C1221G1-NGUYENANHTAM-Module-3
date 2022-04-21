<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 21/04/2022
  Time: 3:31 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List Service</title>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.11.5/css/dataTables.bootstrap4.min.css" type="text/css">
</head>
<body>
<a href="view/home.jsp">Về trang chủ </a>
<br>
<a href="service?action=create">Thêm mới Service</a>




<div style="text-align: center">
    <caption><h2>List of Service</h2></caption>

    <table class="table" id     ="example">
        <thead class="thead-dark">
        <tr style="position: -webkit-sticky;
    position: sticky;
          top: 0;
z-index: 2;">

            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Area</th>
            <th scope="col">Cost</th>
            <th scope="col">MAX people</th>
            <th scope="col">Rent type Id</th>
            <th scope="col">Service Type Id</th>
            <th scope="col">Standard Room</th>
            <th scope="col">Description Other Convenience</th>
            <th scope="col">Pool Area</th>
            <th scope="col">Number Of Floors</th>
            <th scope="col">Edit</th>
            <th scope="col">Delete</th>


        </tr>
        </thead>
        <tbody>

        <c:forEach var="employee" items="${serviceList}">
            <%--                               đằng sau var phải giống trong model--%>
            <tr>
                <td>${employee.serviceId}</td>
                <td>${employee.serviceName}</td>
                <td>${employee.serviceArea}</td>
                <td>${employee.cost}</td>
                <td>${employee.serviceMaxPeople}</td>
                <td>${employee.rentTypeId}</td>
                <td>${employee.serviceTypeId}</td>
                <td>${employee.standardRoom}</td>
                <td>${employee.descriptionOtherConvenience}</td>
                <td>${employee.poolArea}</td>
                <td>${employee.numberOfFloors}</td>
                <td>
                    <a href="/service?action=edit&id=${employee.serviceId}"
                       style="text-decoration: none">EDIT</a>
                </td>
                <td>
                    <a href="/service?action=delete&id=${employee.serviceId}"
                       style="text-decoration: none">DELETE</a>
                </td>
            </tr>

        </c:forEach>
        </tbody>


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
<%--<script src="https://code.jquery.com/jquery-3.5.1.js"></script>--%>
<script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#example').DataTable(
            {
                "dom": 'lrtip',
                // "lengthChange": false,
                // "pageLength": 5
            }
        );
    });
</script>
