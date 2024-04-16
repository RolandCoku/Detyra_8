//Krijoni nënklasën Cilinder, me fushë private lartesi .
// Klasa ka:
//• një konstruktor pa argumenta që vendos lartesinë 1.0 , rrezen 1.0 dhe ngjyren “blu”
//• një konstruktor me argumenta rrezen, ngjyrën dhe lartësinë
//• metodat get dhe set për fushën
//• një metodë që kthen vëllimin e cilindrit
public class Cilinder extends Rreth{
    private double lartesi;

    public Cilinder(){
        super();
        this.lartesi = 1.0;
    }

    public Cilinder(double rreze, double lartesi, String ngjyra){
        super(rreze,ngjyra);
        this.lartesi = lartesi;
    }

    public double getLartesi() {
        return lartesi;
    }

    public void setLartesi(double lartesi) {
        this.lartesi = lartesi;
    }

    public double vellimi(){
        return this.siperfaqja()*this.lartesi;
    }
}
