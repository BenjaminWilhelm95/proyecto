package controller;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/login")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreUsuario = request.getParameter("nombreUsuario");
        String contrasena = request.getParameter("contrasena");
        if ("admin".equals(nombreUsuario) && "admin123".equals(contrasena)) {
            // Usuario autenticado
            request.getSession().setAttribute("usuarioAutenticado", true);
            response.sendRedirect(request.getContextPath() + "/dashboard");
        } else {
            request.setAttribute("mensajeError", "Credenciales incorrectas");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}
