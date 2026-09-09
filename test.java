import FromArray.*;
// import FromArrayList.*;
// import FromLinkedList.*;
// import FromVector.*;
// import FromArrayDeque.*;
// import FromPriorityQueue.*;
// import FromHashSet.*;
// import FromLinkedHashSet.*;
// import FromTreeSet.*;
// import FromHashMap.*;
import java.util.*;

public class test {

    public static void main(String[] args) {

//Array to other


Integer[] list = {60, 40, 90, 80, 20};

// ArrayList
ArrayList<Integer> result1 = Convert.toArrayList(list);

// Stack
Stack<Integer> result2 = Convert.toStack(list);

// LinkedList
LinkedList<Integer> result3 = Convert.toLinkedList(list);

// Vector
Vector<Integer> result4 = Convert.toVector(list);

// ArrayDeque
ArrayDeque<Integer> result5 = Convert.toArrayDeque(list);

// PriorityQueue
PriorityQueue<Integer> result6 = Convert.toPriorityQueue(list);

// HashSet
HashSet<Integer> result7 = Convert.toHashSet(list);

// LinkedHashSet
LinkedHashSet<Integer> result8 = Convert.toLinkedHashSet(list);

// TreeSet
TreeSet<Integer> result9 = Convert.toTreeSet(list);

// HashMap
HashMap<Integer, Integer> result10 =
        Convert.toIntegerHashMap(list);

HashMap<Character, Integer> result11 =
        Convert.toCharacterHashMap(list);

// TreeMap
TreeMap<Integer, Integer> result12 =
        Convert.toIntegerTreeMap(list);

TreeMap<Character, Integer> result13 =
        Convert.toCharacterTreeMap(list);

// LinkedHashMap
LinkedHashMap<Integer, Integer> result14 =
        Convert.toIntegerLinkedHashMap(list);

LinkedHashMap<Character, Integer> result15 =
        Convert.toCharacterLinkedHashMap(list);


// Print
System.out.println("ArrayList       : " + result1);
System.out.println("Stack           : " + result2);
System.out.println("LinkedList      : " + result3);
System.out.println("Vector          : " + result4);
System.out.println("ArrayDeque      : " + result5);
System.out.println("PriorityQueue   : " + result6);
System.out.println("HashSet         : " + result7);
System.out.println("LinkedHashSet   : " + result8);
System.out.println("TreeSet         : " + result9);
System.out.println("Integer HashMap  : " + result10);
System.out.println("Character HashMap: " + result11);
System.out.println("Integer TreeMap  : " + result12);
System.out.println("Character TreeMap: " + result13);
System.out.println("Integer LinkedHashMap  : " + result14);
System.out.println("Character LinkedHashMap: " + result15);
        
    }
}