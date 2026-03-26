/*. School Result System 
Create class Student with name and marks. 
Create subclass Result with grade. 
     Compute grade and display result using inherited data. */

class Student{
    String name;
    int marks;
    Student(String n , int m){
        name=n;
        marks=m;
    }
}    

class Result extends Student{
    String grade;
    Result(String n , int m , String g){
        super(n,m);
        grade=g;
    }
    void show(){
        System.out.println("Name :"+name);
        System.out.println("Marks :"+marks);
        System.out.println("Grade :"+grade);
    }
}

public class P7{
    public static void main(String[] args){
        Result r = new Result("Angad" ,70 , "B");
        r.show();
    }
}