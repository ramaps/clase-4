package Actividades;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio1b {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor para numero1: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingresa el valor para numero2: ");
        int numero2 = scanner.nextInt();
        System.out.print("Ingresa el valor para numero3: ");
        int numero3 = scanner.nextInt();
        System.out.print("Ingresa la letra 'a' para ordenar en orden ascendente: ");
        char letra = scanner.next().charAt(0);
        int[] numeros = {numero1, numero2, numero3};

        if (letra == 'a') {
            Arrays.sort(numeros);
        }
        System.out.println("Los números ordenados en orden ascendente son: " + Arrays.toString(numeros));
    }
}
