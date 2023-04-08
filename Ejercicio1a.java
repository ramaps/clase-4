package Actividades;
import java.util.Arrays;

public class Ejercicio1a {
    public static void main(String[] args) {

        int numero1 = 3;
        int numero2 = 15;
        int numero3 = 8;
        char letra= 'a';
        
        
        int numeros[]= {numero1, numero2, numero3};
         if (letra == 'a') {
            Arrays.sort(numeros);
        } 
        System.out.println("los numeros ordenados de manera ascendente son" + Arrays.toString(numeros));
    }
}