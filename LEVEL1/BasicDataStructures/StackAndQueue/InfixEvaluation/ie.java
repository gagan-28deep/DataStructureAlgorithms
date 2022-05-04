// Constraints
// 1. Expression is balanced
// 2. The only operators used are +, -, *, /
// 3. Opening and closing brackets - () - are used to impact precedence of operations
// 4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
// 5. In two operators of equal precedence give preference to the one on left.
// 6. All operands are single digit numbers.

// Format
// Input
// Input is managed for you

// Output
// Value of infix expression

// Example
// Sample Input

// 2 + 6 * 4 / 8 - 3

// Sample Output
// 2

import java.io.*;
import java.util.*;

public class ie {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                operator.push(ch);
            } else if (Character.isDigit(ch)) {
                operand.push(ch - '0'); // char to int
            } else if (ch == ')') {
                while (operator.peek() != '(') {
                    char optor = operator.pop();
                    int v2 = operand.pop();
                    int v1 = operand.pop();

                    int opv = operation(v1, v2, optor);
                    operand.push(opv);
                }
                operator.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // ch wants to solve higher priority first
                while (operator.size() > 0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())) {
                    char optor = operator.pop();
                    int v2 = operand.pop();
                    int v1 = operand.pop();

                    int opv = operation(v1, v2, optor);
                    operand.push(opv);
                }
                // ch is pushing itself now
                operator.push(ch);
            }
        }
        while (operator.size() != 0) {

            char optor = operator.pop();
            int v2 = operand.pop();
            int v1 = operand.pop();

            int opv = operation(v1, v2, optor);
            operand.push(opv);
        }

        System.out.println(operand.peek());

    }

    public static int precedence(char optor) {
        if (optor == '+') {
            return 1;
        } else if (optor == '-') {
            return 1;
        } else if (optor == '*') {
            return 2;
        } else {
            return 2;
        }
    }

    public static int operation(int v1, int v2, char optor) {
        if (optor == '+') {
            return v1 + v2;
        } else if (optor == '-') {
            return v1 - v2;
        } else if (optor == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
}