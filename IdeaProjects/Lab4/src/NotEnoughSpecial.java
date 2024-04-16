public class NotEnoughSpecial extends NotEnoughException{
    public NotEnoughSpecial(int should, int is){
        super(should,is);
    }

    @Override
    public String toString(){
        return "Mumri i karaktereve te vecanta te dhena eshte "+super.getIs()+" nga "+super.getShould()+" qe kerkohet minimalisht!";
    }

}
