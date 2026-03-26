/*4. Online Shopping – Product System 
Create class Product with name and price. 
Create subclass Electronics with warrantyPeriod. 
     Display product details and final price. */

class Product{
    String name;
    int price;
    Product(String n ,int p){
        name=n;
        price=p;
    }
}  

class Electronics extends Product{
    int warrantyPeriod;
    Electronics(String n , int p ,int wp){
        super(n,p);
        warrantyPeriod=wp;
    }
    void display(){
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
    }
}

public class P4{
    public static void main(String[] args){
        Electronics e = new Electronics("Laptop" ,50000 ,2);
        e.display();
    }
}