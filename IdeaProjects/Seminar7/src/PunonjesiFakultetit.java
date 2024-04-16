//Një PunonjesiFakultetit ka orarin e punës dhe rolin.
public class PunonjesiFakultetit extends Punonjesi{
    private String orariPunes;
    private String roli;
    public PunonjesiFakultetit(String emri, String adresa, String nrTel, String email, int zyra, int paga, String orariPunes, String roli){
        super(emri, adresa, nrTel, email, zyra, paga);
        this.orariPunes = orariPunes;
        this.roli = roli;
    }
    public String getOrariPunes(){
        return orariPunes;
    }
    public String gerRoli(){
        return roli;
    }
    public void setOrariPunes(String orariPunes){
        this.orariPunes = orariPunes;
    }
    public void setRoli(String roli){
        this.roli = roli;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
