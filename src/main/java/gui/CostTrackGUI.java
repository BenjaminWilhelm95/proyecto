package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CostTrackGUI extends JFrame {

    public CostTrackGUI() {
        setTitle("Cost-Track");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        JButton calcularPresupuestoButton = new JButton("Calcular Presupuesto");
        JButton gestionarTrabajadoresButton = new JButton("Gestionar Trabajadores");
        JButton ajustarConfiguracionesButton = new JButton("Ajustar Configuraciones");
        panel.add(calcularPresupuestoButton);
        panel.add(gestionarTrabajadoresButton);
        panel.add(ajustarConfiguracionesButton);
        calcularPresupuestoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(CostTrackGUI.this, "Funcionalidad de Calcular Presupuesto");
            }
        });

        gestionarTrabajadoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(CostTrackGUI.this, "Funcionalidad de Gestionar Trabajadores");
            }
        });

        ajustarConfiguracionesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(CostTrackGUI.this, "Funcionalidad de Ajustar Configuraciones");
            }
        });
        getContentPane().add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CostTrackGUI();
            }
        });
    }
}
