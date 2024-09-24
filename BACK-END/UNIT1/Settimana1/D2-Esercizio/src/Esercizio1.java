public class Esercizio1 {
    public boolean pariDispari(String str) {
        return str.length() % 2 == 0 ;
    }

    public boolean annoBisestile(int year) {
        return year % 4 == 0 || (year % 400 == 0 && year % 100 != 0); /*prova*/
    }
}
