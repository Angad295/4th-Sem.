/*4. Convert an Array to a List and Vice Versa 
Problem: 
• Convert an Integer[] array into a List<Integer> and back to an array. 
Hint: Use Arrays.asList() and toArray().*/

import java.util.ArrayList;
import java.util.Arrays;

public class S1_p4{
    public void main(String[] args){
        Integer[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(array));
        Integer[] newArray = numList.toArray(new Integer[numList.size()]);
    }
}