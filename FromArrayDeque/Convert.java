package FromArrayDeque;

import java.util.*;

public class Convert {

    // ArrayDeque → Array
    public static <T> T[] toArray(ArrayDeque<T> deque, T[] arr) {

        if (deque == null || deque.isEmpty()) {
            return arr;
        }

        return deque.toArray(arr);
    }


    // ArrayDeque → ArrayList
    public static <T> ArrayList<T> toArrayList(ArrayDeque<T> deque) {

        ArrayList<T> arrayList = new ArrayList<>();

        if (deque == null || deque.isEmpty()) {
            return arrayList;
        }

        for (T ele : deque) {
            arrayList.add(ele);
        }

        return arrayList;
    }


    // ArrayDeque → LinkedList
    public static <T> LinkedList<T> toLinkedList(ArrayDeque<T> deque) {

        LinkedList<T> linkedList = new LinkedList<>();

        if (deque == null || deque.isEmpty()) {
            return linkedList;
        }

        for (T ele : deque) {
            linkedList.add(ele);
        }

        return linkedList;
    }


    // ArrayDeque → Vector
    public static <T> Vector<T> toVector(ArrayDeque<T> deque) {

        Vector<T> vector = new Vector<>();

        if (deque == null || deque.isEmpty()) {
            return vector;
        }

        for (T ele : deque) {
            vector.add(ele);
        }

        return vector;
    }


    // ArrayDeque → Stack
    public static <T> Stack<T> toStack(ArrayDeque<T> deque) {

        Stack<T> stack = new Stack<>();

        if (deque == null || deque.isEmpty()) {
            return stack;
        }

        for (T ele : deque) {
            stack.push(ele);
        }

        return stack;
    }


    // ArrayDeque → PriorityQueue
    public static <T extends Comparable<? super T>>
    PriorityQueue<T> toPriorityQueue(ArrayDeque<T> deque) {

        PriorityQueue<T> queue = new PriorityQueue<>();

        if (deque == null || deque.isEmpty()) {
            return queue;
        }

        for (T ele : deque) {
            queue.add(ele);
        }

        return queue;
    }


    // ArrayDeque → HashSet
    public static <T> HashSet<T> toHashSet(ArrayDeque<T> deque) {

        HashSet<T> set = new HashSet<>();

        if (deque == null || deque.isEmpty()) {
            return set;
        }

        for (T ele : deque) {
            set.add(ele);
        }

        return set;
    }


    // ArrayDeque → LinkedHashSet
    public static <T> LinkedHashSet<T> toLinkedHashSet(
            ArrayDeque<T> deque) {

        LinkedHashSet<T> linkedSet = new LinkedHashSet<>();

        if (deque == null || deque.isEmpty()) {
            return linkedSet;
        }

        for (T ele : deque) {
            linkedSet.add(ele);
        }

        return linkedSet;
    }


    // ArrayDeque → TreeSet
    public static <T extends Comparable<? super T>>
    TreeSet<T> toTreeSet(ArrayDeque<T> deque) {

        TreeSet<T> treeSet = new TreeSet<>();

        if (deque == null || deque.isEmpty()) {
            return treeSet;
        }

        for (T ele : deque) {
            treeSet.add(ele);
        }

        return treeSet;
    }


    // ArrayDeque → HashMap<Integer, T>
    public static <T> HashMap<Integer, T> toIntegerHashMap(ArrayDeque<T> deque) {

        HashMap<Integer, T> hashmap = new HashMap<>();

        if (deque == null || deque.isEmpty()) {
            return hashmap;
        }

        int i = 0;

        for (T value : deque) {
            hashmap.put(i++, value);
        }

        return hashmap;
    }


    // ArrayDeque → HashMap<Character, T>
    public static <T> HashMap<Character, T> toCharacterHashMap(ArrayDeque<T> deque) {

        HashMap<Character, T> hashmap = new HashMap<>();

        if (deque == null || deque.isEmpty()) {
            return hashmap;
        }

        char key = 'a';

        for (T value : deque) {
            hashmap.put(key++, value);
        }

        return hashmap;
    }


    // ArrayDeque → TreeMap<Integer, T>
    public static <T> TreeMap<Integer, T> toIntegerTreeMap(ArrayDeque<T> deque) {

        TreeMap<Integer, T> treemap = new TreeMap<>();

        if (deque == null || deque.isEmpty()) {
            return treemap;
        }

        int i = 0;

        for (T value : deque) {
            treemap.put(i++, value);
        }

        return treemap;
    }


    // ArrayDeque → TreeMap<Character, T>
    public static <T> TreeMap<Character, T> toCharacterTreeMap(ArrayDeque<T> deque) {

        TreeMap<Character, T> treemap = new TreeMap<>();

        if (deque == null || deque.isEmpty()) {
            return treemap;
        }

        char key = 'a';

        for (T value : deque) {
            treemap.put(key++, value);
        }

        return treemap;
    }




// ArrayDeque → LinkedHashMap<Integer, T>

public static <T> LinkedHashMap<Integer, T> toIntegerLinkedHashMap(
        ArrayDeque<T> deque) {

    LinkedHashMap<Integer, T> linkedHashMap = new LinkedHashMap<>();

    if (deque == null || deque.isEmpty()) {
        return linkedHashMap;
    }

    int key = 0;

    for (T value : deque) {
        linkedHashMap.put(key++, value);
    }

    return linkedHashMap;
}


// ArrayDeque → LinkedHashMap<Character, T>

public static <T> LinkedHashMap<Character, T> toCharacterLinkedHashMap(
        ArrayDeque<T> deque) {

    LinkedHashMap<Character, T> linkedHashMap = new LinkedHashMap<>();

    if (deque == null || deque.isEmpty()) {
        return linkedHashMap;
    }

    char key = 'a';

    for (T value : deque) {
        linkedHashMap.put(key++, value);
    }

    return linkedHashMap;
}


    // ArrayDeque → HashMap
    // index → element
    // public static <T> HashMap<Integer, T> toHashMap(
    //         ArrayDeque<T> deque) {

    //     HashMap<Integer, T> hashMap = new HashMap<>();

    //     if (deque == null || deque.isEmpty()) {
    //         return hashMap;
    //     }

    //     int index = 0;

    //     for (T ele : deque) {
    //         hashMap.put(index, ele);
    //         index++;
    //     }

    //     return hashMap;
    // }


    // // ArrayDeque → TreeMap
    // // index → element
    // public static <T> TreeMap<Integer, T> toTreeMap(
    //         ArrayDeque<T> deque) {

    //     TreeMap<Integer, T> treeMap = new TreeMap<>();

    //     if (deque == null || deque.isEmpty()) {
    //         return treeMap;
    //     }

    //     int index = 0;

    //     for (T ele : deque) {
    //         treeMap.put(index, ele);
    //         index++;
    //     }

    //     return treeMap;
    // }
}