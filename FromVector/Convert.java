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


    // Vector → HashMap
    // index → element
    public static <T> HashMap<Integer, T> toHashMap(
            Vector<T> vector) {

        HashMap<Integer, T> hashMap = new HashMap<>();

        if (vector == null || vector.isEmpty()) {
            return hashMap;
        }

        for (int i = 0; i < vector.size(); i++) {
            hashMap.put(i, vector.get(i));
        }

        return hashMap;
    }


    // Vector → TreeMap
    // index → element
    public static <T> TreeMap<Integer, T> toTreeMap(
            Vector<T> vector) {

        TreeMap<Integer, T> treeMap = new TreeMap<>();

        if (vector == null || vector.isEmpty()) {
            return treeMap;
        }

        for (int i = 0; i < vector.size(); i++) {
            treeMap.put(i, vector.get(i));
        }

        return treeMap;
    }
}