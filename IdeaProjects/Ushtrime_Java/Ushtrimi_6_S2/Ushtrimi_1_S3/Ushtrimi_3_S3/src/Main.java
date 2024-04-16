import java.util.Arrays;
import java.util.Scanner;

//Shkruaj një program që lexon emrat e tre qyteteve dhe i rendit sipas rendit alfabetik.
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Jepni emrat e tre qyteteve: ");
       String [] qytete = new String[3];

       for (int i = 0; i < qytete.length; i++){
           qytete[i] = scanner.next();
       }

       System.out.println(Arrays.toString(qytete));

       for (int i = 0; i < qytete.length-1; i++){
           if(qytete[i].compareToIgnoreCase(qytete[i+1]) > 0){
               String temp = qytete[i];
               qytete[i] = qytete[i+1];
               qytete[i+1] = temp;
           }
       }

       System.out.println(Arrays.toString(qytete));
    }
}