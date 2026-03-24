package Day_3.Concepts_Code;
import java.util.*;
public class MathematicalOperations {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for value a:");
        a=sc.nextInt();
        System.out.println("Enter a number for value b:");
        b=sc.nextInt();
        System.out.println("Sum: " + (a+b));
        System.out.println("Difference: " + (a-b));
        System.out.println("Product: " + (a*b));
        System.out.println("Quotient: " + (a/b));
        System.out.println("Remainder: " + (a%b));
    }
}
