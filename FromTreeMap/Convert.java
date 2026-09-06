package FromTreeMap;

import java.util.*;

public class Convert {

    // TreeMap → Array
    // Converts VALUES to array

    public static <K, V> V[] toArray(
            TreeMap<K, V> map, V[] arr) {

        if (map == null || map.isEmpty()) {
            return arr;
        }

        return map.values().toArray(arr);
    }


    // TreeMap → ArrayList

    public static <K, V> ArrayList<V> toArrayList(
            TreeMap<K, V> map) {

        ArrayList<V> list = new ArrayList<>();

        if (map == null || map.isEmpty()) {
            return list;
        }

        for (V ele : map.values()) {
            list.add(ele);
        }

        return list;
    }


    // TreeMap → Stack

    public static <K, V> Stack<V> toStack(
            TreeMap<K, V> map) {

        Stack<V> stack = new Stack<>();

        if (map == null || map.isEmpty()) {
            return stack;
        }

        for (V ele : map.values()) {
            stack.push(ele);
        }

        return stack;
    }


    // TreeMap → LinkedList

    public static <K, V> LinkedList<V> toLinkedList(
            TreeMap<K, V> map) {

        LinkedList<V> linkedList = new LinkedList<>();

        if (map == null || map.isEmpty()) {
            return linkedList;
        }

        for (V ele : map.values()) {
            linkedList.add(ele);
        }

        return linkedList;
    }


    // TreeMap → Vector

    public static <K, V> Vector<V> toVector(
            TreeMap<K, V> map) {

        Vector<V> vector = new Vector<>();

        if (map == null || map.isEmpty()) {
            return vector;
        }

        for (V ele : map.values()) {
            vector.add(ele);
        }

        return vector;
    }


    // TreeMap → ArrayDeque

    public static <K, V> ArrayDeque<V> toArrayDeque(
            TreeMap<K, V> map) {

        ArrayDeque<V> deque = new ArrayDeque<>();

        if (map == null || map.isEmpty()) {
            return deque;
        }

        for (V ele : map.values()) {
            deque.add(ele);
        }

        return deque;
    }


    // TreeMap → PriorityQueue

    public static <K, V extends Comparable<? super V>>
    PriorityQueue<V> toPriorityQueue(
            TreeMap<K, V> map) {

        PriorityQueue<V> queue = new PriorityQueue<>();

        if (map == null || map.isEmpty()) {
            return queue;
        }

        for (V ele : map.values()) {
            queue.add(ele);
        }

        return queue;
    }


    // TreeMap → HashSet

    public static <K, V> HashSet<V> toHashSet(
            TreeMap<K, V> map) {

        HashSet<V> set = new HashSet<>();

        if (map == null || map.isEmpty()) {
            return set;
        }

        for (V ele : map.values()) {
            set.add(ele);
        }

        return set;
    }


    // TreeMap → LinkedHashSet

    public static <K, V> LinkedHashSet<V> toLinkedHashSet(
            TreeMap<K, V> map) {

        LinkedHashSet<V> linkedSet = new LinkedHashSet<>();

        if (map == null || map.isEmpty()) {
            return linkedSet;
        }

        for (V ele : map.values()) {
            linkedSet.add(ele);
        }

        return linkedSet;
    }


    // TreeMap → TreeSet

    public static <K, V extends Comparable<? super V>>
    TreeSet<V> toTreeSet(
            TreeMap<K, V> map) {

        TreeSet<V> treeSet = new TreeSet<>();

        if (map == null || map.isEmpty()) {
            return treeSet;
        }

        for (V ele : map.values()) {
            treeSet.add(ele);
        }

        return treeSet;
    }


    // TreeMap → HashMap

    public static <K, V> HashMap<K, V> toHashMap(
            TreeMap<K, V> map) {

        HashMap<K, V> hashMap = new HashMap<>();

        if (map == null || map.isEmpty()) {
            return hashMap;
        }

        for (Map.Entry<K, V> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }

        return hashMap;
    }


    // TreeMap → LinkedHashMap

    public static <K, V> LinkedHashMap<K, V> toLinkedHashMap(
            TreeMap<K, V> map) {

        LinkedHashMap<K, V> linkedMap =
                new LinkedHashMap<>();

        if (map == null || map.isEmpty()) {
            return linkedMap;
        }

        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedMap.put(entry.getKey(), entry.getValue());
        }

        return linkedMap;
    }
}