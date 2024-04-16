public class Ushtrimi1 {
    int nr1, nr2, nr3;

    public Ushtrimi1(int nr1, int nr2, int nr3){
        this.nr1 = nr1;
        this.nr2 = nr2;
        this.nr3 = nr3;
    }

    public int shuma(){
        return nr1+nr2+nr3;
    }

    public int prodhimi(){
        return nr1*nr2*nr3;
    }

    public int mesatarja(){
        return shuma()/3;
    }

}
