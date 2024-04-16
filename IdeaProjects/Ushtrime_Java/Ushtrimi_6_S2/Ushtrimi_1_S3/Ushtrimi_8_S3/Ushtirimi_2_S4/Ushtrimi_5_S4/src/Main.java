import java.util.Arrays;
import java.util.Scanner;

//Shkruaj metodën e mëposhtme që bashkon 2 matrica nje dimensionale të renditura në një
//matrice të renditur.
//public static int[] bashko(int[] list1, int[] list2)
//Implemento një metodë që kërkon të shumtën list1.length + list2.length krahasime.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        System.out.print("Jepni numrin e elementeve per matrincen 1: ");
        n1 = scanner.nextInt();
        System.out.print("Jepni numrin e elementee per matricen 2: ");
        n2 = scanner.nextInt();

        int[] array1 = new int[n1];
        int[] array2 = new int[n2];

        System.out.println("Jepni elementet e matries 1:  ");
        for (int i = 0; i<n1; i++){
            System.out.print("Array1 "+(i+1)+":");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Jepni elementet e matries 2:  ");
        for (int i = 0; i<n2; i++){
            System.out.print("Array2 "+(i+1)+":");
            array2[i] = scanner.nextInt();
        }

        int[] mergedArray = bashko(array1,array2);

        System.out.println(Arrays.toString(mergedArray));
    }

    public static int[] bashko(int[] array1, int[] array2){
        int k = 0;
        int l = 0;
        int i = 0;
        int[] mergedArray = new int[array1.length+array2.length];

        while (k<array1.length && l<array2.length){
            if(array1[k] <= array2[l]){
                mergedArray[i++] = array1[k++];
            } else {
                mergedArray[i++] = array2[l++];
            }
        }

        while (k<array1.length){
            mergedArray[i++] = array1[k++];
        }

        while (l<array2.length){
            mergedArray[i++] = array2[l++];
        }
        return mergedArray;
    }
}