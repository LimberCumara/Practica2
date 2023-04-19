<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro de usuarios</title>
</head>
<body>
    <h1>Registro de usuarios</h1>
    <form action="RegistroServlet" method="post">
        <p>
            <label for="nombre">Nombre:</label>
            <input type="text" name="nombre" id="nombre" required>
        </p>
        <p>
            <label for="apellidos">Apellidos:</label>
            <input type="text" name="apellidos" id="apellidos" required>
        </p>
        <p>
            <label for="correo">Correo electrónico:</label>
            <input type="email" name="correo" id="correo" required>
        </p>
        <p>
            <label for="contrasena">Contraseña:</label>
            <input type="password" name="contrasena" id="contrasena" required>
        </p>
        <p>
            <button type="submit">Enviar</button>
        </p>
    </form>
</body>
</html>

