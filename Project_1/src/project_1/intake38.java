package project_1;

import java.util.Scanner;

public class intake38 {
    
    private final Student student = new Student();
    
    public boolean isStudentExists(String name){
        return student.getId(name) != -1;
    }
    
    public void getStudentInfo(String name){
        if (isStudentExists(name)) {
            int studentId = student.getId(name);
            System.out.println("Student ID : "+studentId);
            System.out.println("Intake : "+student.getIntake(studentId));
            System.out.println("Section : "+student.getSection(studentId));
        }
    }
    
    public void setStudentInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Student ID : ");
        int studentId = scanner.nextInt();
        System.out.print("Student Name : ");
        String studentName = scanner.nextLine();
        System.out.print("Intake : ");
        String studentIntake = scanner.nextLine();
        System.out.print("Section : ");
        String studentSection = scanner.nextLine();
        student.setInfo(studentId, studentName, studentIntake, studentSection);
    }
    
    public void getName(int id){
        if (student.getName(id) != null) {
            System.out.println(student.getName(id));
        }
    }
    
    public void getId(String name){
        if (isStudentExists(name)) {
            System.out.println(student.getId(name));
        }
    }
    
    public void getIntake(int id, String name){
        if (student.getId(name) != -1 && student.getName(id) != null) {
            System.out.println(student.getIntake(id));
        }
    }
    
    public void getSection(int id, String name){
        if (student.getId(name) != -1 && student.getName(id) != null) {
            System.out.println(student.getSection(id));
        }
    }
}
