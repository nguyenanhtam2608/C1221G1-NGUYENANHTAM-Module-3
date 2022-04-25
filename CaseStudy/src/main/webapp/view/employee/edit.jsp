<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 23/04/2022
  Time: 10:26 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<p><a href="/employee?action=list">Back to List</a></p>
<form method="post">
    <fieldset>
        <legend>Edit Employee</legend>
        <table border="1" cellpadding="5">

            <tr>

                <td>
                    <input type="hidden" name="idEmployee" value="${employee.idEmployee}">
                </td>

            </tr>
            <tr>
                <th>Name Employee</th>
                <td><input type="text" name="nameEmployee" size="45" value="${employee.nameEmployee}">
                </td>
            </tr>

            <tr>
                <td>Birthday Employee</td>
                <td><input type="date" name="birthdayEmployee" size="45" value="${employee.birthdayEmployee}"></td>
            </tr>

            <tr>
                <th>Id Card Employee</th>
                <td><input type="text" name="idCardEmployee" size="45" value="${employee.idCardEmployee}"></td>
            </tr>

            <tr>
                <td>Salary Employee</td>
                <td><input type="text" name="salaryEmployee" size="45" value="${employee.salaryEmployee}"></td>
            </tr>

            <tr>
                <th>Phone Employee</th>
                <td><input type="text" name="phoneEmployee" size="45" value="${employee.phoneEmployee}"></td>
            </tr>

            <tr>
                <th> email Employee</th>
                <td><input type="text" name="emailEmployee" size="45" value="${employee.emailEmployee}"></td>
            </tr>

            <tr>
                <th> Address Employee</th>
                <td><input type="text" name="addressEmployee" size="45" value="${employee.addressEmployee}"></td>
            </tr>

            <tr>
                <th>Id Position</th>
                <td><select name="idPosition">
                    <c:forEach var="positionList" items="${positionList}">
                        <option value="${positionList.idPosition}">
                                ${positionList.namePosition}</option>
                    </c:forEach>
                </select></td>
            </tr>

            <tr>
                <th>Id Education Degree</th>
                <td><select name="idEducationDegree" >
                    <c:forEach var="educationDegreeList" items="${educationDegreeList}">
                        <option value="${educationDegreeList.idEducationDegree}">
                                ${educationDegreeList.nameEducationDegree}</option>
                    </c:forEach>
                </select></td>
            </tr>

            <tr>
                <th>ID Division</th>
                <td><select name="idDivision" >
                    <c:forEach var="divisionList" items="${divisionList}">
                        <option value="${divisionList.idDivision}">
                                ${divisionList.nameDivision}</option>
                    </c:forEach>
                </select></td>
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