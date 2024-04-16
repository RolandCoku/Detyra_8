import java.util.Scanner;

//Shkruaj një program që kontrollon nëse stringa ‘abc’ është në mes të një stringe të dhënë. Në mes
//do jetë nëse numri i karaktereve majtas dhe djathtas saj mund të ndryshojnë nga e shumta 1
//karakter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;

        System.out.print("Jepni nje stringe qe permban abc: ");
        string = scanner.nextLine();

        boolean inMiddle = false;
//Nese stringa eshte tek abc qe te ndodhet ne mes duhet te jete ne pozicionin string.length()/2 - 1 and string.length()/2 + 2
//Kushtet e lidhura me or plotesojne kushtet e kerkeses qe abc te llogaritet si ne mes edhe nese leviz me nje karakter nga majtas apo djathtas nga mesi

        if(string.length() % 2 != 0){
            if((string.substring(string.length()/2 - 1, string.length()/2 + 2).equals("abc"))
                    ||(string.substring(string.length()/2 - 2, string.length()/2 + 1).equals("abc"))
                    ||(string.substring(string.length()/2, string.length()/2 + 3).equals("abc"))){
                inMiddle = true;
            }
        }
//Nese stringa eshte cift abc qe te ndodhet ne mes duhet te jete ne pozicionin string.lengh()/2-1 dhe string.length()/2 + 2 ose nese ndodhet ne pozicionin string.length()/2 - 2 dhe string.length/2
        if(string.length()%2 == 0){
            if((string.substring(string.length()/2 - 2,string.length()/2+1).equals("abc"))
                    ||string.substring(string.length()/2 - 1, string.length()/2 + 2).equals("abc")){
                inMiddle = true;
            }
        }
        System.out.println(inMiddle);
    }
}