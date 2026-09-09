import FromLinkedHashMap.*;
import java.util.*;

public class LinkedHashMapTest {

    public static void main(String[] args) {

        // LinkedHashMap with Integer keys
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        map.put(5, 60);
        map.put(2, 20);
        map.put(8, 90);
        map.put(1, 20);
        map.put(10, -10);
        map.put(4, 40);
        map.put(7, 60);
        map.put(3, 0);

        System.out.println("Original LinkedHashMap : " + map);

        // LinkedHashMap => Array
        Integer[] arr = Convert.toArray(map, new Integer[0]);
        System.out.println("LinkedHashMap => Array : " + Arrays.toString(arr));

        // LinkedHashMap => ArrayList
        ArrayList<Integer> list = Convert.toArrayList(map);
        System.out.println("LinkedHashMap => ArrayList : " + list);

        // LinkedHashMap => Stack
        Stack<Integer> stack = Convert.toStack(map);
        System.out.println("LinkedHashMap => Stack : " + stack);

        // LinkedHashMap => LinkedList
        LinkedList<Integer> linkedList = Convert.toLinkedList(map);
        System.out.println("LinkedHashMap => LinkedList : " + linkedList);

        // LinkedHashMap => Vector
        Vector<Integer> vector = Convert.toVector(map);
        System.out.println("LinkedHashMap => Vector : " + vector);

        // LinkedHashMap => ArrayDeque
        ArrayDeque<Integer> deque = Convert.toArrayDeque(map);
        System.out.println("LinkedHashMap => ArrayDeque : " + deque);

        // LinkedHashMap => PriorityQueue
        PriorityQueue<Integer> queue = Convert.toPriorityQueue(map);
        System.out.println("LinkedHashMap => PriorityQueue : " + queue);

        // Check PriorityQueue priority order
        PriorityQueue<Integer> copy = new PriorityQueue<>(queue);
        System.out.print("PriorityQueue poll order : ");

        while (!copy.isEmpty()) {
            System.out.print(copy.poll() + " ");
        }
        System.out.println();

        // LinkedHashMap => HashSet
        HashSet<Integer> hashSet = Convert.toHashSet(map);
        System.out.println("LinkedHashMap => HashSet : " + hashSet);

        // LinkedHashMap => LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet =
                Convert.toLinkedHashSet(map);
        System.out.println(
                "LinkedHashMap => LinkedHashSet : " + linkedHashSet);

        // LinkedHashMap => TreeSet
        TreeSet<Integer> treeSet = Convert.toTreeSet(map);
        System.out.println("LinkedHashMap => TreeSet : " + treeSet);

        // LinkedHashMap<Integer,Integer> => HashMap<Integer,Integer>
        HashMap<Integer, Integer> hashMap =
                Convert.toIntegerHashMap(map);

        System.out.println(
                "LinkedHashMap => HashMap<Integer,Integer> : "
                        + hashMap);

        // LinkedHashMap<Integer,Integer> => TreeMap<Integer,Integer>
        TreeMap<Integer, Integer> treeMap =
                Convert.toIntegerTreeMap(map);

        System.out.println(
                "LinkedHashMap => TreeMap<Integer,Integer> : "
                        + treeMap);


        // --------------------------------------------------
        // Character Key LinkedHashMap
        // --------------------------------------------------

        LinkedHashMap<Character, Integer> charMap =
                new LinkedHashMap<>();

        charMap.put('d', 40);
        charMap.put('a', 60);
        charMap.put('f', 90);
        charMap.put('b', 20);
        charMap.put('e', -10);
        charMap.put('c', 0);

        System.out.println(
                "\nCharacter Key LinkedHashMap : " + charMap);

        // LinkedHashMap<Character,Integer> => HashMap<Character,Integer>
        HashMap<Character, Integer> charHashMap =
                Convert.toCharacterHashMap(charMap);

        System.out.println(
                "LinkedHashMap => HashMap<Character,Integer> : "
                        + charHashMap);

        // LinkedHashMap<Character,Integer> => TreeMap<Character,Integer>
        TreeMap<Character, Integer> charTreeMap =
                Convert.toCharacterTreeMap(charMap);

        System.out.println(
                "LinkedHashMap => TreeMap<Character,Integer> : "
                        + charTreeMap);


        // --------------------------------------------------
        // String Key LinkedHashMap
        // --------------------------------------------------

        LinkedHashMap<String, Integer> stringMap =
                new LinkedHashMap<>();

        stringMap.put("Java", 60);
        stringMap.put("Python", 20);
        stringMap.put("React", 90);
        stringMap.put("MongoDB", -10);
        stringMap.put("Node", 40);

        System.out.println(
                "\nString Key LinkedHashMap : " + stringMap);

        // LinkedHashMap<String,Integer> => HashMap<String,Integer>
        HashMap<String, Integer> stringHashMap =
                Convert.toStringHashMap(stringMap);

        System.out.println(
                "LinkedHashMap => HashMap<String,Integer> : "
                        + stringHashMap);

        // LinkedHashMap<String,Integer> => TreeMap<String,Integer>
        TreeMap<String, Integer> stringTreeMap =
                Convert.toStringTreeMap(stringMap);

        System.out.println(
                "LinkedHashMap => TreeMap<String,Integer> : "
                        + stringTreeMap);
    }
}