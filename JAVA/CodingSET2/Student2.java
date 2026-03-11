/*Array of Objects (Students) 
Create a class Student with attributes name and marks. Create an array of Student 
objects and display the details of all students. */

public class Student2{
    String name;
    int marks;
    Student2(){
        name="unknown";
        marks=0;
    }
    Student2(String n,int m){
        name=n;
        marks=m;
    }
    void display(){
        System.out.println("Student Name :" + name);
        System.out.println("Student Marks :" + marks);
    }

    public static void main(String[] args){
        Student2 s1=new Student2("Alice" , 85);
        Student2 s2=new Student2("Bob" , 90);
        Student2 s3=new Student2("Rohit" , 80);

        Student2 students[] = {s1, s2, s3};

        for(Student2 student : students){
            student.display();
            System.out.println();
        }
    }
    
}