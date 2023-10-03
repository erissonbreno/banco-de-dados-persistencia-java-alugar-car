<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
    <div class="container-fluid">
        <ul class="navbar-nav">
            <li class="nav-item"><a class="nav-link active" href="/sobre">AlugaCar</a></li>
            <c:if test="${not empty user}">
            <li class="nav-item"><a class="nav-link" href="/usuario/lista">Usuários</a></li>
            <li class="nav-item"><a class="nav-link" href="/cliente/lista">Clientes</a></li>
            <li class="nav-item"><a class="nav-link" href="/locacao/lista">Locação</a></li>
            <li class="nav-item"><a class="nav-link" href="/veiculo/lista">Veículos</a></li>
            <li class="nav-item"><a class="nav-link" href="/carro/lista">Carro</a></li>
            <li class="nav-item"><a class="nav-link" href="/moto/lista">Moto</a></li>
            <li class="nav-item"><a class="nav-link" href="/bicicleta/lista">Bicicleta</a></li>
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