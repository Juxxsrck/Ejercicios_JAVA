package Ejercicios;

import java.util.Scanner;

public class IntercambioContenido{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int A, B, Aux;
     System.out.println("Introduzca el valor de A");
     A = sc.nextInt();
     System.out.println("Introduzca el valor de B");
     B = sc.nextInt();
     System.out.println("El valor de A es: " + A + "\nEl valor de B es: " + B + "\nSin intercanbiar");
    Aux = A;
    A = B;
    B = Aux;
    System.out.println("\n\n Intercambiado\nEL valor de A ahora es: " + A + "\nY ahora el valor de B es: " + B);
    }
}