public class Main {
    public static void main(String[] args) {

        System.out.println("************************** PRIMO ESERCIZIO **************************");

        Rettangolo primo = new Rettangolo(13, 10);
        primo.area();
        primo.perimetro();
        primo.stampa();

        Rettangolo secondo = new Rettangolo(15, 5);
        secondo.area();
        secondo.perimetro();
        secondo.stampa();

        stampaDueRettangoli(primo, secondo);

        System.out.println("************************** SECONDO ESERCIZIO **************************");

        Chiamata chiamata1 = new Chiamata("+39-3395278894", "52sec");
        Chiamata chiamata2 = new Chiamata("+39-3284567890", "44sec");
        Chiamata chiamata3 = new Chiamata("+39-3451234567", "1min 20sec");
        Chiamata chiamata4 = new Chiamata("+39-3209876543", "2min");
        Chiamata chiamata5 = new Chiamata("+39-3301122334", "45sec");

        Chiamata[] listaChiamate = {chiamata1, chiamata2, chiamata3, chiamata4, chiamata5};

        Sim utente = new Sim("+39-3470757363", "5€", listaChiamate);

        utente.stampaSim();

    }

    public static void stampaDueRettangoli(Rettangolo primo, Rettangolo secondo) {

        double sommaAree = primo.area + secondo.area;
        double sommaPerimetri = primo.perimetro + secondo.perimetro;

        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }
}