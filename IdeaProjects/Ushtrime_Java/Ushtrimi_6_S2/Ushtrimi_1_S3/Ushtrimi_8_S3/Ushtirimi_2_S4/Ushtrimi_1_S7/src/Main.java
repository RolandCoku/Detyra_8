//Kopjoni nje file binar ne nje file tjeter duke perdorur FileInputStream dhe FileOutputStream
//dhe me pas duke perdorur BufferedInputStream dhe BufferedOutputStream.

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        File source = new File("source.dat");
        File destination = new File("destination.dat");

        copyUsingFileInputStream(source,destination);
    }

    public static void copyUsingFileInputStream(File source, File destination){
        try (
                FileOutputStream outputStreamSource = new FileOutputStream(source);
                BufferedOutputStream bufferedOutputStreamSource = new BufferedOutputStream(outputStreamSource);
                FileInputStream inputStreamSource = new FileInputStream(source);
                BufferedInputStream bufferedInputStreamSource = new BufferedInputStream(inputStreamSource);
                FileOutputStream outputStreamDestination = new FileOutputStream(destination);
                BufferedOutputStream bufferedOutputStreamDestination = new BufferedOutputStream(outputStreamDestination)
        ){
            //Write on the source file "Source file text" for testing;
            byte[] sourceText = "Source file text!".getBytes();
            bufferedOutputStreamSource.write(sourceText);
            bufferedOutputStreamSource.flush();
            byte[] readSourceText = new byte[1024];
            int bytesRead;

            while ((bytesRead = bufferedInputStreamSource.read(readSourceText)) != -1){
                bufferedOutputStreamDestination.write(readSourceText,0, bytesRead);//Write the copied text in the new file
            }

        } catch (IOException e){
            System.out.println("Error opening or reading the file");
        }

        try (
                BufferedInputStream bufferedInputStreamDestination = new BufferedInputStream(new FileInputStream(destination)) ;
                BufferedInputStream bufferedInputStreamSource = new BufferedInputStream(new FileInputStream(source));

        ) {
            //Read the bytes from the source file for testing
            byte[] readSourceText = new byte[1024];
            int readbytes;
            while ((readbytes = bufferedInputStreamSource.read(readSourceText)) != -1){
                String extractedString = new String(readSourceText, 0, readbytes, StandardCharsets.UTF_8);//Convert the byte stream to a string
                System.out.println("Source text: "+extractedString);//Print the extracted string for testing
            }

            //Read the text from the destination file and print to check if the information is saved correctly
            byte[] readDestinationText = new byte[1024];
            int readDestinationBytes;

            while ((readDestinationBytes = bufferedInputStreamDestination.read(readDestinationText)) != -1){
                String destinationText = new String(readDestinationText,0, readDestinationBytes, StandardCharsets.UTF_8);
                System.out.println("Destination text: "+destinationText);
            }

        }catch (IOException e){
            System.out.println("Error opening the file!");
        }
    }

}
