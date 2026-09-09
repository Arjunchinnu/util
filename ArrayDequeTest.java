import FromArrayDeque.*;
import java.util.*;

public class ArrayDequeTest {

    public static void main(String[] args) {

        // One best test case
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addAll(Arrays.asList(
                60, 20, 90, 20, -10, 40, 60
        ));

        // ArrayDeque → Array
        Integer[] result1 =
                Convert.toArray(deque, new Integer[0]);

        // ArrayDeque → ArrayList
        ArrayList<Integer> result2 =
                Convert.toArrayList(deque);

        // ArrayDeque → LinkedList
        LinkedList<Integer> result3 =
                Convert.toLinkedList(deque);

        // ArrayDeque → Vector
        Vector<Integer> result4 =
                Convert.toVector(deque);

        // ArrayDeque → Stack
        Stack<Integer> result5 =
                Convert.toStack(deque);

        // ArrayDeque → PriorityQueue
        PriorityQueue<Integer> result6 =
                Convert.toPriorityQueue(deque);

        // ArrayDeque → HashSet
        HashSet<Integer> result7 =
                Convert.toHashSet(deque);

        // ArrayDeque → LinkedHashSet
        LinkedHashSet<Integer> result8 =
                Convert.toLinkedHashSet(deque);

        // ArrayDeque → TreeSet
        TreeSet<Integer> result9 =
                Convert.toTreeSet(deque);

        // ArrayDeque → HashMap<Integer, Integer>
        HashMap<Integer, Integer> result10 =
                Convert.toIntegerHashMap(deque);

        // ArrayDeque → HashMap<Character, Integer>
        HashMap<Character, Integer> result11 =
                Convert.toCharacterHashMap(deque);

        // ArrayDeque → TreeMap<Integer, Integer>
        TreeMap<Integer, Integer> result12 =
                Convert.toIntegerTreeMap(deque);

        // ArrayDeque → TreeMap<Character, Integer>
        TreeMap<Character, Integer> result13 =
                Convert.toCharacterTreeMap(deque);

        // ArrayDeque → LinkedHashMap<Integer, Integer>
        LinkedHashMap<Integer, Integer> result14 =
                Convert.toIntegerLinkedHashMap(deque);

        // ArrayDeque → LinkedHashMap<Character, Integer>
        LinkedHashMap<Character, Integer> result15 =
                Convert.toCharacterLinkedHashMap(deque);


        // Print results

        System.out.println("Original ArrayDeque       : " + deque);

        System.out.println("Array                     : "
                + Arrays.toString(result1));

        System.out.println("ArrayList                 : "
                + result2);

        System.out.println("LinkedList                : "
                + result3);

        System.out.println("Vector                    : "
                + result4);

        System.out.println("Stack                     : "
                + result5);

        System.out.println("PriorityQueue             : "
                + result6);

        System.out.println("HashSet                   : "
                + result7);

        System.out.println("LinkedHashSet             : "
                + result8);

        System.out.println("TreeSet                   : "
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