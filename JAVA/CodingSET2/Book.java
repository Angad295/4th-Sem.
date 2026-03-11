/*Book Class with Constructor Overloading 
Create a class Book with attributes title and price. Implement two constructors: 
one default constructor and one parameterized constructor. Display the book 
details. */

public class Book{
    String title;
    int price;
    public Book(){
        title="unknown";
        price=0;
    }
     public Book(String t , int p){
        title=t;
        price=p;
    }
    void display(){
        System.out.println("Title of Book:" + title);
        System.out.println("Price of Book:" + price);
    }
    public void main(String[] args){
        Book b1=new Book("Atom" ,1000);
        b1.display();
    }
}