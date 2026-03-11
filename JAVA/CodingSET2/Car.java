/*Car Details Using this Keyword 
Create a class Car with attributes brand and price. Use the this keyword inside the 
constructor to initialize the variables and display the details. */

public class Car{
    String brand;
    int price;
    public Car(){
        this.brand="unlknown";
        this.price=0;
    }
    public Car(String b ,int p){
        this.brand=b;
        this.price=p;
    }
    void display(){
        System.out.println("Brand name is:" +this.brand);
        System.out.println("Price of car is:" +this.price);
    }
    public void main(String[] args){
        Car c= new Car("TOYOTA" ,2000000);
        c.display();
    }
}