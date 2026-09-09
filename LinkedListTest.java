import FromLinkedList.*;
import java.util.*;

public class LinkedListTest {

    public static void main(String[] args) {

        // One test case
        LinkedList<Integer> list = new LinkedList<>(
                Arrays.asList(60, 20, 90, 20, -10, 40, 60)
        );

        // LinkedList → Array
        Integer[] result1 = Convert.toArray(list, new Integer[0]);

        // LinkedList → ArrayList
        ArrayList<Integer> result2 = Convert.toArrayList(list);

        // LinkedList → Stack
        Stack<Integer> result3 = Convert.toStack(list);

        // LinkedList → Vector
        Vector<Integer> result4 = Convert.toVector(list);

        // LinkedList → ArrayDeque
        ArrayDeque<Integer> result5 = Convert.toArrayDeque(list);

        // LinkedList → PriorityQueue
        PriorityQueue<Integer> result6 = Convert.toPriorityQueue(list);

        // LinkedList → HashSet
        HashSet<Integer> result7 = Convert.toHashSet(list);

        // LinkedList → LinkedHashSet
        LinkedHashSet<Integer> result8 = Convert.toLinkedHashSet(list);

        // LinkedList → TreeSet
        TreeSet<Integer> result9 = Convert.toTreeSet(list);

        // LinkedList → HashMap
        HashMap<Integer, Integer> result10 =
                Convert.toIntegerHashMap(list);

        HashMap<Character, Integer> result11 =
                Convert.toCharacterHashMap(list);

        // LinkedList → TreeMap
        TreeMap<Integer, Integer> result12 =
                Convert.toIntegerTreeMap(list);

        TreeMap<Character, Integer> result13 =
                Convert.toCharacterTreeMap(list);

        // LinkedList → LinkedHashMap
        LinkedHashMap<Integer, Integer> result14 =
                Convert.toIntegerLinkedHashMap(list);

        LinkedHashMap<Character, Integer> result15 =
                Convert.toCharacterLinkedHashMap(list);


        // Print results

        System.out.println("Original LinkedList      : " + list);

        System.out.println("Array                    : "
                + Arrays.toString(result1));

        System.out.println("ArrayList                : " + result2);

        System.out.println("Stack                    : " + result3);

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