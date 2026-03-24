import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        System.out.println("Enter the first number: " + num1);
        System.out.println("Enter the second number: " + num2);
        System.out.println("Enter the operator (+, -, *, /): ");
        Scanner sc = new Scanner(System.in);
        char operator = sc.next().charAt(0);
        switch(operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if(num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
    
}
