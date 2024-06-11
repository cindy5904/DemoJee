<%@ page import="org.example.demojee.ServletListePersonne" %><%--
  Created by IntelliJ IDEA.
  User: telci
  Date: 11/06/2024
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="personnes" type="java.util.ArrayList<org.example.demojee.ServletListePersonne>" scope="request" />
<html>
<head>
    <title>Title</title>
    <%@include file="monLienBootstrap.html" %>
</head>
<body>
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Nom</th>
            <th scope="col">Prénom</th>
            <th scope="col">Age</th>
        </tr>
        </thead>
        <tbody>
        <%
            for (ServletListePersonne p : personnes) { %>
        <tr>

            <td><p><%= p.getNom()%></p></td>
            <td><%= p.getPrenom()%></td>
            <td><%= p.getAge()%></td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>

</body>
</html>
