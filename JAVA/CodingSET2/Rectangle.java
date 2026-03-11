/*Rectangle Area 
Create a class Rectangle with length and width. Use a parameterized constructor to 
initialize the values and write a method to calculate and display the area.*/

public class Rectangle{
    int length;
    int width;

    public Rectangle(){
        length=0;
        width=0;
    }

    public Rectangle(int l ,int w){
        length=l;
        width=w;
    }

    public int area(){
        return length*width;
    }

    public void main(String[] args){
        Rectangle obj= new Rectangle(2 ,3);
        System.out.println("Area = "+obj.area());
    }

}