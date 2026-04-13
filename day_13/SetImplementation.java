package Day_13.Concepts_Code;
import java.util.*;
public class SetImplementation {
    public static void main(String[] args) {
        Integer a=1;
        Set<Integer> set = new HashSet<>();
        set.add(a);
        System.out.println(set.hashCode());
        set.add(0);
        System.out.println(set);
        System.out.println(set.contains(1));
        Set<String> set1 = new HashSet<>();
        set1.add("Shruthi");
        set1.add("Sibi");
        set1.add("sruthika");
        set1.add("siva");
        System.out.println(set1);
        System.out.println(set1.hashCode());
        for(String s:set1){
            System.out.println(s);
        }
    }
    
}
