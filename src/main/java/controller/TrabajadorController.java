package controller;
import model.Trabajador;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
public class TrabajadorController {
    private List<Trabajador> listaTrabajadores = new ArrayList<>();

    public String listarTrabajadores(HttpServletRequest request) {
        request.setAttribute("trabajadores", listaTrabajadores);
        return "listaTrabajadores.jsp";
    }

    public String mostrarFormularioAgregar(HttpServletRequest request) {
        request.setAttribute("trabajador", new Trabajador());
        return "formularioAgregar.jsp";
    }

    public String agregarTrabajador(Trabajador trabajador) {
        listaTrabajadores.add(trabajador);
        return "redirect:/trabajadores";
    }

    public String mostrarFormularioEliminar(HttpServletRequest request) {
        request.setAttribute("trabajadores", listaTrabajadores);
        return "formularioEliminar.jsp";
    }

    public String eliminarTrabajador(int indice) {
        if (indice >= 0 && indice < listaTrabajadores.size()) {
            listaTrabajadores.remove(indice);
        }
        return "redirect:/trabajadores";
    }
}
