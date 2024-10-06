<%-- 
    Document   : agregarPlanta
    Created on : Oct 5, 2024, 11:52:49?PM
    Author     : Emilio
--%>

<!DOCTYPE html>
<html>
<head>
    <title>Agregar Planta</title>
    <style>
        .form-container {
            width: 50%;
            margin: 50px auto;
            border: 1px solid #ddd;
            padding: 30px;
            border-radius: 8px;
            background-color: #f9f9f9;
        }
        label {
            display: block;
            margin-top: 15px;
            font-weight: bold;
        }
        input[type="text"], textarea {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border-radius: 4px;
            border: 1px solid #ccc;
        }
        input[type="submit"], a.button {
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #007BFF;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            text-decoration: none;
            display: inline-block;
        }
        input[type="submit"]:hover, a.button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1>Agregar Nueva Planta</h1>
        <form action="plantas?accion=insertar" method="post">
            <label for="nombre">Nombre:</label>
            <input type="text" name="nombre" id="nombre" required/>

            <label for="especie">Especie:</label>
            <input type="text" name="especie" id="especie" required/>

            <label for="descripcion">Descripción:</label>
            <textarea name="descripcion" id="descripcion" rows="4" required></textarea>

            <input type="submit" value="Agregar"/>
            <a href="plantas" class="button">Cancelar</a>
        </form>
    </div>
</body>
</html>

