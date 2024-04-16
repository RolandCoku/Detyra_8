//Te ndertohet nje klase Kompjuter qe permban:
//o Fushat: firma_prodhimit, viti_prodhimit, cmimi, shpejtesia_procesorit.
//o Konstruktori: public Kompjuter (String f, int v, int c, double s)
//o Metoda get/set per aksesimin e kater fushave.
//o public Boolean krahaso (Kompjuter k) kthen true nese dy kompjutera jane te njejte duke u bazuar vetem tek firma dhe shpejtesia e procesorit.
//o public Kompjuter krahaso1 (Kompjuter k) kthen kompjuterin me te shpejte duke u bazuar tek shpejtesia e procesorit.
//o public String toString() kthen nje paraqitje te Kompjuter si String : [“HP”, 2015, 500, 2.4GH]
public class Kompjuter {
    private String firma_prodhimit;
    private int viti_prodhimit;
    private int cmimi;
    private double shpejtesia_procesorit;

    public Kompjuter(String firma_prodhimit, int viti_prodhimit, int cmimi, double shpejtesia_procesorit ){
        this.firma_prodhimit = firma_prodhimit;
        this.viti_prodhimit = viti_prodhimit;
        this.cmimi = cmimi;
        this.shpejtesia_procesorit = shpejtesia_procesorit;
    }

    public String getFirma_prodhimit(){
        return firma_prodhimit;
    }
    public int getViti_prodhimit(){
        return viti_prodhimit;
    }

    public int getCmimi() {
        return cmimi;
    }

    public double getShpejtesia_procesorit(){
        return shpejtesia_procesorit;
    }

    public void setFirma_prodhimit(String firma_prodhimitERe){
        firma_prodhimit = firma_prodhimitERe;
    }

    public void setViti_prodhimit(int viti_prodhimitIRi){
        viti_prodhimit = viti_prodhimitIRi;
    }

    public void setCmimi(int cmimiRi){
        cmimi = cmimiRi;
    }

    public void setShpejtesia_procesorit(double shpejtesia_procesoritERe){
        shpejtesia_procesorit = shpejtesia_procesoritERe;
    }

    public boolean krahaso(Kompjuter kompjuter1){
        return (this.firma_prodhimit.equals(kompjuter1.firma_prodhimit)) && (this.shpejtesia_procesorit == kompjuter1.shpejtesia_procesorit);
    }

    public Kompjuter krahaso1(Kompjuter kompjuter1){
        if (this.shpejtesia_procesorit > kompjuter1.shpejtesia_procesorit) {
            return this;
        } else
            return kompjuter1;
    }

    @Override
     public String toString(){
        return "[\""+firma_prodhimit+"\", "+viti_prodhimit+", "+cmimi+", "+shpejtesia_procesorit+"GH]";
    }

}

