import FromPriorityQueue.*;
import java.util.*;

public class PriorityQueueTest {

    public static void main(String[] args) {

        // One best test case
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.addAll(Arrays.asList(
                60, 20, 90, 20, -10, 40, 60
        ));

        // PriorityQueue → Array
        Integer[] result1 =
                Convert.toArray(queue, new Integer[0]);

        // PriorityQueue → ArrayList
        ArrayList<Integer> result2 =
                Convert.toArrayList(queue);

        // PriorityQueue → LinkedList
        LinkedList<Integer> result3 =
                Convert.toLinkedList(queue);

        // PriorityQueue → Vector
        Vector<Integer> result4 =
                Convert.toVector(queue);

        // PriorityQueue → Stack
        Stack<Integer> result5 =
                Convert.toStack(queue);

        // PriorityQueue → ArrayDeque
        ArrayDeque<Integer> result6 =
                Convert.toArrayDeque(queue);

        // PriorityQueue → HashSet
        HashSet<Integer> result7 =
                Convert.toHashSet(queue);

        // PriorityQueue → LinkedHashSet
        LinkedHashSet<Integer> result8 =
                Convert.toLinkedHashSet(queue);

        // PriorityQueue → TreeSet
        TreeSet<Integer> result9 =
                Convert.toTreeSet(queue);

        // PriorityQueue → HashMap<Integer, Integer>
        HashMap<Integer, Integer> result10 =
                Convert.toIntegerHashMap(queue);

        // PriorityQueue → HashMap<Character, Integer>
        HashMap<Character, Integer> result11 =
                Convert.toCharacterHashMap(queue);

        // PriorityQueue → TreeMap<Integer, Integer>
        TreeMap<Integer, Integer> result12 =
                Convert.toIntegerTreeMap(queue);

        // PriorityQueue → TreeMap<Character, Integer>
        TreeMap<Character, Integer> result13 =
                Convert.toCharacterTreeMap(queue);

        // PriorityQueue → LinkedHashMap<Integer, Integer>
        LinkedHashMap<Integer, Integer> result14 =
                Convert.toIntegerLinkedHashMap(queue);

        // PriorityQueue → LinkedHashMap<Character, Integer>
        LinkedHashMap<Character, Integer> result15 =
                Convert.toCharacterLinkedHashMap(queue);


        // Print results

        System.out.println("Original PriorityQueue    : " + queue);

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

        System.out.println("ArrayDeque                : "
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