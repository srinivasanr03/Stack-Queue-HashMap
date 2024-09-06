import java.util.*;

public class q2 {
    public static void main(String[] args) {
        // Create a HashMap
        Map<Integer, String> map = new HashMap<>();
        
        // Add elements to the map
        map.put(5, "Rahul");
        map.put(7, "Lakshman");
        map.put(1, "Ram");
        map.put(4, "Krrish");
        map.put(2, "Lakshay");
        
        // Print the original map
        System.out.println("Original map: " + map);
        
        // Sort the map by values
        Map<Integer, String> sortedMap = sortMapByValue(map);
        
        // Print the sorted map by values
        System.out.println("Sorted map by values: " + sortedMap);
    }
    
    // Method to sort a map by values
    public static <K, V extends Comparable<? super V>> Map<K, V> sortMapByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
        
        // Sort the list based on values
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        
        // Create a LinkedHashMap to maintain the insertion order of the sorted entries
        Map<K, V> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        return sortedMap;
    }
}
