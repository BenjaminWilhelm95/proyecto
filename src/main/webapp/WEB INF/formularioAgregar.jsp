<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulario Agregar Trabajador</title>
</head>
<body>
<h2>Formulario Agregar Trabajador</h2>
<form action="<%=request.getContextPath()%>/trabajadores/agregar" method="post">
    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre" required>
    <br>
    <label for="rol">Rol:</label>
    <input type="text" id="rol" name="rol" required>
    <br>
    <button type="submit">Agregar Trabajador</button>
</form>
<br>
<a href="<%=request.getContextPath()%>/trabajadores">Volver a la Lista</a>
</body>
</html>