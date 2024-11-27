package logica;

import java.awt.Color;
public class Figura {
	
	private int x;
    private int y;
    private Color color;

    public Figura(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }
}
