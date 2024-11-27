package presentacion;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import control.Controlador;

public class PanelFormulario extends JPanel {
    private JTextField tR;
    private JTextField tG;
    private JTextField tB;
    private JButton bCirculo;
    private JButton bCuadrado;
    private Controlador controlador;

    public PanelFormulario(PanelLienzo panelLienzo) {
       
        this.controlador = new Controlador(panelLienzo);

      
        this.setLayout(new GridLayout(4, 2, 10, 10));
        this.tR = new JTextField();
        this.tG = new JTextField();
        this.tB = new JTextField();
        this.bCirculo = new JButton("Circulo");
        this.bCuadrado = new JButton("Cuadrado");

       
        bCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearFigura("circulo");
            }
        });

        bCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearFigura("cuadrado");
            }
        });

      
        this.add(new JLabel("R:"));
        this.add(tR);
        this.add(new JLabel("G:"));
        this.add(tG);
        this.add(new JLabel("B:"));
        this.add(tB);
        this.add(bCirculo);
        this.add(bCuadrado);
    }

    
    private void crearFigura(String tipo) {
        try {
            int r = Math.max(0, Math.min(255, Integer.parseInt(tR.getText())));
            int g = Math.max(0, Math.min(255, Integer.parseInt(tG.getText())));
            int b = Math.max(0, Math.min(255, Integer.parseInt(tB.getText())));

            Color color = new Color(r, g, b);
            controlador.crearFigura(tipo, color);
        } catch (NumberFormatException e) {
            System.out.println("Error: Los valores de R, G y B deben ser números entre 0 y 255.");
        }
    }

}
