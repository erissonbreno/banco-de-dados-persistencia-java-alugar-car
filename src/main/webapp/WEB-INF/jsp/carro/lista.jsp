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
    <h3>Lista de Carros</h3>
</div>

<table class="table">
    <thead>
    <tr>
        <th>Nome</th>
        <th>Valor</th>
        <th>Categoria</th>
        <th>Marca</th>
        <th>Elétrico?</th>
        <th>Quilometragem</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="carro" items="${listaCarro}">

    <tr>
        <td>${carro.nome}</td>
        <td>${carro.valor}</td>
        <td>${carro.categoria}</td>
        <td>${carro.marca}</td>
        <td>${carro.eletrico}</td>
        <td>${carro.quilometragem}</td>
        <td><a href="/carro/${carro.id}/excluir">excluir</a> </td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>