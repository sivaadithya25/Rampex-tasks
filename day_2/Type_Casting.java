
public class TypeCasting {
    public static void main(String[] args) {
        int num1 = 100;
        double num2 = num1; 
        System.out.println("Implicit Type Casting: " + num2);
        double num3 = 9.99;
        int num4 = (int) num3;
        System.out.println("Explicit Type Casting: " + num4);
        String str = "123";
        int num5 = Integer.parseInt(str);
        System.out.println("String to Integer: " + num5);
        char ch = 'A';
        int num6 = ch;  
        System.out.println("Char to Integer: " + num6);
        
    }
    
}
