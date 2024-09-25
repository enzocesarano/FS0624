public class Sim {
    public String numero;
    private String credito;
    private Chiamata[] listaChiamate;

    public Sim(String numero, String credito, Chiamata[] listaChiamate) {
        this.numero = numero;
        this.credito = credito;
        this.listaChiamate = listaChiamate;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public void setListaChiamate(Chiamata[] listaChiamate) {
        this.listaChiamate = listaChiamate;
    }

    public void stampaSim() {
        System.out.println("Numero SIM: " + this.numero);
        System.out.println("Credito: " + this.credito);
        System.out.println("Lista Chiamate:");
        for (Chiamata chiamata : listaChiamate) {
            chiamata.stampaChiamata();
        }
    }
}