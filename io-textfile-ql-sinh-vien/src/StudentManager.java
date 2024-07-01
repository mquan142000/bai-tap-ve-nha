import entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private static String filePath = "io-textfile-ql-sinh-vien/src/data.txt";
    private static File myFile = new File(filePath);
    private static StudentRv studentRv = new StudentRv();
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    public StudentManager() {
    }

    public static void addStudent() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(myFile, true))) {
            System.out.println("----------Enter student information------");
            System.out.println("Enter id: ");
            String id = scanner.nextLine();
            System.out.println("Enter name: ");
            String name = scanner.nextLine();

            Student s = new Student(Integer.parseInt(id), name);
            String dataStudent = s.getId() + "," + s.getName();
            bufferedWriter.write(dataStudent);
            bufferedWriter.newLine();
            System.out.println("Thêm thành công");
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void showListStudent() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                int idStudent = Integer.parseInt(data[0]);
                String nameStudent = data[1];
                Student s1 = new Student(idStudent, nameStudent);
                System.out.println(s1);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    public static void deleteStudent() {
        System.out.println("Enter the ID of the student to delete: ");
        int idToDelete = Integer.parseInt(scanner.nextLine());
        List<String> lines = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                int idStudent = Integer.parseInt(data[0]);
                if (idStudent != idToDelete) {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(myFile))) {
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("Student with ID " + idToDelete + " has been deleted.");
    }

    public static void updateStudent() {
        List<Student> students = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                int idStudent = Integer.parseInt(data[0]);
                String nameStudent = data[1];
                students.add(new Student(idStudent, nameStudent));
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        System.out.println("Enter the ID of the student to update: ");
        int idUpdate = Integer.parseInt(scanner.nextLine());
        boolean foundStudent = false;

        for (Student s : students) {
            if (s.getId() == idUpdate) {
                System.out.println("Enter new name: ");
                String newName = scanner.nextLine();
                s.setName(newName);
                foundStudent = true;
                break;
            }
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(myFile))) {
            for (Student s : students) {
                String dataStudent = s.getId() + "," + s.getName();
                bufferedWriter.write(dataStudent);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        if (foundStudent) {
            System.out.println("Student with ID " + idUpdate + " has been updated.");
        } else {
            System.out.println("Student with ID " + idUpdate + " not found.");
        }
    }

    public static void importStudents() {
        System.out.println("Enter file name to import from: ");
        String fileName = scanner.nextLine();
        List<Student> importedStudents = studentRv.importStudentsFromFile(fileName);
        studentList.addAll(importedStudents);
        studentRv.writeStudents(studentList);
    }

    public static void exportStudents() {
        System.out.println("Enter file name to export to: ");
        String fileName = scanner.nextLine();
        studentRv.exportStudentsToFile(fileName, studentList);
    }
}
