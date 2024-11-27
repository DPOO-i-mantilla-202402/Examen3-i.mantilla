package control;

import java.awt.Color;
import presentacion.PanelLienzo;
import logica.Circulo;
import logica.Cuadrado;

public class Controlador {
    private PanelLienzo panelLienzo;

    public Controlador(PanelLienzo panelLienzo) {
        this.panelLienzo = panelLienzo;
    }

   
    public void crearFigura(String tipo, Color color) {
        int x = 50 + panelLienzo.getFiguras().size() * 10; 
        int y = 50 + panelLienzo.getFiguras().size() * 10;

        if (tipo.equals("circulo")) {
            Circulo circulo = new Circulo(x, y, color);
            panelLienzo.agregarFigura(circulo);
        } else if (tipo.equals("cuadrado")) {
            Cuadrado cuadrado = new Cuadrado(x, y, color);
            panelLienzo.agregarFigura(cuadrado);
        }
    }

}

