package FromArrayList;

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
    
   public static <T> T[] toArray(ArrayList<T> list, T[] arr) {

    return list.toArray(arr);
    }

    // Stack
    public static <T> Stack <T> toStack(ArrayList<T> list){

        Stack<T> stack = new Stack<>();

         if (list.isEmpty()) {
            return stack;
            }

        for(T ele : list){
            stack.push(ele);
        }

        return stack;
    }

    //LinkedList
    public static <T> LinkedList<T> toLinkedList(ArrayList<T> list) {

    LinkedList<T> linkedList = new LinkedList<>();

    if(list.isEmpty()){
        return linkedList;
    }

    for (T element : list) {
        linkedList.add(element);
    }

    return linkedList;
}


    //Vector

    public static <T> Vector <T> toVector(ArrayList<T> list) {

    Vector<T> vector = new Vector<>();

    if (list.isEmpty()) {
        return vector;
        }

    for (T ele : list) {
        vector.add(ele);
    }

    return vector;
    }


    //ArrayDeque

    public static <T> ArrayDeque <T> toArrayDeque(ArrayList<T> list){

        ArrayDeque <T> Deque = new ArrayDeque<>();

        if (list.isEmpty()) {
        return Deque;
        }

        for(T ele : list){
            Deque.add(ele);
        }

        return Deque;

    }

      //PriorityQueue

    public static <T> PriorityQueue <T> toPriorityQueue(ArrayList <T> list){

        PriorityQueue <T> queue = new PriorityQueue<>();

        if (list.isEmpty()) {
        return queue;
        }

        for(T ele : list){
            queue.add(ele);
        }

        return queue;
    }

    
    //HashSet

    public static <T> HashSet<T> toHashSet(ArrayList <T> list) {

    HashSet<T> set = new HashSet<>();

    if (list.isEmpty()) {
        return set;
        }

    for (T ele : list) {
        set.add(ele);
    }

    return set;
    }


    //LinkedHashSet

    public static <T> LinkedHashSet<T> toLinkedHashSet(ArrayList <T> list) {

    LinkedHashSet<T> Linkedset = new LinkedHashSet<>();

    if (list.isEmpty()) {
        return Linkedset;
        }

    for (T ele : list) {
        Linkedset.add(ele);
    }

    return Linkedset;
}


// TreeSet

public static <T> TreeSet<T> toTreeSet(ArrayList<T> list) {

    TreeSet<T> treeset = new TreeSet<>();

    if (list.isEmpty()) {
        return treeset;
    }

    for (T ele : list) {
        treeset.add(ele);
    }

    return treeset;
}


// HashMap

public static <T> HashMap<Integer, T> toHashMap(ArrayList<T> list) {

    HashMap<Integer, T> hashmap = new HashMap<>();

    if (list.isEmpty()) {
        return hashmap;
    }

    for (int i = 0; i < list.size(); i++) {
        hashmap.put(i, list.get(i));
    }

    return hashmap;
}


// TreeMap

public static <T> TreeMap<Integer, T> toTreeMap(ArrayList<T> list) {

    TreeMap<Integer, T> treemap = new TreeMap<>();

    if (list.isEmpty()) {
        return treemap;
    }

    for (int i = 0; i < list.size(); i++) {
        treemap.put(i, list.get(i));
    }

    return treemap;
}


}
