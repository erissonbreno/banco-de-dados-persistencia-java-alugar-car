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
    <h3>Lista de Usuários</h3>
</div>

<table class="table">
    <thead>
    <tr>
        <th>Id</th>
        <th>Nome</th>
        <th>Email</th>
        <th>Senha</th>
        <th>Clientes</th>
        <th>Veiculos</th>
        <th>Locações</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="usuario" items="${listaUsuario}">

    <tr>
        <td>${usuario.id}</td>
        <td>${usuario.nome}</td>
        <td>${usuario.email}</td>
        <td>${usuario.senha}</td>
        <td>${usuario.clientes.size()}</td>
        <td>${usuario.veiculos.size()}</td>
        <td>${usuario.locacoes.size()}</td>
        <td><a href="/usuario/${usuario.email}/excluir">excluir</a> </td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>