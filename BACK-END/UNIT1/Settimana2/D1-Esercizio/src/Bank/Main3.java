package Bank;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Scegli il tipo di conto:");
        System.out.println("1 - ContoCorrente");
        System.out.println("2 - ContoOnLine");
        System.out.print("Scelta: ");
        int tipoConto = sc.nextInt();

        ContoCorrente conto = null;

        if (tipoConto == 1) {
            conto = new ContoCorrente("Mario Rossi", 1000);
        } else if (tipoConto == 2) {
            conto = new ContoOnLine("Luigi Verdi", 1500, 500);  // max prelievo 500 per ContoOnLine
        } else {
            System.out.println("Scelta non valida. Uscita dal programma.");
            sc.close();
            return;
        }

        boolean continua = true;

        while (continua) {
            System.out.println("\nScegli un'operazione:");
            System.out.println("1 - Prelievo");
            System.out.println("0 - Esci");
            System.out.print("Scelta: ");
            int scelta = sc.nextInt();

            switch (scelta) {
                case 1:
                    try {
                        System.out.print("Inserisci l'importo da prelevare: ");
                        double importo = sc.nextDouble();
                        conto.preleva(importo);
                        System.out.println("Saldo attuale: " + conto.restituisciSaldo());
                    } catch (BancaException e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                    break;

                case 0:
                    continua = false;
                    System.out.println("Grazie per aver utilizzato il servizio!");
                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        }

        sc.close();
    }
}