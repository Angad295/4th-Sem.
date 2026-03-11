/*. Count the Frequency of Elements in a List 
Problem: 
• Given a List<String>, count how many times each string appears. 
List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", 
"apple"); 
System.out.println(countFrequencies(words));   
// Output: {apple=3, banana=2, orange=1} 
Hint: Use a HashMap<String, Integer>. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class S1_p8{
    public void main(String[] args){
        List<String> fruits = new ArrayList<String>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"));
        HashMap<String, Integer> frequencyMap = new HashMap<String, Integer>();
        
        for (String fruit : fruits) {
            frequencyMap.put(fruit, frequencyMap.getOrDefault(fruit, 0) + 1);
        }
        
        System.out.println(frequencyMap);
    }
}