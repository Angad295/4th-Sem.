/*9. Find Common Elements Between Two Lists 
Problem: 
• Given two List<Integer>, find the common elements. 
List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5); 
List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7); 
System.out.println(findCommonElements(list1, list2));   
// Output: [3, 4, 5] 
Hint: Use retainAll() method.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S1_p9{
    public void main(String[] args){
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 6, 7));
        
        list1.retainAll(list2);
        System.out.println(list1);
    }
}