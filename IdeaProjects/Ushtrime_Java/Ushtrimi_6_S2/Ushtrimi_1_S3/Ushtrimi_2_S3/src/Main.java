import java.util.Scanner;

//Shkruaj një program që lexon një string dhe një substring dhe përcakton sa herë shfaqet
//substringa në stringën e dhënë.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strg;
        String subStrg;
        System.out.print("Jepni nje stringe: ");
        strg = scanner.nextLine();
        System.out.print("Jepni nje substringe: ");
        subStrg = scanner.nextLine();

        if(subStrg.length()>strg.length()){
            System.out.println("Substringa "+subStrg+"nuk gjendet ne stringen "+strg);
        }
        int i = 0;
        int count = 0;
        while(i <= strg.length()-subStrg.length()){
            if(strg.startsWith(subStrg, i)){
                count++;
            }
            i += subStrg.length();
        }
        System.out.println("Substring "+subStrg+" gjendet "+count+" ne stringen "+ strg);
    }
}