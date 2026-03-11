/*1. Add and Retrieve Elements from an ArrayList 
Problem: 
• Create an ArrayList<String>, add five names to it, and print each name using a 
loop. 
Hint: Use add() and get() methods of ArrayList.*/

import java.util.ArrayList;

public class S1_p1{
    public void main(String[] args){
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");   
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Mango");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
    }
}