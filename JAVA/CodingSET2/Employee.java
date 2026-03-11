/*Employee Information 
Create a class Employee with attributes name, designation, and salary. Initialize 
them using a constructor and display the employee information.*/

public class Employee{
    String name;
    String designation;
    int salary;

    public Employee(){
        name="unknown";
        designation="XXXXXX";
        salary=0;
    }
    public Employee(String n ,String d ,int s){
        name=n;
        designation=d;
        salary=s;
    }
    void display(){
        System.out.println("Employe Name :" + name);
        System.out.println("Employe Designation :" +designation);
        System.out.println("Employe Salary :" + salary);
    }

    public void main(String[] args){
        Employee e1 = new Employee("Angad" , "Manager" ,10000);
        e1.display();
    }

}