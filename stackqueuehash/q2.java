import java.util.Stack;

public class q2 {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(count);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                count = 0;
            } else if (ch == ']') {
                int repeatCount = countStack.pop();
                StringBuilder decodedString = stringStack.pop();
                for (int i = 0; i < repeatCount; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        q2 solution = new q2();
        String encodedString1 = "3[a]2[bc]";
        System.out.println("Decoded string: " + solution.decodeString(encodedString1));

        String encodedString2 = "3[a2[c]]";
        System.out.println("Decoded string: " + solution.decodeString(encodedString2));

        String encodedString3 = "2[abc]3[cd]ef";
        System.out.println("Decoded string: " + solution.decodeString(encodedString3));
    }
}
