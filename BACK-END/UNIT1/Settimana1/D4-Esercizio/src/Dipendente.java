public abstract class Dipendente implements CheckIn {
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;
    private String oraDiInizio;

    public Dipendente(String matricola){
        this.matricola = matricola;
    }

    public String getMatricola() {
        return this.matricola;
    }

    public double getStipendio() {
        return this.stipendio;
    }

    public double setStipendio(double stipendio) {
       return this.stipendio = stipendio;
    }

    public Dipartimento setDipartimento() {
        return this.dipartimento;
    }

    public Dipartimento getDipartimento() {
        return this.dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
       this.dipartimento = dipartimento;
    }

    public String getOraDiInizio(){
        return this.oraDiInizio;
    }

    public String setOraDiInizio(String str) {
        return this.oraDiInizio = str;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Dipendente " + this.matricola + " {oraDiInizio='" + this.oraDiInizio +"'}";
    }

}
