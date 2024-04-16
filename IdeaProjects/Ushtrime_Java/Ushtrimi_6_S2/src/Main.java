import java.util.Scanner;

//Shkruaj një progam që lexon një numer të plotë me 3 shifra dhe afishon shumën e shifrave të tij.
// Psh. Nëse numri është 932, shuma e shifrave është 14.
// Zgjidheni ushtrimin per rastin e pergjithshem kur nuk e dime sa shifra ka numri.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jepni nje numer: ");
        int nr = scanner.nextInt();
        int shuma = 0;

        while (nr > 0){
            shuma += nr%10;
            nr /= 10;
        }

        System.out.println("Shuma: " + shuma);
    }
}