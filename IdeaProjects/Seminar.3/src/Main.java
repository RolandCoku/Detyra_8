import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Jepni numrin e vlerave qe doni te ruani: ");
        int n = scanner.nextInt();
        System.out.println("Jepni vlerat e matrices: ");
        int [] numberArray = new int[n];
        for (int i = 0; i<n; i++){
            System.out.print("Nr: ");
            numberArray[i] = scanner.nextInt();
        }*/

        //ushtrimi8_5(numberArray);
        //ushtrimi9_5(numberArray);
        //ushtrimi9_5_v2(numberArray);

        System.out.print("Jepni numrin e punonjesve: ");
        int n = scanner.nextInt();
        System.out.print("Jepni numrin e kolonava: ");
        int m = scanner.nextInt();

        int[][] workHours = new int[n][m];

        System.out.println("Jepni oret e punes per secilin punonjes: ");
        for (int i = 0; i < workHours.length; i++){
            for (int j = 0; j < workHours[0].length; j++){
                System.out.print("Punonjesi "+i+": ");
                workHours[i][j] = scanner.nextInt();
            }
        }

        ushtrimi10_5(workHours);
    }

    public static void ushtrimi8_5(int [] numberArray){
        //Shkruaj nje program qe kthen numrin e dyte me te vogel te nje matrice
        int max1 = numberArray[0];
        int max2 = numberArray[0];

        for (int i = 0; i < numberArray.length; i++){
            if (max1 < numberArray[i]){
                max2 = max1;
                max1 = numberArray[i];
            } else if (max2 < numberArray[i] && max1 != numberArray[i]){
                max2 = numberArray[i];
            }
        }

        System.out.println(Arrays.toString(numberArray));
        System.out.println("Numri i dyte me i madh ne matrice eshte: "+max2);
    }


    //Shkruaj një program që vendos numrat pozitive para atyre negative në një matricë një dimensionale.
    //Ushtrimi nuk kerkon renditje te matrices, kerkon kalimin e numrave pozitiv para numrave negative ne rendin e dhene.
    public static void ushtrimi9_5(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                for (int j = i+1; j < array.length; j++){
                    if (array[j] > 0){
                        int temp = array[j];
                        for (int k = j; ; k--){
                            if(k>0&&array[k-1]<0){
                                array[k] = array[k-1];
                            } else
                                break;
                        }
                        array[i] = temp;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //Renditja jo sipas rendit fillestar
    public static void ushtrimi9_5_v2(int[] array){
        int i = 0, j = array.length - 1;

        while (i < j){
            if((array[i]<0) && (array[j]>0)){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            } else if (array[j] < 0){
                j--;
            } else if (array[j]>0){
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //Orët e punës për cdo punonjës janë ruajtur në një matricë 2 dimensionale.
    //Cdo rresht ruan orët e punës për 7 ditë të javës të një punonjësi.
    //Shkruaj një program që shfaq punonjësit dhe orët e tyre totale në rend zbritës.

    public static void ushtrimi10_5(int[][] workHours){
        int[][] totalHours = new int[workHours.length][2];
        for (int i = 0; i < workHours.length; i++){
            totalHours[i][0] = i;
            for (int j = 0; j < workHours[0].length; j++){
                totalHours[i][1] += workHours[i][j];
            }
        }

        for (int i = 0; i < totalHours.length - 1; i++){
            for (int j = i+1; j < totalHours.length; j++){
                if(totalHours[i][1] < totalHours[j][1]){
                    int temp = totalHours[i][1];
                    totalHours[i][1] = totalHours[j][1];
                    totalHours[j][1] = temp;

                    int tempIndex = totalHours[i][0];
                    totalHours[i][0] = totalHours[j][0];
                    totalHours[j][0] = tempIndex;
                }
            }
        }

        for (int[] totalHour : totalHours) {
            System.out.println("Punonjesi: " + totalHour[0] + " Oret e punes: " + totalHour[1]);
        }
    }


}