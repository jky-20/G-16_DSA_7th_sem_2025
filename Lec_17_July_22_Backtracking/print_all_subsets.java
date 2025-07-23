package Lec_17_July_22_Backtracking;
import java.util.ArrayList;
import  java.util.List;

public class print_all_subsets {
    static void printSubsets(int[] arr, int i, List<Integer> subarray){
        // base case
        if(i == arr.length){

            for(var val : subarray){
                System.out.print(val + "  ");
            }
            System.out.println();
            return;
        }

        // recursive call
        printSubsets(arr, i+1, subarray);

        // operations
        subarray.add(arr[i]);

        // reursive call
        printSubsets(arr, i+1, subarray);

        // return statement
        subarray.removeLast();
    }
    public static void main(String[] args) {
        
        int[] arr = new int[]{1,2,3,4,5};
        printSubsets(arr, 0, new ArrayList<>());
    }
}
