public class ProvaEsercizi {

    public static void main(String[]args){

        // Test moltiplica
        int prodotto = moltiplica(4, 5);
        System.out.println("Prodotto: " + prodotto);

        // Test concatena
        String concatenato = concatena("ciao", 3);
        System.out.println("Concatenazione: " + concatenato);

        // Test inserisciArray
        String[] array = {"uno", "due", "tre", "quattro", "cinque"};
        String[] nuovoArray = inserisciArray(array, "NUOVO");

        System.out.print("Nuovo array: ");
        for (String s : nuovoArray) {
            System.out.print(s + " ");
        }
    }

    // Metodo moltiplica
    public static int moltiplica(int a, int b) {
        return a * b;
    }

    // Metodo concatena
    public static String concatena(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    // Metodo inserisciArray
    public static String[] inserisciArray(String[] arr, String str) {
        if (arr.length != 5) {
            throw new IllegalArgumentException("L'array deve contenere esattamente 5 elementi.");
        }

        String[] nuovoArray = new String[6];
        nuovoArray[0] = arr[0];
        nuovoArray[1] = arr[1];
        nuovoArray[2] = str;
        nuovoArray[3] = arr[2];
        nuovoArray[4] = arr[3];
        nuovoArray[5] = arr[4];

        return nuovoArray;
    }
}












