
// Zgjeroni Ushtrimin 2 duke ndërtuar një klasë Personi dhe 2 nënklasa të quajtura Studenti dhe Punonjesi.
// Gjithashtu krijo klasat PunonjesiFakultetit dhe Staf si nënklasa të Punonjesi.
// Një Person ka emrin, adresen, numrin e telefonit dhe adresen e email-it.
// Një student ka statusin (nje konstante BACHELOR ose MASTER). Një punonjës ka një zyrë dhe pagën.
// Një PunonjesiFakultetit ka orarin e punës dhe rolin. Një anetar stafi ka një titull.
// Mbikalo metodën toString ne çdo klase për të shfaqur emrin e klasës dhe emrin e personit.
// Krijo një klasë PunonjesiTest që teston klasat e mësipërme.
public class Personi {
    private String emri;
    private String adresa;
    private String nrTel;
    private String email;
    public Personi(String emri, String adresa, String nrTel, String email){
        this.emri = emri;
        this.adresa = adresa;
        this.nrTel = nrTel;
        this.email = email;
    }

    public String getEmri(){
        return emri;
    }
    public String getAdresa(){
        return adresa;
    }
    public String getNrTel(){
        return nrTel;
    }
    public String getEmail(){
        return email;
    }
    public void setEmri(String emri){
        this.emri = emri;
    }
    public void setAdresa(String adresa){
        this.adresa = adresa;
    }
    public void setNrTel(String nrTel){
        this.nrTel = nrTel;
    }
    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public String toString(){
        return this.getClass().getName() + emri;
    }
}
