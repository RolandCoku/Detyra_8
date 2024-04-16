//Një punonjës ka një zyrë dhe pagën.

public class Punonjesi extends Personi {
    private int zyra;
    private int paga;

    public Punonjesi(String emri, String adresa, String nrTel, String email, int zyra, int paga){
        super(emri, adresa, nrTel, email);
        this.zyra = zyra;
        this.paga = paga;
    }

    public int getZyra(){
        return zyra;
    }
    public int getPaga(){
        return paga;
    }
    public void setZyra(int zyra){
        this.zyra = zyra;
    }
    public void setPaga(int paga){
        this.paga = paga;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
