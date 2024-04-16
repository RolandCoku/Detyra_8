import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        double rrenje1, rrenje2;

        System.out.println("Jepni vlerat e koeficienteve a, b, c :");
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();
        double dallor = llogaritDallor(a,b,c);
        rrenje1 = llogaritRreje(dallor,a,b,'-');
        rrenje2 = llogaritRreje(dallor,a,b,'+');
        System.out.println("Rrejet: "+rrenje1+" "+rrenje2);

    }
    public static double llogaritDallor(int a, int b, int c){
        int temp = b*b-4*a*c;
        double dallor = Math.sqrt(temp);
        return dallor;
    }

    public static double llogaritRreje(double dalllor, int a, int b, char sheja){
        double nr, p;
        p=2*a;
        if(sheja == '-'){
            nr = -b-dalllor;
        }else {
            nr = -b+dalllor;
        }
        return nr/p;
    }
}