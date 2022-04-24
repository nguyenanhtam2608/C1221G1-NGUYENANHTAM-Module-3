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
    <title>List Employee</title>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.11.5/css/dataTables.bootstrap4.min.css" type="text/css">
</head>
<body>
<a href="view/home.jsp">Về trang chủ </a>
<br>
<a href="employee?action=create">Thêm mới Employee</a>


<form action="/employee" method="get">
    <input type="text" placeholder="Input Employee's name" name="searchName">

    <select name="searchPosition" >

        <option value="%">--Choose Position--</option>

        <c:forEach var="positionList" items="${positionList}">

                <option value="${positionList.idPosition}">
                    ${positionList.namePosition}

        </c:forEach>
    </select>

    <input type="text" placeholder="Input Employee's email" name="searchEmail">


    <input type="hidden" name="action" value="search">
    <button type="submit">Search</button>
</form>


<div style="text-align: center">
    <caption><h2>List of Employee</h2></caption>

    <table class="table" id="example">
        <thead class="thead-dark">
        <tr style="position: -webkit-sticky;
    position: sticky;
          top: 0;
z-index: 2;">

            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">BirthDay</th>
            <th scope="col">CMND</th>
            <th scope="col">Salary</th>
            <th scope="col">Phone</th>
            <th scope="col">Email</th>
            <th scope="col">Address</th>
            <th scope="col">Position Id</th>
            <th scope="col">Education Degree Id</th>
            <th scope="col">Division Id</th>
            <th scope="col">Edit</th>
            <th scope="col">Delete</th>


        </tr>
        </thead>
        <tbody>

        <c:forEach var="employee" items="${employeeList}">
            <%--                               đằng sau var phải giống trong model--%>
            <tr>
                <td>${employee.idEmployee}</td>
                <td>${employee.nameEmployee}</td>
                <td>${employee.birthdayEmployee}</td>
                <td>${employee.idCardEmployee}</td>
                <td>${employee.salaryEmployee}</td>
                <td>${employee.phoneEmployee}</td>
                <td>${employee.emailEmployee}</td>
                <td>${employee.addressEmployee}</td>

                    <%--                  Position--%>
                <c:forEach var="positionList" items="${positionList}">

                    <c:if test="${employee.idPosition== positionList.idPosition}">
                        <td><c:out value="${positionList.namePosition}"></c:out></td>
                    </c:if>
                </c:forEach>

                    <%--                    Education Degree--%>
                <c:forEach var="educationDegreeList" items="${educationDegreeList}">

                    <c:if test="${employee.idEducationDegree== educationDegreeList.idEducationDegree}">
                        <td><c:out value="${educationDegreeList.nameEducationDegree}"></c:out></td>
                    </c:if>
                </c:forEach>

                    <%--                Division--%>


                <c:forEach var="divisionList" items="${divisionList}">

                    <c:if test="${employee.idDivision== divisionList.idDivision}">
                        <td><c:out value="${divisionList.nameDivision}"></c:out></td>
                    </c:if>
                </c:forEach>

                <td>
                    <a href="/employee?action=edit&id=${employee.idEmployee}"
                       style="text-decoration: none">EDIT</a>
                </td>
                <td>
                    <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#exampleModal"
                            onclick="confirmDelete(${employee.idEmployee}, '${employee.nameEmployee}')">
                        Delete
                    </button>
                </td>

            </tr>

        </c:forEach>
        </tbody>


    </table>

    <!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
         aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Confirm delete?</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>

                <form method="post"  >
<%--                    gửi qua method post của trang employee--%>
                    <div class="modal-body">
                        Do you really want to delete ?
                        <div id="idEmployee"></div>
                        <div id="nameEmployee"></div>
                        <input type="hidden" value="delete" name="action">

                        <input type="hidden" id="idDelete" name="idEmployee">
<%--                        // name="..." phải giống bên controller--%>
                    </div>
                    <div class="modal-footer">

                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Delete</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

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
    function confirmDelete(id, name) {
        document.getElementById("idEmployee").innerText = "Employee Id: " + id;
        document.getElementById("nameEmployee").innerText = "Employee name: " + name;
        document.getElementById("idDelete").value = id;
    }
</script>
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
