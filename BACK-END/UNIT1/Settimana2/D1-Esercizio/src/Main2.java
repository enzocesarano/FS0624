import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Inserisci i km percorsi: ");
            double km = sc.nextDouble();

            System.out.print("Inserisci i litri di carburante consumati: ");
            double litri = sc.nextDouble();

            if (litri == 0) {
                throw new ArithmeticException("Errore: Divisione per zero. Non puoi inserire 0 litri.");
            }
            double kmPerLitro = km / litri;
            System.out.print("Hai percorso " + kmPerLitro + "km per litro");

        } catch (InputMismatchException e) {
            System.out.println("Errore: Devi inserire un numero valido.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}