package FromTreeSet;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Convert {

    // TreeSet → Array

    public static <T> T[] toArray(TreeSet<T> set, T[] arr) {

        if (set == null || set.isEmpty()) {
            return arr;
        }

        return set.toArray(arr);
    }


    // TreeSet → ArrayList

    public static <T> ArrayList<T> toArrayList(TreeSet<T> set) {

        ArrayList<T> list = new ArrayList<>();

        if (set == null || set.isEmpty()) {
            return list;
        }

        for (T ele : set) {
            list.add(ele);
        }

        return list;
    }


    // TreeSet → Stack

    public static <T> Stack<T> toStack(TreeSet<T> set) {

        Stack<T> stack = new Stack<>();

        if (set == null || set.isEmpty()) {
            return stack;
        }

        for (T ele : set) {
            stack.push(ele);
        }

        return stack;
    }


    // TreeSet → LinkedList

    public static <T> LinkedList<T> toLinkedList(TreeSet<T> set) {

        LinkedList<T> linkedList = new LinkedList<>();

        if (set == null || set.isEmpty()) {
            return linkedList;
        }

        for (T ele : set) {
            linkedList.add(ele);
        }

        return linkedList;
    }


    // TreeSet → Vector

    public static <T> Vector<T> toVector(TreeSet<T> set) {

        Vector<T> vector = new Vector<>();

        if (set == null || set.isEmpty()) {
            return vector;
        }

        for (T ele : set) {
            vector.add(ele);
        }

        return vector;
    }


    // TreeSet → ArrayDeque

    public static <T> ArrayDeque<T> toArrayDeque(TreeSet<T> set) {

        ArrayDeque<T> deque = new ArrayDeque<>();

        if (set == null || set.isEmpty()) {
            return deque;
        }

        for (T ele : set) {
            deque.add(ele);
        }

        return deque;
    }


    // TreeSet → PriorityQueue

    public static <T extends Comparable<? super T>>
    PriorityQueue<T> toPriorityQueue(TreeSet<T> set) {

        PriorityQueue<T> queue = new PriorityQueue<>();

        if (set == null || set.isEmpty()) {
            return queue;
        }

        for (T ele : set) {
            queue.add(ele);
        }

        return queue;
    }


    // TreeSet → HashSet

    public static <T> HashSet<T> toHashSet(TreeSet<T> set) {

        HashSet<T> hashSet = new HashSet<>();

        if (set == null || set.isEmpty()) {
            return hashSet;
        }

        for (T ele : set) {
            hashSet.add(ele);
        }

        return hashSet;
    }


    // TreeSet → LinkedHashSet

    public static <T> LinkedHashSet<T> toLinkedHashSet(
            TreeSet<T> set) {

        LinkedHashSet<T> linkedSet = new LinkedHashSet<>();

        if (set == null || set.isEmpty()) {
            return linkedSet;
        }

        for (T ele : set) {
            linkedSet.add(ele);
        }

        return linkedSet;
    }


    // TreeSet → HashMap
    // index → element

    public static <T> HashMap<Integer, T> toHashMap(
            TreeSet<T> set) {

        HashMap<Integer, T> hashMap = new HashMap<>();

        if (set == null || set.isEmpty()) {
            return hashMap;
        }

        int i = 0;

        for (T ele : set) {
            hashMap.put(i, ele);
            i++;
        }

        return hashMap;
    }


    // TreeSet → TreeMap
    // index → element

    public static <T> TreeMap<Integer, T> toTreeMap(
            TreeSet<T> set) {

        TreeMap<Integer, T> treeMap = new TreeMap<>();

        if (set == null || set.isEmpty()) {
            return treeMap;
        }

        int i = 0;

        for (T ele : set) {
            treeMap.put(i, ele);
            i++;
        }

        return treeMap;
    }
}