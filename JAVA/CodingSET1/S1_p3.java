/*3. Check if a List Contains a Specific Element 
Problem: 
• Given a List<String>, check if a specific string is present. 
Hint: Use the contains() method of List. */

import java.util.ArrayList;

public class S1_p3{
    public void main(String[] args){
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");   
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Mango");

        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.contains("Orange"));

    }
}