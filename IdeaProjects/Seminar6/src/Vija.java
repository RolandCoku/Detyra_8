import javax.print.DocFlavor;

//Dhe klasa Vija qe perfaqeson nje segment midis dy pikave. Metodat e klases Vija jane:
//o public Vija (Pika p1, Pika p2) Nderton nje vije qe permban keto dy Pika.
//o public Vija (int x1, int y1, int x2, int y2)
//o public Pika getP1() Kthen fillimin e vijes.
//o public Pika getP2 () Kthen fundin e vijes.
//o public String toString ( )Kthen nje paraqitje ne forme Stringe te Vija si: “[(11,12),(6,9)]”
//o public double pjerrtesia () Kthen pjerresine evijes.
//  Pjerresia midis dy pikave (x1,y1) dhe (x2,y2) llogaritet me formulen (y2-y1)/(x2-x1).
public class Vija {
    private Pika p1;
    private Pika p2;
    public Vija(Pika p1, Pika p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Vija(int x1, int y1, int x2, int y2){
        p1 = new Pika();
        p1.setX(x1);
        p1.setY(y1);

        p2 = new Pika();
        p2.setX(x2);
        p2.setY(y2);
    }
    public Pika getP1() {
        return p1;
    }
    public Pika getP2(){
        return p2;
    }

    public double pjerresia(){
        return (p2.getY()-p1.getY())/(p2.getX()-p1.getX());
    }

    @Override
    public String toString(){
        return "[("+p1.getX()+", "+p1.getY()+"), ("+p2.getX()+", "+p2.getY()+")]";
    }
}
