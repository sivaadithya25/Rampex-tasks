package util;

import exception.InvalidExpressionException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import model.Node;
import model.NumberNode;
import model.OperatorNode;

public class ExpressionBuilder {

    public static Node buildTree(String[] postfix) throws InvalidExpressionException {
        Stack<Node> stack = new Stack<>();

        try {
            for (String token : postfix) {
                if ("+-*/".contains(token)) {
                    Node right = stack.pop();
                    Node left = stack.pop();
                    stack.push(new OperatorNode(token, left, right));
                } else {
                    stack.push(new NumberNode(token));
                }
            }
            return stack.pop();
        } catch (Exception e) {
            throw new InvalidExpressionException("Invalid Expression");
        }
    }

    public static Node buildTreeFromPrefix(String[] prefix) throws InvalidExpressionException {
        Stack<Node> stack = new Stack<>();

        try {
            for (int i = prefix.length - 1; i >= 0; i--) {
                String token = prefix[i];
                if (isOperator(token)) {
                    Node left = stack.pop();
                    Node right = stack.pop();
                    stack.push(new OperatorNode(token, left, right));
                } else {
                    stack.push(new NumberNode(token));
                }
            }
            if (stack.size() != 1) {
                throw new InvalidExpressionException("Invalid Expression");
            }
            return stack.pop();
        } catch (Exception e) {
            throw new InvalidExpressionException("Invalid Expression");
        }
    }

    public static double evaluate(String expr) throws Exception {
        return evaluatePostfix(expr);
    }

    public static double evaluate(String[] postfix) throws Exception {
        return buildTree(postfix).evaluate();
    }

    public static double evaluate(String expr, String notation) throws Exception {
        switch (notation.toLowerCase()) {
            case "postfix":
                return evaluatePostfix(expr);
            case "prefix":
                return evaluatePrefix(expr);
            case "infix":
                return evaluateInfix(expr);
            default:
                throw new InvalidExpressionException("Unsupported notation: " + notation);
        }
    }

    public static double evaluatePostfix(String expr) throws Exception {
        String[] tokens = tokenizeBySpace(expr);
        return buildTree(tokens).evaluate();
    }

    public static double evaluatePrefix(String expr) throws Exception {
        String[] tokens = tokenizeBySpace(expr);
        return buildTreeFromPrefix(tokens).evaluate();
    }

    public static double evaluateInfix(String expr) throws Exception {
        String[] postfix = infixToPostfix(expr);
        return buildTree(postfix).evaluate();
    }

    private static String[] infixToPostfix(String expr) throws InvalidExpressionException {
        List<String> output = new ArrayList<>();
        Stack<String> operators = new Stack<>();
        List<String> tokens = tokenizeInfix(expr);

        for (String token : tokens) {
            if (isNumber(token)) {
                output.add(token);
            } else if ("(".equals(token)) {
                operators.push(token);
            } else if (")".equals(token)) {
                while (!operators.isEmpty() && !"(".equals(operators.peek())) {
                    output.add(operators.pop());
                }
                if (operators.isEmpty() || !"(".equals(operators.peek())) {
                    throw new InvalidExpressionException("Mismatched parentheses");
                }
                operators.pop();
            } else if (isOperator(token)) {
                while (!operators.isEmpty() && isOperator(operators.peek())
                        && precedence(operators.peek()) >= precedence(token)) {
                    output.add(operators.pop());
                }
                operators.push(token);
            } else {
                throw new InvalidExpressionException("Invalid token: " + token);
            }
        }

        while (!operators.isEmpty()) {
            String op = operators.pop();
            if ("(".equals(op) || ")".equals(op)) {
                throw new InvalidExpressionException("Mismatched parentheses");
            }
            output.add(op);
        }

        return output.toArray(new String[0]);
    }

    private static List<String> tokenizeInfix(String expr) throws InvalidExpressionException {
        List<String> tokens = new ArrayList<>();
        int i = 0;

        while (i < expr.length()) {
            char c = expr.charAt(i);

            if (Character.isWhitespace(c)) {
                i++;
                continue;
            }

            if (c == '(' || c == ')' || c == '+' || c == '*' || c == '/') {
                tokens.add(String.valueOf(c));
                i++;
                continue;
            }

            if (c == '-') {
                boolean unaryMinus = tokens.isEmpty() || "(".equals(tokens.get(tokens.size() - 1))
                        || isOperator(tokens.get(tokens.size() - 1));
                if (unaryMinus) {
                    int start = i;
                    i++;
                    while (i < expr.length() && (Character.isDigit(expr.charAt(i)) || expr.charAt(i) == '.')) {
                        i++;
                    }
                    String number = expr.substring(start, i);
                    if (!isNumber(number)) {
                        throw new InvalidExpressionException("Invalid number: " + number);
                    }
                    tokens.add(number);
                } else {
                    tokens.add(String.valueOf(c));
                    i++;
                }
                continue;
            }

            if (Character.isDigit(c) || c == '.') {
                int start = i;
                i++;
                while (i < expr.length() && (Character.isDigit(expr.charAt(i)) || expr.charAt(i) == '.')) {
                    i++;
                }
                String number = expr.substring(start, i);
                if (!isNumber(number)) {
                    throw new InvalidExpressionException("Invalid number: " + number);
                }
                tokens.add(number);
                continue;
            }

            throw new InvalidExpressionException("Invalid character: " + c);
        }

        return tokens;
    }

    private static String[] tokenizeBySpace(String expr) throws InvalidExpressionException {
        String trimmed = expr.trim();
        if (trimmed.isEmpty()) {
            throw new InvalidExpressionException("Expression cannot be empty");
        }
        return trimmed.split("\\s+");
    }

    private static boolean isOperator(String token) {
        return "+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token);
    }

    private static int precedence(String op) {
        if ("+".equals(op) || "-".equals(op)) {
            return 1;
        }
        if ("*".equals(op) || "/".equals(op)) {
            return 2;
        }
        return -1;
    }

    private static boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}