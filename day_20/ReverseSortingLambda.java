import java.util.*;

public class ReverseSortingLambda {
    public static void main(String[] args) {
        List<String> words=new ArrayList<>();
        words.add("cake");
        words.add("banana");
        words.add("watermelon");
        words.add("grapes");
        words.add("muskmelon"); 
        words.add("apple");
        
        words.sort(Comparator.reverseOrder());
        // words.forEach((i) -> System.out.println(i));
        System.out.println(words);
        


    }
}
