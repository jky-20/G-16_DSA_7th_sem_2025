package Lec_27_August_5_JCF;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class list_interface {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(12);

        for(int val : list){
            System.out.println(val);
        }

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);

        list.remove(1);

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(12); // at the top of stack
        int top = stack.pop();    // returns and removes top element
        top = stack.peek();   // returns top element, doesn't remove

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
