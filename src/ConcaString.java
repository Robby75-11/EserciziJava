import java.util.Scanner;

public class ConcaString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Acquisizione delle tre stringhe
        System.out.print("Inserisci la prima stringa: ");
        String s1 = scanner.nextLine();

        System.out.print("Inserisci la seconda stringa: ");
        String s2 = scanner.nextLine();

        System.out.print("Inserisci la terza stringa: ");
        String s3 = scanner.nextLine();

        // Concatenazione in ordine di inserimento
        String concatenazioneDiretta = s1 + s2 + s3;
        System.out.println("Concatenazione in ordine: " + concatenazioneDiretta);

        // Concatenazione in ordine inverso
        String concatenazioneInversa = s3 + s2 + s1;
        System.out.println("Concatenazione inversa: " + concatenazioneInversa);

        scanner.close();
    }
}
