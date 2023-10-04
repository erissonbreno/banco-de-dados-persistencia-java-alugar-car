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
    <h3>Lista de Bicicletas</h3>
</div>

<table class="table">
    <thead>
    <tr>
        <th>Nome</th>
        <th>Valor</th>
        <th>Categoria</th>
        <th>Modelo</th>
        <th>Com cesta?</th>
        <th>Cor</th>
        <th>Usuario</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="bicicleta" items="${listaBicicleta}">

    <tr>
        <td>${bicicleta.nome}</td>
        <td>${bicicleta.valor}</td>
        <td>${bicicleta.categoria}</td>
        <td>${bicicleta.modelo}</td>
        <td>${bicicleta.comCesta}</td>
        <td>${bicicleta.cor}</td>
        <td>${bicicleta.usuario.nome}</td>
        <td><a href="/bicicleta/${bicicleta.id}/excluir">excluir</a> </td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>