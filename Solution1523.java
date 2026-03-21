
import java.util.Scanner;

public class Solution1523{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        high=(high+1)/2;
        low=low/2;
        System.out.println(high-low);
    } 
    
}
