<%-- 
    Document   : listarplantas
    Created on : Oct 5, 2024, 11:45:24?PM
    Author     : Emilio
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Plantas</title>
    <style>
        table {
            width: 80%;
            border-collapse: collapse;
            margin: 20px auto;
        }
        th, td {
            padding: 12px;
            border: 1px solid #ddd;
            text-align: center;
        }
        th {
            background-color: #f2f2f2;
        }
        a {
            text-decoration: none;
            color: #007BFF;
        }
        a:hover {
            text-decoration: underline;
        }
        .container {
            text-align: center;
            margin-top: 40px;
        }
        .add-button {
            margin-bottom: 20px;
            display: inline-block;
            padding: 10px 20px;
            background-color: #28A745;
            color: white;
            border-radius: 4px;
        }
        .add-button:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Lista de Plantas</h1>
        <a href="plantas?accion=nuevo" class="add-button">Agregar Nueva Planta</a>
        <table>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Especie</th>
                <th>Descripción</th>
                <th>Acciones</th>
            </tr>
            <c:forEach var="planta" items="${listaPlantas}">
                <tr>
                    <td>${planta.id}</td>
                    <td>${planta.nombre}</td>
                    <td>${planta.especie}</td>
                    <td>${planta.descripcion}</td>
                    <td>
                        <a href="plantas?accion=eliminar&id=${planta.id}" 
                           onclick="return confirm('¿Estás seguro de eliminar esta planta?');">Eliminar</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>

