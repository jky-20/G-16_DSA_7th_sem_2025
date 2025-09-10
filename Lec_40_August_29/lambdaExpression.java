package Lec_40_August_29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class example{
    String name;
    int roll;
}

public class lambdaExpression {
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<>();
        List<String> words = new ArrayList<>();
        
        List<example> list = new ArrayList<>();

        Collections.sort(nums, (a,b) -> Integer.compare(b, a)); // reverse order
        Collections.sort(words);
        Collections.sort(list, (a, b) -> Integer.compare(a.roll, b.roll));  // increasing
    }
}
