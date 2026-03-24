import java.util.*;
public class Perimeter {
    public static void main(String[] args) {
        int l,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        l=sc.nextInt();
        System.out.println("Enter the breadth:");
        b=sc.nextInt();
        System.out.println("Perimeter: " + 2*(l+b));    
    }
}
