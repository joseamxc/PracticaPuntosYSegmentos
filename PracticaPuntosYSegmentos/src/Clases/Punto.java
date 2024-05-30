package Clases;


public class Punto {
    /**
     * Coordenada x del punto.
     */
    private int x;

    /**
     * Coordenada y del punto.
     */
    private int y;

    /**
     * Constructor por defecto. Crea un punto en las coordenadas (0,0).
     */
    public Punto() {
        this(0, 0);
    }

    /**
     * Constructor que recibe como parámetros dos enteros. 
     * 
     * @param x Coordenada x del punto.
     * @param y Coordenada y del punto.
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Devuelve la coordenada x del punto.
     * 
     * @return Coordenada x del punto.
     */
    public int getX() {
        return x;
    }

    /**
     * Establece la coordenada x del punto.
     * 
     * @param x Nueva coordenada x del punto.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Devuelve la coordenada y del punto.
     * 
     * @return Coordenada y del punto.
     */
    public int getY() {
        return y;
    }

    /**
     * Establece la coordenada y del punto.
     * 
     * @param y Nueva coordenada y del punto.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Devuelve una representación de cadena del punto en el formato (x,y).
     * 
     * @return Representación de cadena del punto.
     */
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
        
    }
}
