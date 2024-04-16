import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Të ndërtohet një program që lexon nga një skedar tekst gjithë fjalët që janë shkruar në të(
//numri i fjalëve është i papërcaktuar) dhe shkruan në një skedar të ri gjithë fjalët që nuk
//përmbajnë gërmën d dhe i.
public class Main {
    public static void main(String[] args) {
        File sourceFile = new File("C:\\Users\\rolan\\IdeaProjects\\Ushtrime_Java\\Ushtrimi_6_S2\\Ushtrimi_1_S3\\Ushtrimi_8_S3\\Ushtirimi_2_S4\\Ushtrimi_1_S7\\Ushtrimi_2_S7\\Ushtrimi_3_S7\\src\\source");
        File destination = new File("C:\\Users\\rolan\\IdeaProjects\\Ushtrime_Java\\Ushtrimi_6_S2\\Ushtrimi_1_S3\\Ushtrimi_8_S3\\Ushtirimi_2_S4\\Ushtrimi_1_S7\\Ushtrimi_2_S7\\Ushtrimi_3_S7\\src\\destination");
        readAndRewriteWords(sourceFile,destination);
    }

    public static void readAndRewriteWords(File sourceFile, File destinationFile){
        try (
                Scanner fileScanner = new Scanner(sourceFile);
                FileWriter fileWriter = new FileWriter(destinationFile)
        ) {
            while (fileScanner.hasNext()){
                String currentWord = fileScanner.next();
                if(!currentWord.contains("d")&&!currentWord.contains("i")){
                    fileWriter.write(currentWord+" ");
                }
            }

        }catch (IOException e){
            System.out.println("Error opening file!");
        }
    }
}