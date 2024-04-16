import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Lexoni nga një file emrat dhe 5 nota për secilin student dhe shkruani në një file të ri emrin e
//studentit dhe notën maksimale të tij. Numri i studentëve nuk është i përcaktuar.
//File-i është i organizuar në këtë mënyrë:
//Studenti1 8, 9, 7, 10, 8
//Studenti2 6, 8, 9, 7, 9

public class Main {
    public static void main(String[] args) {
        File notat = new File("C:\\Users\\rolan\\IdeaProjects\\Ushtrime_Java\\Ushtrimi_6_S2\\Ushtrimi_1_S3\\Ushtrimi_8_S3\\Ushtirimi_2_S4\\Ushtrimi_1_S7\\Ushtrimi_2_S7\\src\\notat.txt");
        File notatMax = new File("C:\\Users\\rolan\\IdeaProjects\\Ushtrime_Java\\Ushtrimi_6_S2\\Ushtrimi_1_S3\\Ushtrimi_8_S3\\Ushtirimi_2_S4\\Ushtrimi_1_S7\\Ushtrimi_2_S7\\src\\notatMax");
        getStudentMaxGrade(notat,notatMax);
    }

    public static void getStudentMaxGrade(File notat, File notatMax){
        String studentInfo = "";
        try (
                Scanner fileScanner = new Scanner(notat);
                FileWriter fileWriter = new FileWriter(notatMax)
        ){
            while (fileScanner.hasNextLine()){
                studentInfo = fileScanner.nextLine();
                String studentName = studentInfo.substring(0, studentInfo.indexOf(" "));
                System.out.println(studentName);

                String studentGrades = studentInfo.substring(studentInfo.indexOf(" ")+1);
                System.out.println(studentGrades);

                String[] splitedGrades = studentGrades.split(", ");

                int maxGrade = Integer.parseInt(splitedGrades[0]);
                for(int i = 0; i < splitedGrades.length; i++){
                    if(maxGrade < Integer.parseInt(splitedGrades[i])){
                        maxGrade = Integer.parseInt(splitedGrades[i]);
                        System.out.println("Max grade: "+maxGrade);
                    }
                }
                fileWriter.write(studentName+" "+maxGrade+"\n");
            }

        }catch (IOException e){
            System.out.println("Error opening file!");
        }
    }
}