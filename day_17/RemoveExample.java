package Day_17.Concepts_Code;
import java.util.ArrayList;
import java.util.List;

public class RemoveExample{
     public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(15);
        list.add(20);
        list.add(26);
        list.add(30);
        System.out.println(list);
        for(Integer i:list){
            list.remove(i);
        }
        System.out.println(list);
    }
}
