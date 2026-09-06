package FromLinkedList;

import java.util.*;

public class Convert {

    // LinkedList → Array
    public static <T> T[] toArray(LinkedList<T> list, T[] arr) {
        return list.toArray(arr);
    }


    // LinkedList → ArrayList
    public static <T> ArrayList<T> toArrayList(LinkedList<T> list) {

        ArrayList<T> arrayList = new ArrayList<>();

        for (T ele : list) {
            arrayList.add(ele);
        }

        return arrayList;
    }


    // LinkedList → Stack
    public static <T> Stack<T> toStack(LinkedList<T> list) {

        Stack<T> stack = new Stack<>();

        for (T ele : list) {
            stack.push(ele);
        }

        return stack;
    }


    // LinkedList → Vector
    public static <T> Vector<T> toVector(LinkedList<T> list) {

        Vector<T> vector = new Vector<>();

        for (T ele : list) {
            vector.add(ele);
        }

        return vector;
    }


    // LinkedList → ArrayDeque
    public static <T> ArrayDeque<T> toArrayDeque(LinkedList<T> list) {

        ArrayDeque<T> deque = new ArrayDeque<>();

        for (T ele : list) {
            deque.add(ele);
        }

        return deque;
    }


    // LinkedList → PriorityQueue
    public static <T extends Comparable<? super T>>
    PriorityQueue<T> toPriorityQueue(LinkedList<T> list) {

        PriorityQueue<T> queue = new PriorityQueue<>();

        for (T ele : list) {
            queue.add(ele);
        }

        return queue;
    }


    // LinkedList → HashSet
    public static <T> HashSet<T> toHashSet(LinkedList<T> list) {

        HashSet<T> set = new HashSet<>();

        for (T ele : list) {
            set.add(ele);
        }

        return set;
    }


    // LinkedList → LinkedHashSet
    public static <T> LinkedHashSet<T> toLinkedHashSet(
            LinkedList<T> list) {

        LinkedHashSet<T> linkedSet = new LinkedHashSet<>();

        for (T ele : list) {
            linkedSet.add(ele);
        }

        return linkedSet;
    }


    // LinkedList → TreeSet
    public static <T extends Comparable<? super T>>
    TreeSet<T> toTreeSet(LinkedList<T> list) {

        TreeSet<T> treeSet = new TreeSet<>();

        for (T ele : list) {
            treeSet.add(ele);
        }

        return treeSet;
    }


    // LinkedList → HashMap
    // index → element
    public static <T> HashMap<Integer, T> toHashMap(
            LinkedList<T> list) {

        HashMap<Integer, T> hashMap = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            hashMap.put(i, list.get(i));
        }

        return hashMap;
    }


    // LinkedList → TreeMap
    // index → element
    public static <T> TreeMap<Integer, T> toTreeMap(LinkedList<T> list) {

        TreeMap<Integer, T> treeMap = new TreeMap<>();

        for (int i = 0; i < list.size(); i++) {
            treeMap.put(i, list.get(i));
        }

        return treeMap;
    }
}