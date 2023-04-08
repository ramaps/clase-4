package Actividades;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

       
        String archivo = "C:\\Users\\ramir\\OneDrive\\Escritorio\\JAVA\\clase N°4\\ejercicios presentados\\suma.txt";
        System.out.println("Ingrese la operacion a realizar (suma o multiplicacion): ");
        Scanner input = new Scanner(System.in);
        String operacion = input.nextLine();

        operaciones(archivo, operacion);

    }

    public static void operaciones(String ruta, String opcion) {

        int suma = 0;
        int multiplicacion = 1;
        String[] arrayNumeros = new String[10];

        try {

            for (String linea : Files.readAllLines(Paths.get(ruta))) {

                System.out.println("Los numeros son: " + linea + "\n");

                arrayNumeros = linea.split(" ");

                for (int i = 0; i < arrayNumeros.length; i++) {


                    if (opcion.equalsIgnoreCase("suma")) {
                        suma += Integer.parseInt(arrayNumeros[i]);
                    } else {
                        multiplicacion *= Integer.parseInt(arrayNumeros[i]);
                    }
                }

                if (opcion.equalsIgnoreCase("suma")) {
                    System.out.println("la suma total es: " + suma);
                } else {
                    System.out.println("la multiplicacion total es: " + multiplicacion);
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
