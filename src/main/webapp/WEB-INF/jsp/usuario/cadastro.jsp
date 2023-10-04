<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<div class="container mt-3">
    <h2>Cadastro de usuario</h2>
    <form action="/usuario/incluir" method="post">
        <div class="mb-3 mt-3">
            <label for="nome">Nome:</label>
            <input type="text" class="form-control" value="Ze" id="nome" placeholder="Digite o Nome" name="nome">
        </div>
        <div class="mb-3 mt-3">
            <label for="email">Email:</label>
            <input type="email" class="form-control" value="ze@ze.com" id="email" placeholder="Digite o Email" name="email">
        </div>
        <div class="mb-3">
            <label for="pwd">Senha:</label>
            <input type="password" class="form-control" value="ze123" id="pwd" placeholder="Digite a Senha" name="senha">
        </div>
        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>
</body>
</html>