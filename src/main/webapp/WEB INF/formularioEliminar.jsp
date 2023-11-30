<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulario Eliminar Trabajador</title>
</head>
<body>
<h2>Formulario Eliminar Trabajador</h2>
<form action="<%=request.getContextPath()%>/trabajadores/eliminar" method="post">
    <label for="indice">Seleccione el índice del trabajador a eliminar:</label>
    <select id="indice" name="indice">
        <c:forEach begin="0" end="${trabajadores.size() - 1}" var="i">
            <option value="${i}">${i}</option>
        </c:forEach>
    </select>
    <br>
    <button type="submit">Eliminar Trabajador</button>
</form>
<br>
<a href="<%=request.getContextPath()%>/trabajadores">Volver a la Lista</a>
</body>
</html>
