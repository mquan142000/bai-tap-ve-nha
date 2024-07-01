import entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRv {
    private static final File myFile = new File("io-textfile-ql-sinh-vien/src/student.txt");

    public List<Student> readStudents() {
        List<Student> studentList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                Student student = new Student(id, name);
                studentList.add(student);
            }
        } catch (IOException e) {
            System.err.println("Error reading students: " + e.getMessage());
        }
        return studentList;
    }

    public void writeStudents(List<Student> studentList) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(myFile))) {
            for (Student student : studentList) {
                bufferedWriter.write(student.getId() + "," + student.getName() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error writing students: " + e.getMessage());
        }
    }

    public List<Student> importStudentsFromFile(String fileName) {
        List<Student> studentList = new ArrayList<>();
        File file = new File(fileName);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                Student student = new Student(id, name);
                studentList.add(student);
            }
        } catch (IOException e) {
            System.err.println("Error importing students: " + e.getMessage());
        }
        return studentList;
    }

    public void exportStudentsToFile(String fileName, List<Student> studentList) {
        File file = new File(fileName);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (Student student : studentList) {
                bufferedWriter.write(student.getId() + "," + student.getName() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error exporting students: " + e.getMessage());
        }
    }
}
