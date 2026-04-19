import java.io.*;

class S5_p5 {
    public static void main(String[] args) {
        BufferedReader br = null;
         try{
             br = new BufferedReader(new FileReader("data.csv"));
            String line ;
            while((line =br.readLine()) != null){
                System.out.println(line);
            }
             }
             catch(FileNotFoundException e){
                System.out.println("Error: File not found");
             }
         catch(IOException e){
              System.out.println(e.getMessage());
         }
         finally{
            try{
                if(br != null){
                    br.close();
                }
            }
             catch(IOException e){
                    System.out.println("Error closing file");
                }
         }
         
    }
}
