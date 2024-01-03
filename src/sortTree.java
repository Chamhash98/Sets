import java.util.TreeSet;

public class sortTree {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        //ascending - descending

        System.out.println("Tree Set :- " + set);//ABCDE
        System.out.println("Reverse Tree Set :- " + set.descendingSet());//EDCBA
        System.out.println("Top Tree Set :- " + set.headSet("C", true));//ABC
        System.out.println("Romove Tree Set :- " + set.subSet("A", false, "E", true));//remove //BCDE
        System.out.println("Bottom Tree Set :- " + set.tailSet("C", false));//DE
    }
    }

