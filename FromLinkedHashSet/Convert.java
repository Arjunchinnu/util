package FromLinkedHashSet;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Convert {

    // LinkedHashSet → Array

    public static <T> T[] toArray(LinkedHashSet<T> set, T[] arr) {

        if (set == null || set.isEmpty()) {
            return arr;
        }

        return set.toArray(arr);
    }


    // LinkedHashSet → ArrayList

    public static <T> ArrayList<T> toArrayList(LinkedHashSet<T> set) {

        ArrayList<T> list = new ArrayList<>();

        if (set == null || set.isEmpty()) {
            return list;
        }

        for (T ele : set) {
            list.add(ele);
        }

        return list;
    }


    // LinkedHashSet → Stack

    public static <T> Stack<T> toStack(LinkedHashSet<T> set) {

        Stack<T> stack = new Stack<>();

        if (set == null || set.isEmpty()) {
            return stack;
        }

        for (T ele : set) {
            stack.push(ele);
        }

        return stack;
    }


    // LinkedHashSet → LinkedList

    public static <T> LinkedList<T> toLinkedList(LinkedHashSet<T> set) {

        LinkedList<T> linkedList = new LinkedList<>();

        if (set == null || set.isEmpty()) {
            return linkedList;
        }

        for (T ele : set) {
            linkedList.add(ele);
        }

        return linkedList;
    }


    // LinkedHashSet → Vector

    public static <T> Vector<T> toVector(LinkedHashSet<T> set) {

        Vector<T> vector = new Vector<>();

        if (set == null || set.isEmpty()) {
            return vector;
        }

        for (T ele : set) {
            vector.add(ele);
        }

        return vector;
    }


    // LinkedHashSet → ArrayDeque

    public static <T> ArrayDeque<T> toArrayDeque(LinkedHashSet<T> set) {

        ArrayDeque<T> deque = new ArrayDeque<>();

        if (set == null || set.isEmpty()) {
            return deque;
        }

        for (T ele : set) {
            deque.add(ele);
        }

        return deque;
    }


    // LinkedHashSet → PriorityQueue

    public static <T extends Comparable<? super T>>
    PriorityQueue<T> toPriorityQueue(LinkedHashSet<T> set) {

        PriorityQueue<T> queue = new PriorityQueue<>();

        if (set == null || set.isEmpty()) {
            return queue;
        }

        for (T ele : set) {
            queue.add(ele);
        }

        return queue;
    }


    // LinkedHashSet → HashSet

    public static <T> HashSet<T> toHashSet(LinkedHashSet<T> set) {

        HashSet<T> hashSet = new HashSet<>();

        if (set == null || set.isEmpty()) {
            return hashSet;
        }

        for (T ele : set) {
            hashSet.add(ele);
        }

        return hashSet;
    }


    // LinkedHashSet → TreeSet

    public static <T extends Comparable<? super T>>
    TreeSet<T> toTreeSet(LinkedHashSet<T> set) {

        TreeSet<T> treeSet = new TreeSet<>();

        if (set == null || set.isEmpty()) {
            return treeSet;
        }

        for (T ele : set) {
            treeSet.add(ele);
        }

        return treeSet;
    }


    // LinkedHashSet → HashMap<Integer, T>
    public static <T> HashMap<Integer, T> toIntegerHashMap(LinkedHashSet<T> set) {

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


    // LinkedHashSet → HashMap<Character, T>
    public static <T> HashMap<Character, T> toCharacterHashMap(LinkedHashSet<T> set) {

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


    // LinkedHashSet → TreeMap<Integer, T>
    public static <T> TreeMap<Integer, T> toIntegerTreeMap(LinkedHashSet<T> set) {

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


    // LinkedHashSet → TreeMap<Character, T>
    public static <T> TreeMap<Character, T> toCharacterTreeMap(LinkedHashSet<T> set) {

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


    // LinkedHashSet → LinkedHashMap

public static <T> LinkedHashMap<Integer, T> toIntegerLinkedHashMap(
        LinkedHashSet<T> set) {

    LinkedHashMap<Integer, T> linkedHashMap = new LinkedHashMap<>();

    if (set == null || set.isEmpty()) {
        return linkedHashMap;
    }

    int key = 0;

    for (T value : set) {
        linkedHashMap.put(key++, value);
    }

    return linkedHashMap;
}


public static <T> LinkedHashMap<Character, T> toCharacterLinkedHashMap(
        LinkedHashSet<T> set) {

    LinkedHashMap<Character, T> linkedHashMap = new LinkedHashMap<>();

    if (set == null || set.isEmpty()) {
        return linkedHashMap;
    }

    char key = 'a';

    for (T value : set) {
        linkedHashMap.put(key++, value);
    }

    return linkedHashMap;
}


    // LinkedHashSet → HashMap
    // index → element

    // public static <T> HashMap<Integer, T> toHashMap(
    //         LinkedHashSet<T> set) {

    //     HashMap<Integer, T> hashMap = new HashMap<>();

    //     if (set == null || set.isEmpty()) {
    //         return hashMap;
    //     }

    //     int i = 0;

    //     for (T ele : set) {
    //         hashMap.put(i, ele);
    //         i++;
    //     }

    //     return hashMap;
    // }


    // // LinkedHashSet → TreeMap
    // // index → element

    // public static <T> TreeMap<Integer, T> toTreeMap(
    //         LinkedHashSet<T> set) {

    //     TreeMap<Integer, T> treeMap = new TreeMap<>();

    //     if (set == null || set.isEmpty()) {
    //         return treeMap;
    //     }

    //     int i = 0;

    //     for (T ele : set) {
    //         treeMap.put(i, ele);
    //         i++;
    //     }

    //     return treeMap;
    // }
}