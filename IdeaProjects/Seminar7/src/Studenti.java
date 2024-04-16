// Një student ka statusin (nje konstante BACHELOR ose MASTER). Një punonjës ka një zyrë dhe pagën.
public class Studenti extends Personi {
    public final static int BACHELOR = 0;
    public final static int MASTER = 1;
    private int statusi;

    public Studenti(String emri, String adresa, String nrTel, String email, int statusi){
        super(emri, adresa, nrTel, email);
        this.statusi = statusi;
    }
    public String getStatusi(){
        return (statusi == BACHELOR) ? "Bachelor" : "Master";
    }
    public void setBachelor(){
        statusi = BACHELOR;
    }
    public void setMaster(){
        statusi = MASTER;
    }

    @Override
    public String toString(){
        return "Emri: "+getEmri()+
                "\nAdresa: "+getAdresa()+
                "\nNumri telefonit: "+getNrTel()+
                "\nEmail: "+getEmail()+
                "\nStatusi: "+getStatusi();
    }
}
