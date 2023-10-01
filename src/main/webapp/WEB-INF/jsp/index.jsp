<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>AlugaCar</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-3">
    <h2>Classes de dominio</h2>
    <p>Aluguel de veículos</p>
    <table class="table">
        <thead>
        <tr>
            <th>Campo</th>
            <th>Tipo</th>
            <th>Observação</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Descrição</td>
            <td>String</td>
            <td>Detalhamento do aluguel</td>
        </tr>
        <tr>
            <td>Data</td>
            <td>LocalDateTime</td>
            <td>Data da locação</td>
        </tr>
        <tr>
            <td>Veiculo</td>
            <td>List<'Veiculos'></td>
            <td>Lista de veículos</td>
        </tr>
        <tr>
            <td>Cliente</td>
            <td>Cliente</td>
            <td>Cliente</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>