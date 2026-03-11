/*String Processing Class 
Create a class Message that stores a string. Write methods to display the length of 
the string and its uppercase form. */

public class Message{
    String mess;
    public Message(){
        mess="no message";
    }
    public Message(String m){
        mess=m;
    }
    void display(){
        System.out.println("The length of the message is:" + mess.length());
        mess.toUpperCase();
        System.out.println(mess);
    }
    public void main(String[] args){
        Message m= new Message("Hello World");
        m.display();
    }
}