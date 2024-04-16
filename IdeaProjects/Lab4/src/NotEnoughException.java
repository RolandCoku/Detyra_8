
public class NotEnoughException extends Exception{
    private int should, is;

    public NotEnoughException(int should, int is){
        this.should = should;
        this.is = is;
    }

    public int getShould() {
        return should;
    }

    public int getIs() {
        return is;
    }
}
