package TH1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Jonh", 30);
        hashMap.put("Anderson", 32);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Jonh", 30);
        linkedHashMap.put("Anderson", 32);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println("\nThe age for " + "Jone is " + linkedHashMap.get("Jonh"));
        System.out.println("\nThe age for " + "Anderson is " + linkedHashMap.get("Anderson"));

    }
}
