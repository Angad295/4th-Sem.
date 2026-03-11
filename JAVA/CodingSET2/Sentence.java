/* Word Counter 
Create a class Sentence that stores a sentence (String). Write a method that splits 
the sentence into words and counts the total number of words. */

public class Sentence{
    String sen;
    public Sentence(){
        sen="nothing";
    }
    public Sentence(String s){
        sen=s;
    }
    public void count(){
        sen.split("");
        System.out.println("Total no. of words :"+this.sen.length());
    }
    public void main(String[] args){
        Sentence s=new Sentence("Hello World");
        s.count();
    }
}