//IMPORTAR LIBRERIA UCN
import edu.princeton.cs.stdlib.StdDraw;
import java.awt.*;
//CLASE PRINCIPAL
public class Main {
    public static void main(String[] args) {

        //ESCALA LIENZO
        double min = -1.0;
        double max = 1.0;
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        //DEFINIR VARIABLES X E Y
        double x1 = min + (max - min) * Math.random();
        double y1 = min + (max - min) * Math.random();
        double x12 = min + (max - min) * Math.random();
        double y12 = min + (max - min) * Math.random();
        double x2 = x1 - 0.01;
        double y2 = y1 - 0.01;
        double x21 = x12 - 0.01;
        double y21 = y12 - 0.01;
        double x3 = x2 - 0.01;
        double y3 = y2 - 0.01;
        double x31 = x21 - 0.01;
        double y31 = y21 - 0.01;
        double x4 = x3 - 0.01;
        double y4 = y3 - 0.01;
        double x41 = x31 - 0.01;
        double y41 = y31 - 0.01;
        double x5 = x4 - 0.01;
        double y5 = y4 - 0.01;
        double x51 = x41 - 0.01;
        double y51 = y41 - 0.01;
        //DEFINIR VELOCIDADES AL AZAR
        double velocidad = 0.005 * Math.random();
        double vx = velocidad;
        double vy = velocidad;
        double vx1 = velocidad;
        double vy1 = velocidad;
        double vx2 = velocidad;
        double vy2 = velocidad;
        double vx21 = velocidad;
        double vy21 = velocidad;
        double vx3 = velocidad;
        double vy3 = velocidad;
        double vx31 = velocidad;
        double vy31 = velocidad;
        double vx4 = velocidad;
        double vy4 = velocidad;
        double vx41 = velocidad;
        double vy41 = velocidad;
        double vx5 = velocidad;
        double vy5 = velocidad;
        double vx51 = velocidad;
        double vy51 = velocidad;

        StdDraw.enableDoubleBuffering();
        // GENERAR LINEAS Y CICLO WHILE
        while(true){
            StdDraw.clear();
            vx = colisiones(x1, vx);
            vy = colisiones(y1, vy);
            vx1 = colisiones(x12, vx1);
            vy1 = colisiones(y12, vy1);
            vx2 = colisiones(x2, vx2);
            vy2 = colisiones(y2, vy2);
            vx21 = colisiones(x21, vx21);
            vy21 = colisiones(y21, vy21);
            vx3 = colisiones(x3, vx3);
            vy3 = colisiones(y3, vy3);
            vx31 = colisiones(x31, vx31);
            vy31 = colisiones(y31, vy31);
            vx4 = colisiones(x4, vx4);
            vy4 = colisiones(y4, vy4);
            vx41 = colisiones(x41, vx41);
            vy41 = colisiones(y41, vy41);
            vx5 = colisiones(x5, vx5);
            vy5 = colisiones(y5, vy5);
            vx51 = colisiones(x51, vx51);
            vy51 = colisiones(y51, vy51);

            //MOVIMIENTO DE LINEAS
            x1  += vx;
            y1  += vy;
            x12 += vx1;
            y12 += vy1;
            x2  += vx2;
            y2+= vy2;
            x21+= vx21;
            y21 += vy21;
            x3 += vx3;
            y3 += vy3;
            x31 += vx31;
            y31 += vy31;
            x4 += vx4;
            y4 += vy4;
            x41 += vx41;
            y41 += vy41;
            x5 += vx5;
            y5 += vy5;
            x51 += vx51;
            y51 += vy51;
            //COLOR AL AZAR DE LINEAS
            Color colorLinea = new Color((float) Math.random(), (float) Math.random(), (float) Math.random());
            double radio = 0.002;
            crearLinea(x1, y1, x12, y12, colorLinea, radio);
            crearLinea(x2, y2, x21, y21, colorLinea, radio);
            crearLinea(x3, y3, x31, y31, colorLinea, radio);
            crearLinea(x4, y4, x41, y41, colorLinea, radio);
            crearLinea(x5, y5, x51, y51, colorLinea, radio);
            StdDraw.show();
        }
    }

    //FUNCION PARA CREAR LINEAS
    private static void crearLinea(double x1, double y1, double x2, double y2,
                                   Color colorLinea, double radio) {
        StdDraw.setPenColor(colorLinea);
        StdDraw.line(x1, y1, x2, y2);
        StdDraw.filledCircle(x1, y1, radio);
        StdDraw.filledCircle(x2, y2, radio);
    }

    //FUNCION PARA DETECTAR COLISIONES
    public static double colisiones(double x, double velocidad) {
        if (Math.abs(x + velocidad) > 1.0) {
            return -velocidad;
        }
        else {
            return velocidad;
        }
    }
}