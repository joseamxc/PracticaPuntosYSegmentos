package Clases;

/**
 * Clase que representa un segmento en el plano cartesiano.
 */
public class Segmento {
    /**
     * Punto 'a' del segmento.
     */
    private Punto a;

    /**
     * Punto 'b' del segmento.
     */
    private Punto b;

    /**
     * Constructor por defecto que crea un segmento entre los puntos (0,0) y (1,1).
     */
    public Segmento() {
        this.a = new Punto(0, 0);
        this.b = new Punto(1, 1);
    }

    /**
     * Constructor que crea un segmento entre los puntos pasados como parámetros.
     *
     * @param a Punto 'a' del segmento.
     * @param b Punto 'b' del segmento.
     */
    public Segmento(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Devuelve el punto 'a' del segmento.
     *
     * @return Punto 'a' del segmento.
     */
    public Punto getA() {
        return a;
    }

    /**
     * Establece el punto 'a' del segmento.
     *
     * @param a Punto 'a' del segmento.
     */
    public void setA(Punto a) {
        this.a = a;
    }

    /**
     * Devuelve el punto 'b' del segmento.
     *
     * @return Punto 'b' del segmento.
     */
    public Punto getB() {
        return b;
    }

    /**
     * Establece el punto 'b' del segmento.
     *
     * @param b Punto 'b' del segmento.
     */
    public void setB(Punto b) {
        this.b = b;
    }

    /**
     * Devuelve una representación en cadena del segmento.
     *
     * @return Representación en cadena del segmento.
     */
    @Override
    public String toString() {
        return "[" + a + ", " + b + "]";
    }

    /**
     * Calcula la distancia entre los puntos 'a' y 'b' del segmento.
     *
     * @return Distancia entre los puntos 'a' y 'b' del segmento.
     */
    public double distancia() {
        int x1 = a.getX();
        int y1 = a.getY();
        int x2 = b.getX();
        int y2 = b.getY();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}