public class Rettangolo {
    private double l1;
    private double l2;
    public double area;
    public double perimetro;

    public Rettangolo(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double area() {
        return this.area = this.l1 * this.l2;
    }

    public double perimetro() {
        return this.perimetro = (this.l1 + this.l2) * 2;
    }

    public void stampa() {
        System.out.println("Area del rettangolo: " + this.area);
        System.out.println("Perimetro del rettangolo: " + this.perimetro);
    }

}