package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularPresupuestoGUI extends JFrame {

    private DefaultListModel<String> trabajadoresListModel;
    private JList<String> trabajadoresList;
    private JTextField nombreTextField;
    private JTextField rolTextField;

    public CalcularPresupuestoGUI() {
        setTitle("Calcular Presupuesto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        trabajadoresListModel = new DefaultListModel<>();
        trabajadoresList = new JList<>(trabajadoresListModel);
        nombreTextField = new JTextField(20);
        rolTextField = new JTextField(20);
        JButton agregarButton = new JButton("Agregar Trabajador");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarTrabajador();
            }
        });
        JButton eliminarButton = new JButton("Eliminar Trabajador");
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarTrabajador();
            }
        });
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.add(new JLabel("Nombre del Trabajador:"));
        panel.add(nombreTextField);
        panel.add(new JLabel("Rol del Trabajador:"));
        panel.add(rolTextField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(agregarButton);
        buttonPanel.add(eliminarButton);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel, BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(trabajadoresList), BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }
    private void agregarTrabajador() {
        String nombre = nombreTextField.getText();
        String rol = rolTextField.getText();

        if (!nombre.isEmpty() && !rol.isEmpty()) {
            String trabajador = nombre + " - " + rol;
            trabajadoresListModel.addElement(trabajador);
            nombreTextField.setText("");
            rolTextField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese nombre y rol del trabajador.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void eliminarTrabajador() {
        int indiceSeleccionado = trabajadoresList.getSelectedIndex();

        if (indiceSeleccionado != -1) {
            trabajadoresListModel.remove(indiceSeleccionado);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un trabajador para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalcularPresupuestoGUI().setVisible(true);
            }
        });
    }
}
