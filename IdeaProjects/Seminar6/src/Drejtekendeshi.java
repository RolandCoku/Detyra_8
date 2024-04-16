//Nderto nje klase Drejkendeshi qe permban:
//o Dy fusha te dhenash double, gjeresia dhe gjatesia me vlera default 1.
//o Nje konstruktor pa argumenta qe krijon nje drejkendesh default.
//o Nje konstruktor qe krijon nje drejkendesh me gjeresi dhe gjatesi te dhene.
//o Nje metode siperfaqja() qe kthen siperfaqen e drejkendeshit.
//o Nje metode perimetri() qe kthen perimetrin.
public class Drejtekendeshi {
    double gjeresia;
    double gjatesia;
    public Drejtekendeshi(){
        gjeresia = 1;
        gjatesia = 1;
    }
    public Drejtekendeshi(double gjatesia, double gjeresia){
        this.gjatesia = gjatesia;
        this.gjeresia = gjeresia;
    }

    public double sipefaqja(){
        return gjeresia*gjatesia;
    }

    public double perimetri(){
        return (2*gjatesia)+(2*gjeresia);
    }

}
