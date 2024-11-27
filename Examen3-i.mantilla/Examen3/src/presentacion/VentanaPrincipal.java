package presentacion;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    
    private PanelFormulario panelFormulario;
    private PanelLienzo panelLienzo;

    
    public PanelLienzo getPanelLienzo() {
        return panelLienzo;
    }

    public VentanaPrincipal() {
        this.setTitle("Parcial Isabela Mantilla");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 600);
        this.setLayout(new BorderLayout());

    
        this.panelLienzo = new PanelLienzo();
        this.panelFormulario = new PanelFormulario(panelLienzo); 

        this.add(this.panelFormulario, BorderLayout.WEST);
        this.add(this.panelLienzo, BorderLayout.CENTER);

        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new VentanaPrincipal();
    }
}

