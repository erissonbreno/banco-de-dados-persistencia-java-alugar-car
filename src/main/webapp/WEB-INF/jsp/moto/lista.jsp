<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>AlugaCar</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"></c:import>
<div class="container-fluid mt-3">
    <h3>Lista de Motos</h3>
</div>

<table class="table">
    <thead>
    <tr>
        <th>Nome</th>
        <th>Valor</th>
        <th>Categoria</th>
        <th>Modelo</th>
        <th>Urbana?</th>
        <th>Cor Capaceta</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="moto" items="${listaMoto}">

        <tr>
            <td>${moto.nome}</td>
            <td>${moto.valor}</td>
            <td>${moto.categoria}</td>
            <td>${moto.modelo}</td>
            <td>${moto.urbana}</td>
            <td>${moto.corCapacete}</td>
            <td><a href="/moto/${moto.id}/excluir">excluir</a> </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>