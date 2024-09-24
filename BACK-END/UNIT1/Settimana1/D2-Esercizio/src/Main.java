import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Esercizio1 ex1 = new Esercizio1();
        Esercizio2 ex2 = new Esercizio2();


        System.out.println("********************************* ESERCIZIO 1 *********************************");
        System.out.println("Inserisci una parola: ");
        String a = scn.nextLine();
        boolean b = ex1.pariDispari(a);
        System.out.println(b);

        System.out.println("Inserisci un anno: ");
        int year = scn.nextInt();
        boolean c = ex1.annoBisestile(year);
        System.out.println(c ? "Anno bisestile" : "Anno non bisestile");
        System.out.println("*******************************************************************************");

        System.out.println("********************************* ESERCIZIO 2 *********************************");
        System.out.println("Inserisci un numero da 0-3: ");
        int numero = scn.nextInt();
        String numberLetter = ex2.letter(numero);
        System.out.println(numberLetter);

        scn.nextLine();

        String parola;
        do {
            System.out.println("Inserisci una parola oppure ':q' per uscire: ");
            parola = scn.nextLine();
            if (parola.equals(":q")) {
                break;
            }
            String splitParola = ex2.splitString(parola);
            System.out.println(splitParola);

        } while (true);

        System.out.println("Inserisci un numero: ");
        int number1 = scn.nextInt();
        int counter = ex2.counterToZero(number1);
        System.out.println("*******************************************************************************");

    }
}