package Lec_17_July_22_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class return_all_subsets {

    List<List<Integer>> returnSubsets(int[] arr, int i){
        // base case
        if(i == arr.length){
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>());
            return ans;
        }

        // recursive call
        List<List<Integer>> smallans = returnSubsets(arr, i+1);

        // operations
        List<List<Integer>> ans = new ArrayList<>();

        for(var list : smallans){
            ans.add(list);
        }

        for(var list : smallans){
            list.add(arr[i]);
            ans.add(list);
        }

        // return
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
