import FromTreeSet.*;
import java.util.*;

public class TreeSetTest {

    public static void main(String[] args) {

        // One best test case
        TreeSet<Integer> set = new TreeSet<>();

        set.addAll(Arrays.asList(
                60, 20, 90, 20, -10, 40, 60, 0
        ));

        // TreeSet → Array
        Integer[] result1 =
                Convert.toArray(set, new Integer[0]);

        // TreeSet → ArrayList
        ArrayList<Integer> result2 =
                Convert.toArrayList(set);

        // TreeSet → Stack
        Stack<Integer> result3 =
                Convert.toStack(set);

        // TreeSet → LinkedList
        LinkedList<Integer> result4 =
                Convert.toLinkedList(set);

        // TreeSet → Vector
        Vector<Integer> result5 =
                Convert.toVector(set);

        // TreeSet → ArrayDeque
        ArrayDeque<Integer> result6 =
                Convert.toArrayDeque(set);

        // TreeSet → PriorityQueue
        PriorityQueue<Integer> result7 =
                Convert.toPriorityQueue(set);

        // TreeSet → HashSet
        HashSet<Integer> result8 =
                Convert.toHashSet(set);

        // TreeSet → LinkedHashSet
        LinkedHashSet<Integer> result9 =
                Convert.toLinkedHashSet(set);

        // TreeSet → HashMap<Integer, Integer>
        HashMap<Integer, Integer> result10 =
                Convert.toIntegerHashMap(set);

        // TreeSet → HashMap<Character, Integer>
        HashMap<Character, Integer> result11 =
                Convert.toCharacterHashMap(set);

        // TreeSet → TreeMap<Integer, Integer>
        TreeMap<Integer, Integer> result12 =
                Convert.toIntegerTreeMap(set);

        // TreeSet → TreeMap<Character, Integer>
        TreeMap<Character, Integer> result13 =
                Convert.toCharacterTreeMap(set);

        // TreeSet → LinkedHashMap<Integer, Integer>
        LinkedHashMap<Integer, Integer> result14 =
                Convert.toIntegerLinkedHashMap(set);

        // TreeSet → LinkedHashMap<Character, Integer>
        LinkedHashMap<Character, Integer> result15 =
                Convert.toCharacterLinkedHashMap(set);


        // Print results

        System.out.println("Original TreeSet          : " + set);

        System.out.println("Array                     : "
                + Arrays.toString(result1));

        System.out.println("ArrayList                 : "
                + result2);

        System.out.println("Stack                     : "
                + result3);

        System.out.println("LinkedList                : "
                + result4);

        System.out.println("Vector                    : "
                + result5);

        System.out.println("ArrayDeque                : "
                + result6);

        System.out.println("PriorityQueue             : "
                + result7);

        System.out.println("HashSet                   : "
                + result8);

        System.out.println("LinkedHashSet             : "
                + result9);

        System.out.println("Integer HashMap           : "
                + result10);

        System.out.println("Character HashMap         : "
                + result11);

        System.out.println("Integer TreeMap           : "
                + result12);

        System.out.println("Character TreeMap         : "
                + result13);

        System.out.println("Integer LinkedHashMap     : "
                + result14);

        System.out.println("Character LinkedHashMap   : "
                + result15);
    }
}