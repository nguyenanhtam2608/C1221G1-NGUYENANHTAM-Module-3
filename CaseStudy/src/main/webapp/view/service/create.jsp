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
    <title>Thêm mới Service </title>
</head>
<body>

<div>

    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Service</h2>
            </caption>

            <tr>
                <th>Name</th>
                <td><input type="text" name="serviceName" size="45"></td>
            </tr>

            <tr>
                <td>Area</td>
                <td><input type="text" name="serviceArea" size="45"></td>
            </tr>

            <tr>
                <th>Cost</th>
                <td><input type="text" name="cost" size="45"></td>
            </tr>

            <tr>
                <td>Max people</td>
                <td><input type="text" name="serviceMaxPeople" size="45"></td>
            </tr>

            <tr>
                <th>Rent Type ID</th>
                <td><select name="rentTypeId" >
                    <c:forEach var="rentTypeList" items="${rentTypeList}">
                        <option value="${rentTypeList.idRentType}">
                                ${rentTypeList.nameRentType}</option>
                    </c:forEach>
                </select></td>
            </tr>

            <tr>
                <th>Service Type id</th>
                <td><select name="serviceTypeId" >
                    <c:forEach var="serviceTypeList" items="${serviceTypeList}">
                        <option value="${serviceTypeList.idServiceType}">
                                ${serviceTypeList.nameServiceType}</option>
                    </c:forEach>
                </select></td>
            </tr>

            <tr>
                <th>Strandard Room</th>
                <td><input type="text" name="standardRoom" size="45"></td>
            </tr>

            <tr>
                <th>Description Other Convenience</th>
                <td><input type="text" name="descriptionOtherConvenience" size="45"></td>
            </tr>

            <tr>
                <th>Pool Area</th>
                <td><input type="text" name="poolArea" size="45"></td>
            </tr>

            <tr>
                <th>Number Of Floos</th>
                <td><input type="text" name="numberOfFloors" size="45"></td>
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
