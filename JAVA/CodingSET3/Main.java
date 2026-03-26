/*1. College Student Record 
Create a class Person with name and age. 
Create Student with rollNo and course. 
     Use super() to initialize common details and display full student record.*/

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Student extends Person {  
    int rollNo;
    String course;
    Student(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, 101, "Computer Science");
        student.display();
    }
}


