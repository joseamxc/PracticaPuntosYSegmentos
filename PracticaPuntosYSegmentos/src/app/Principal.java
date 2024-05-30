package app;

import java.util.Random;
import Clases.Segmento;
import Clases.Punto;

public class Principal {
    public static void main(String[] args) {
        Random random = new Random();
/*
 * Crear puntos aleatorios para calcular segmentos
 */
        Punto punto1 = new Punto(random.nextInt(11), random.nextInt(11));
        Punto punto2 = new Punto(random.nextInt(11), random.nextInt(11));
        Punto punto3 = new Punto(random.nextInt(11), random.nextInt(11));
        Punto punto4 = new Punto(random.nextInt(11), random.nextInt(11));

        Segmento segmento1 = new Segmento(punto1, punto2);
        Segmento segmento2 = new Segmento(punto3, punto4);
/*
 * Recogemos los puntos generados por y los calculamos con la formula
 */
        System.out.println("Segmento 1: (" + punto1.getX() + ", " + punto1.getY() + ") - (" + punto2.getX() + ", " + punto2.getY() + ")");
        System.out.println("Distancia: " + segmento1.distancia());

        System.out.println("Segmento 2: (" + punto3.getX() + ", " + punto3.getY() + ") - (" + punto4.getX() + ", " + punto4.getY() + ")");
        System.out.println("Distancia: " + segmento2.distancia());
    }
}