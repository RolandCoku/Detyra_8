import java.util.Scanner;

//Ushtrimi 1.
//Shkruaj një program që lexon një string dhe një karakter dhe përcakton sa herë shfaqet ky
//karakter në string.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strg;
        char ch;
        int count = 0;
        System.out.print("Jepni nje stringe: ");
        strg = scanner.nextLine();
        System.out.print("Jepni nje karakter: ");
        ch = scanner.next().charAt(0);

        for (int i = 0; i < strg.length(); i++){
            if(strg.charAt(i) == ch){
                count++;
            }
        }

        System.out.println("Karakteri "+ch+" perseritet "+count+" here ne stringen "+strg);
    }
}