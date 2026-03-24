package Day_3.Concepts_Code;

public class TiltedSquarePattern {
    public static void main(String[] args) {
        int size = 5; // Size of the tilted square

        // Print the tilted square pattern
        for (int i = 0; i < size; i++) {
            // Print leading spaces
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 0; k < size; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
