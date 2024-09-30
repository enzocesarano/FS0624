public class Main {
    public static void main(String[] args) {
        DipendenteFullTime d1 = new DipendenteFullTime("002", 10, 173);
        d1.setDipartimento(Dipartimento.PRODUZIONE);
        d1.checkIn("6:00");
        d1.calculateSalary();
        System.out.println("Stipendio del Dipendente con matricola " + d1.getMatricola() + ": " + d1.getStipendio() + "€");

        DipendentePartTime d2 = new DipendentePartTime("003", 8.5, 80);
        d2.setDipartimento(Dipartimento.VENDITE);
        d2.checkIn("8:00");
        d2.calculateSalary();
        System.out.println("Stipendio del Dipendente con matricola " + d2.getMatricola() + ": " + d2.getStipendio() + "€");

        Dirigente d3 = new Dirigente("001", 12, 173);
        d3.setDipartimento(Dipartimento.AMMINISTRAZIONE);
        d3.checkIn("8:00");
        d3.calculateSalary();
        System.out.println("Stipendio del Dipendente con matricola " + d3.getMatricola() + ": " + d3.getStipendio() + "€");

        Volontario v1 = new Volontario("Federico", 29, "FedericoIafolla");
        v1.checkIn("9:00");

        Dipendente[] dipendenti = { d1, d2, d3 };

        CheckIn[] d4 = {d1, d2, d3, v1};

        for (int i = 0; i < d4.length; i++){
            System.out.println(d4[i]);
        }

        int somma = 0;
        for(int i = 0; i < dipendenti.length; i++) {
            somma += dipendenti[i].getStipendio();
        }

        System.out.println("La somma degli stipendi di tutti i Dipendenti è: " + somma+"€");
    }
}