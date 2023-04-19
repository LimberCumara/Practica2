<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Encuesta de sistemas operativos</title>
</head>
<body>
	<h1>Encuesta de sistemas operativos</h1>
	<form action="EncuestaServlet" method="post">
		<label for="nombre">Nombre:</label>
		<input type="text" id="nombre" name="nombre"><br>
		
		<label for="sistema">¿Cuál es tu sistema operativo favorito?</label><br>
		<input type="radio" id="windows" name="sistema" value="Windows">
		<label for="windows">Windows</label><br>
		<input type="radio" id="mac" name="sistema" value="Mac">
		<label for="mac">Mac OS</label><br>
		<input type="radio" id="linux" name="sistema" value="Linux">
		<label for="linux">Linux</label><br>
		
		<label for="comentario">Comentario:</label><br>
		<textarea id="comentario" name="comentario"></textarea><br>
		
		<input type="submit" value="Enviar">
	</form>
</body>
</html>
