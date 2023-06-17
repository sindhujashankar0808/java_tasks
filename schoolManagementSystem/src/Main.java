import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Add Course");
            System.out.println("4. View Students");
            System.out.println("5. View Teachers");
            System.out.println("6. View Courses");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addTeacher();
                    break;
                case 3:
                    addCourse();
                    break;
                case 4:
                    viewStudents();
                    break;
                case 5:
                    viewTeachers();
                    break;
                case 6:
                    viewCourses();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter student name: ");
        String name = sc.next();
        System.out.print("Enter student roll number: ");
        int rollNumber = sc.nextInt();
        students.add(new Student(name, rollNumber));
        System.out.println("Student added successfully");
    }

    static void addTeacher() {
        System.out.print("Enter teacher name: ");
        String name = sc.next();
        System.out.print("Enter teacher employee number: ");
        int employeeNumber = sc.nextInt();
        teachers.add(new Teacher(name, employeeNumber));
        System.out.println("Teacher added successfully");
    }

    static void addCourse() {
        System.out.print("Enter course name: ");
        String name = sc.next();
        System.out.print("Enter course code: ");
        int code = sc.nextInt();
        courses.add(new Course(name, code));
        System.out.println("Course added successfully");
    }

    static void viewStudents() {
        System.out.println("Name\tRoll Number");
        for (Student student : students) {
            System.out.println(student.name + "\t" + student.rollNumber);
        }
    }

    static void viewTeachers() {
        System.out.println("Name\tEmployee Number");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.name + "\t" + teacher.employeeNumber);
        }
    }