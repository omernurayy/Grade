import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GradeFilter {
    public static void main(String[] args) {
        String inputFilePath = "studentsEN.txt";
        String outputFilePath = "grade5students.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             PrintWriter writer = new PrintWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t"); 
                if (parts.length >= 3 && "5".equals(parts[2].trim())) {
                    System.out.println(line);
                    writer.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
