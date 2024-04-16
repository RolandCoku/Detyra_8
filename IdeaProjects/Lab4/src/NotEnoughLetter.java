public class NotEnoughLetter extends NotEnoughException{

    private int should,is;

    public NotEnoughLetter(int should, int is){
        super(should,is);
    }

    public int getShould() {
        return should;
    }

    public int getIs() {
        return is;
    }
}
