//WAP to demonstrate multiple inheritance using interface in java
interface InterfaceA {
    void methodA();
}
interface InterfaceB {
    void methodB();
}
class MultipleInheritance implements InterfaceA, InterfaceB {
    public void methodA() {
        System.out.println("Method A from InterfaceA");
    }
    public void methodB() {
        System.out.println("Method B from InterfaceB");
    }
}
public class Practical5 {
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.methodA(); // Calling method from InterfaceA
        obj.methodB(); // Calling method from InterfaceB
    }
}