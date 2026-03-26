/*8. Food Delivery System 
Create class Order with orderId and amount. 
Create subclass OnlineOrder with deliveryCharge. 
     Calculate final bill using super. */

class Order{
    int orderId;
    int amount;
    Order(int oi ,int a){
        orderId=oi;
        amount=a;
    }
}    

class OnlineOrder extends Order{
    int deliveryCharge;
    OnlineOrder(int oi ,int a,int d){
        super(oi ,a);
        deliveryCharge = d;
    }
    void fin(){
        System.out.println("Final bill :" + amount);
    }
    }



    public class P8{
        public static void main(String[] args){
            OnlineOrder o = new OnlineOrder(1 , 2000 , 99);
            o.fin();
        }
    }
