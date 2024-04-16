public class Password {

    private final int nrUpperShould, nrLowerShould, nrSpecialShould, nrNumberShould, lengthShould;
    private final char[] illegalChar;

    public Password(int nrUpperShould, int nrLowerShould, int nrSpecialShould, int nrNumberShould, int lengthShould, char[] illegalChar){
        this.nrUpperShould = nrUpperShould;
        this.nrLowerShould = nrLowerShould;
        this.nrSpecialShould = nrSpecialShould;
        this.nrNumberShould = nrNumberShould;
        this.lengthShould = lengthShould;
        this.illegalChar = illegalChar;
    }


    public void checkFormat(String Password) throws IllegalCharacterException, NotEnoughException, NotLongEnoughException{
    }

    public static void main(String[] args){

        Password password = new Password(2, 2, 2, 2, 2, new char[]{'\n','\t','\r',' '});

        try {
            password.checkFormat(password);
        }catch (NotEnoughException | NotLongEnoughException | IllegalCharacterException exception){
            System.out.println("Formati Gabim");
            System.out.println(exception);
        }
    }
}

