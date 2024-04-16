import java.util.Scanner;
//Shkruaj një program që lexon një string dhe tregon nëse është palindromë
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strg;
        boolean palindrome = true;
        System.out.print("Jeni nje stringe: ");
        strg = scanner.nextLine();
        for (int i = 0; i<strg.length()/2; i++){
            if(strg.charAt(i) != strg.charAt(strg.length()-1-i)){
                System.out.println("Stringa nuk eshte palindrome!");
                palindrome = false;
            }
        }
        if(palindrome){
            System.out.println("Stringa eshte palindrome");
        }
    }
}