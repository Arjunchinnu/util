package FromHashMap;

import java.util.*;

public class Convert {

    // HashMap → Array

    public static <T> T[] toArray(HashMap<Integer, T> map, T[] arr) {

        if (map == null || map.isEmpty()) {
            return arr;
        }

        return map.values().toArray(arr);
    }


    // HashMap → ArrayList

    public static <T> ArrayList<T> toArrayList(
            HashMap<Integer, T> map) {

        ArrayList<T> list = new ArrayList<>();

        if (map == null || map.isEmpty()) {
            return list;
        }

        for (T ele : map.values()) {
            list.add(ele);
        }

        return list;
    }


    // HashMap → Stack

    public static <T> Stack<T> toStack(
            HashMap<Integer, T> map) {

        Stack<T> stack = new Stack<>();

        if (map == null || map.isEmpty()) {
            return stack;
        }

        for (T ele : map.values()) {
            stack.push(ele);
        }

        return stack;
    }


    // HashMap → LinkedList

    public static <T> LinkedList<T> toLinkedList(
            HashMap<Integer, T> map) {

        LinkedList<T> linkedList = new LinkedList<>();

        if (map == null || map.isEmpty()) {
            return linkedList;
        }

        for (T ele : map.values()) {
            linkedList.add(ele);
        }

        return linkedList;
    }


    // HashMap → Vector

    public static <T> Vector<T> toVector(
            HashMap<Integer, T> map) {

        Vector<T> vector = new Vector<>();

        if (map == null || map.isEmpty()) {
            return vector;
        }

        for (T ele : map.values()) {
            vector.add(ele);
        }

        return vector;
    }


    // HashMap → ArrayDeque

    public static <T> ArrayDeque<T> toArrayDeque(
            HashMap<Integer, T> map) {

        ArrayDeque<T> deque = new ArrayDeque<>();

        if (map == null || map.isEmpty()) {
            return deque;
        }

        for (T ele : map.values()) {
            deque.add(ele);
        }

        return deque;
    }


    // HashMap → PriorityQueue

    public static <T extends Comparable<? super T>>
    PriorityQueue<T> toPriorityQueue(
            HashMap<Integer, T> map) {

        PriorityQueue<T> queue = new PriorityQueue<>();

        if (map == null || map.isEmpty()) {
            return queue;
        }

        for (T ele : map.values()) {
            queue.add(ele);
        }

        return queue;
    }


    // HashMap → HashSet

    public static <T> HashSet<T> toHashSet(
            HashMap<Integer, T> map) {

        HashSet<T> set = new HashSet<>();

        if (map == null || map.isEmpty()) {
            return set;
        }

        for (T ele : map.values()) {
            set.add(ele);
        }

        return set;
    }


    // HashMap → LinkedHashSet

    public static <T> LinkedHashSet<T> toLinkedHashSet(
            HashMap<Integer, T> map) {

        LinkedHashSet<T> linkedSet = new LinkedHashSet<>();

        if (map == null || map.isEmpty()) {
            return linkedSet;
        }

        for (T ele : map.values()) {
            linkedSet.add(ele);
        }

        return linkedSet;
    }


    // HashMap → TreeSet

    public static <T extends Comparable<? super T>>
    TreeSet<T> toTreeSet(
            HashMap<Integer, T> map) {

        TreeSet<T> treeSet = new TreeSet<>();

        if (map == null || map.isEmpty()) {
            return treeSet;
        }

        for (T ele : map.values()) {
            treeSet.add(ele);
        }

        return treeSet;
    }

    
    // hashmap -> linkedHashMap

    // Integer Key
public static <T> LinkedHashMap<Integer, T> toIntegerLinkedHashMap(
        HashMap<Integer, T> map) {

    LinkedHashMap<Integer, T> linkedHashMap = new LinkedHashMap<>();

    if (map == null || map.isEmpty()) {
        return linkedHashMap;
    }

    for (Map.Entry<Integer, T> entry : map.entrySet()) {
        linkedHashMap.put(entry.getKey(), entry.getValue());
    }

    return linkedHashMap;
}


// Character Key
public static <T> LinkedHashMap<Character, T> toCharacterLinkedHashMap(
        HashMap<Character, T> map) {

    LinkedHashMap<Character, T> linkedHashMap = new LinkedHashMap<>();

    if (map == null || map.isEmpty()) {
        return linkedHashMap;
    }

    for (Map.Entry<Character, T> entry : map.entrySet()) {
        linkedHashMap.put(entry.getKey(), entry.getValue());
    }

    return linkedHashMap;
}


// String Key
public static <T> LinkedHashMap<String, T> toStringLinkedHashMap(
        HashMap<String, T> map) {

    LinkedHashMap<String, T> linkedHashMap = new LinkedHashMap<>();

    if (map == null || map.isEmpty()) {
        return linkedHashMap;
    }

    for (Map.Entry<String, T> entry : map.entrySet()) {
        linkedHashMap.put(entry.getKey(), entry.getValue());
    }

    return linkedHashMap;
}


    // hashmap -> treemap

// Integer Key
public static <T> TreeMap<Integer, T> toIntegerTreeMap(
        HashMap<Integer, T> map) {

    TreeMap<Integer, T> treeMap = new TreeMap<>();

    if (map == null || map.isEmpty()) {
        return treeMap;
    }

    for (Map.Entry<Integer, T> entry : map.entrySet()) {
        treeMap.put(entry.getKey(), entry.getValue());
    }

    return treeMap;
}


// Character Key
public static <T> TreeMap<Character, T> toCharacterTreeMap(
        HashMap<Character, T> map) {

    TreeMap<Character, T> treeMap = new TreeMap<>();

    if (map == null || map.isEmpty()) {
        return treeMap;
    }

    for (Map.Entry<Character, T> entry : map.entrySet()) {
        treeMap.put(entry.getKey(), entry.getValue());
    }

    return treeMap;
}


// String Key
public static <T> TreeMap<String, T> toStringTreeMap(
        HashMap<String, T> map) {

    TreeMap<String, T> treeMap = new TreeMap<>();

    if (map == null || map.isEmpty()) {
        return treeMap;
    }

    for (Map.Entry<String, T> entry : map.entrySet()) {
        treeMap.put(entry.getKey(), entry.getValue());
    }

    return treeMap;
}


    // // HashMap → TreeMap

    // public static <T> TreeMap<Integer, T> toTreeMap(
    //         HashMap<Integer, T> map) {

    //     TreeMap<Integer, T> treeMap = new TreeMap<>();

    //     if (map == null || map.isEmpty()) {
    //         return treeMap;
    //     }

    //     for (Map.Entry<Integer, T> entry : map.entrySet()) {
    //         treeMap.put(entry.getKey(), entry.getValue());
    //     }

    //     return treeMap;
    // }
}