import FromStack.*;
import java.util.*;

public class StackTest {

    public static void main(String[] args) {

        // One best test case
        Stack<Integer> stack = new Stack<>();

        stack.addAll(Arrays.asList(
                60, 20, 90, 20, -10, 40, 60
        ));

        // Stack → Array
        Integer[] result1 =
                Convert.toArray(stack, new Integer[0]);

        // Stack → ArrayList
        ArrayList<Integer> result2 =
                Convert.toArrayList(stack);

        // Stack → LinkedList
        LinkedList<Integer> result3 =
                Convert.toLinkedList(stack);

        // Stack → Vector
        Vector<Integer> result4 =
                Convert.toVector(stack);

        // Stack → ArrayDeque
        ArrayDeque<Integer> result5 =
                Convert.toArrayDeque(stack);

        // Stack → PriorityQueue
        PriorityQueue<Integer> result6 =
                Convert.toPriorityQueue(stack);

        // Stack → HashSet
        HashSet<Integer> result7 =
                Convert.toHashSet(stack);

        // Stack → LinkedHashSet
        LinkedHashSet<Integer> result8 =
                Convert.toLinkedHashSet(stack);

        // Stack → TreeSet
        TreeSet<Integer> result9 =
                Convert.toTreeSet(stack);

        // Stack → HashMap
        HashMap<Integer, Integer> result10 =
                Convert.toHashMap(stack);

        // Stack → TreeMap
        TreeMap<Integer, Integer> result11 =
                Convert.toTreeMap(stack);

        // Stack → LinkedHashMap<Integer, Integer>
        LinkedHashMap<Integer, Integer> result12 =
                Convert.toIntegerLinkedHashMap(stack);

        // Stack → LinkedHashMap<Character, Integer>
        LinkedHashMap<Character, Integer> result13 =
                Convert.toCharacterLinkedHashMap(stack);

        // Print results
        System.out.println("Original Stack            : " + stack);
        System.out.println("Array                     : "
                + Arrays.toString(result1));
        System.out.println("ArrayList                 : " + result2);
        System.out.println("LinkedList                : " + result3);
        System.out.println("Vector                    : " + result4);
        System.out.println("ArrayDeque                : " + result5);
        System.out.println("PriorityQueue             : " + result6);
        System.out.println("HashSet                   : " + result7);
        System.out.println("LinkedHashSet             : " + result8);
        System.out.println("TreeSet                   : " + result9);
        System.out.println("HashMap                   : " + result10);
        System.out.println("TreeMap                   : " + result11);
        System.out.println("Integer LinkedHashMap     : " + result12);
        System.out.println("Character LinkedHashMap   : " + result13);
    }
}