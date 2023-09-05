import java.io.*;

public class FileIOPractice {
    public static void main(String[] args) {
        System.out.println("/n Welcome to Java 10!");
        try {
            // create a file writer and open it
            BufferedWriter writer = new BufferedWriter(new FileWriter
                    ("\\Users\\eduardocruz\\IdeaProjects\\untitled\\output.txt"));

            // write to the file using the writer
            writer.write("This is my first line in a new file");
            writer.write("\n This should be on a new line!");
            writer.write("\n This will be on the third line and this is my string!");

            // close the file
            writer.close();

            // tell us that our program wrote to a file
            System.out.println("\n We Just Wrote To A File!!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("\\Users\\eduardocruz\\IdeaProjects\\untitled\\output.txt"));
            String MuLine = "";
            while((MuLine = reader.readLine()) !=null){
                System.out.println(MuLine);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
