/*. Remove an Element from a List 
Problem: 
• Given a List<Integer>, remove all occurrences of a specific number. 
List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 2, 5); 
int target = 2; 
System.out.println(removeElement(numbers, target));   
// Output: [1, 3, 4, 5] 
Hint: Use removeIf() method. */

import java.util.ArrayList;
import java.util.Arrays;

public class  S1_p2{
    public void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,3,2,4,2,5));
        
        int target = 2;
        nums.removeIf(n -> n == target);
        System.out.println(nums);
    }
}