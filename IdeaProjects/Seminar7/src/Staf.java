//Një anetar stafi ka një titull.
public class Staf extends Punonjesi{
    private String titulli;
    public Staf(String emri, String adresa, String nrTel, String email, int zyra, int paga, String titulli){
        super(emri, adresa, nrTel, email, zyra, paga);
        this.titulli = titulli;
    }
    public void setTitulli(String titulli){
        this.titulli = titulli;
    }
    public String getTtitulli(){
        return titulli;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
