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
    <h3>Lista de Locações</h3>
</div>

<table class="table">
    <thead>
    <tr>
        <th>Id</th>
        <th>Descrição</th>
        <th>Data</th>
        <th>Veiculos</th>
        <th>Cliente</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="locacao" items="${listaLocacao}">

        <tr>
            <td>${locacao.id}</td>
            <td>${locacao.descricao}</td>
            <td>${locacao.data}</td>
            <td>${locacao.veiculos}</td>
            <td>${locacao.cliente}</td>
            <td><a href="/locacao/${locacao.id}/excluir">excluir</a> </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>