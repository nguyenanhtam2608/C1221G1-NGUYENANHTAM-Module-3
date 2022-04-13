<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 13/04/2022
  Time: 4:37 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Result </h1>
<c:if test="${mes==''}">
    <span> ${first}</span><span> ${operator}</span>${sencond}<span> = </span>

    <span> ${result} </span>
</c:if>

${mes}
</body>
</html>