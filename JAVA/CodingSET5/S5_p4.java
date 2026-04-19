import java.util.Scanner;

class S5_p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the two numbers ");
         String a=sc.nextLine();
         String b=sc.nextLine();
         
         try{
             Integer ai= Integer.parseInt(a);
             Integer bi= Integer.parseInt(b);
             Integer result=ai/bi;
             System.out.println(result);
         }
         catch(NumberFormatException e){
              System.out.println("Invalid Format");
         }
         catch(ArithmeticException e){
              System.out.println("Denominator can't be 0");
         }
        
    }
}
