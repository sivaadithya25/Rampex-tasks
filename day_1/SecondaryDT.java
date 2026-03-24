
public class SecondaryDataTypes {
    public static void main(String[] args) {
        // Secondary data types in Java
        String myString = "Hello, World!"; // A sequence of characters
        int[] myArray = {1, 2, 3, 4, 5}; // An array of integers
        java.util.List<String> myList = new java.util.ArrayList<>(); // A list of strings
        myList.add("Java");
        myList.add("Python");
        myList.add("C++");

        // Print the values of the secondary data types
        System.out.println("String value: " + myString);
        System.out.print("Array values: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("List values: " + myList);
    }
    
}
