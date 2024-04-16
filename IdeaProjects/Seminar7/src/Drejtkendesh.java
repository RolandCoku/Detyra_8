public class Drejtkendesh extends Figura{
    private int gjeresi;
    private int gjatesi;

    public Drejtkendesh(String ngjyre, int gjatesi, int gjeresi){
        super(ngjyre);
        this.gjeresi = gjeresi;
        this.gjatesi = gjatesi;
    }

    public int getGjtesi(){
        return gjatesi;
    }
    public int getGjresi(){
        return gjeresi;
    }
    public void setGjeresi(int gjeresi){
        this.gjeresi = gjeresi;
    }
    public void setGjatesi(int gjatesi){
        this.gjatesi = gjatesi;
    }
    public int siperfaqja(){
        return gjatesi*gjeresi;
    }

    @Override
    public String toString(){
        return "Figura eshte nje drejtekendesh ngjyre "+this.getNgjyre()+" me gjatesi "+gjatesi+" ,me gjeresi "+gjeresi +" dhe siperfaqe "+this.siperfaqja();
    }
}
