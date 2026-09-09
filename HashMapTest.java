import FromHashMap.*;
import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {

        // HashMap with Integer keys
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(5, 60);
        map.put(2, 20);
        map.put(8, 90);
        map.put(1, 20);
        map.put(10, -10);
        map.put(4, 40);
        map.put(7, 60);
        map.put(3, 0);

        System.out.println("Original HashMap : " + map);

        // HashMap => Array
        Integer[] arr = Convert.toArray(map, new Integer[0]);
        System.out.println("HashMap => Array : " + Arrays.toString(arr));

        // HashMap => ArrayList
        ArrayList<Integer> list = Convert.toArrayList(map);
        System.out.println("HashMap => ArrayList : " + list);

        // HashMap => Stack
        Stack<Integer> stack = Convert.toStack(map);
        System.out.println("HashMap => Stack : " + stack);

        // HashMap => LinkedList
        LinkedList<Integer> linkedList = Convert.toLinkedList(map);
        System.out.println("HashMap => LinkedList : " + linkedList);

        // HashMap => Vector
        Vector<Integer> vector = Convert.toVector(map);
        System.out.println("HashMap => Vector : " + vector);

        // HashMap => ArrayDeque
        ArrayDeque<Integer> deque = Convert.toArrayDeque(map);
        System.out.println("HashMap => ArrayDeque : " + deque);

        // HashMap => PriorityQueue
        PriorityQueue<Integer> queue = Convert.toPriorityQueue(map);
        System.out.println("HashMap => PriorityQueue : " + queue);

        // Check PriorityQueue priority order
        PriorityQueue<Integer> copy = new PriorityQueue<>(queue);
        System.out.print("PriorityQueue poll order : ");

        while (!copy.isEmpty()) {
            System.out.print(copy.poll() + " ");
        }
        System.out.println();

        // HashMap => HashSet
        HashSet<Integer> hashSet = Convert.toHashSet(map);
        System.out.println("HashMap => HashSet : " + hashSet);

        // HashMap => LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet =
                Convert.toLinkedHashSet(map);
        System.out.println("HashMap => LinkedHashSet : " + linkedHashSet);

        // HashMap => TreeSet
        TreeSet<Integer> treeSet = Convert.toTreeSet(map);
        System.out.println("HashMap => TreeSet : " + treeSet);

        // HashMap<Integer,Integer> => LinkedHashMap<Integer,Integer>
        LinkedHashMap<Integer, Integer> linkedHashMap =
                Convert.toIntegerLinkedHashMap(map);

        System.out.println(
                "HashMap => LinkedHashMap<Integer,Integer> : "
                        + linkedHashMap);

        // HashMap<Integer,Integer> => TreeMap<Integer,Integer>
        TreeMap<Integer, Integer> treeMap =
                Convert.toIntegerTreeMap(map);

        System.out.println(
                "HashMap => TreeMap<Integer,Integer> : "
                        + treeMap);


        // --------------------------------------------------
        // Character Key HashMap
        // --------------------------------------------------

        HashMap<Character, Integer> charMap = new HashMap<>();

        charMap.put('d', 40);
        charMap.put('a', 60);
        charMap.put('f', 90);
        charMap.put('b', 20);
        charMap.put('e', -10);
        charMap.put('c', 0);

        System.out.println("\nCharacter Key HashMap : " + charMap);

        // HashMap<Character,Integer> => LinkedHashMap<Character,Integer>
        LinkedHashMap<Character, Integer> charLinkedHashMap =
                Convert.toCharacterLinkedHashMap(charMap);

        System.out.println(
                "HashMap => LinkedHashMap<Character,Integer> : "
                        + charLinkedHashMap);

        // HashMap<Character,Integer> => TreeMap<Character,Integer>
        TreeMap<Character, Integer> charTreeMap =
                Convert.toCharacterTreeMap(charMap);

        System.out.println(
                "HashMap => TreeMap<Character,Integer> : "
                        + charTreeMap);


        // --------------------------------------------------
        // String Key HashMap
        // --------------------------------------------------

        HashMap<String, Integer> stringMap = new HashMap<>();

        stringMap.put("Java", 60);
        stringMap.put("Python", 20);
        stringMap.put("React", 90);
        stringMap.put("MongoDB", -10);
        stringMap.put("Node", 40);

        System.out.println("\nString Key HashMap : " + stringMap);

        // HashMap<String,Integer> => LinkedHashMap<String,Integer>
        LinkedHashMap<String, Integer> stringLinkedHashMap =
                Convert.toStringLinkedHashMap(stringMap);

        System.out.println(
                "HashMap => LinkedHashMap<String,Integer> : "
                        + stringLinkedHashMap);

        // HashMap<String,Integer> => TreeMap<String,Integer>
        TreeMap<String, Integer> stringTreeMap =
                Convert.toStringTreeMap(stringMap);

        System.out.println(
                "HashMap => TreeMap<String,Integer> : "
                        + stringTreeMap);
    }
}