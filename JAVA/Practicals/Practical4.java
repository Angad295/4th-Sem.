//WAP to demonstrate single inheritance in java.
class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}
class Child extends Parent {
    void show() {
        System.out.println("This is the child class.");
    }
}
public class Practical4 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Inherited method from Parent class
        child.show();    // Method from Child class
    }
}
