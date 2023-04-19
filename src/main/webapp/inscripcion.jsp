<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscripción en seminarios</title>
</head>
<body>
    <h1>Inscripción en seminarios</h1>
    <form method="post" action="InscripcionServlet">
        <p>
            <label for="fecha">Fecha:</label>
            <input type="date" id="fecha" name="fecha" required>
        </p>
        <p>
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre" required>
        </p>
        <p>
            <label for="apellidos">Apellidos:</label>
            <input type="text" id="apellidos" name="apellidos" required>
        </p>
        <p>
            <label for="turno">Turno:</label>
            <select id="turno" name="turno" required>
                <option value="">Seleccione un turno</option>
                <option value="Mañana">Mañana</option>
                <option value="Tarde">Tarde</option>
            </select>
        </p>
        <p>
            <label>Temas:</label>
            <input type="checkbox" name="temas" value="5g">5G
            <input type="checkbox" name="temas" value="ia">Inteligencia artificial
            <input type="checkbox" name="temas" value="ml">Machine learning
            <input type="checkbox" name="temas" value="robotica">Robótica
        </p>
        <p>
            <input type="submit" value="Enviar">
        </p>
    </form>
</body>
</html>

