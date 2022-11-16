package lab5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class ReadingFiles {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

    	 File dir = new File("C:\\Users\\User\\Documents\\Aqq\\Myfolder");
         File[] files = dir.listFiles();

         for (File file : files) {
             if(file.isFile()) {
                 BufferedReader inputStream = null;
                 String line;
                 try {
                     inputStream = new BufferedReader(new FileReader(file));
                     while ((line = inputStream.readLine()) != null) {
                         System.out.println(line);
                     }
                 }catch(IOException e) {
                 	System.out.println(e);
                 }
                
                
                 }
        
             }
    }
}