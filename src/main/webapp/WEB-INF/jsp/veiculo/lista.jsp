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
    <h3>Lista de Veículos</h3>
</div>

<table class="table">
    <thead>
    <tr>
        <th>Id</th>
        <th>Nome</th>
        <th>Valor</th>
        <th>Categoria</th>
        <th>Usuario</th>
        <th>Locacoes</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="veiculo" items="${listaVeiculo}">

        <tr>
            <td>${veiculo.id}</td>
            <td>${veiculo.nome}</td>
            <td>${veiculo.valor}</td>
            <td>${veiculo.categoria}</td>
            <td>${veiculo.usuario}</td>
            <td>${veiculo.locacao}</td>
            <td><a href="/veiculo/${veiculo.id}/excluir">excluir</a> </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>