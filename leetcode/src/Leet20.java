import java.util.Stack;

public class Leet20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Leet20 solution = new Leet20();
        String testString = "()[]{}";
        boolean result = solution.isValid(testString);
        System.out.println("Строка " + testString + " является " + (result ? "валидной" : "невалидной"));
    }
}
