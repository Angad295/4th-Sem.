import java.util.Scanner;

class S5_p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Numenator and Denominator");
         int nu = sc.nextInt();
         int de = sc.nextInt();
         try{
             int result = nu/de;
             System.out.println(result);
         }
         catch(ArithmeticException e){
              System.out.println("Denominator can't be zero");
         }
        
    }
}
