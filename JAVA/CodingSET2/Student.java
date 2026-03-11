/*Student Details 
Create a class Student with data members name and rollNo. Use a constructor to 
initialize them and display the student details.*/




public class Student{
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    } 
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
    } 
};





