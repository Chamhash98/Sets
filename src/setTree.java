import java.util.TreeSet;

public class setTree {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(48);
        ts.add(132);
        ts.add(24);
        ts.add(30);

        System.out.println(ts);

        //poll - sorting(filteration)
        System.out.println("Lowest Value :- " + ts.pollFirst());
        System.out.println("Highest Value :- " + ts.pollLast());
    }
}
