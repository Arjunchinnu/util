import FromTreeMap.*;
import java.util.*;

public class TreeMapTest {

    public static void main(String[] args) {

        // TreeMap with Integer keys
        TreeMap<Integer, Integer> map = new TreeMap<>();

        map.put(5, 60);
        map.put(2, 20);
        map.put(8, 90);
        map.put(1, 20);
        map.put(10, -10);
        map.put(4, 40);
        map.put(7, 60);
        map.put(3, 0);

        System.out.println("Original TreeMap : " + map);

        // TreeMap => Array
        Integer[] arr = Convert.toArray(map, new Integer[0]);
        System.out.println("TreeMap => Array : " + Arrays.toString(arr));

        // TreeMap => ArrayList
        ArrayList<Integer> list = Convert.toArrayList(map);
        System.out.println("TreeMap => ArrayList : " + list);

        // TreeMap => Stack
        Stack<Integer> stack = Convert.toStack(map);
        System.out.println("TreeMap => Stack : " + stack);

        // TreeMap => LinkedList
        LinkedList<Integer> linkedList = Convert.toLinkedList(map);
        System.out.println("TreeMap => LinkedList : " + linkedList);

        // TreeMap => Vector
        Vector<Integer> vector = Convert.toVector(map);
        System.out.println("TreeMap => Vector : " + vector);

        // TreeMap => ArrayDeque
        ArrayDeque<Integer> deque = Convert.toArrayDeque(map);
        System.out.println("TreeMap => ArrayDeque : " + deque);

        // TreeMap => PriorityQueue
        PriorityQueue<Integer> queue = Convert.toPriorityQueue(map);
        System.out.println("TreeMap => PriorityQueue : " + queue);

        // Check PriorityQueue priority order
        PriorityQueue<Integer> copy = new PriorityQueue<>(queue);
        System.out.print("PriorityQueue poll order : ");

        while (!copy.isEmpty()) {
            System.out.print(copy.poll() + " ");
        }
        System.out.println();

        // TreeMap => HashSet
        HashSet<Integer> hashSet = Convert.toHashSet(map);
        System.out.println("TreeMap => HashSet : " + hashSet);

        // TreeMap => LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet =
                Convert.toLinkedHashSet(map);
        System.out.println(
                "TreeMap => LinkedHashSet : " + linkedHashSet);

        // TreeMap => TreeSet
        TreeSet<Integer> treeSet = Convert.toTreeSet(map);
        System.out.println("TreeMap => TreeSet : " + treeSet);


        // TreeMap<Integer,Integer> => HashMap<Integer,Integer>
        HashMap<Integer, Integer> hashMap =
                Convert.toIntegerHashMap(map);

        System.out.println(
                "TreeMap => HashMap<Integer,Integer> : "
                        + hashMap);

        // TreeMap<Integer,Integer> => LinkedHashMap<Integer,Integer>
        LinkedHashMap<Integer, Integer> linkedHashMap =
                Convert.toIntegerLinkedHashMap(map);

        System.out.println(
                "TreeMap => LinkedHashMap<Integer,Integer> : "
                        + linkedHashMap);


        // --------------------------------------------------
        // Character Key TreeMap
        // --------------------------------------------------

        TreeMap<Character, Integer> charMap = new TreeMap<>();

        charMap.put('d', 40);
        charMap.put('a', 60);
        charMap.put('f', 90);
        charMap.put('b', 20);
        charMap.put('e', -10);
        charMap.put('c', 0);

        System.out.println("\nCharacter Key TreeMap : " + charMap);

        // TreeMap<Character,Integer> => HashMap<Character,Integer>
        HashMap<Character, Integer> charHashMap =
                Convert.toCharacterHashMap(charMap);

        System.out.println(
                "TreeMap => HashMap<Character,Integer> : "
                        + charHashMap);

        // TreeMap<Character,Integer> => LinkedHashMap<Character,Integer>
        LinkedHashMap<Character, Integer> charLinkedHashMap =
                Convert.toCharacterLinkedHashMap(charMap);

        System.out.println(
                "TreeMap => LinkedHashMap<Character,Integer> : "
                        + charLinkedHashMap);


        // --------------------------------------------------
        // String Key TreeMap
        // --------------------------------------------------

        TreeMap<String, Integer> stringMap = new TreeMap<>();

        stringMap.put("Java", 60);
        stringMap.put("Python", 20);
        stringMap.put("React", 90);
        stringMap.put("MongoDB", -10);
        stringMap.put("Node", 40);

        System.out.println("\nString Key TreeMap : " + stringMap);

        // TreeMap<String,Integer> => HashMap<String,Integer>
        HashMap<String, Integer> stringHashMap =
                Convert.toStringHashMap(stringMap);

        System.out.println(
                "TreeMap => HashMap<String,Integer> : "
                        + stringHashMap);

        // TreeMap<String,Integer> => LinkedHashMap<String,Integer>
        LinkedHashMap<String, Integer> stringLinkedHashMap =
                Convert.toStringLinkedHashMap(stringMap);

        System.out.println(
                "TreeMap => LinkedHashMap<String,Integer> : "
                        + stringLinkedHashMap);
    }
}