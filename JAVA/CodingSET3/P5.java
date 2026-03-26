/*5. Bank Account System 
Create class Account with accNo and balance. 
Create subclass SavingsAccount with interestRate. 
     Use super() and calculate interest.*/

class Account{
    int accNo;
    int balance;
    Account(int an ,int b){
        accNo=an;
        balance=b;
    }
}

class SavingsAccount extends Account{
    int interestRate;
    SavingsAccount(int an, int b, int ir){
        super(an ,b);
        interestRate=ir;
    }
    void cal(){
        System.out.println("Total interest is : "+ ((balance*interestRate) / 100));
    }
}

public class P5{
    public static void main(String[] args){
        SavingsAccount s = new SavingsAccount(101 ,10000 ,10);
        s.cal();
    }
}