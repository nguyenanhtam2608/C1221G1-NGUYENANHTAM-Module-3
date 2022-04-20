<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 18/04/2022
  Time: 3:55 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Page - Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>

        .logo {
            float: left;
        }

        .login {
            padding-top: 28px;
        }

        .colorp {
            background: beige;
            height: 70px;
        }


        .searchinput {

        }
    </style>
</head>
<body class="bgbody">
<div class="row headh1">
    <div class="col-10 logo"><img class="rounded-pill border border-black border border-3"
                                  src="https://www.hiendproperty.com/images/logo.png"></div>
    <div class="col-2 login">

        <button> Đăng Nhập</button>

    </div>
</div>


<div class="row colorp">
    <div class="col-1"></div>
    <div class="col-1">Employee</div>
    <div class="col-1"><a href="/customer" style="text-decoration: none">Customer</a></div>
    <div class="col-1">Service</div>
    <div class="col-1">Contract</div>
    <div class="col-1"></div>
    <div class="col-1"></div>
    <div class="col-4 searchinput">

        <form>
            <input name="search" placeholder="search"></input>
        </form>
    </div>


</div>

<div class="row">
    <div class="col-4 border-end">
        <div class="row">

        </div>
    </div>

    <div class="col-8">Body web</div>
</div>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
        integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
        integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
        crossorigin="anonymous"></script>
</body>
</html>
