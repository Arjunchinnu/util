package FromHashSet;

import java.util.*;

public class Convert {

    // HashSet → Array
    public static <T> T[] toArray(HashSet<T> set, T[] arr) {

        if (set == null || set.isEmpty()) {
            return arr;
        }

        return set.toArray(arr);
    }


    // HashSet → ArrayList
    public static <T> ArrayList<T> toArrayList(HashSet<T> set) {

        ArrayList<T> arrayList = new ArrayList<>();

        if (set == null || set.isEmpty()) {
            return arrayList;
        }

        for (T ele : set) {
            arrayList.add(ele);
        }

        return arrayList;
    }


    // HashSet → LinkedList
    public static <T> LinkedList<T> toLinkedList(HashSet<T> set) {

        LinkedList<T> linkedList = new LinkedList<>();

        if (set == null || set.isEmpty()) {
            return linkedList;
        }

        for (T ele : set) {
            linkedList.add(ele);
        }

        return linkedList;
    }


    // HashSet → Vector
    public static <T> Vector<T> toVector(HashSet<T> set) {

        Vector<T> vector = new Vector<>();

        if (set == null || set.isEmpty()) {
            return vector;
        }

        for (T ele : set) {
            vector.add(ele);
        }

        return vector;
    }


    // HashSet → Stack
    public static <T> Stack<T> toStack(HashSet<T> set) {

        Stack<T> stack = new Stack<>();

        if (set == null || set.isEmpty()) {
            return stack;
        }

        for (T ele : set) {
            stack.push(ele);
        }

        return stack;
    }


    // HashSet → PriorityQueue
    public static <T extends Comparable<? super T>>
    PriorityQueue<T> toPriorityQueue(HashSet<T> set) {

        PriorityQueue<T> queue = new PriorityQueue<>();

        if (set == null || set.isEmpty()) {
            return queue;
        }

        for (T ele : set) {
            queue.add(ele);
        }

        return queue;
    }


    // HashSet → ArrayDeque
    public static <T> ArrayDeque<T> toArrayDeque(HashSet<T> set) {

        ArrayDeque<T> deque = new ArrayDeque<>();

        if (set == null || set.isEmpty()) {
            return deque;
        }

        for (T ele : set) {
            deque.add(ele);
        }

        return deque;
    }


    // HashSet → LinkedHashSet
    public static <T> LinkedHashSet<T> toLinkedHashSet(HashSet<T> set) {

        LinkedHashSet<T> linkedSet = new LinkedHashSet<>();

        if (set == null || set.isEmpty()) {
            return linkedSet;
        }

        for (T ele : set) {
            linkedSet.add(ele);
        }

        return linkedSet;
    }


    // HashSet → TreeSet
    public static <T extends Comparable<? super T>>
    TreeSet<T> toTreeSet(HashSet<T> set) {

        TreeSet<T> treeSet = new TreeSet<>();

        if (set == null || set.isEmpty()) {
            return treeSet;
        }

        for (T ele : set) {
            treeSet.add(ele);
        }

        return treeSet;
    }



    // HashSet → HashMap<Integer, T>
    public static <T> HashMap<Integer, T> toIntegerHashMap(HashSet<T> set) {

        HashMap<Integer, T> hashmap = new HashMap<>();

        if (set == null || set.isEmpty()) {
            return hashmap;
        }

        int i = 0;

        for (T value : set) {
            hashmap.put(i++, value);
        }

        return hashmap;
    }


    // HashSet → HashMap<Character, T>
    public static <T> HashMap<Character, T> toCharacterHashMap(HashSet<T> set) {

        HashMap<Character, T> hashmap = new HashMap<>();

        if (set == null || set.isEmpty()) {
            return hashmap;
        }

        char key = 'a';

        for (T value : set) {
            hashmap.put(key++, value);
        }

        return hashmap;
    }


    // HashSet → TreeMap<Integer, T>
    public static <T> TreeMap<Integer, T> toIntegerTreeMap(HashSet<T> set) {

        TreeMap<Integer, T> treemap = new TreeMap<>();

        if (set == null || set.isEmpty()) {
            return treemap;
        }

        int i = 0;

        for (T value : set) {
            treemap.put(i++, value);
        }

        return treemap;
    }


    // HashSet → TreeMap<Character, T>
    public static <T> TreeMap<Character, T> toCharacterTreeMap(HashSet<T> set) {

        TreeMap<Character, T> treemap = new TreeMap<>();

        if (set == null || set.isEmpty()) {
            return treemap;
        }

        char key = 'a';

        for (T value : set) {
            treemap.put(key++, value);
        }

        return treemap;
    }


    // // HashSet → HashMap
    // // index → element
    // public static <T> HashMap<Integer, T> toHashMap(HashSet<T> set) {

    //     HashMap<Integer, T> hashMap = new HashMap<>();

    //     if (set == null || set.isEmpty()) {
    //         return hashMap;
    //     }

    //     int index = 0;

    //     for (T ele : set) {
    //         hashMap.put(index, ele);
    //         index++;
    //     }

    //     return hashMap;
    // }


    // // HashSet → TreeMap
    // // index → element
    // public static <T> TreeMap<Integer, T> toTreeMap(HashSet<T> set) {

    //     TreeMap<Integer, T> treeMap = new TreeMap<>();

    //     if (set == null || set.isEmpty()) {
    //         return treeMap;
    //     }

    //     int index = 0;

    //     for (T ele : set) {
    //         treeMap.put(index, ele);
    //         index++;
    //     }

    //     return treeMap;
    // }
}