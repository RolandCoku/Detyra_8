public class TestPersoni {
    public static void main(String[] args){
        Personi personi1 = new Personi("Roland Coku", "Tirane", "0686252556","rolandcoku1@gmail.com");
        Personi personi2 = new Punonjesi("Roland", "Librazhd", "0685256555", "rolandcoku@icloud.com",303,50000);
        Personi personi3 = new Staf("bbbbb","cccc","010100101010", "mkmasajnjsan", 100, 20000, "Roje");
        Punonjesi punonjesi1 = new Punonjesi("AAAA", "Diber", "0686485889", "roland.coku@fti.edu.al",300,100000);
        Personi personi4 = new Studenti("Landi", "Mullet", "0678383833", "rolandcoku@gmail.com", Studenti.BACHELOR);

        System.out.println(((Staf) personi3).getTtitulli());
    }
}
