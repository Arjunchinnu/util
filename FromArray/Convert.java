package FromArray;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
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

  
    public  static String print(){
        return "hello";
    }

    // ArrayList

    public static <T> ArrayList<T> toArrayList(T[] arr) {
        ArrayList<T> list = new ArrayList<>();

         if (arr == null || arr.length == 0) {
        return list;
        }

        for (T ele : arr) {
            list.add(ele);
        }
        return list;
    }

    // Stack
    public static <T> Stack <T> toStack(T[] arr){

        Stack<T> stack = new Stack<>();

         if (arr == null || arr.length == 0) {
        return stack;
        }

        for(T ele : arr){
            stack.push(ele);
        }

        return stack;
    }


    //LinkedList

   public static <T> LinkedList<T> toLinkedList(T[] arr) {

    LinkedList<T> list = new LinkedList<>();

    if (arr == null || arr.length == 0) {
        return list;
        }

    for (T ele : arr) {
        list.add(ele);
    }

    return list;
    }


    //Vector

    public static <T> Vector <T> toVector(T[] arr) {

    Vector<T> vector = new Vector<>();

    if (arr == null || arr.length == 0) {
        return vector;
        }

    for (T ele : arr) {
        vector.add(ele);
    }

    return vector;
    }

    //ArrayDeque

    public static <T> ArrayDeque <T> toArrayDeque(T[] arr){

        ArrayDeque <T> Deque = new ArrayDeque<>();

        if (arr == null || arr.length == 0) {
        return Deque;
        }

        for(T ele : arr){
            Deque.add(ele);
        }

        return Deque;

    }

    //PriorityQueue

    public static <T> PriorityQueue <T> toPriorityQueue(T[] arr){

        PriorityQueue <T> queue = new PriorityQueue<>();

        if (arr == null || arr.length == 0) {
        return queue;
        }

        for(T ele : arr){
            queue.add(ele);
        }

        return queue;
    }

    //HashSet

    public static <T> HashSet<T> toHashSet(T[] arr) {

    HashSet<T> set = new HashSet<>();

    if (arr == null || arr.length == 0) {
        return set;
        }

    for (T ele : arr) {
        set.add(ele);
    }

    return set;
    }


    //LinkedHashSet

    public static <T> LinkedHashSet<T> toLinkedHashSet(T[] arr) {

    LinkedHashSet<T> Linkedset = new LinkedHashSet<>();

    if (arr == null || arr.length == 0) {
        return Linkedset;
        }

    for (T ele : arr) {
        Linkedset.add(ele);
    }

    return Linkedset;
}


    //TreeSet

    public static <T> TreeSet<T> toTreeSet(T[] arr) {

        TreeSet<T> treeset = new TreeSet<>();

        if (arr == null || arr.length == 0) {
        return treeset;
        }

        for (T ele : arr) {
            treeset.add(ele);
        }

        return treeset;
    }


//HashMap

    public static <T> HashMap<Integer,T> toHashMap(T[] arr) {

        HashMap<Integer,T > hashmap = new HashMap<>();

        if (arr == null || arr.length == 0) {
        return hashmap;
        }

        for (int i = 0; i < arr.length; i++) {
            hashmap.put(i, arr[i]);
        }

        return hashmap;
    }


    //TreeMap

    public static <T> TreeMap<Integer, T> toTreeMap(T[] arr) {

            TreeMap<Integer, T> treemap = new TreeMap<>();

            if (arr == null || arr.length == 0) {
            return treemap;
         }

            for (int i = 0; i < arr.length; i++) {
                treemap.put(i, arr[i]);
            }

            return treemap;
        }

}