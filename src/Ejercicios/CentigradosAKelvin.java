package Ejercicios;

import java.io.IOException;
import java.util.Scanner;

public class CentigradosAKelvin {
    public static void main(String[] args) {

        double temperatura;
        char car;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese la temperatura en °C: ");
            temperatura = sc.nextDouble();
            System.out.println("La temperatura en °K ... es: " + (temperatura + 273));
            System.out.println("¿Desea continuar? (S/N)");
            try {
                car = (char)System.in.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }while (car == 's' || car == 'S');
    }
}
