public class NotEnoughLower extends NotEnoughLetter{

    public NotEnoughLower(int should, int is){
        super(should,is);
    }

    @Override
    public String toString(){
        return "Mumri i karaktereve te vogla te dhena eshte "+super.getIs()+" nga "+super.getShould()+" qe kerkohet minimalisht!";
    }
}
