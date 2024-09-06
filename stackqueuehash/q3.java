import java.util.Stack;

public class q3 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        q3 solution = new q3();
        String[] ops1 = {"5", "2", "C", "D", "+"};
        System.out.println("Total sum: " + solution.calPoints(ops1)); // Output: 30
        
        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println("Total sum: " + solution.calPoints(ops2)); // Output: 27
    }
}
