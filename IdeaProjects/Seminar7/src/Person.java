import javax.imageio.plugins.jpeg.JPEGImageReadParam;

//Krijoni superklasën Person, me fusha private emri dhe adresa.
//Krijoni nënklasën Student, me fusha private nrLendesh dhe mesatarja, per numrin e lëndeve që frekuenton një student edhe për notën mesatare përkatësisht.
//Krijoni nënklasën Pedagog, me fusha private nrLendesh dhe paga, për numrin e lëndëve që jep mësim një pedagog edhe për pagën përkatësisht.
//Për çdo fushë krijoni metodat get dhe set dhe për çdo klasë krijoni metodën toString().
//Krijoni klasën TestPerson për të testuar të gjitha metodat e klasave të krijuara.
public class Person {
    private String emri;
    private String adresa;

    public Person(String emri, String adresa){
        this.emri = emri;
        this.adresa = adresa;
    }

    public String getEmri(){
        return emri;
    }

    public String getAdresa(){
        return adresa;
    }

    public void setEmri(String emri){
        this.emri = emri;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString(){
        return "Personi: "+emri + "banon ne " + adresa;
    }
}
