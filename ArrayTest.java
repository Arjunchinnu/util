import FromArrayList.*;
import java.util.*;

public class ArrayTest{

    public static void main(String[] args) {

        // One test case covering duplicates, unsorted values,
        // positive and negative numbers
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(60, 20, 90, 20, -10, 40, 60)
        );

        // ArrayList → Array
        Integer[] result1 = Convert.toArray(list, new Integer[0]);

        // ArrayList → Stack
        Stack<Integer> result2 = Convert.toStack(list);

        // ArrayList → LinkedList
        LinkedList<Integer> result3 = Convert.toLinkedList(list);

        // ArrayList → Vector
        Vector<Integer> result4 = Convert.toVector(list);

        // ArrayList → ArrayDeque
        ArrayDeque<Integer> result5 = Convert.toArrayDeque(list);

        // ArrayList → PriorityQueue
        PriorityQueue<Integer> result6 = Convert.toPriorityQueue(list);

        // ArrayList → HashSet
        HashSet<Integer> result7 = Convert.toHashSet(list);

        // ArrayList → LinkedHashSet
        LinkedHashSet<Integer> result8 = Convert.toLinkedHashSet(list);

        // ArrayList → TreeSet
        TreeSet<Integer> result9 = Convert.toTreeSet(list);

        // ArrayList → HashMap
        HashMap<Integer, Integer> result10 =
                Convert.toIntegerHashMap(list);

        HashMap<Character, Integer> result11 =
                Convert.toCharacterHashMap(list);

        // ArrayList → TreeMap
        TreeMap<Integer, Integer> result12 =
                Convert.toIntegerTreeMap(list);

        TreeMap<Character, Integer> result13 =
                Convert.toCharacterTreeMap(list);

        // ArrayList → LinkedHashMap
        LinkedHashMap<Integer, Integer> result14 =
                Convert.toIntegerLinkedHashMap(list);

        LinkedHashMap<Character, Integer> result15 =
                Convert.toCharacterLinkedHashMap(list);


        // Print results

        System.out.println("Original ArrayList       : " + list);

        System.out.println("Array                    : "
                + Arrays.toString(result1));

        System.out.println("Stack                    : " + result2);

        System.out.println("LinkedList               : " + result3);

        System.out.println("Vector                   : " + result4);

        System.out.println("ArrayDeque               : " + result5);

        System.out.println("PriorityQueue            : " + result6);

        System.out.println("HashSet                  : " + result7);

        System.out.println("LinkedHashSet            : " + result8);

        System.out.println("TreeSet                  : " + result9);

        System.out.println("Integer HashMap          : " + result10);

        System.out.println("Character HashMap        : " + result11);

        System.out.println("Integer TreeMap          : " + result12);

        System.out.println("Character TreeMap        : " + result13);

        System.out.println("Integer LinkedHashMap    : " + result14);

        System.out.println("Character LinkedHashMap  : " + result15);
    }
}
