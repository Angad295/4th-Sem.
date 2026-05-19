import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // ArrayList as temporary database
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        // Running the menu until the user exits (Choice 5)
        do {
            System.out.println("\n=== STUDENT MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Student (Create)");
            System.out.println("2. View Students (Read)");
            System.out.println("3. Update Student (Update)");
            System.out.println("4. Delete Student (Delete)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: createStudent(); break;
                case 2: readStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: System.out.println("Exiting application. Goodbye!"); break;
                default: System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
    }

    // --- 1. CREATE ---
    private static void createStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter Student Course: ");
        String course = scanner.nextLine();

        // adding Student to the list
        studentList.add(new Student(id, name, age, course));
        System.out.println("Student added successfully!");
    }

    // --- 2. READ ---
    private static void readStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }
        System.out.println("\n--- Student Records ---");
        for (Student s : studentList) {
            System.out.println(s); // This automatically calls the toString() method
        }
    }

    // --- 3. UPDATE ---
    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Student s : studentList) {
            if (s.getId() == id) {
                System.out.print("Enter New Name (Current: " + s.getName() + "): ");
                s.setName(scanner.nextLine());
                
                System.out.print("Enter New Age (Current: " + s.getAge() + "): ");
                s.setAge(scanner.nextInt());
                scanner.nextLine();
                
                System.out.print("Enter New Course (Current: " + s.getCourse() + "): ");
                s.setCourse(scanner.nextLine());
                
                System.out.println("Student record updated successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // --- 4. DELETE ---
    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.remove(i);
                System.out.println("Student record deleted successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
}
