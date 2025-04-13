package practicePrograms;

import java.util.Stack;

public class BalancedParanthesis {

    public static boolean isBalanced(String s) {
        // Stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse through each character in the string
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            // If it's a closing bracket, check if it matches the top of the stack
            else if (c == ')' || c == ']' || c == '}') {
                // Stack must not be empty and top of stack must match corresponding opening bracket
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        // If stack is empty, all brackets were matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("()[]{}]"));  // Output: false
        System.out.println(isBalanced("[{()}]")); // Output: true
        System.out.println(isBalanced("[]{}()[{(({[]}))}][]{}()"));// Output: true
        System.out.println(isBalanced("[)(]"));// Output: true
    }
}
