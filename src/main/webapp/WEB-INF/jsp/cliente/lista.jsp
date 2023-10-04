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
    <h3>Lista de Clientes</h3>
    <h4><a href="/cliente/cadastro">Cadastrar cliente</a> </h4>
</div>

<table class="table">
    <thead>
    <tr>
        <th>Id</th>
        <th>Nome</th>
        <th>CPF</th>
        <th>Email</th>
        <th>Usuario</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="cliente" items="${listaCliente}">

    <tr>
        <td>${cliente.id}</td>
        <td>${cliente.nome}</td>
        <td>${cliente.cpf}</td>
        <td>${cliente.email}</td>
        <td>${cliente.usuario.nome}</td>
        <td><a href="/cliente/${cliente.cpf}/excluir">excluir</a> </td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>