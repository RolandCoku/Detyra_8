import java.util.Arrays;
import java.util.Scanner;

//Orët e punës për cdo punonjës janë ruajtur në një matricë 2 dimensionale. Cdo rresht ruan orët e
//punës për 7 ditë të javës të një punonjësi. Shkruaj një program që shfaq punonjësit dhe orët e tyre
//totale në rend zbritës.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nrPunonjsve;

        System.out.print("Jep numrin e punonjesve: ");
        nrPunonjsve = scanner.nextInt();

        int[][] oret = new int[nrPunonjsve][7];

        System.out.println("Jep oret e punes per cdo dite per secilin punonjes: ");
        for (int i = 0; i<nrPunonjsve; i++){
            System.out.println("Punonjesi "+(i+1)+":");
            for (int j = 0; j<7; j++){
                System.out.print("Dita "+(j+1)+":");
                oret[i][j] = scanner.nextInt();
            }
        }

        int[] oretTotale = new int[nrPunonjsve];

        for (int i = 0; i < nrPunonjsve; i++){
            for (int j = 0; j<7; j++){
                oretTotale[i] += oret[i][j];
            }
        }

        System.out.println(Arrays.toString(oretTotale));

        for (int i = 0; i < nrPunonjsve; i++){

            for (int j = i+1; j< nrPunonjsve; j++){

                if(oretTotale[i] < oretTotale[j]){
                    int temp = oretTotale[i];
                    oretTotale[i] = oretTotale[j];
                    oretTotale[j] = temp;

                    for (int k = 0; k < 7; k++){
                        int temp2 = oret[i][k];
                        oret[i][k] = oret[j][k];
                        oret[j][k] = temp2;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(oretTotale));
        for (int i = 0; i<nrPunonjsve; i++){
            System.out.println(Arrays.toString(oret[i]));
        }

    }

}