<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista de Trabajadores</title>
</head>
<body>
<h2>Lista de Trabajadores</h2>
<ul>
    <c:forEach items="${trabajadores}" var="trabajador">
        <li>${trabajador.nombre} - ${trabajador.rol}</li>
    </c:forEach>
</ul>
<a href="<%=request.getContextPath()%>/trabajadores/mostrarFormularioAgregar">Agregar Trabajador</a>
<br>
<a href="<%=request.getContextPath()%>/trabajadores/mostrarFormularioEliminar">Eliminar Trabajador</a>
</body>
</html>
