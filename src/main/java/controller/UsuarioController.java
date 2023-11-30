package controller;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/usuario")
public class UsuarioController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("login".equals(action)) {
            realizarInicioSesion(request, response);
        } else if ("logout".equals(action)) {
            realizarCierreSesion(request, response);
        } else {
            response.sendRedirect(request.getContextPath());
        }
    }
    private void realizarInicioSesion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreUsuario = request.getParameter("nombreUsuario");
        String contrasena = request.getParameter("contrasena");
        if ("admin".equals(nombreUsuario) && "admin123".equals(contrasena)) {
            request.getSession().setAttribute("usuarioAutenticado", true);
            response.sendRedirect(request.getContextPath() + "/inicio.jsp");
        } else {
            request.setAttribute("mensajeError", "Credenciales incorrectas");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
    private void realizarCierreSesion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().invalidate();
        response.sendRedirect(request.getContextPath() + "/login.jsp");
    }
}
