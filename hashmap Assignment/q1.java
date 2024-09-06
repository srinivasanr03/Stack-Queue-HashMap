import java.util.Map;
import java.util.TreeMap;

public class q1 {
    public static void main(String[] args) {
        // Create a TreeMap
        Map<Integer, String> map = new TreeMap<>();

        // Add elements to the map
        map.put(5, "Rahul");
        map.put(7, "Lakshman");
        map.put(1, "Ram");
        map.put(4, "Krrish");
        map.put(2, "Lakshay");

        // Print the original map
        System.out.println("Original map: " + map);

        // Print the map sorted by keys
        System.out.println("Sorted map: " + sortMapByKey(map));
    }

    // Method to sort a map by keys
    public static <K extends Comparable<? super K>, V> Map<K, V> sortMapByKey(Map<K, V> map) {
        // Create a TreeMap from the input map
        Map<K, V> sortedMap = new TreeMap<>(map);

        return sortedMap;
    }
}
