import java.io.*;
import java.util.*;

public class StudentManager {
    private static List<Student> getStudentsFromFile(String filePath) {
        List<Student> students = new ArrayList<>();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String currentLine;
            
            while ((currentLine = br.readLine()) != null) {
                currentLine = currentLine.trim();
                
                if (currentLine.length() == 0) {
                    continue;
                }
                
                String[] data = currentLine.split("\\s+");
                
                if (data.length == 3) {
                    String lastName = data[0];
                    String firstName = data[1];
                    double grade = Double.parseDouble(data[2]);
                    Student s = new Student(firstName, lastName, grade);
                    students.add(s);
                }
            }
            
            br.close();
            
        } catch (IOException e) {
            System.out.println("Problem with the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Bad grade format in file");
        }
        
        return students;
    }
    
    public static void main(String[] args) {
        List<Student> classList = getStudentsFromFile("studentsEN.txt");
        
        if (classList.isEmpty()) {
            System.out.println("No student data found.");
            return;
        }
        
        System.out.println("A) Students with a full mark:");
        classList.stream().filter(s -> s.getScore() == 5.0).forEach(s -> System.out.println(" * " + s));
        
        System.out.println();
        System.out.println("B) Class performance summary:");
        double totalPoints = 0;
        for (Student s : classList) {
            totalPoints += s.getScore();
        }
        double classAverage = totalPoints / classList.size();
        System.out.printf("   Average grade: %.2f%n", classAverage);
        
        System.out.println();
        System.out.println("C) Top performers count:");
        long topScorers = classList.stream().filter(s -> s.getScore() == 5.0).count();
        System.out.println("   Students with full marks: " + topScorers);
    }
}