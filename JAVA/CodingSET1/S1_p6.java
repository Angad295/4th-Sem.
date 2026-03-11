/*6. Reverse a List 
Problem: 
• Given a List<String>, reverse its elements. 
Hint: Use Collections.reverse(). */

import java.util.ArrayList;
import java.util.Collections; 
import java.util.Arrays;  
import java.util.List;

public class S1_p6{
    public void main(String[] args){
        List<String> names = new ArrayList<String>(Arrays.asList("Angad", "Bhoomi", "Rohit", "Pnav"));
        

        Collections.reverse(names);
        System.out.println(names);
    }
}