package Ejercicio1;

import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("¿Valor del radio de la esfera?");

        String radio = lectura.next();
        double radiodouble= Double.parseDouble(radio);

        System.out.println("Dada una esfera de radio "+radio+" unidades ");

        double area = 4 * Math.PI * radiodouble * radiodouble;

        System.out.println("y su area es:" + area + " unidades cuadradas");

        double volumen = (4.0/3.0) * Math.PI * Math.pow(radiodouble, 3);

        System.out.println("Su volumen es:" + volumen + " unidades cubicas");
    }
}
