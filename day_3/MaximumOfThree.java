package Day_3.Concepts_Code;
import java.util.Scanner;
public class MaximumofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a number for value a:");
        a=sc.nextInt();
        System.out.println("Enter a number for value b:");
        b=sc.nextInt();
        System.out.println("Enter a number for value c:");
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("Maximum of three numbers is: " + a);
        }
        else if(b>a && b>c){
            System.out.println("Maximum of three numbers is: " + b);
        }
        else{
            System.out.println("Maximum of three numbers is: " + c);
        }

    }
    
}
