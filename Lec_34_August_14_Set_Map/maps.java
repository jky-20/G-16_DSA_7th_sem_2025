package Lec_34_August_14_Set_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class maps {
    public static void main(String[] args) {
        
        Map<Integer,String> hmap = new HashMap<>();
        Map<Integer,String> lhmap = new LinkedHashMap<>();
        Map<Integer,String> tmap = new TreeMap<>();

        // to add or update
        hmap.put(123, "abc");

        // to get a value
        hmap.get(123);  // only valid if key is present in map

        // correct way
        if(hmap.containsKey(123)){
            hmap.get(123);
        }

        // or
        hmap.getOrDefault(123, "");

        // remove key
        hmap.remove(1234);

        // empty a map
        hmap.clear();

        // iterate over a map
        for(var entry : hmap.entrySet()){
            System.out.println(entry.getKey() +  " : " + entry.getValue());
        }

        for(int key : hmap.keySet()){
            System.out.println(key + " : " + hmap.get(key));
        }

        // get only values
        for(String str : hmap.values()){
            System.out.println(str);
        }
    }
}
