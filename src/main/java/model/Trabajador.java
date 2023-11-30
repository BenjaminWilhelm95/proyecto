package model;
public class Trabajador {
    private String nombre;
    private String rol;
    public Trabajador() {
    }
    // Constructor con parámetros
    public Trabajador(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
}
