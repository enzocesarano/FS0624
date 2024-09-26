public class Volontario implements CheckIn {
   private String name;
   private int età;
   public String curriculum;
   private String oraDiInizio;

   public Volontario(String name, int età, String curriculum) {
       this.name = name;
       this.età = età;
       this.curriculum = curriculum;
   }

    public String getOraDiInizio(){
        return this.oraDiInizio;
    }

    public String setOraDiInizio(String str) {
        return this.oraDiInizio = str;
    }

    @Override
    public void checkIn(String str) {
        this.setOraDiInizio(str);
        this.getOraDiInizio();
    }

    @Override
    public String toString() {
        return "Il Volontario {oraDiInizio='" + this.oraDiInizio +"'}";
    }
}
