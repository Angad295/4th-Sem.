import java.util.Scanner;

class S5_p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the age ");
         int age=sc.nextInt();
         try{
            if(age<18){
                throw new InvalidAgeException("Invalid age : Age can't be less than 18");
            }
             System.out.println(age);
         }
         catch(InvalidAgeException e){
              System.out.println(e.getMessage());
         }
        
    }
}

class InvalidAgeException extends Exception{
    InvalidAgeException(String args){
        super(args);
    }
}
