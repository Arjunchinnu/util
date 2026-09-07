// import FromArray.*;
// import FromArrayList.*;
// import FromLinkedList.*;
// import FromVector.*;
// import FromArrayDeque.*;
// import FromPriorityQueue.*;
// import FromHashSet.*;
// import FromLinkedHashSet.*;
import FromTreeSet.*;
import java.util.*;

public class test {

    public static void main(String[] args) {

        // Character[] list = {2, 4, 6, 8};
        // Character[] list = {'a', 'b', 'c'};

        // System.out.println(Convert.print());


        // Integer[] list = {6,6, 4, 9, 8};

        // Character[] list = {'a','b','c','d'};

        // ArrayList<Character> list = new ArrayList<>(Arrays.asList('a','b','c','d'));

        // LinkedList <Character> list = new LinkedList<>(Arrays.asList('a','b','c','d'));

    //     Stack<Character> list = new Stack<>();
    // list.addAll(List.of(60, 60, 40, 90, 80));


    // Vector <Character> list = new Vector<>(Arrays.asList('a','b','c','d'));

    // ArrayDeque <Character> list = new ArrayDeque<>(Arrays.asList('a','b','c','d'));

    // PriorityQueue <Character> list = new PriorityQueue<>(Arrays.asList('a','b','c','d'));

    // HashSet <Character> list = new HashSet<>(Arrays.asList('a','b','c','d','a'));

// HashMap<Character, Character> list = new HashMap<>();

// list.put(1, 60);
// list.put(2, 60);
// list.put(3, 40);
// list.put(4, 90);
// list.put(5, 80);

// LinkedHashSet <Character> list = new LinkedHashSet<>(Arrays.asList('a','b','c','d','a'));

TreeSet <Character> list = new TreeSet<>(Arrays.asList('a','b','c','d','a'));

// LinkedHashMap<Character, String> list = new LinkedHashMap<>();
// list.put(1, "Apple");
// list.put(2, "Banana");
// list.put(3, "Banana");

// System.out.println(list); // {1=Apple, 2=Banana}



// LinkedHashMap<Character, Character> list = new LinkedHashMap<>();
// list.put(1, 60);
// list.put(2, 90);

// System.out.println(list); // {1=60, 2=90}


// TreeMap<Character, Character> list = new TreeMap<>();
// list.put(1, 60);
// list.put(2, 90);
// System.out.println(list); // {1=Apple, 2=Banana}



    // System.out.println(list);

        Character[] result1 = Convert.toArray(list, new Character[0]);
        ArrayList<Character> result2 = Convert.toArrayList(list);
        Stack<Character>  result3 = Convert.toStack(list);
        LinkedList<Character> result4 = Convert.toLinkedList(list);
        Vector<Character> result5 = Convert.toVector(list);
        ArrayDeque<Character> result6 = Convert.toArrayDeque(list);
        PriorityQueue<Character> result7 = Convert.toPriorityQueue(list);
        HashSet<Character> result8 = Convert.toHashSet(list);
        LinkedHashSet<Character> result9 = Convert.toLinkedHashSet(list);
        // TreeSet<Character> result10 = Convert.toTreeSet(list);
        HashMap<Character, Character> result11 = Convert.toCharacterHashMap(list);
        HashMap<Integer, Character> result12 = Convert.toIntegerHashMap(list);
        TreeMap<Integer,Character> result13 = Convert.toIntegerTreeMap(list);
        TreeMap<Character,Character> result14 = Convert.toCharacterTreeMap(list);


        System.out.println("array "+Arrays.toString(result1));
        System.out.println("ArrayList "+result2);
        System.out.println("Stack "+result3);
        System.out.println("LinkedList "+result4);
        System.out.println("Vector "+result5);
        System.out.println("ArrayDeque "+result6);
        System.out.println("PriorityQueue "+result7);
        System.out.println("HashSet "+result8);
        System.out.println("lhs"+result9);
        // System.out.println("TreeSet"+result10);
        System.out.println("Character HashMap "+result11);
        System.out.println("Integer HashMap "+result12);
        System.out.println("Character TreeMap "+result14);
        System.out.println("Integer TreeMap "+result13);

        String str = "Arjun";

        // System.out.println(str.charAt(1));

        
    }
}