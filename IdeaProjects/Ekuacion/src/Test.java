import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        int[] lista = new int[5];
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        int max = 0;

        while (num<5){
            lista[num] = scanner.nextInt();
            num++;
        }

        for (int i = 0; i<num; i++){
            if(lista[i]>max){
                max=lista[i];
            }
        }
        System.out.println(max);
    }
}
