import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStatsCounter {
    public static void main(String[] args) {
        int lineCount=0;
        int wordCount=0;
        int charCount=0;
        try(BufferedReader reader =new BufferedReader(new FileReader("example.txt"))){
           String line;
            while((line = reader.readLine()) != null ){
                lineCount++;
                charCount+= line.length();

                String[] words = line.split("\\s+"); //The line is split into words using split("\\s+"). 
                //This regular expression \\s+ splits based on any whitespace (spaces, tabs, etc.).
                wordCount += words.length;


              
            }  System.out.println("Number of lines: " + lineCount);
                System.out.println("Number of words: " + wordCount);
                System.out.println("Number of characters: " + charCount);

        } catch( IOException e){

            System.out.println("an error occurwd");
            e.printStackTrace();
        }

    }}
