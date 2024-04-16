//Ndertoni superklasen Punonjës me fushta emer dhe oret_punes.Klasa ka:
//• një konstruktor pa argumenta
//• një konstruktor me argumenta emer dhe oret_punes
//• metodat get dhe set për çdo fushë.
//• një metodë toString
//• metoden public int paga() qe kthen pagen oret_punes * 100
public class Punonjes {
    private String emer;
    private int orePune;
    public Punonjes(){

    }
    public Punonjes(String emer, int orePune){
        this.emer = emer;
        this.orePune = orePune;
    }
    public String getEmer(){
        return emer;
    }
    public int getOrePune(){
        return orePune;
    }
    public void setEmer(String emer){
        this.emer = emer;
    }
    public void setOrePune(int orePune){
        this.orePune = orePune;
    }

    @Override
    public String toString(){
        return "Punonjesi "+emer+" ka " +orePune+" ore pune";
    }

    public int paga(){
        return orePune*100;
    }
}
