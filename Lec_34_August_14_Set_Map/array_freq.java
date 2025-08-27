package Lec_34_August_14_Set_Map;

import java.util.HashMap;
import java.util.Scanner;

public class array_freq {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int key : arr){
            freq.put(key, freq.getOrDefault(key, 0) + 1);
        }

        for(var entry : freq.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
