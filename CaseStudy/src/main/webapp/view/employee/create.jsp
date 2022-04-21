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
    <title>Thêm mới Employee </title>
</head>
<body>

<div>

    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Employee</h2>
            </caption>

            <tr>
                <th>Name Employee</th>
                <td><input type="text" name="nameEmployee" size="45"></td>
            </tr>

            <tr>
                <td>Birthday Employee</td>
                <td><input type="date" name="birthdayEmployee" size="45"></td>
            </tr>

            <tr>
                <th>Id Card Employee</th>
                <td><input type="text" name="idCardEmployee" size="45"></td>
            </tr>

            <tr>
                <td>Salary Employee</td>
                <td><input type="text" name="salaryEmployee" size="45"></td>
            </tr>

            <tr>
                <th>Phone Employee</th>
                <td><input type="text" name="phoneEmployee" size="45"></td>
            </tr>

            <tr>
                <th> email Employee</th>
                <td><input type="text" name="emailEmployee" size="45"></td>
            </tr>

            <tr>
                <th> Address Employee</th>
                <td><input type="text" name="addressEmployee" size="45"></td>
            </tr>

            <tr>
                <th>Id Position</th>
                <td><input type="text" name="idPosition" size="45"></td>
            </tr>

            <tr>
                <th>Id Education Degree</th>
                <td><input type="text" name="idEducationDegree" size="45"></td>
            </tr>

            <tr>
                <th>ID Division</th>
                <td><input type="text" name="idDivision" size="45"></td>
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
