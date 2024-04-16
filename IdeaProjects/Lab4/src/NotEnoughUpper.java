public class NotEnoughUpper extends NotEnoughLetter{
    public NotEnoughUpper(int should, int is){
        super(should,is);
    }

    @Override
    public String toString(){
        return "Password-i duhet te permbaje te pakten "+super.getShould()+" shkronja te medha!";
    }

}
