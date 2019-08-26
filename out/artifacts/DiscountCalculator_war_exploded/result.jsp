<%--
  Created by IntelliJ IDEA.
  User: congn
  Date: 8/26/2019
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Discount Calculator</title>
    <style>
        form{
            width: 450px;
            height: 500px;
            margin: 0 auto;
            padding: 0px 20px 20px;
            background: white;
            border: 2px solid navy;
        }
        label{
            width: 10em;
            padding-right: 1em;
            float: left;
        }
        h1{
            text-align: center;
            color: navy;
        }

    </style>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/calculator">
    <h1>Product Discount Calculator</h1>
    <label>Product Description: </label><p>${}</p>
    <label>List Price: </label><input type="number" name="listPrice"><br>
    <label>Discount Percent: </label><input type="number" name="discountPercent">(%)<br>
    <input type="submit" value="Calculator Discount">
</form>
</body>
</html>
