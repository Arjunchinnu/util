package FromPriorityQueue;

import java.util.*;

public class Convert {

    // PriorityQueue → Array
    public static <T> T[] toArray(PriorityQueue<T> queue, T[] arr) {

        if (queue == null || queue.isEmpty()) {
            return arr;
        }

        return queue.toArray(arr);
    }


    // PriorityQueue → ArrayList
    public static <T> ArrayList<T> toArrayList(PriorityQueue<T> queue) {

        ArrayList<T> arrayList = new ArrayList<>();

        if (queue == null || queue.isEmpty()) {
            return arrayList;
        }

        for (T ele : queue) {
            arrayList.add(ele);
        }

        return arrayList;
    }


    // PriorityQueue → LinkedList
    public static <T> LinkedList<T> toLinkedList(PriorityQueue<T> queue) {

        LinkedList<T> linkedList = new LinkedList<>();

        if (queue == null || queue.isEmpty()) {
            return linkedList;
        }

        for (T ele : queue) {
            linkedList.add(ele);
        }

        return linkedList;
    }


    // PriorityQueue → Vector
    public static <T> Vector<T> toVector(PriorityQueue<T> queue) {

        Vector<T> vector = new Vector<>();

        if (queue == null || queue.isEmpty()) {
            return vector;
        }

        for (T ele : queue) {
            vector.add(ele);
        }

        return vector;
    }


    // PriorityQueue → Stack
    public static <T> Stack<T> toStack(PriorityQueue<T> queue) {

        Stack<T> stack = new Stack<>();

        if (queue == null || queue.isEmpty()) {
            return stack;
        }

        for (T ele : queue) {
            stack.push(ele);
        }

        return stack;
    }


    // PriorityQueue → ArrayDeque
    public static <T> ArrayDeque<T> toArrayDeque(
            PriorityQueue<T> queue) {

        ArrayDeque<T> deque = new ArrayDeque<>();

        if (queue == null || queue.isEmpty()) {
            return deque;
        }

        for (T ele : queue) {
            deque.add(ele);
        }

        return deque;
    }


    // PriorityQueue → HashSet
    public static <T> HashSet<T> toHashSet(PriorityQueue<T> queue) {

        HashSet<T> set = new HashSet<>();

        if (queue == null || queue.isEmpty()) {
            return set;
        }

        for (T ele : queue) {
            set.add(ele);
        }

        return set;
    }


    // PriorityQueue → LinkedHashSet
    public static <T> LinkedHashSet<T> toLinkedHashSet(
            PriorityQueue<T> queue) {

        LinkedHashSet<T> linkedSet = new LinkedHashSet<>();

        if (queue == null || queue.isEmpty()) {
            return linkedSet;
        }

        for (T ele : queue) {
            linkedSet.add(ele);
        }

        return linkedSet;
    }


    // PriorityQueue → TreeSet
    public static <T extends Comparable<? super T>>
    TreeSet<T> toTreeSet(PriorityQueue<T> queue) {

        TreeSet<T> treeSet = new TreeSet<>();

        if (queue == null || queue.isEmpty()) {
            return treeSet;
        }

        for (T ele : queue) {
            treeSet.add(ele);
        }

        return treeSet;
    }


    // PriorityQueue → HashMap<Integer, T>
    public static <T> HashMap<Integer, T> toIntegerHashMap(PriorityQueue<T> queue) {

        HashMap<Integer, T> hashmap = new HashMap<>();

        if (queue == null || queue.isEmpty()) {
            return hashmap;
        }

        int i = 0;

        for (T value : queue) {
            hashmap.put(i++, value);
        }

        return hashmap;
    }


    // PriorityQueue → HashMap<Character, T>
    public static <T> HashMap<Character, T> toCharacterHashMap(PriorityQueue<T> queue) {

        HashMap<Character, T> hashmap = new HashMap<>();

        if (queue == null || queue.isEmpty()) {
            return hashmap;
        }

        char key = 'a';

        for (T value : queue) {
            hashmap.put(key++, value);
        }

        return hashmap;
    }


    // PriorityQueue → TreeMap<Integer, T>
    public static <T> TreeMap<Integer, T> toIntegerTreeMap(PriorityQueue<T> queue) {

        TreeMap<Integer, T> treemap = new TreeMap<>();

        if (queue == null || queue.isEmpty()) {
            return treemap;
        }

        int i = 0;

        for (T value : queue) {
            treemap.put(i++, value);
        }

        return treemap;
    }


    // PriorityQueue → TreeMap<Character, T>
    public static <T> TreeMap<Character, T> toCharacterTreeMap(PriorityQueue<T> queue) {

        TreeMap<Character, T> treemap = new TreeMap<>();

        if (queue == null || queue.isEmpty()) {
            return treemap;
        }

        char key = 'a';

        for (T value : queue) {
            treemap.put(key++, value);
        }

        return treemap;
    }



// PriorityQueue → LinkedHashMap<Integer, T>

public static <T> LinkedHashMap<Integer, T> toIntegerLinkedHashMap(
        PriorityQueue<T> queue) {

    LinkedHashMap<Integer, T> linkedHashMap = new LinkedHashMap<>();

    if (queue == null || queue.isEmpty()) {
        return linkedHashMap;
    }

    int key = 0;

    for (T value : queue) {
        linkedHashMap.put(key++, value);
    }

    return linkedHashMap;
}


// PriorityQueue → LinkedHashMap<Character, T>

public static <T> LinkedHashMap<Character, T> toCharacterLinkedHashMap(
        PriorityQueue<T> queue) {

    LinkedHashMap<Character, T> linkedHashMap = new LinkedHashMap<>();

    if (queue == null || queue.isEmpty()) {
        return linkedHashMap;
    }

    char key = 'a';

    for (T value : queue) {
        linkedHashMap.put(key++, value);
    }

    return linkedHashMap;
}

    // // PriorityQueue → HashMap
    // // index → element
    // public static <T> HashMap<Integer, T> toHashMap(
    //         PriorityQueue<T> queue) {

    //     HashMap<Integer, T> hashMap = new HashMap<>();

    //     if (queue == null || queue.isEmpty()) {
    //         return hashMap;
    //     }

    //     int index = 0;

    //     for (T ele : queue) {
    //         hashMap.put(index, ele);
    //         index++;
    //     }

    //     return hashMap;
    // }


    // // PriorityQueue → TreeMap
    // // index → element
    // public static <T> TreeMap<Integer, T> toTreeMap(
    //         PriorityQueue<T> queue) {

    //     TreeMap<Integer, T> treeMap = new TreeMap<>();

    //     if (queue == null || queue.isEmpty()) {
    //         return treeMap;
    //     }

    //     int index = 0;

    //     for (T ele : queue) {
    //         treeMap.put(index, ele);
    //         index++;
    //     }

    //     return treeMap;
    // }
}