import FromHashSet.*;
import java.util.*;

public class HashSetTest {

    public static void main(String[] args) {

        // One best test case
        HashSet<Integer> set = new HashSet<>();

        set.addAll(Arrays.asList(
                60, 20, 90, 20, -10, 40, 60
        ));

        // HashSet → Array
        Integer[] result1 =
                Convert.toArray(set, new Integer[0]);

        // HashSet → ArrayList
        ArrayList<Integer> result2 =
                Convert.toArrayList(set);

        // HashSet → LinkedList
        LinkedList<Integer> result3 =
                Convert.toLinkedList(set);

        // HashSet → Vector
        Vector<Integer> result4 =
                Convert.toVector(set);

        // HashSet → Stack
        Stack<Integer> result5 =
                Convert.toStack(set);

        // HashSet → PriorityQueue
        PriorityQueue<Integer> result6 =
                Convert.toPriorityQueue(set);

        // HashSet → ArrayDeque
        ArrayDeque<Integer> result7 =
                Convert.toArrayDeque(set);

        // HashSet → LinkedHashSet
        LinkedHashSet<Integer> result8 =
                Convert.toLinkedHashSet(set);

        // HashSet → TreeSet
        TreeSet<Integer> result9 =
                Convert.toTreeSet(set);

        // HashSet → HashMap<Integer, Integer>
        HashMap<Integer, Integer> result10 =
                Convert.toIntegerHashMap(set);

        // HashSet → HashMap<Character, Integer>
        HashMap<Character, Integer> result11 =
                Convert.toCharacterHashMap(set);

        // HashSet → TreeMap<Integer, Integer>
        TreeMap<Integer, Integer> result12 =
                Convert.toIntegerTreeMap(set);

        // HashSet → TreeMap<Character, Integer>
        TreeMap<Character, Integer> result13 =
                Convert.toCharacterTreeMap(set);

        // HashSet → LinkedHashMap<Integer, Integer>
        LinkedHashMap<Integer, Integer> result14 =
                Convert.toIntegerLinkedHashMap(set);

        // HashSet → LinkedHashMap<Character, Integer>
        LinkedHashMap<Character, Integer> result15 =
                Convert.toCharacterLinkedHashMap(set);


        // Print results

        System.out.println("Original HashSet          : " + set);

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

        System.out.println("ArrayDeque                : "
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