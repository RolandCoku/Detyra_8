public class NotLongEnoughException extends Exception{
    private int should, is;
    public NotLongEnoughException(int should, int is){
        this.should = should;
        this.is=is;
    }

    @Override
    public String toString(){
        return "Gjatesia e dhene eshte "+is+" nga "+should+" qe eshte gjatesia minimale e kerkuar!";
    }
}
