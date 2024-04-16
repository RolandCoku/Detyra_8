public class TabelaPikeve {
    private int nr_lojtar;
    private Lojtar[] loja;

    public TabelaPikeve(int kapaciteti){
        loja = new Lojtar[kapaciteti];
        nr_lojtar = 0;
    }
    public void shto(Lojtar newLojtar){
        nr_lojtar++;
        if(loja[loja.length-1]==null){
            int i = nr_lojtar-1;
            while (i>=0 && loja[i].getPiket()>newLojtar.getPiket()) {
                loja[i+1] = loja[i];
                i--;
            }
            loja[i] = newLojtar;
        }
    }
    
}
