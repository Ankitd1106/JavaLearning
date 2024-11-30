package javaConcepts;

import java.util.Stack;

public class Rakuten1 {
//()[]{} true
//            (] fasle
//            ([)] false
//    {[]} true

    public static void main(String[] args) {
        String s = "({[]})";
        if (!s.isEmpty()) {
            System.out.println(brackets(s));
        }

        else{
            System.out.println("blank string");
        }
    }

    public static boolean brackets(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (!(top == '(' && c == ')' || top == '[' && c == ']' || top == '{' && c == '}')) {
                    return false;
                }
            }
        }

//        System.out.println(stack);

        return stack.isEmpty();
    }


}
