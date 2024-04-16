import java.util.Scanner;

//Ne nje vektor 2 dimensional ruhen rezultatet e detyrave per N studente ne M lende. Per te dhenat e studenteve
//do te perdoret nje klase ekzistuese me emrin Student dhe per lendet nje klase me emrin Lenda. Nese nje student
//nuk ka marre pjese ne dorezimin e nje detyre shenohet me -1, ne te kundert vendoset nota.
//a) Ndertoni programin qe lexon te dhenat dhe afishon studentin qe ka dorezuar me shume detyra.
//b) Ndertoni nje funksion qe gjen per nje lende qe merret nga tastiera numrin e detyrave te dorezuara

public class Student {
    private int numriLendeve;
    private int numriStudenteve;
    private String emri;
    private Lenda[] lendet;
    private Student[] studentet;
    private int[][] rezultatet;
    Scanner scanner = new Scanner(System.in);

    public void getStudentInfo(){
        System.out.print("Jepni numrin e studenteve: ");
        this.numriStudenteve = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Jepni numrin e lendeve: ");
        this.numriLendeve = scanner.nextInt();
        scanner.nextLine();
        this.lendet = new Lenda[numriLendeve];
        System.out.println("Jepni emrat per secilen lende: ");
        for (int i = 0; i < numriLendeve; i++){
            System.out.print("Lenda "+(i+1)+":");
            lendet[i] = new Lenda(scanner.nextLine());
        }
        this.studentet = new Student[numriStudenteve];
        System.out.println("Jepni emrat per secilin student: ");
        for (int i = 0; i < numriStudenteve; i++){
            System.out.print("Studenti "+(i+1)+":");
            studentet[i] = new Student();
            studentet[i].emri = scanner.nextLine();
        }
        this.rezultatet = new int[numriStudenteve][numriLendeve];
        System.out.println("Jepni te dhenat per secilen lende dhe student");
        for (int i = 0; i<numriStudenteve; i++){
            System.out.println("Sudenti: "+studentet[i].emri);
            for (int j = 0; j<numriLendeve; j++){
                System.out.print("Nota ne lenden "+(j+1)+":");
                rezultatet[i][j] = scanner.nextInt();
            }
        }
        scanner.nextLine();
    }

    public void printStudentHighestScore(){
        int[] highestScores = new int[numriStudenteve];

        for (int i = 0; i < numriStudenteve; i++){
            for (int j = 0; j < numriLendeve; j++){
                highestScores[i] += rezultatet[i][j];
            }
        }

        int highestScore = rezultatet[0][0];
        int highestScoreIndex = 0;

        for (int i = 0; i < numriStudenteve; i++){
            if(highestScore < highestScores[i]){
                highestScore = highestScores[i];
                highestScoreIndex = i;
            }
        }

        System.out.println("Studenti me rezultatet me te larta eshte: "+studentet[highestScoreIndex].emri+" me "+highestScores[highestScoreIndex]+" pike!");
    }

    public void printSubject(){
        System.out.println("Jepni emrin e nje lende: ");
        String emriLendes;
        emriLendes = scanner.nextLine();
        int lendaIndex = -1;

        for (int i = 0; i < numriLendeve; i++){
            if(emriLendes.equals(lendet[i].getEmriLendes())){
                lendaIndex = i;
            }
        }

        int detyraTeDorezuara = 0;

        for (int i = 0; i < numriLendeve; i++){
            detyraTeDorezuara += rezultatet[i][lendaIndex];
        }
        System.out.println("Numri i detyrave te dorzuara ne lenden "+lendet[lendaIndex].getEmriLendes()+" eshte "+detyraTeDorezuara);
    }

    public static void main(String[] args){
        Student student = new Student();
        student.getStudentInfo();
        student.printStudentHighestScore();
        student.printSubject();
    }
}
