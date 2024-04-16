public class Main {
    public static void main(String[] args) {
        Rreth rreth = new Rreth();
        Rreth rreth1 = new Rreth(4, "Jeshile");

        Cilinder cilinder = new Cilinder();
        Cilinder cilinder1 = new Cilinder(5, 4, "Portokalli");

        System.out.println("Ngjyra e rrethit: "+rreth.getNgjyra()+"\n"+"Rrezja: "+rreth.getRrezja()+"\n"+rreth.siperfaqja());
        System.out.println("Ngjyra e cilindrit: "+cilinder1.getNgjyra()+"\n"+"Rrezja: "+cilinder1.getRrezja()+"\n"+"Vellimi"+cilinder1.vellimi());
    }
}