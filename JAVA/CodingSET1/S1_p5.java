/*5. Find the Maximum and Minimum Elements in a List 
Problem: 
• Given a List<Integer>, find and print the maximum and minimum values. 
Hint: Use Collections.max() and Collections.min(). 
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S1_p5{
    public void main(String[] args){
        List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println(max);
         System.out.println(min);
    }
}