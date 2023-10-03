import java.util.*;
import java.io.*;

public class introHashmap{
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India", 135);
        hm.put("China", 200);
        hm.put("USa", 50);
        System.out.println(hm);

        hm.put("Nigeria", 3);
        System.out.println(hm);

        hm.put("India", 3);
        System.out.println(hm);

        System.out.println(hm.get("India"));

        System.out.println(hm.containsKey("India"));


        // To bring out all keys

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        // Loop using keys

        for(String key : hm.keySet()){
            Integer val = hm.get(key);
            System.out.println(key + " " + val);
        }
    }   
}