
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int nr;
        System.out.println("Give a number: ");
        Scanner scanner = new Scanner(System.in);
        nr = scanner.nextInt();

        if (nr%2 == 0) {
            System.out.println(nr+" is even");
        }else {
            System.out.println(nr+" is odd");
        }

    }
}