package Day_13.Concepts_Code;
import java.util.*;
public class TreeSetImplementation {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(30);
        set.add(20);
        set.add(10);
        set.add(15);
    set.tailSet(5);
        System.out.println(set);
    }
    
}
