package Day_8.Concepts_Code;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum of 2 integers: " + calculator.add(5, 10));
        System.out.println("Sum of 3 integers: " + calculator.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + calculator.add(5.5, 10.5));
    }

    
}
