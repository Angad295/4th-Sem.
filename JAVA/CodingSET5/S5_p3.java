import java.util.Scanner;

class S5_p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the input ");
         String a=sc.nextLine();
         try{
             Integer result= Integer.parseInt(a);
             System.out.println(result);
         }
         catch(NumberFormatException e){
              System.out.println("Invalid Format");
         }
        
    }
}
