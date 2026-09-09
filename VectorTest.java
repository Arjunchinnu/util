import FromVector.*;
import java.util.*;

public class VectorTest {

    public static void main(String[] args) {

        // One test case
        Vector<Integer> vector = new Vector<>(
                Arrays.asList(60, 20, 90, 20, -10, 40, 60)
        );

        // Vector → Array
        Integer[] result1 = Convert.toArray(vector, new Integer[0]);

        // Vector → ArrayList
        ArrayList<Integer> result2 = Convert.toArrayList(vector);

        // Vector → LinkedList
        LinkedList<Integer> result3 = Convert.toLinkedList(vector);

        // Vector → Stack
        Stack<Integer> result4 = Convert.toStack(vector);

        // Vector → ArrayDeque
        ArrayDeque<Integer> result5 = Convert.toArrayDeque(vector);

        // Vector → PriorityQueue
        PriorityQueue<Integer> result6 = Convert.toPriorityQueue(vector);

        // Vector → HashSet
        HashSet<Integer> result7 = Convert.toHashSet(vector);

        // Vector → LinkedHashSet
        LinkedHashSet<Integer> result8 = Convert.toLinkedHashSet(vector);

        // Vector → TreeSet
        TreeSet<Integer> result9 = Convert.toTreeSet(vector);

        // Vector → HashMap
        HashMap<Integer, Integer> result10 =
                Convert.toIntegerHashMap(vector);

        HashMap<Character, Integer> result11 =
                Convert.toCharacterHashMap(vector);

        // Vector → TreeMap
        TreeMap<Integer, Integer> result12 =
                Convert.toIntegerTreeMap(vector);

        TreeMap<Character, Integer> result13 =
                Convert.toCharacterTreeMap(vector);

        // Vector → LinkedHashMap
        LinkedHashMap<Integer, Integer> result14 =
                Convert.toIntegerLinkedHashMap(vector);

        LinkedHashMap<Character, Integer> result15 =
                Convert.toCharacterLinkedHashMap(vector);


        // Print results

        System.out.println("Original Vector          : " + vector);

        System.out.println("Array                    : "
                + Arrays.toString(result1));

        System.out.println("ArrayList                : " + result2);

        System.out.println("LinkedList               : " + result3);

        System.out.println("Stack                    : " + result4);

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