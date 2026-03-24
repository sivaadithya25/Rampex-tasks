import java.util.*;
public class Solution2525{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();
        int mass = sc.nextInt();
        if(isBulky(length,width,height) && mass >= 100)     System.out.println("Both");
        else if(!(isBulky(length,width,height)) && mass < 100)      System.out.println("Neither");
        else if(!(isBulky(length,width,height)) && mass >= 100)     System.out.println("Heavy");
        else    System.out.println("Bulky");
    }
    
    private static boolean isBulky(int length, int width, int height){
        long volume = (long)length * (long)width * (long)height;

        if(Math.max(length,Math.max(width,height)) >= 10_000)   return true;
        if( volume >= 1000_000_000) return true;
        return false;
    }
}