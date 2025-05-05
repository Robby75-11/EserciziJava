
import java.util.Scanner;

public class PeriRetta {

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
        System.out.println("Il numero è " + (risultato == 0 ? "pari" : "dispari"));

        // Triangolo
        System.out.print("Inserisci il primo lato del triangolo: ");
        double a = scanner.nextDouble();
        System.out.print("Inserisci il secondo lato del triangolo: ");
        double b = scanner.nextDouble();
        System.out.print("Inserisci il terzo lato del triangolo: ");
        double c = scanner.nextDouble();
        double area = areaTriangolo(a, b, c);
        System.out.println("Area del triangolo: " + area);

        scanner.close();
    }

    // Metodo perimetro rettangolo
    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    // Metodo pari/dispari
    public static int pariDispari(int numero) {
        return numero % 2 == 0 ? 0 : 1;
    }

    // Metodo area triangolo (formula di Erone)
    public static double areaTriangolo(double a, double b, double c) {
        double s = (a + b + c) / 2; // semiperimetro
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
