import java.util.Scanner;

class S5_p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
         
         try{
             int[] arr = new int[5];
         System.out.println("Enter marks for 5 subjects");
         for(int i=0;i<5;i++){
             arr[i]=sc.nextInt();
         }
            for(int i=0;i<5;i++){
                sum+=arr[i];
             if(arr[i]<0){
                 throw InvalidMarksException("Marks can't be smaller than 0 ");
             }
             if(arr[i]>100){
                 throw InvalidMarksException("Marks can't be grater than 100");
             }
            
         }
          double avg = sum/5.0;
          System.out.println(avg);
         
         }
         catch(InvalidMarksException e){
              System.out.println(e.getMessage());
         }
         catch(Exception e){
              System.out.println("An exception occured");
         }
    }
}

class InvalidMarksException extends Exception{
    InvalidMarksException(String args){
        super(args);
    }
}
