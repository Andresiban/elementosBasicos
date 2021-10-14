package elementosBasicos;

import java.util.Scanner;

public class PruebaScanner {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola, ¿cómo te llamas?");

        String nombre = teclado.nextLine();

        System.out.println("Hola, " + nombre);

        System.out.println("¿Y cuál es tu apellido?");

        String apellido = teclado.nextLine();

        System.out.println("Hola "+ nombre + " "+ apellido);

        System.out.println("Dime tu edad y le sumo 5");
        int edad = teclado.nextInt();

        System.out.println("Entiendo, tu edad es " + edad );

























































    }
}
