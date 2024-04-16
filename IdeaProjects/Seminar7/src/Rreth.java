//Krijoni superklasën Rreth, me fusha private rreze dhe ngjyrë .
//Klasa ka:
//• një konstruktor pa argumenta që inicializon rrezen me 1.0 dhe ngjyrën me “blu”,
//• një konstruktor me argumenta rrezen dhe ngjyrën
//• metodat get dhe set për çdo fushë.
//• një metodë që kthen sipërfaqen e rrethit.
public class Rreth {
    private double rrezja;
    private String ngjyra;

    public Rreth(){
        rrezja = 0.1;
        ngjyra = "blu";
    }

    public Rreth(double rrezja, String ngjyra){
        this.rrezja = rrezja;
        this.ngjyra = ngjyra;
    }

    public double getRrezja() {
        return rrezja;
    }

    public String getNgjyra(){
        return ngjyra;
    }

    public void setRrezja(double rrezja) {
        this.rrezja = rrezja;
    }

    public void setNgjyra(String ngjyra) {
        this.ngjyra = ngjyra;
    }

    public double siperfaqja(){
        return 3.14*Math.pow(rrezja,2);
    }
}
