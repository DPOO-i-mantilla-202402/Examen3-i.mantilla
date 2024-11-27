package presentacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

import logica.Figura;

public class PanelLienzo extends JPanel {
    private ArrayList<Figura> figuras;

    public PanelLienzo() {
        this.figuras = new ArrayList<>();
    }
    
    public ArrayList<Figura> getFiguras() {
        return figuras;
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());

        System.out.println("Re-pintando el lienzo con " + figuras.size() + " figuras.");

        for (Figura figura : figuras) {
            g2d.setColor(figura.getColor());
            if (figura instanceof logica.Circulo) {
                g2d.fillOval(figura.getX(), figura.getY(), 100, 100);
            } else if (figura instanceof logica.Cuadrado) {
                g2d.fillRect(figura.getX(), figura.getY(), 100, 100);
            }
        }
    }

    
    public void agregarFigura(Figura figura) {
        this.figuras.add(figura);
        this.repaint();
    }

}

