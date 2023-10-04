<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
    <div class="container-fluid">
        <ul class="navbar-nav">
            <li><a class="nav-link active" href="/sobre">AlugaCar</a></li>
            <li><a class="nav-link" href="/usuario/lista">Usuários</a></li>
            <c:if test="${not empty user}">
            <li><a class="nav-link" href="/cliente/lista">Clientes</a></li>
            <li><a class="nav-link" href="/locacao/lista">Locação</a></li>
            <li><a class="nav-link" href="/veiculo/lista">Veículos</a></li>
            <li><a class="nav-link" href="/carro/lista">Carro</a></li>
            <li><a class="nav-link" href="/moto/lista">Moto</a></li>
            <li><a class="nav-link" href="/bicicleta/lista">Bicicleta</a></li>
            </c:if>

        </ul>

        <ul class="navbar navbar-expand-sm bg-dark navbar-dark">
            <c:if test="${empty user}">
                <li><a href="/usuario/cadastro"><span class="glyphicon glyphicon-user"></span> Cadastro</a></li>
                <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Entrar</a></li>
            </c:if>

            <c:if test="${not empty user}">
                <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Sair ${user.nome}</a></li>
            </c:if>
        </ul>
    </div>
</nav>