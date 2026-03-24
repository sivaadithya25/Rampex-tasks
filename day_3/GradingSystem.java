package Day_3.Concepts_Code;
import java.util.*;
public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks=sc.nextInt();
        switch (marks) {
            case 100:
                System.out.println("Grade: A+");            
                break;
            case 90:
                System.out.println("Grade: A");
                break;
            case 80:
                System.out.println("Grade: B");
                break;
            case 70:
                System.out.println("Grade: C");
                break;
            default:
                System.out.println("Grade: C"); 
                break;
        }
    }
    
}
