import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main2 {

    public static List<Integer> generaListaCasuale(int N) {
        Random rand = new Random();
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            lista.add(rand.nextInt(101));
        }

        Collections.sort(lista);
        return lista;
    }

    public static List<Integer> duplicaConInverso(List<Integer> lista) {
        List<Integer> nuovaLista = new ArrayList<>(lista);
        List<Integer> listaInvertita = new ArrayList<>(lista);

        Collections.reverse(listaInvertita);

        nuovaLista.addAll(listaInvertita);
        return nuovaLista;
    }

    public static void stampaPosizioni(List<Integer> lista, boolean pari) {
        if (pari) {
            System.out.println("Valori in posizioni pari:");
            for (int i = 0; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        } else {
            System.out.println("Valori in posizioni dispari:");
            for (int i = 1; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero N di elementi da generare: ");
        int N = scanner.nextInt();

        List<Integer> listaCasuale = generaListaCasuale(N);
        System.out.println("Lista casuale ordinata:");
        System.out.println(listaCasuale);

        List<Integer> listaConInverso = duplicaConInverso(listaCasuale);
        System.out.println("Lista con elementi duplicati in ordine inverso:");
        System.out.println(listaConInverso);


        System.out.print("Vuoi stampare i valori in posizioni pari? (true/false): ");
        boolean pari = scanner.nextBoolean();
        stampaPosizioni(listaConInverso, pari);

        scanner.close();
    }
}