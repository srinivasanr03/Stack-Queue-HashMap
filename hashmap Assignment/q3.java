import java.util.HashSet;

public class q3 {
    public boolean containsAtMostOneDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return false; // Found a duplicate
            }
        }

        return true; // No more than one duplicate found
    }

    public static void main(String[] args) {
        q3 solution = new q3();
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Contains at most one duplicate? " + solution.containsAtMostOneDuplicate(arr1)); // Output: true

        int[] arr2 = {1, 2, 3, 4, 2};
        System.out.println("Contains at most one duplicate? " + solution.containsAtMostOneDuplicate(arr2)); // Output: false

        int[] arr3 = {1, 2, 3, 3, 4, 5};
        System.out.println("Contains at most one duplicate? " + solution.containsAtMostOneDuplicate(arr3)); // Output: false
    }
}
