//Krijoni superklasën Figura, me fushën private ngjyre.
//Krijoni nënklasat Drejtkendesh, me fusha private gjeresi dhe gjatesi, dhe Trekendesh, me fusha private bazë dhe lartësi.
//Për secilen nga 3 klasat krijoni metodat siperfaqja (), që llogarit sipërfaqen e figurës, dhe toString(), që kthen të dhënat e figurës në form String.
//Krijoni klasën TestFigure, për të provuar metodat e krijuara.
public class Figura {
    private String ngjyre;
    public Figura(String ngjyre){
        this.ngjyre = ngjyre;
    }
    public String getNgjyre(){
        return ngjyre;
    }
    public void setNgjyre(String ngjyre){
        this.ngjyre = ngjyre;
    }
    @Override
    public String toString(){
        return "Kjo eshte nje figure ngjyre "+ngjyre;
    }
}
