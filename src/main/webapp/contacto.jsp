<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Contacto</title>
</head>
<body>
    <h1>Contactenos</h1>
    <form method="post" action="EnviarCorreoServlet">
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" id="nombre"><br><br>
        <label for="correo">Correo electrónico:</label>
        <input type="email" name="correo" id="correo"><br><br>
        <label for="mensaje">Mensaje:</label>
        <textarea name="mensaje" id="mensaje"></textarea><br><br>
        <label for="enviar-copia">Enviar una copia a mi correo:</label>
        <input type="checkbox" name="enviar-copia" id="enviar-copia"><br><br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>
