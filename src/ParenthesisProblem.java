import java.util.Stack;

public class ParenthesisProblem {
    public static boolean isValid(String string) {
        Stack<Character> stack = new Stack<>();         //stack to store new chars
        for(Character character: string.toCharArray())           //access the chars using for loop.
        {
            switch (character)
            {
                case '(':
                case '{':
                case '[':
                    stack.push(character);
                    break;
                case ')':
                    if(stack.peek() != '(' || stack.isEmpty()) {
                        return false;
                    }
                    stack.pop();
                    break;
                case '}':
                    if(stack.peek() != '{' || stack.isEmpty()) {
                        return false;
                    }
                    stack.pop();
                    break;
                case ']':
                    if(stack.peek() != '[' || stack.isEmpty()) {
                        return false;
                    }
                    stack.pop();
                    break;
            }
        }
        return stack.isEmpty();     //if stack is empty return true
    }
    public static void main(String[] args) {
        //isValid("{}[]");
        System.out.println(isValid("{}[]"));
        System.out.println(isValid("{[}]"));
    }
}
