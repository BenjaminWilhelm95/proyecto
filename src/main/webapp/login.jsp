<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Iniciar Sesión</title>
</head>
<body>
<h2>Iniciar Sesión</h2>

<%-- Mostrar mensaje de error si existe uno --%>
<% String mensajeError = (String)request.getAttribute("mensajeError"); %>
<% if (mensajeError != null && !mensajeError.isEmpty()) { %>
<p style="color: red;"><%= mensajeError %></p>
<% } %>

<form action="<%=request.getContextPath()%>/login" method="post">
    <label for="nombreUsuario">Nombre de Usuario:</label>
    <input type="text" id="nombreUsuario" name="nombreUsuario" required>
    <br>
    <label for="contrasena">Contraseña:</label>
    <input type="password" id="contrasena" name="contrasena" required>
    <br>
    <button type="submit">Iniciar Sesión</button>
</form>
</body>
</html>
