package controller;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/administrador")
public class AdministradorController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("dashboard".equals(action)) {
            mostrarDashboard(request, response);
        } else {
            response.sendRedirect(request.getContextPath());
        }
    }

    private void mostrarDashboard(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean esAdministrador = verificarPermisosAdministrador(request);
        if (esAdministrador) {
            request.getRequestDispatcher("/dashboardAdministrador.jsp").forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath());
        }
    }
    private boolean verificarPermisosAdministrador(HttpServletRequest request) {
        return (boolean) request.getSession().getAttribute("usuarioAutenticado");
    }
}
