<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registro de libro</title>
</head>
<body>
    <h1>Registro de libro</h1>
    <form action="RegistroLibroServlet" method="POST">
        <label for="titulo">Título:</label>
        <input type="text" id="titulo" name="titulo" required><br><br>
        <label for="autor">Autor:</label>
        <input type="text" id="autor" name="autor" required><br><br>
        <label for="resumen">Resumen:</label><br>
        <textarea id="resumen" name="resumen" rows="4" cols="50" required></textarea><br><br>
        <label for="medio">Medio:</label><br>
            <input type="radio" id="medioFisico" name="medio" value="fisico" required>
            <label for="medioFisico">Físico</label><br>
            <input type="radio" id="medioMagnetico" name="medio" value="magnetico">
            <label for="medioMagnetico">Magnético</label><br> <br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>

