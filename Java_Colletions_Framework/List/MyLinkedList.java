import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

/*
Java LinkedList

The LinkedList class in Java is a **doubly linked list implementation** of the List and Deque interfaces.

1. Key Features of LinkedList
✅ **Dynamic Size** – Grows automatically when elements are added.
✅ **Efficient Insertions/Deletions** – Faster than ArrayList for inserting/removing elements in the middle.
✅ **Maintains Insertion Order** – Elements are stored in the order they were inserted.
✅ **Duplicates Allowed** – You can store duplicate elements.
✅ **Not Synchronized** – It is not thread-safe, so use Collections.synchronizedList() if needed.
✅ **Implements Deque Interface** – Supports queue and stack operations.

✅ You can use wrapper classes (Integer, Double, Character, Boolean, etc.).
✅ You cannot use primitive types like int, double, char, etc. (Use their wrapper classes instead).
   LinkedList<Integer> numbers = new LinkedList<>();
   LinkedList<Double> decimals = new LinkedList<>();
   LinkedList<Character> letters = new LinkedList<>();
   LinkedList<Boolean> flags = new LinkedList<>();
*/

public class MyLinkedList {

    public static void main(String[] args) {

        // Creates an empty LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 1- Adding Elements
        list.add("Nayan");
        list.add("Spider");
        list.add("Zeus");

        // 2- Add elements at a specific index
        list.add(1, "Bitcoin");

        // 3- Accessing Elements
        String fetchname = list.get(2); // Retrieves the element at index 2
        System.out.println(fetchname); // Output: Bitcoin

        // 4- Updating an Element
        list.set(0, "Avalanche");

        // 5- Removing Elements
        // 5.1 - Removal by Value
        list.remove("Avalanche");

        // 5.2 - Removal by Index
        list.remove(0);

        // 6- Checking if an Element Exists
        boolean x = list.contains("Zeus");
        boolean y = list.contains("World");
        System.out.println(x); // prints true
        System.out.println(y); // prints false

        // 7- Finding the Size of the LinkedList
        int sizeoflist = list.size();
        System.out.println(sizeoflist); // prints size of list

        // 8- Sorting LinkedList
        Collections.sort(list);

        // 9- Iterating Over Elements

        // 9.1 - Using a for-each loop
        for (String item : list) {
            System.out.println(item);
        }

        // 9.2 - Using an Iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 10- Clearing all Elements from LinkedList
        list.clear();

    }
}
