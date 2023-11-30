package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginGUI extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginGUI() {
        setTitle("Inicio de Sesión - Cost-Track");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(new GridLayout(3, 2));
        JLabel usernameLabel = new JLabel("Nombre de Usuario:");
        JLabel passwordLabel = new JLabel("Contraseña:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica de autenticación (puedes agregar tu lógica aquí)
                String username = usernameField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                if (autenticarUsuario(username, password)) {
                    JOptionPane.showMessageDialog(LoginGUI.this, "Inicio de sesión exitoso");
                } else {
                    JOptionPane.showMessageDialog(LoginGUI.this, "Inicio de sesión fallido. Verifica tus credenciales.");
                }
                usernameField.setText("");
                passwordField.setText("");
            }
        });
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(loginButton);
        getContentPane().add(panel);
        setVisible(true);
    }
    private boolean autenticarUsuario(String username, String password) {
        return username.equals("admin") && password.equals("admin");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginGUI();
            }
        });
    }
}
