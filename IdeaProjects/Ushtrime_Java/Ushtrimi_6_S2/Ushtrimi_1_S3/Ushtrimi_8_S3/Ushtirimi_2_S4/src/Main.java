import java.util.Arrays;
import java.util.Scanner;

//Shkruaj një program që i kërkon përdoruesit të fusë numrin e studentëve dhe më pas emrat dhe
//pikët për secilin student dhe afishon emrat e studentëve nga ai që ka më tepër pikë tek ai që ka
//më pak.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numriStudenteve;
        System.out.print("Jepni numrin e studenteve: ");
        numriStudenteve = scanner.nextInt();
        String[] emrat =  new String[numriStudenteve];
        int[] piket = new int[numriStudenteve];
        System.out.println("Jepni emrat dhe piket e secilit prej studenteve: ");
        for (int i = 0; i<emrat.length; i++){
            System.out.print("Studenti "+(i+1)+":");
            emrat[i] = scanner.next();
            System.out.print("Piket: ");
            piket[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(emrat));
        System.out.println(Arrays.toString(piket));

        for (int i = 0; i<emrat.length; i++){
            for(int j = i; j < emrat.length; j++){
                if(piket[i] < piket[j]){
                    int tempPiket = piket[i];
                    piket[i] = piket[j];
                    piket[j] = tempPiket;

                    String tempEmri = emrat[i];
                    emrat[i] = emrat[j];
                    emrat[j] = tempEmri;
                }
            }
        }

        System.out.println(Arrays.toString(emrat));
        System.out.println(Arrays.toString(piket));

    }
}