public class IllegalCharacterException extends Exception{
    private char illegalChar;

    public IllegalCharacterException(char used){
        this.illegalChar = used;
    }

    @Override
    public String toString(){
        return illegalChar +" nuk lejohet te perdoret!";
    }
}
