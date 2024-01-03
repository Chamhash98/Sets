import java.util.HashSet;
import java.util.Iterator;

public class setHash {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        //hashset out

            set.add("one");
            set.add("Two");
            set.add("Three");
            set.add("Four");
            set.add("Five");

        //hashset duplicate out
        set.add("Amal");
        set.add("Kamal");
        set.add("Amal");
        set.add("Samal");
        set.add("Namal");
        Iterator<String> i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
