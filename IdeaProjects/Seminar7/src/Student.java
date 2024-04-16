public class Student extends Person{
    private int nrLendesh;
    private double mesatarja;

    public Student(String emri, String adresa){
        super(emri, adresa);
        this.nrLendesh = 0;
        this.mesatarja = -1;
    }

    public Student(String emri, String adresa, int nrLendesh, double mesatarja){
        super(emri, adresa);
        this.nrLendesh = nrLendesh;
        this.mesatarja = mesatarja;
    }

    public int getNrLendesh(){
        return nrLendesh;
    }

    public double getMesatarja(){
        return mesatarja;
    }

    public void setNrLendesh(int nrLendesh){
        this.nrLendesh = nrLendesh;
    }

    public void setMesatarja(double mesatarja){
        this.mesatarja = mesatarja;
    }

    @Override
    public String toString(){
        return "Studenti: " + getEmri() + "banon ne " + getAdresa() + "frekuenton " + nrLendesh + "lende dhe ka mesatare: "+mesatarja;
    }
}
