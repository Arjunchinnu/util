package FromArrayList;

import java.util.*;

public class Convert {

    // ArrayList → Array
    public static <T> T[] toArray(ArrayList<T> list, T[] arr) {

        if (list == null || list.isEmpty()) {
            return arr;
        }

        return list.toArray(arr);
    }


    // ArrayList → Stack
    public static <T> Stack<T> toStack(ArrayList<T> list) {

        Stack<T> stack = new Stack<>();

        if (list == null || list.isEmpty()) {
            return stack;
        }

        for (T ele : list) {
            stack.push(ele);
        }

        return stack;
    }


    // ArrayList → LinkedList
    public static <T> LinkedList<T> toLinkedList(ArrayList<T> list) {

        LinkedList<T> linkedList = new LinkedList<>();

        if (list == null || list.isEmpty()) {
            return linkedList;
        }

        for (T ele : list) {
            linkedList.add(ele);
        }

        return linkedList;
    }


    // ArrayList → Vector
    public static <T> Vector<T> toVector(ArrayList<T> list) {

        Vector<T> vector = new Vector<>();

        if (list == null || list.isEmpty()) {
            return vector;
        }

        for (T ele : list) {
            vector.add(ele);
        }

        return vector;
    }


    // ArrayList → ArrayDeque
    public static <T> ArrayDeque<T> toArrayDeque(ArrayList<T> list) {

        ArrayDeque<T> deque = new ArrayDeque<>();

        if (list == null || list.isEmpty()) {
            return deque;
        }

        for (T ele : list) {
            deque.add(ele);
        }

        return deque;
    }


    // ArrayList → PriorityQueue
    public static <T extends Comparable<? super T>>
    PriorityQueue<T> toPriorityQueue(ArrayList<T> list) {

        PriorityQueue<T> queue = new PriorityQueue<>();

        if (list == null || list.isEmpty()) {
            return queue;
        }

        for (T ele : list) {
            queue.add(ele);
        }

        return queue;
    }


    // ArrayList → HashSet
    public static <T> HashSet<T> toHashSet(ArrayList<T> list) {

        HashSet<T> set = new HashSet<>();

        if (list == null || list.isEmpty()) {
            return set;
        }

        for (T ele : list) {
            set.add(ele);
        }

        return set;
    }


    // ArrayList → LinkedHashSet
    public static <T> LinkedHashSet<T> toLinkedHashSet(
            ArrayList<T> list) {

        LinkedHashSet<T> linkedSet = new LinkedHashSet<>();

        if (list == null || list.isEmpty()) {
            return linkedSet;
        }

        for (T ele : list) {
            linkedSet.add(ele);
        }

        return linkedSet;
    }


    // ArrayList → TreeSet
    public static <T extends Comparable<? super T>>
    TreeSet<T> toTreeSet(ArrayList<T> list) {

        TreeSet<T> treeSet = new TreeSet<>();

        if (list == null || list.isEmpty()) {
            return treeSet;
        }

        for (T ele : list) {
            treeSet.add(ele);
        }

        return treeSet;
    }

    
    
//HashMap

      // ArrayList → HashMap<Integer, T>
    // public static <T> HashMap<Integer, T> toIntegerHashMap(ArrayList<T> list) {

    //     HashMap<Integer, T> hashmap = new HashMap<>();

    //     if (list == null || list.isEmpty()) {
    //         return hashmap;
    //     }

    //     for (int i = 0; i < list.size(); i++) {
    //         hashmap.put(i, list.get(i));
    //     }

    //     return hashmap;
    // }


    // // ArrayList → HashMap<Character, T>
    // public static <T> HashMap<Character, T> toCharacterHashMap(ArrayList<T> list) {

    //     HashMap<Character, T> hashmap = new HashMap<>();

    //     if (list == null || list.isEmpty()) {
    //         return hashmap;
    //     }

    //     char key = 'a';

    //     for (int i = 0; i < list.size(); i++) {
    //         hashmap.put(key++, list.get(i));
    //     }

    //     return hashmap;
    // }

    // ArrayList → HashMap
    // index → element
    // public static <T> HashMap<Integer, T> toHashMap(
    //         ArrayList<T> list) {

    //     HashMap<Integer, T> hashMap = new HashMap<>();

    //     if (list == null || list.isEmpty()) {
    //         return hashMap;
    //     }

    //     for (int i = 0; i < list.size(); i++) {
    //         hashMap.put(i, list.get(i));
    //     }

    //     return hashMap;
    // }


    // ArrayList → TreeMap
    // index → element
    // public static <T> TreeMap<Integer, T> toTreeMap(
    //         ArrayList<T> list) {

    //     TreeMap<Integer, T> treeMap = new TreeMap<>();

    //     if (list == null || list.isEmpty()) {
    //         return treeMap;
    //     }

    //     for (int i = 0; i < list.size(); i++) {
    //         treeMap.put(i, list.get(i));
    //     }

    //     return treeMap;
    // }

    //TreeMap


    // ArrayList → HashMap<Integer, T>
    public static <T> HashMap<Integer, T> toIntegerHashMap(ArrayList<T> list) {

        HashMap<Integer, T> hashmap = new HashMap<>();

        if (list == null || list.isEmpty()) {
            return hashmap;
        }

        for (int i = 0; i < list.size(); i++) {
            hashmap.put(i, list.get(i));
        }

        return hashmap;
    }


    // ArrayList → HashMap<Character, T>
    public static <T> HashMap<Character, T> toCharacterHashMap(ArrayList<T> list) {

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


    // ArrayList → TreeMap<Integer, T>
    public static <T> TreeMap<Integer, T> toIntegerTreeMap(ArrayList<T> list) {

        TreeMap<Integer, T> treemap = new TreeMap<>();

        if (list == null || list.isEmpty()) {
            return treemap;
        }

        for (int i = 0; i < list.size(); i++) {
            treemap.put(i, list.get(i));
        }

        return treemap;
    }


    // ArrayList → TreeMap<Character, T>
    public static <T> TreeMap<Character, T> toCharacterTreeMap(ArrayList<T> list) {

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



// ArrayList → LinkedHashMap<Integer, T>

public static <T> LinkedHashMap<Integer, T> toIntegerLinkedHashMap(
        ArrayList<T> list) {

    LinkedHashMap<Integer, T> linkedHashMap = new LinkedHashMap<>();

    if (list == null || list.isEmpty()) {
        return linkedHashMap;
    }

    for (int i = 0; i < list.size(); i++) {
        linkedHashMap.put(i, list.get(i));
    }

    return linkedHashMap;
}


// ArrayList → LinkedHashMap<Character, T>

public static <T> LinkedHashMap<Character, T> toCharacterLinkedHashMap(
        ArrayList<T> list) {

    LinkedHashMap<Character, T> linkedHashMap = new LinkedHashMap<>();

    if (list == null || list.isEmpty()) {
        return linkedHashMap;
    }

    char key = 'a';

    for (int i = 0; i < list.size(); i++) {
        linkedHashMap.put(key++, list.get(i));
    }

    return linkedHashMap;
}

}