import java.util.Scanner;

//Shkruaj një aplikacion që lexon nga përdoruesi një numër të plotë me 5 shifra,
//ndan numrin në shifra individuale dhe afishon shifrat të ndara nga njëra-tjetra me 3 hapësira.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jepni nje numer me 5 shifra: ");
        int nr = scanner.nextInt();
        int pjesetuesi = 1;

        while (nr/pjesetuesi >= 10){
            pjesetuesi *= 10;
        }

        while (pjesetuesi > 0){
            System.out.print(((nr/pjesetuesi)%10)+" ");
            pjesetuesi /= 10;
        }

        String numer = Integer.toString(nr);

        for (int i = 0; i < numer.length(); i++){
            System.out.print(numer.charAt(i)+" ");
        }
    }
}