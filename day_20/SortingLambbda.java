import java.util.*;

public class SortingLambda {
    public static void main(String[] args) {
        List<String> words=new ArrayList<>();
        words.add("cake");
        words.add("banana");
        words.add("watermelon");
        words.add("grapes");
        words.add("muskmelon");
        words.add("apple");
        
        words.sort(Comparator.reverseOrder());
        System.out.println(words);
        


    }
}
