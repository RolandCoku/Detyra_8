public class TestFigura {
    public static void main(String[] args){
        Figura figure = new Figura("blu");
        Drejtkendesh drejtkendesh = new Drejtkendesh("i kuq", 5, 6);
        Trekendesh trekendesh = new Trekendesh("jeshil", 4, 6);

        System.out.println(figure);
        System.out.println(drejtkendesh);
        System.out.println(trekendesh);
    }
}
