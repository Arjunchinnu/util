package FromStack;

import java.util.*;

public class Convert {

    // Stack → Array
    public static <T> T[] toArray(Stack<T> stack, T[] arr) {

        if (stack == null || stack.isEmpty()) {
            return arr;
        }

        return stack.toArray(arr);
    }


    // Stack → ArrayList
    public static <T> ArrayList<T> toArrayList(Stack<T> stack) {

        ArrayList<T> arrayList = new ArrayList<>();

        if (stack == null || stack.isEmpty()) {
            return arrayList;
        }

        for (T ele : stack) {
            arrayList.add(ele);
        }

        return arrayList;
    }


    // Stack → LinkedList
    public static <T> LinkedList<T> toLinkedList(Stack<T> stack) {

        LinkedList<T> linkedList = new LinkedList<>();

        if (stack == null || stack.isEmpty()) {
            return linkedList;
        }

        for (T ele : stack) {
            linkedList.add(ele);
        }

        return linkedList;
    }


    // Stack → Vector
    public static <T> Vector<T> toVector(Stack<T> stack) {

        Vector<T> vector = new Vector<>();

        if (stack == null || stack.isEmpty()) {
            return vector;
        }

        for (T ele : stack) {
            vector.add(ele);
        }

        return vector;
    }


    // Stack → ArrayDeque
    public static <T> ArrayDeque<T> toArrayDeque(Stack<T> stack) {

        ArrayDeque<T> deque = new ArrayDeque<>();

        if (stack == null || stack.isEmpty()) {
            return deque;
        }

        for (T ele : stack) {
            deque.add(ele);
        }

        return deque;
    }


    // Stack → PriorityQueue
    public static <T extends Comparable<? super T>>
    PriorityQueue<T> toPriorityQueue(Stack<T> stack) {

        PriorityQueue<T> queue = new PriorityQueue<>();

        if (stack == null || stack.isEmpty()) {
            return queue;
        }

        for (T ele : stack) {
            queue.add(ele);
        }

        return queue;
    }


    // Stack → HashSet
    public static <T> HashSet<T> toHashSet(Stack<T> stack) {

        HashSet<T> set = new HashSet<>();

        if (stack == null || stack.isEmpty()) {
            return set;
        }

        for (T ele : stack) {
            set.add(ele);
        }

        return set;
    }


    // Stack → LinkedHashSet
    public static <T> LinkedHashSet<T> toLinkedHashSet(
            Stack<T> stack) {

        LinkedHashSet<T> linkedSet = new LinkedHashSet<>();

        if (stack == null || stack.isEmpty()) {
            return linkedSet;
        }

        for (T ele : stack) {
            linkedSet.add(ele);
        }

        return linkedSet;
    }


    // Stack → TreeSet
    public static <T extends Comparable<? super T>>
    TreeSet<T> toTreeSet(Stack<T> stack) {

        TreeSet<T> treeSet = new TreeSet<>();

        if (stack == null || stack.isEmpty()) {
            return treeSet;
        }

        for (T ele : stack) {
            treeSet.add(ele);
        }

        return treeSet;
    }


    // Stack → HashMap
    // index → element
    public static <T> HashMap<Integer, T> toHashMap(
            Stack<T> stack) {

        HashMap<Integer, T> hashMap = new HashMap<>();

        if (stack == null || stack.isEmpty()) {
            return hashMap;
        }

        for (int i = 0; i < stack.size(); i++) {
            hashMap.put(i, stack.get(i));
        }

        return hashMap;
    }


    // Stack → TreeMap
    // index → element
    public static <T> TreeMap<Integer, T> toTreeMap(
            Stack<T> stack) {

        TreeMap<Integer, T> treeMap = new TreeMap<>();

        if (stack == null || stack.isEmpty()) {
            return treeMap;
        }

        for (int i = 0; i < stack.size(); i++) {
            treeMap.put(i, stack.get(i));
        }

        return treeMap;
    }


    // Stack → LinkedHashMap<Integer, T>
    
    public static <T> LinkedHashMap<Integer, T> toIntegerLinkedHashMap(
            Stack<T> stack) {
    
        LinkedHashMap<Integer, T> linkedHashMap = new LinkedHashMap<>();
    
        if (stack == null || stack.isEmpty()) {
            return linkedHashMap;
        }
    
        for (int i = 0; i < stack.size(); i++) {
            linkedHashMap.put(i, stack.get(i));
        }
    
        return linkedHashMap;
    }
    
    
    // Stack → LinkedHashMap<Character, T>
    
    public static <T> LinkedHashMap<Character, T> toCharacterLinkedHashMap(
            Stack<T> stack) {
    
        LinkedHashMap<Character, T> linkedHashMap = new LinkedHashMap<>();
    
        if (stack == null || stack.isEmpty()) {
            return linkedHashMap;
        }
    
        char key = 'a';
    
        for (int i = 0; i < stack.size(); i++) {
            linkedHashMap.put(key++, stack.get(i));
        }
    
        return linkedHashMap;
    }
}