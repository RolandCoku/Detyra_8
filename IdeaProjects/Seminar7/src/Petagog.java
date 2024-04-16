public class Petagog extends Person{
    private int nrlendesh;
    private double paga;

    public Petagog(String emri, String adresa, int nrlendesh, double paga){
        super(emri, adresa);
        this.nrlendesh = nrlendesh;
        this.paga = paga;
    }

    public double getPaga() {
        return paga;
    }

    public int getNrlendesh() {
        return nrlendesh;
    }

    public void setNrlendesh(int nrlendesh) {
        this.nrlendesh = nrlendesh;
    }

    public void setPaga(double paga) {
        this.paga = paga;
    }

    @Override
    public String toString() {
        return "Petagog{" +
                "nrlendesh=" + nrlendesh +
                ", paga=" + paga +
                '}';
    }
}
