

import java.util.Scanner;

public class Periretta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rettangolo
        System.out.print("Inserisci il primo lato del rettangolo: ");
        double lato1 = scanner.nextDouble();
        System.out.print("Inserisci il secondo lato del rettangolo: ");
        double lato2 = scanner.nextDouble();
        double perimetroRett = perimetroRettangolo(lato1, lato2);
        System.out.println("Perimetro del rettangolo: " + perimetroRett);

        // Pari o dispari
        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();
        int risultato = pariDispari(numero);
        System
    }
}