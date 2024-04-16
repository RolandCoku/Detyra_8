import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        double rrenje1, rrenje2;
        System.out.println("Jepni koeficientet a, b, c:");
        System.out.print("a = ");
        a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("b = ");
        b = scanner.nextInt();
        scanner.nextLine();
        System.out.print("c = ");
        c = scanner.nextInt();
        scanner.nextLine();

        if (a==0){
            System.out.println("Ky nuk eshte ekuacion i grades se dyte.");
        }else {
            double dallor = llogaritDallor(a,b,c);
            if (Double.compare(dallor,Double.NaN)==0){
                System.out.println("Ky ekuacion nuk ka rrenje.");
            } else{
                rrenje1 = llogaritRrenje(dallor, a, b, '-');
                rrenje2 = llogaritRrenje(dallor, a, b, '+');
                System.out.println("Rrenja 1: "+rrenje1+"\nRrenje 2: "+rrenje2);
            }
        }
    }
    public static double llogaritDallor(int a, int b, int c){
        int temp = b*b-4*a*c;

        return Math.sqrt(temp);
    }

    public static double llogaritRrenje(double dallor, int a, int b, char sign){
        if(sign=='-'){
            return -b-dallor/2*a;
        } else {
            return -b+dallor/2*a;
        }
    }
}

//1.	Si e keni rregulluar ArrayIndexOutOfBoundsException? Pse nuk keni nevojë për breakpoint për të ndihmuar në zgjidhjen e këtij problemi?

//      Për të rregulluar ArrayIndexOutOfBoundsException mjafton të ndryshojmë kushtin te cikli while.
//      Për të rregulluar këtë problem nuk kemi nevojë për breakpoint sepse duke qenë se është një error i njohur vetë kompilatori na paralajmëron për këtë error
//      dhe nuk lejon kompilimin e programit.

//2.	Si e keni rregulluar problemin e marrjes së vlerës së gabuar maksimale kur keni si input -5, -3, -7, -2, -6?
//      Në mënyrë të veçantë, ku i keni vendosur breakpoints tuaj (në çfarë shprehjesh) dhe cili ishte problemi?
//
//      Për të rregulluar problemin me vlerën maksimale të numrave negative mjafton që të vendosim breakpoint te kushti që kemi vendosur për të krahasuar
//      maksimumin me vlerat e vektorit dhe në rrjeshtin ku ruajmë maksimumin e ri te variabli max.
//      Gjatë debug kuptojmë që kushti që kemi vendosur nuk plotësohet asnjëherë pasi asnjë nga vlerat negative të vektorit nuk është me e madhe se vlera 0
//      me të cilën ne kemi inicializuar max në fillim të programit. Për të rregulluar këtë inicializojmë max me vlerën e parë të listës
//      kështu arrijmë të kontrollojmë për max pavarësisht se çfarë vlerash i japim.
//
//3.	Në përgjithësi, cilat jane rastet qe planifikoni të përdorni debugger? Në veçanti, per cila lloje të gabimeve, ju ndihmon për të zgjidhur dhe rregulluar?
//
//      Debugger është një ndihmë e madhe në proramim kryesisht në rastet kur në programin tone kemi të bëjmë me përpunime të dhënash të ndryshme.
//      Debugger na lejon që të rregullojmë dhe dedektojmë gabimet logjike në kod të cilat janë të pamundura për tu kapur nga kompilatori.
//
//4.	Çfarë informacioni shfaqet në panelin Debug??
//
//      Në panelin debug mund të shohim programin dhe funksionin që po ekzekutohet si edhe vlerat e secilit variabël të inicializuar në pika të ndryshme të programit.
//
//5.	Në përgjithësi, ku planifikoni të vendosni breakpoint kur beni debug te kodit?Në çfarë lloj shprehjesh?
//
//      Pikat breakpoint mund të vendosen kryesisht në shprehje matematikore dhe ne pika kyçe të programit ku kemi vleredhenie
//      ose ndryshim të vlerës së variablave të ndryshëm.