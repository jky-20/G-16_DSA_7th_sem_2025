package Lec_32_August_12_Stack;

import java.util.Stack;

public class nextGreaterElement {
    static int[] next_greater_element(int[] arr){

        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0 ; i<n ; i++){
            int curr = arr[i];

            while(!stack.isEmpty() && curr > arr[stack.peek()]){
                ans[stack.pop()] = curr;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            ans[stack.pop()] = -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ans = next_greater_element(arr);

        for(int val : ans){
            System.out.print(val + "  ");
        }
    }
}
