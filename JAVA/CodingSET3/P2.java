/*2. Employee Salary System 
Create a class Employee with name and baseSalary. 
Create subclass Manager with bonus. 
     Calculate total salary using inherited data. */

 class Employee{
    String name;
    int baseSalary;

    Employee(String n ,int bs){
        name = n; 
        baseSalary = bs;
    }
}

 class Manager extends Employee{
    int bonus;
    Manager(String n ,int bs ,int b){
        super(n ,bs);
        bonus=b;
    }
    void cal(){
        System.out.println(baseSalary + bonus);
    }
}

public class P2{
    public static void main(String[] args){
        Manager m = new Manager("Angad" ,10000 ,2000);
        m.cal();
    }
}
