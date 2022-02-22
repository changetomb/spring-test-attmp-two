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
    <title>INDEX</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"/>
</head>
<body>


<form style="padding: 20px;" action="/save" method="post">

    <div class="row">
        <div class="col">
            <input placeholder="NAME" type="text" name="name" class="form-control"> <br>
        </div>
        <div class="col">
            <input placeholder="FAMILY" type="text" name="family" class="form-control"> <br>
        </div>

        <div class="col">
            <button type="submit" class="btn btn-primary mb-2">Save</button>
        </div>
    </div>
</form>


<%--<table style="padding: 40px;" class="table table-bordered table-hover ">
    <caption>List of Users</caption>
    <thead class="thead-dark">
    <tr>
        <th scope="col">id</th>
        <th scope="col">name</th>
        <th scope="col">family</th>
        <th scope="col">delete</th>
        <th scope="col">update</th>
    </tr>
    </thead>
    <c:forEach items="${findAll}" varStatus="i" var="person">

        <tr>
            <td>${i.count}</td>
            <td>${person.name}</td>
            <td>${person.family}</td>
            <td><a href="/delete?id=${person.id}">delete</a></td>
            <td><a href="/update?id=${person.id}">update</a></td>
        </tr>
    </c:forEach>
</table>--%>
<table style="padding: 40px;" class="table table-bordered table-hover ">
    <caption>List of Users</caption>
    <thead  class="thead-dark">
    <tr >
        <th scope="col">id</th>
        <th scope="col">name</th>
        <th scope="col">family</th>
        <th scope="col">delete</th>
        <th scope="col">update</th>
    </tr>
    </thead>
    <c:forEach items="${findAll}" varStatus="i" var="person">

        <form action="/updated" method="post">
        <tr>
            <td>${i.count}</td>
            <td><input type="text" value="${person.name}" name="name"></td>
            <td><input type="text" value="${person.family}" name="family"></td>
<%--            <td><a href="/delete?id=${person.id}">delete</a></td>--%>
            <td><button type="button" value="delete"><a href="/delete?id=${person.id}">delete</a></button></td>
            <td><input type="submit" value="update"></td>
            <input type="hidden" value="${person.id}" name="id">
        </tr>
        </form>
     </c:forEach>
</table>
</body>
</html>
