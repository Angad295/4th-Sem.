/*10. Implement a Stack Using Deque 
Problem: 
• Use Deque<Integer> to implement a stack with: 
o push(int x) 
o pop() 
o peek() 
o isEmpty() 
Hint: Use ArrayDeque<Integer> with addFirst() and removeFirst(). */

import java.util.ArrayDeque;
import java.util.Deque;

public class S1_p10{
    public void main(String[] args){
        Deque<Integer> stack = new ArrayDeque<Integer>();
        
        stack.addFirst(10);
        stack.addFirst(20);
        stack.addFirst(30);
        stack.addLast(40);
        
        System.out.println(stack.peekFirst());

        
        stack.removeFirst();
        System.out.println(stack.peekFirst());
        System.out.println(stack.peekLast());
        
        System.out.println(stack.isEmpty());
    }
}