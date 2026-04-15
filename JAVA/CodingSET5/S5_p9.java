import java.util.Scanner;

class S5_p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the password :");
         String pass=sc.nextLine();
         try{
            if(pass.length() < 8){
                throw new InvalidPasswordException("InvalidPassword : to short");
            }
            boolean ispass = false;
            for(char ch:pass.toCharArray()){
                if(Character.isDigit(ch)){
                    ispass=true;
                }
            }
            if(!ispass){
                 throw new InvalidPasswordException("InvalidPassword : must contain a digit");
            }
         }
         catch(InvalidPasswordException e){
              System.out.println(e.getMessage());
         }
    }
}

class InvalidPasswordException extends Exception{
    InvalidPasswordException(String args){
        super(args);
    }
}
