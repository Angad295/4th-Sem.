/*6. Hospital Management 
Create class Person with name and age. 
Create subclass Patient with disease and doctorAssigned. 
     Display complete patient information.*/

class Person{
    String  name;
    int age;
    Person(String n ,int a){
        name=n;
        age=a;
    }
}     

class Patient extends Person{
    String disease;
    String doctorAssigned;
    Patient(String n ,int a ,String d ,String da){
        super(n,a);
        disease=d;
        doctorAssigned=da;
    }
    void info(){
        System.out.println("Patient name :"+name);
         System.out.println("Patient age :"+age);
          System.out.println("Disease :"+disease);
           System.out.println("Doctor assigned:"+doctorAssigned);
    }
}

public class P6{
    public static void main(String[] args){
        Patient p = new Patient("Angad" ,20 ,"Coding" ,"Sir");
        p.info();
    }
}