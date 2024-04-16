import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nr1, nr2, nr3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jepni tre numra cfaredo:");
        nr1 = scanner.nextInt();
        scanner.nextLine();
        nr2 = scanner.nextInt();
        scanner.nextLine();
        nr3 = scanner.nextInt();
        Ushtrimi1 ushtrimi1 = new Ushtrimi1(nr1,nr2,nr3);
        System.out.println("Shuma: "+ushtrimi1.shuma());
        System.out.println("Mesatarja: "+ushtrimi1.mesatarja());
        System.out.println("Prodhimi: "+ushtrimi1.prodhimi());

        //Ushtrimi2
        System.out.println("Nr1 = "+nr1+" , Nr2 = "+nr2);

        int temp = nr1;
        nr1 = nr2;
        nr2 = temp;

        System.out.println("Nr1 = "+nr1+" , Nr2 = "+nr2);

        //Ushtrimi3

        System.out.println("Numri\tKatrori\tKubi");
        for (int i = 0; i<=5; i++){
            System.out.println((i)+"\t\t"+(i*i)+"\t\t"+(i*i*i));
        }

        //Ushtrimi4
        System.out.println("Nr1\tNr2\tpjesto(Nr1,Nr2)");
        System.out.println(nr1+"\t"+nr2+"\t"+(double)nr2/nr1);
        System.out.println(nr2+"\t"+nr3+"\t"+(double)nr3/nr2);
        System.out.println(nr3+"\t"+nr1+"\t"+(nr1/nr3));

        //Ushtrimi5
        System.out.println("Jepni numrin e minutave: ");
        int min = scanner.nextInt();

        double vite = (double) min/525600;
        double dite = vite*365;

        System.out.println(min+" minuta = "+vite+" vite dhe "+dite + " dite");

        //Ushtrimi6

        System.out.println("Jepni nje numer cfaredo: ");
        int numri = scanner.nextInt();
        int shuma = 0;
        while (numri != 0){
            shuma += numri%10;
            numri /= 10;
        }
        System.out.println("Shuma e shifrave te numrit = "+shuma);

        //Ushtrimi7
        System.out.println("Jepni nje numer:");
        int nr = scanner.nextInt();
        int pjestuesi = 1;
        while (nr/pjestuesi >= 10){
            pjestuesi *= 10;
        }
        while (pjestuesi != 0){
            System.out.print(((nr/pjestuesi)%10+"   "));
            pjestuesi /= 10;
        }

        String numberString = Integer.toString(nr);

        for (int i = 0; i < numberString.length(); i++){
            System.out.print(numberString.charAt(i)+"  ");
        }
        }


    }