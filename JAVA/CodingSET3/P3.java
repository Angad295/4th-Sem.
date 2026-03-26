/*3. Vehicle Registration System 
Create class Vehicle with vehicleNo and ownerName. 
Create subclass Car with model and fuelType. 
     Use constructor chaining to initialize all details.*/

class Vehicle{
    int vehicleNo;
    String ownerName;
    Vehicle(int vn ,String on){
        vehicleNo=vn;
        ownerName=on;
    }
}

class Car extends Vehicle{
    int model;
    String fuelType;
    Car(int vn ,String on ,int m, String ft ){
        super(vn , on);
        model = m;
        fuelType = ft;
    }
    void display(){
        System.out.println("Vehicle No: " + vehicleNo);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class P3{
    public static void main(String[] args){
        Car c = new Car(102 ,"Angad" ,10 ,"CNG");
        c.display();
    }
}