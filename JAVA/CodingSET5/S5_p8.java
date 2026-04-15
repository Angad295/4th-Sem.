import java.util.Scanner;

class S5_p8 {
    public static void main(String[] args) {
        int balance = 50000;
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter amount for withdrawal :");
         int amount=sc.nextInt();
         try{
            if(amount>balance){
                throw new InsufficientBalanceException("InsufficientBalance");
            }
             System.out.print("Reamining balance :" );
             System.out.println( balance-amount);
         }
         catch(InsufficientBalanceException e){
              System.out.println(e.getMessage());
         }
        
    }
}

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String args){
        super(args);
    }
}
