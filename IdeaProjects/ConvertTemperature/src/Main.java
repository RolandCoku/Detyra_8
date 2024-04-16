import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double temp_C;
        System.out.println("Give the temperature in Celsius");
        Scanner scanner = new Scanner(System.in);
        temp_C = scanner.nextDouble();

        double temp_Fh = (temp_C*((double)9/5))+32;

        System.out.println("The temperature in degrees Fahrenheit: "+temp_Fh);
    }
}