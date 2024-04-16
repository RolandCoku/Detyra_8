public class NotEnoughNumber extends NotEnoughException{

    public NotEnoughNumber(int should, int is){
        super(should, is);
    }

    @Override
    public String toString(){
        return "Mumri i karaktereve numer te dhena eshte "+super.getIs()+" nga "+super.getShould()+" qe kerkohet minimalisht!";
    }
}
