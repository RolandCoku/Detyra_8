public class Trekendesh extends Figura{
    private int baze;
    private int lartesi;

    public Trekendesh(String ngjyre, int baze, int lartesi){
        super(ngjyre);
        this.baze = baze;
        this.lartesi = lartesi;
    }
    public int getBaze(){
        return baze;
    }
    public int getLartesi(){
        return lartesi;
    }
    public void setBaze(int baze){
        this.baze = baze;
    }
    public void setLartesi(int lartesi){
        this.lartesi = lartesi;
    }
    public int siperfaqja(){
        return (baze*lartesi)/2;
    }

    @Override
    public String toString(){
        return "Figura eshte nje trekendesh ngjyre "+this.getNgjyre()+" me baze "+baze+" ,lartesi "+lartesi+" dhe siperfaqe "+this.siperfaqja();
    }
}
