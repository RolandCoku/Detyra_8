import java.util.Scanner;

//Shkruaj një program që cdo folje “është” të një fjalie të dhënë e zëvendëson me ” nuk është”.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println("Jepni nje fjali: ");
        string = scanner.nextLine();
        string = string.replace("eshte","nuk eshte");
        System.out.println(string);
    }
}