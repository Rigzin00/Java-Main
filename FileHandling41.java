import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileHandlingEg {
    public static void main(String[] args) {
        // Write to file
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("Hello, this is Rigzin.");
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from file
        try (FileReader reader = new FileReader("example.txt")) {
            int character;
            System.out.print("Content read from file: ");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println(); 
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
