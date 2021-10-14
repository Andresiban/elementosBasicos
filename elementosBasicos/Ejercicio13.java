package elementosBasicos;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        String nombre = sc.nextLine();
        System.out.println();
        System.out.println("¿Cuál es tu edad?");
        int edad = sc.nextInt();
        System.out.println(" ¿Cuántos años de experiencia tienes?");
        int experiencia = sc.nextInt();
        sc.nextLine();
        System.out.println("¿Qué comida prefieres cocinar?");
        String preferencia = sc.nextLine();

        System.out.println("El formulario de " + nombre + ", de " + edad + " años y " + experiencia + " de experiencia, está completo. Nos comunicaremos con usted si necesitamos a alguien que cocine comida " + preferencia + ".");

    }
}
