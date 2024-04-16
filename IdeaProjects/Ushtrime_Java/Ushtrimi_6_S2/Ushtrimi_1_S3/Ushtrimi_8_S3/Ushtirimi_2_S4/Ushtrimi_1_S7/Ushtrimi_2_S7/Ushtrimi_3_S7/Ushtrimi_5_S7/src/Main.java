import java.io.*;
import java.util.Scanner;

//Ushtrimin 2 zgjidheni duke i trajtuar studentet si objekte qe do lexohen dhe do shkruhen ne
//file. Objekti Student ka 3 fusha: emri, vektor me nota dhe nota maksimale.
public class Main {
    public static void main(String[] args) {
        File notat = new File("C:\\Users\\rolan\\IdeaProjects\\Ushtrime_Java\\Ushtrimi_6_S2\\Ushtrimi_1_S3\\Ushtrimi_8_S3\\Ushtirimi_2_S4\\Ushtrimi_1_S7\\Ushtrimi_2_S7\\src\\notat.txt");
        File student = new File("C:\\Users\\rolan\\IdeaProjects\\Ushtrime_Java\\Ushtrimi_6_S2\\Ushtrimi_1_S3\\Ushtrimi_8_S3\\Ushtirimi_2_S4\\Ushtrimi_1_S7\\Ushtrimi_2_S7\\Ushtrimi_3_S7\\Ushtrimi_5_S7\\src\\student");
        File studentMaxGrade = new File("C:\\Users\\rolan\\IdeaProjects\\Ushtrime_Java\\Ushtrimi_6_S2\\Ushtrimi_1_S3\\Ushtrimi_8_S3\\Ushtirimi_2_S4\\Ushtrimi_1_S7\\Ushtrimi_2_S7\\Ushtrimi_3_S7\\Ushtrimi_5_S7\\src\\studentMaxGrade");
        readStudentInfoAndWriteObj(notat,student);
        readStudentObjectAndWriteMaxGrade(student,studentMaxGrade);
    }
    public static void readStudentInfoAndWriteObj(File notat, File student){
        try (
                Scanner fileScanner = new Scanner(notat);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(student))
        ) {
            while (fileScanner.hasNextLine()){
                String studentInfo = fileScanner.nextLine();
                String studentName = studentInfo.substring(0, studentInfo.indexOf(" "));
                String studentGrades = studentInfo.substring(studentInfo.indexOf(" ")+1);
                String[] splitedGrades = studentGrades.split(", ");
                int[] grades = new int[splitedGrades.length];
                for (int i = 0; i < splitedGrades.length; i++){
                    grades[i] = Integer.parseInt(splitedGrades[i]);
                }
                objectOutputStream.writeObject(new Student(studentName, grades));
            }

        }catch (IOException e){
            System.out.println("Error opening file!");
        }
    }

    public static void readStudentObjectAndWriteMaxGrade(File student, File studentMaxGrade){
        try (
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(student));
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(studentMaxGrade));
        ) {
            while (true){
                try {
                    Object object = objectInputStream.readObject();

                    if (object instanceof Student student1){
                        int[] notat = student1.getNotat();
                        int maxGrade = notat[0];
                        for (int i = 0; i < notat.length; i++){
                            if(maxGrade < notat[i]){
                                maxGrade = notat[i];
                            }
                        }
                        System.out.println("Max grade: "+maxGrade);
                        student1.setNotaMax(maxGrade);
                        objectOutputStream.writeObject(student1);
                    }
                }catch (EOFException eofe){
                    System.out.println("End off file!");
                    break;
                }
            }

        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error opening file!");
        }
    }
}

class Student implements Serializable{
    private String emri;
    private int[] notat;
    private int notaMax;

    public Student(String emri, int[] notat){
        this.emri = emri;
        this.notat = notat;
        this.notaMax = 0;
    }

    public void setNotaMax(int notaMax) {
        this.notaMax = notaMax;
    }

    public int[] getNotat() {
        return notat;
    }
}