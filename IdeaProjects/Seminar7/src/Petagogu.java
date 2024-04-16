//Plotesojeni klasen Pedagogu me nje:
//• konstruktor qe merr tre argumenta: ore pune, emrin dhe titullin
//• metode paga () qe kthen rrogen e nje Pedagogu te barabarte me rrogen e nje punonjesi +500
public class Petagogu extends Punonjes{
    private String titulli;
    public Petagogu(int orePune, String emri, String titulli){
        super(emri, orePune);
        this.titulli = titulli;
    }
    public String getTitulli(){
        return titulli;
    }
    public void setTitulli(String titulli){
        this.titulli = titulli;
    }
    @Override
    public int paga(){
        return super.paga()+500;
    }
}
