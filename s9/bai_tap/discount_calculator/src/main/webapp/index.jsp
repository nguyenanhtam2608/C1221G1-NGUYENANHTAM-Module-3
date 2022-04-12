<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 12/04/2022
  Time: 10:29 SA
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title> Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body style="text-align: center">
<h2> Product Discount Calculator</h2>
<form action="/discount" method="post">
    <label>Product Description</label><br>
    <input type="text" name="product" placeholder="Name Product">
    <br>
    <br>
    <label>List Price: </label><br/>
    <input type="text" name="price" placeholder="List Price"/><br/>
<br>
    <label>Discount Percen: </label><br/>
    <input type="text" name="discount" placeholder="Discount Percen"/><br/>
    <br>
    <input type="submit" id="submit" value="Product Description"/>
</form>
</body>
</html>
