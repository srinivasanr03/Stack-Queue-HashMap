import java.util.HashMap;
import java.util.Map;

public class q5 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character in magazine
        for (char ch : magazine.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Check if ransomNote can be constructed
        for (char ch : ransomNote.toCharArray()) {
            if (!charCount.containsKey(ch) || charCount.get(ch) <= 0) {
                return false;
            }
            charCount.put(ch, charCount.get(ch) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        q5 solution = new q5();
        String ransomNote1 = "a";
        String magazine1 = "b";
        System.out.println("Can construct ransom note? " + solution.canConstruct(ransomNote1, magazine1)); // Output: false

        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println("Can construct ransom note? " + solution.canConstruct(ransomNote2, magazine2)); // Output: false

        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println("Can construct ransom note? " + solution.canConstruct(ransomNote3, magazine3)); // Output: true
    }
}
