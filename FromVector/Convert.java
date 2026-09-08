package FromVector;

import java.util.*;

public class Convert {

    // Vector → Array
    public static <T> T[] toArray(Vector<T> vector, T[] arr) {

        if (vector == null || vector.isEmpty()) {
            return arr;
        }

        return vector.toArray(arr);
    }


    // Vector → ArrayList
    public static <T> ArrayList<T> toArrayList(Vector<T> vector) {

        ArrayList<T> arrayList = new ArrayList<>();

        if (vector == null || vector.isEmpty()) {
            return arrayList;
        }

        for (T ele : vector) {
            arrayList.add(ele);
        }

        return arrayList;
    }


    // Vector → LinkedList
    public static <T> LinkedList<T> toLinkedList(Vector<T> vector) {

        LinkedList<T> linkedList = new LinkedList<>();

        if (vector == null || vector.isEmpty()) {
            return linkedList;
        }

        for (T ele : vector) {
            linkedList.add(ele);
        }

        return linkedList;
    }


    // Vector → Stack
    public static <T> Stack<T> toStack(Vector<T> vector) {

        Stack<T> stack = new Stack<>();

        if (vector == null || vector.isEmpty()) {
            return stack;
        }

        for (T ele : vector) {
            stack.push(ele);
        }

        return stack;
    }


    // Vector → ArrayDeque
    public static <T> ArrayDeque<T> toArrayDeque(Vector<T> vector) {

        ArrayDeque<T> deque = new ArrayDeque<>();

        if (vector == null || vector.isEmpty()) {
            return deque;
        }

        for (T ele : vector) {
            deque.add(ele);
        }

        return deque;
    }


    // Vector → PriorityQueue
    public static <T extends Comparable<? super T>>
    PriorityQueue<T> toPriorityQueue(Vector<T> vector) {

        PriorityQueue<T> queue = new PriorityQueue<>();

        if (vector == null || vector.isEmpty()) {
            return queue;
        }

        for (T ele : vector) {
            queue.add(ele);
        }

        return queue;
    }


    // Vector → HashSet
    public static <T> HashSet<T> toHashSet(Vector<T> vector) {

        HashSet<T> set = new HashSet<>();

        if (vector == null || vector.isEmpty()) {
            return set;
        }

        for (T ele : vector) {
            set.add(ele);
        }

        return set;
    }


    // Vector → LinkedHashSet
    public static <T> LinkedHashSet<T> toLinkedHashSet(
            Vector<T> vector) {

        LinkedHashSet<T> linkedSet = new LinkedHashSet<>();

        if (vector == null || vector.isEmpty()) {
            return linkedSet;
        }

        for (T ele : vector) {
            linkedSet.add(ele);
        }

        return linkedSet;
    }


    // Vector → TreeSet
    public static <T extends Comparable<? super T>>
    TreeSet<T> toTreeSet(Vector<T> vector) {

        TreeSet<T> treeSet = new TreeSet<>();

        if (vector == null || vector.isEmpty()) {
            return treeSet;
        }

        for (T ele : vector) {
            treeSet.add(ele);
        }

        return treeSet;
    }


    // Vector → HashMap<Integer, T>
    public static <T> HashMap<Integer, T> toIntegerHashMap(Vector<T> vector) {

        HashMap<Integer, T> hashmap = new HashMap<>();

        if (vector == null || vector.isEmpty()) {
            return hashmap;
        }

        for (int i = 0; i < vector.size(); i++) {
            hashmap.put(i, vector.get(i));
        }

        return hashmap;
    }


    // Vector → HashMap<Character, T>
    public static <T> HashMap<Character, T> toCharacterHashMap(Vector<T> vector) {

        HashMap<Character, T> hashmap = new HashMap<>();

        if (vector == null || vector.isEmpty()) {
            return hashmap;
        }

        char key = 'a';

        for (int i = 0; i < vector.size(); i++) {
            hashmap.put(key++, vector.get(i));
        }

        return hashmap;
    }


    // Vector → TreeMap<Integer, T>
    public static <T> TreeMap<Integer, T> toIntegerTreeMap(Vector<T> vector) {

        TreeMap<Integer, T> treemap = new TreeMap<>();

        if (vector == null || vector.isEmpty()) {
            return treemap;
        }

        for (int i = 0; i < vector.size(); i++) {
            treemap.put(i, vector.get(i));
        }

        return treemap;
    }


    // Vector → TreeMap<Character, T>
    public static <T> TreeMap<Character, T> toCharacterTreeMap(Vector<T> vector) {

        TreeMap<Character, T> treemap = new TreeMap<>();

        if (vector == null || vector.isEmpty()) {
            return treemap;
        }

        char key = 'a';

        for (int i = 0; i < vector.size(); i++) {
            treemap.put(key++, vector.get(i));
        }

        return treemap;
    }



    
    // Vector → LinkedHashMap<Integer, T>
    
    public static <T> LinkedHashMap<Integer, T> toIntegerLinkedHashMap(
            Vector<T> vector) {
    
        LinkedHashMap<Integer, T> linkedHashMap = new LinkedHashMap<>();
    
        if (vector == null || vector.isEmpty()) {
            return linkedHashMap;
        }
    
        for (int i = 0; i < vector.size(); i++) {
            linkedHashMap.put(i, vector.get(i));
        }
    
        return linkedHashMap;
    }
    
    
    // Vector → LinkedHashMap<Character, T>
    
    public static <T> LinkedHashMap<Character, T> toCharacterLinkedHashMap(
            Vector<T> vector) {
    
        LinkedHashMap<Character, T> linkedHashMap = new LinkedHashMap<>();
    
        if (vector == null || vector.isEmpty()) {
            return linkedHashMap;
        }
    
        char key = 'a';
    
        for (int i = 0; i < vector.size(); i++) {
            linkedHashMap.put(key++, vector.get(i));
        }
    
        return linkedHashMap;
    }



    // Vector → HashMap
    // index → element
    // public static <T> HashMap<Integer, T> toHashMap(
    //         Vector<T> vector) {

    //     HashMap<Integer, T> hashMap = new HashMap<>();

    //     if (vector == null || vector.isEmpty()) {
    //         return hashMap;
    //     }

    //     for (int i = 0; i < vector.size(); i++) {
    //         hashMap.put(i, vector.get(i));
    //     }

    //     return hashMap;
    // }


    // Vector → TreeMap
    // index → element
    // public static <T> TreeMap<Integer, T> toTreeMap(
    //         Vector<T> vector) {

    //     TreeMap<Integer, T> treeMap = new TreeMap<>();

    //     if (vector == null || vector.isEmpty()) {
    //         return treeMap;
    //     }

    //     for (int i = 0; i < vector.size(); i++) {
    //         treeMap.put(i, vector.get(i));
    //     }

    //     return treeMap;
    // }
}