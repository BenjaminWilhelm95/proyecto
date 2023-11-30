package model;
public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    private boolean sesionIniciada;

    // Constructor
    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.sesionIniciada = false;
    }
    public void iniciarSesion(String nombreUsuario, String contrasena) {
        if (nombreUsuario.equals(this.nombreUsuario) && contrasena.equals(this.contrasena)) {
            this.sesionIniciada = true;
            System.out.println("Sesión iniciada correctamente para el usuario: " + this.nombreUsuario);
        } else {
            System.out.println("Error al iniciar sesión. Comprueba el nombre de usuario y la contraseña.");
        }
    }
    public void cerrarSesion() {
        this.sesionIniciada = false;
        System.out.println("Sesión cerrada para el usuario: " + this.nombreUsuario);
    }
    public boolean sesionIniciada() {
        return this.sesionIniciada;
    }
    public void comprar() {
        if (sesionIniciada) {
            System.out.println("Compra realizada correctamente.");
        } else {
            System.out.println("Error: Debes iniciar sesión para realizar una compra.");
        }
    }
}
