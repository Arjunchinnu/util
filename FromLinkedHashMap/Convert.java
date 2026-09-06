package FromLinkedHashMap;

import java.util.*;

public class Convert {

    // LinkedHashMap → Array

    public static <T> T[] toArray(
            LinkedHashMap<Integer, T> map,
            T[] arr) {

        if (map == null || map.isEmpty()) {
            return arr;
        }

        return map.values().toArray(arr);
    }


    // LinkedHashMap → ArrayList

    public static <T> ArrayList<T> toArrayList(
            LinkedHashMap<Integer, T> map) {

        ArrayList<T> list = new ArrayList<>();

        if (map == null || map.isEmpty()) {
            return list;
        }

        for (T ele : map.values()) {
            list.add(ele);
        }

        return list;
    }


    // LinkedHashMap → Stack

    public static <T> Stack<T> toStack(
            LinkedHashMap<Integer, T> map) {

        Stack<T> stack = new Stack<>();

        if (map == null || map.isEmpty()) {
            return stack;
        }

        for (T ele : map.values()) {
            stack.push(ele);
        }

        return stack;
    }


    // LinkedHashMap → LinkedList

    public static <T> LinkedList<T> toLinkedList(
            LinkedHashMap<Integer, T> map) {

        LinkedList<T> linkedList = new LinkedList<>();

        if (map == null || map.isEmpty()) {
            return linkedList;
        }

        for (T ele : map.values()) {
            linkedList.add(ele);
        }

        return linkedList;
    }


    // LinkedHashMap → Vector

    public static <T> Vector<T> toVector(
            LinkedHashMap<Integer, T> map) {

        Vector<T> vector = new Vector<>();

        if (map == null || map.isEmpty()) {
            return vector;
        }

        for (T ele : map.values()) {
            vector.add(ele);
        }

        return vector;
    }


    // LinkedHashMap → ArrayDeque

    public static <T> ArrayDeque<T> toArrayDeque(
            LinkedHashMap<Integer, T> map) {

        ArrayDeque<T> deque = new ArrayDeque<>();

        if (map == null || map.isEmpty()) {
            return deque;
        }

        for (T ele : map.values()) {
            deque.add(ele);
        }

        return deque;
    }


    // LinkedHashMap → PriorityQueue

    public static <T extends Comparable<? super T>>
    PriorityQueue<T> toPriorityQueue(
            LinkedHashMap<Integer, T> map) {

        PriorityQueue<T> queue = new PriorityQueue<>();

        if (map == null || map.isEmpty()) {
            return queue;
        }

        for (T ele : map.values()) {
            queue.add(ele);
        }

        return queue;
    }


    // LinkedHashMap → HashSet

    public static <T> HashSet<T> toHashSet(
            LinkedHashMap<Integer, T> map) {

        HashSet<T> set = new HashSet<>();

        if (map == null || map.isEmpty()) {
            return set;
        }

        for (T ele : map.values()) {
            set.add(ele);
        }

        return set;
    }


    // LinkedHashMap → LinkedHashSet

    public static <T> LinkedHashSet<T> toLinkedHashSet(
            LinkedHashMap<Integer, T> map) {

        LinkedHashSet<T> linkedSet = new LinkedHashSet<>();

        if (map == null || map.isEmpty()) {
            return linkedSet;
        }

        for (T ele : map.values()) {
            linkedSet.add(ele);
        }

        return linkedSet;
    }


    // LinkedHashMap → TreeSet

    public static <T extends Comparable<? super T>>
    TreeSet<T> toTreeSet(
            LinkedHashMap<Integer, T> map) {

        TreeSet<T> treeSet = new TreeSet<>();

        if (map == null || map.isEmpty()) {
            return treeSet;
        }

        for (T ele : map.values()) {
            treeSet.add(ele);
        }

        return treeSet;
    }


    // LinkedHashMap → HashMap

    public static <T> HashMap<Integer, T> toHashMap(
            LinkedHashMap<Integer, T> map) {

        HashMap<Integer, T> hashMap = new HashMap<>();

        if (map == null || map.isEmpty()) {
            return hashMap;
        }

        for (Map.Entry<Integer, T> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }

        return hashMap;
    }


    // LinkedHashMap → TreeMap

    public static <T> TreeMap<Integer, T> toTreeMap(
            LinkedHashMap<Integer, T> map) {

        TreeMap<Integer, T> treeMap = new TreeMap<>();

        if (map == null || map.isEmpty()) {
            return treeMap;
        }

        for (Map.Entry<Integer, T> entry : map.entrySet()) {
            treeMap.put(entry.getKey(), entry.getValue());
        }

        return treeMap;
    }
}