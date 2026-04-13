package main;

import java.util.Scanner;
import util.ExpressionBuilder;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter notation (postfix/prefix/infix): ");
            String notation = scanner.nextLine().trim().toLowerCase();

            if (!notation.equals("postfix") && !notation.equals("prefix") && !notation.equals("infix")) {
                System.out.println("Error: notation must be postfix, prefix, or infix");
                return;
            }

            System.out.print("Enter " + notation + " expression: ");
            String expr = scanner.nextLine().trim();

            if (expr.isEmpty()) {
                System.out.println("Error: expression cannot be empty");
                return;
            }

            double result = ExpressionBuilder.evaluate(expr, notation);

            System.out.println("Notation: " + notation);
            System.out.println("Expression: " + expr);
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}