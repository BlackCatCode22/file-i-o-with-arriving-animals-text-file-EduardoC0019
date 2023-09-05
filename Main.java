import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String path = "\\Users\\eduardocruz\\IdeaProjects\\CSV SPLIT";
        String myFileLine = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ( ( myFileLine = reader.readLine() ) !=null ) {
                String[] myArray = myFileLine.split(",");
                System.out.println(" First Element: "); + myArray[0]);
                System.out.println(" Second Element: "); + myArray[1]);
                System.out.println(" Third Element: "); + myArray[2]);
                System.out.println(" Fourth Element: "); + myArray[3]);
                System.out.println(" Fifth Element: "); + myArray[4]);
                System.out.println(" Sixth Element: "); + myArray[5]);

            }

        }
        catch (IOException e) {
    }
}