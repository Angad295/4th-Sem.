/*0. Mobile Recharge System 
Create class Recharge with mobileNumber and planAmount. 
Create subclass DataRecharge with dataLimit. 
Show recharge details and benefits.*/

class Recharge{
    int mobileNumber;
    int planAmount;
    Recharge(int mn,int pa){
        mobileNumber=mn;
        planAmount=pa;
    }
}

class DataRecharge extends Recharge{
    int dataLimit;
    DataRecharge(int mn,int pa,int dl){
        super(mn ,pa);
        dataLimit=dl;
    }
     void show(){
        System.out.println("Mobile Number :"+mobileNumber);
        System.out.println("Amount :"+planAmount);
        System.out.println("Data Limit:"+dataLimit);
        
    }
}

public class P10{
    public static void main(String[] args){
        DataRecharge dr = new DataRecharge( 909090 , 1000 ,2);
            dr.show();
        }
    }
