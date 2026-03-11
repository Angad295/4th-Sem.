/*7. Sort a List in Ascending and Descending Order 
Problem: 
• Given a List<Integer>, sort it in both ascending and descending order. 
Hint: Use Collections.sort() and Collections.reverseOrder(). */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S1_p7{
    public void main(String[] args){
        List<Integer> nums = new ArrayList<Integer>(Arrays.asList(5, 2, 8, 1, 3));
        
        Collections.sort(nums);
        System.out.println("Ascending: " + nums);
        
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("Descending: " + nums);
    }
}