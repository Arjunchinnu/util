package FromLinkedList;

import java.util.*;

public class Convert {

    // LinkedList → Array
    public static <T> T[] toArray(LinkedList<T> list, T[] arr) {

        if (list == null || list.isEmpty()) {
            return arr;
        }

        return list.toArray(arr);
    }


    // LinkedList → ArrayList
    public static <T> ArrayList<T> toArrayList(LinkedList<T> list) {

        ArrayList<T> arrayList = new ArrayList<>();

        if (list == null || list.isEmpty()) {
            return arrayList;
        }

        for (T ele : list) {
            arrayList.add(ele);
        }

        return arrayList;
    }


    // LinkedList → Stack
    public static <T> Stack<T> toStack(LinkedList<T> list) {

        Stack<T> stack = new Stack<>();

        if (list == null || list.isEmpty()) {
            return stack;
        }

        for (T ele : list) {
            stack.push(ele);
        }

        return stack;
    }


    // LinkedList → Vector
    public static <T> Vector<T> toVector(LinkedList<T> list) {

        Vector<T> vector = new Vector<>();

        if (list == null || list.isEmpty()) {
            return vector;
        }

        for (T ele : list) {
            vector.add(ele);
        }

        return vector;
    }


    // LinkedList → ArrayDeque
    public static <T> ArrayDeque<T> toArrayDeque(LinkedList<T> list) {

        ArrayDeque<T> deque = new ArrayDeque<>();

        if (list == null || list.isEmpty()) {
            return deque;
        }

        for (T ele : list) {
            deque.add(ele);
        }

        return deque;
    }


    // LinkedList → PriorityQueue
    public static <T extends Comparable<? super T>>
    PriorityQueue<T> toPriorityQueue(LinkedList<T> list) {

        PriorityQueue<T> queue = new PriorityQueue<>();

        if (list == null || list.isEmpty()) {
            return queue;
        }

        for (T ele : list) {
            queue.add(ele);
        }

        return queue;
    }


    // LinkedList → HashSet
    public static <T> HashSet<T> toHashSet(LinkedList<T> list) {

        HashSet<T> set = new HashSet<>();

        if (list == null || list.isEmpty()) {
            return set;
        }

        for (T ele : list) {
            set.add(ele);
        }

        return set;
    }


    // LinkedList → LinkedHashSet
    public static <T> LinkedHashSet<T> toLinkedHashSet(
            LinkedList<T> list) {

        LinkedHashSet<T> linkedSet = new LinkedHashSet<>();

        if (list == null || list.isEmpty()) {
            return linkedSet;
        }

        for (T ele : list) {
            linkedSet.add(ele);
        }

        return linkedSet;
    }


    // LinkedList → TreeSet
    public static <T extends Comparable<? super T>>
    TreeSet<T> toTreeSet(LinkedList<T> list) {

        TreeSet<T> treeSet = new TreeSet<>();

        if (list == null || list.isEmpty()) {
            return treeSet;
        }

        for (T ele : list) {
            treeSet.add(ele);
        }

        return treeSet;
    }


      // ArrayList → HashMap<Integer, T>

    // LinkedList → HashMap<Integer, T>
    
    public static <T> HashMap<Integer, T> toIntegerHashMap(LinkedList<T> list) {

        HashMap<Integer, T> hashmap = new HashMap<>();

        if (list == null || list.isEmpty()) {
            return hashmap;
        }

        for (int i = 0; i < list.size(); i++) {
            hashmap.put(i, list.get(i));
        }

        return hashmap;
    }


    // LinkedList → HashMap<Character, T>
    public static <T> HashMap<Character, T> toCharacterHashMap(LinkedList<T> list) {

        HashMap<Character, T> hashmap = new HashMap<>();

        if (list == null || list.isEmpty()) {
            return hashmap;
        }

        char key = 'a';

        for (int i = 0; i < list.size(); i++) {
            hashmap.put(key++, list.get(i));
        }

        return hashmap;
    }


    // LinkedList → TreeMap<Integer, T>
    public static <T> TreeMap<Integer, T> toIntegerTreeMap(LinkedList<T> list) {

        TreeMap<Integer, T> treemap = new TreeMap<>();

        if (list == null || list.isEmpty()) {
            return treemap;
        }

        for (int i = 0; i < list.size(); i++) {
            treemap.put(i, list.get(i));
        }

        return treemap;
    }


    // LinkedList → TreeMap<Character, T>
    public static <T> TreeMap<Character, T> toCharacterTreeMap(LinkedList<T> list) {

        TreeMap<Character, T> treemap = new TreeMap<>();

        if (list == null || list.isEmpty()) {
            return treemap;
        }

        char key = 'a';

        for (int i = 0; i < list.size(); i++) {
            treemap.put(key++, list.get(i));
        }

        return treemap;
    }


    // LinkedList → HashMap
    // index → element
    // public static <T> HashMap<Integer, T> toHashMap(
    //         LinkedList<T> list) {

    //     HashMap<Integer, T> hashMap = new HashMap<>();

    //     if (list == null || list.isEmpty()) {
    //         return hashMap;
    //     }

    //     for (int i = 0; i < list.size(); i++) {
    //         hashMap.put(i, list.get(i));
    //     }

    //     return hashMap;
    // }


    // LinkedList → TreeMap
    // // index → element
    // public static <T> TreeMap<Integer, T> toTreeMap(
    //         LinkedList<T> list) {

    //     TreeMap<Integer, T> treeMap = new TreeMap<>();

    //     if (list == null || list.isEmpty()) {
    //         return treeMap;
    //     }

    //     for (int i = 0; i < list.size(); i++) {
    //         treeMap.put(i, list.get(i));
    //     }

    //     return treeMap;
    // }
}