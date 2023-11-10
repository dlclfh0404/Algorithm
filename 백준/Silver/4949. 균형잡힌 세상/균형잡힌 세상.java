import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();

            // 종료 조건
            if (input.equals(".")) {
                break;
            }

            // 괄호의 짝이 올바르게 맞는지 확인
            if (isBalanced(input)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    private static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == ']') {
                // 스택이 비어있거나 짝이 맞지 않으면 false
                if (stack.isEmpty() || !isPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        // 스택이 비어있어야 모든 괄호의 짝이 맞음
        return stack.isEmpty();
    }

    private static boolean isPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']');
    }
}