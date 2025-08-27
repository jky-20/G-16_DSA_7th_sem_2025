package Lec_34_August_14_Set_Map;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class sets {
    public static void main(String[] args) {
        
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        hashSet.add(10);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(15);
        hashSet.add(18);
        hashSet.add(23);
        
        linkedSet.add(10);
        linkedSet.add(10);
        linkedSet.add(20);
        linkedSet.add(15);
        linkedSet.add(18);
        linkedSet.add(23);
        
        treeSet.add(10);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(15);
        treeSet.add(18);
        treeSet.add(23);

        for(int val : hashSet){
            System.out.print(val + "  ");
        }
        System.out.println();

        for(int val : linkedSet){
            System.out.print(val + "  ");
        }
        System.out.println();

        for(int val : treeSet){
            System.out.print(val + "  ");
        }

        // methods
        hashSet.contains(20);   // O(1)
        linkedSet.contains(20); // O(N)
        treeSet.contains(20);   // O(logN)

        hashSet.remove(10);
        hashSet.size();

        hashSet.clear();

        if(hashSet.isEmpty()){
            System.out.println("Empty Set");
        }
    }
}
