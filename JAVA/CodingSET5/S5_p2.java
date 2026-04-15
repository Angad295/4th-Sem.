import java.util.Scanner;

class S5_p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
         for(int i=0;i<5;i++){
             arr[i]=i;
         }
         System.out.println("Enter the index ");
         int a=sc.nextInt();
         try{
             int result = arr[a];
             System.out.println(result);
         }
         catch(ArrayIndexOutOfBoundsException e){
              System.out.println("Invalid index");
         }
        
    }
}
