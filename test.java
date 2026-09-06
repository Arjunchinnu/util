// import FromArray.Convert;
//  import FromArrayList.Convert;
// import  FromLinkedList.*;
// import FromStack.*;
// import FromVector.*;
// import FromArrayDeque.*;
// import FromPriorityQueue.*;
// import FromHashSet.*;
// import FromLinkedHashSet.*;
// import FromTreeSet.*;
import FromHashMap.*;
import java.util.*;

public class test {

    public static void main(String[] args) {

        // Integer[] arr = {2, 4, 6, 8};
        // Character[] arr2 = {'a', 'b', 'c'};

        // System.out.println(Convert.print());


        // Integer[] arr = {6, 4, 9, 8};
        // Character[] arrchar = {'a','b','c','d'};

        // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(60,60,40,90,80));

        // LinkedList <Integer> list = new LinkedList<>(Arrays.asList(60,60,40,90,80));

    //     Stack<Integer> list = new Stack<>();
    // list.addAll(List.of(60, 60, 40, 90, 80));


    // Vector <Integer> list = new Vector<>(Arrays.asList(60,60,40,90,80));

    // ArrayDeque <Integer> list = new ArrayDeque<>(Arrays.asList(60,60,40,90,80));

    // PriorityQueue <Integer> list = new PriorityQueue<>(Arrays.asList(60,60,40,90,80));

    // HashSet <Integer> list = new HashSet<>(Arrays.asList(60,60,40,90,80));

HashMap<Integer, Integer> list = new HashMap<>();

list.put(1, 60);
list.put(2, 60);
list.put(3, 40);
list.put(4, 90);
list.put(5, 80);

// LinkedHashSet <Integer> list = new LinkedHashSet<>(Arrays.asList(60,60,40,90,80));

// TreeSet <Integer> list = new TreeSet<>(Arrays.asList(60,60,40,90,80));




    // System.out.println(list);

        Integer[] arr = Convert.toArray(list, new Integer[0]);
        ArrayList<Integer> res0 = Convert.toArrayList(list);
        Stack<Integer>  res1 = Convert.toStack(list);
        LinkedList<Integer> res2 = Convert.toLinkedList(list);
        Vector<Integer> res3 = Convert.toVector(list);
        ArrayDeque<Integer> res4 = Convert.toArrayDeque(list);
        PriorityQueue<Integer> res5 = Convert.toPriorityQueue(list);
        HashSet<Integer> res6 = Convert.toHashSet(list);
        LinkedHashSet<Integer> res7 = Convert.toLinkedHashSet(list);
        TreeSet<Integer> res8 = Convert.toTreeSet(list);
        // HashMap<Integer,Integer> res9 = Convert.toHashMap(list);
        TreeMap<Integer,Integer> res10 = Convert.toTreeMap(list);


        System.out.println("arr "+Arrays.toString(arr));
        System.out.println("al"+res0);
        System.out.println("st"+res1);
        System.out.println("ll"+res2);
        System.out.println("vt"+res3);
        System.out.println("Ar"+res4);
        System.out.println("pr"+res5);
        System.out.println("hs"+res6);
        System.out.println("lhs"+res7);
        System.out.println("TS"+res8);
        // System.out.println("HM"+res9);
        System.out.println("TM"+res10);

        String str = "Arjun";

        // System.out.println(str.charAt(1));

        
    }
}