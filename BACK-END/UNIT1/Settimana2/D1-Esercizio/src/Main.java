import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int position = -1;
        int num = -1;

        int[] x = {1, 3, 7, 8, 10};
        System.out.println(Arrays.toString(x));

        while (true) {
            try {
                System.out.println("Scrivi un numero da 1 a 10 (o 0 per uscire): ");
                num = sc.nextInt();

                if (num == 0) {
                    System.out.println("Hai scelto di uscire. Programma terminato.");
                    break;
                }

                if (num > 0 && num <= 10) {
                    System.out.println("In quale posizione dell'array? (0-4): ");
                    position = sc.nextInt();

                    if (position >= 0 && position < x.length) {
                        x[position] = num;
                        System.out.println(Arrays.toString(x));
                    } else {
                        System.out.println("Posizione non valida. Inserisci un valore da 0 a 4.");
                    }

                } else {
                    System.out.println("Numero fuori dal range (1-10). Riprova.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Errore: devi inserire un numero intero.");
                sc.next();

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore: la posizione inserita è fuori dal range dell'array.");
            }
        }

        sc.close();
    }
}