import java.util.HashMap;
import java.util.Map;

public class Main3 {

    private static HashMap<String, String> rubrica = new HashMap<>();

    public static void aggiungiContatto(String nome, String telefono) {
        rubrica.put(nome, telefono);
        System.out.println("Contatto aggiunto: " + nome + " - " + telefono);
    }

    public static void cancellaContatto(String nome) {
        if (rubrica.containsKey(nome)) {
            rubrica.remove(nome);
            System.out.println("Contatto " + nome + " cancellato.");
        } else {
            System.out.println("Contatto non trovato.");
        }
    }

    public static String trovaNomePerNumero(String telefono) {
        for (Map.Entry<String, String> contatto : rubrica.entrySet()) {
            if (contatto.getValue().equals(telefono)) {
                return contatto.getKey();
            }
        }
        return "Numero non trovato.";
    }

    public static String trovaNumeroPerNome(String nome) {
        return rubrica.getOrDefault(nome, "Contatto non trovato.");
    }

    public static void stampaRubrica() {
        if (rubrica.isEmpty()) {
            System.out.println("La rubrica è vuota.");
        } else {
            System.out.println("Rubrica telefonica:");
            for (Map.Entry<String, String> contatto : rubrica.entrySet()) {
                System.out.println(contatto.getKey() + ": " + contatto.getValue());
            }
        }
    }

    public static void main(String[] args) {
        aggiungiContatto("Mario", "123456789");
        aggiungiContatto("Luca", "987654321");
        aggiungiContatto("Giulia", "555666777");

        System.out.println("\nRubrica iniziale:");
        stampaRubrica();

        System.out.println("\nNumero di Giulia: " + trovaNumeroPerNome("Giulia"));

        System.out.println("\nNome per il numero 987654321: " + trovaNomePerNumero("987654321"));

        cancellaContatto("Luca");

        System.out.println("\nRubrica dopo la cancellazione:");
        stampaRubrica();
    }
}