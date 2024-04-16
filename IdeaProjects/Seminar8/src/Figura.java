//Ndertoni superklasen abstrakte Figura.
//Ajo permban metoden toString() dhe metoden abstrakte Siperfaqja().
//Ndertoni nenklasat Rrethi dhe Katrori qe trashgojne nga superklasa Figura.
//Ata kane fushat rrezja dhe brinja perkatesisht.Ndertoni konstruktoret,
//metodat set/get, toString() dhe metoden gjejSiperfaqen per secilen nga nenklasat.
//Ndertoni klasen TestFigura.
public abstract class Figura {
    public abstract double siperfaqja();

    @Override
    public String toString() {
        return "Figura{}";
    }
}

class Rrethi extends Figura{
    @Override
    public double siperfaqja(){

    }
}
