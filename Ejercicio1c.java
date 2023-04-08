package Actividades;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ejercicio1c {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2; 
        int numero3;
        char letra;


        if (args.length == 4) {
            numero1 =0;
            numero2=0;
            numero3=0;
            letra='a';
        } else {
            System.out.print("Ingresa el valor para numero1: ");
            numero1 = scanner.nextInt();

            System.out.print("Ingresa el valor para numero2: ");
            numero2 = scanner.nextInt();

            System.out.print("Ingresa el valor para numero3: ");
            numero3 = scanner.nextInt();

            System.out.print("Ingresa la letra 'a' para ordenar en orden ascendente: ");
            letra = scanner.next().charAt(0);
        }

        int[] numeros = {numero1, numero2, numero3};

        ordenarNumeros(numeros, letra);

        System.out.println("Los números ordenados en orden ascendente son: " + Arrays.toString(numeros));
    }

    public static void ordenarNumeros(int numeros[], char letra) {
        if (letra == 'a') {
            Arrays.sort(numeros);
        }
    }
}