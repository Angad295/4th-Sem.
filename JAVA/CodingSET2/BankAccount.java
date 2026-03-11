/*Bank Account Simulation 
Create a class BankAccount with attributes accountHolderName and balance. Use a 
constructor to initialize them and implement a method to deposit money and 
display the updated balance.*/

public class BankAccount{
    String ahn;
    int b;
    public BankAccount(){
        ahn="unknown";
        b=0;
    }
    public BankAccount(String n, int b){
        ahn=n;
        this.b=b;
    }
    void deposit(int d){
        this.b+=d;
        System.out.println("Updated balance :"+this.b);
    }
    public void main(String[] args){
        BankAccount a1=new BankAccount("Angad" ,1000);
        a1.deposit(1000);
    }
}