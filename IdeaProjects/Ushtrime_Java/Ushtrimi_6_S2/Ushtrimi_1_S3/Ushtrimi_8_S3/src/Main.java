import java.util.Scanner;

//Shkruaj një program që kthen shumën e numrave që gjenden në një string që merret nga
//përdoruesi.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        int shuma = 0;
        int numriGjetur = 0;
        System.out.println("Jepni nje stringe qe permban numra: ");
        string = scanner.nextLine();

        for(int i=0;  i < string.length(); i++){
            numriGjetur = 0;
            while (Character.isDigit(string.charAt(i))){
                numriGjetur += Character.getNumericValue(string.charAt(i));
                numriGjetur *= 10;
                if(i<string.length()-1){
                    i++;
                }
            }
            shuma += numriGjetur/10;
        }

        System.out.println(shuma);
    }
}