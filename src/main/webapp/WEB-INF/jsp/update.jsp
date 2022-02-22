<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2/19/2022
  Time: 12:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <title>UPDATE</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" />
</head>
<body>
<%--
<form action="/updated" method="post">

<table>


    <tr>
        <td>
            <input type="hidden" name="id" value="${person.id}">
        </td>

        <td>
            NAME : <input type="text" name="name" value="${person.name}">
        </td>

        <td>
            FAMILY :<input type="text" name="family" value="${person.family}">
        </td>
        <td>
            submit :<input type="submit"value="update">
        </td>

    </tr>

</table>
</form>
--%>

<form style="padding: 20px;" action="/updated" method="post">

    <div class="row">
        <div class="col">
            <input type="hidden" name="id" value="${person.id}"> <br>
        </div>
        <div class="col">
            <input placeholder="NAME" value="${person.name}" type="text"  name="name" class="form-control"> <br>
        </div>
        <div class="col">
            <input placeholder="FAMILY" value="${person.family}" type="text" name="family" class="form-control"> <br>
        </div>

        <div class="col">
            <input  type="submit" value="update"  class="form-control"> <br>
        </div>
    </div>
</form>

</body>
</html>
