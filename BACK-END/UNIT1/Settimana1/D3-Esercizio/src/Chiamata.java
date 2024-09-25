public class Chiamata {
    public String numero;
    public String durata;

    public Chiamata(String numero, String durata) {
        this.numero = numero;
        this.durata = durata;
    }

    public void stampaChiamata() {
        System.out.println("Numero chiamato: " + this.numero + ", Durata: " + this.durata);
    }
}