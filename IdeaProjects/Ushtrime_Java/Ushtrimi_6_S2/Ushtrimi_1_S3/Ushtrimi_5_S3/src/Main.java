import java.util.Scanner;
//Shkruaj një program që përsërit cdo karakter 2 herë në një string
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strg;

        System.out.println("Jepni nje stringe: ");
        strg = scanner.nextLine();

        String newStrg = "";

        for (int i = 0; i < strg.length(); i++){
            newStrg += strg.charAt(i);
            newStrg += strg.charAt(i);
        }

        System.out.println(newStrg);
    }
}