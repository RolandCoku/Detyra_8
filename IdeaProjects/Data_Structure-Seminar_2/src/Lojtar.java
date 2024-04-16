public class Lojtar {
    private String emri;
    private int piket;

    public Lojtar(String emri, int piket){
        this.emri = emri;
        this.piket = piket;
    }

    public String getEmri() {
        return emri;
    }
    public int getPiket() {
        return piket;
    }

    @Override
    public String toString(){
        return "["+this.emri+": "+this.piket+"]";
    }
}
