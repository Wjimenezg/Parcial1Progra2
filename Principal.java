package parcial1Progra2;

import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número binario: ");
        String salidaBinario = scanner.nextLine();
        
        
       ConversoraDecimal conversion = new ConversoraDecimal(salidaBinario);
        int salidaDecimal = conversion.convertir();
        System.out.println("El valor decimal de " + salidaBinario + " es: " + salidaDecimal);
    }

}