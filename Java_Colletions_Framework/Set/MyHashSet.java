package Java_Colletions_Framework.Set;

import java.util.HashSet;
import java.util.Iterator;

/* Java HashSet
The HashSet class in Java is a part of the java.util package and implements the Set interface. 
It is used to store a collection of unique elements in an unordered manner.

Unlike Lists, HashSet does not allow duplicate values and does not maintain insertion order. 
It uses a HashMap internally for storage, making operations like add, remove, and contains very fast (O(1) on average).

1. Key Features of HashSet
✅ Unique Elements – Does not allow duplicates.
✅ Unordered Collection – Does not maintain insertion order.
✅ Fast Operations – Provides O(1) average time complexity for insertions, deletions, and lookups.
✅ Null Allowed – A HashSet can store one null value.
✅ Not Synchronized – It is not thread-safe, so use Collections.synchronizedSet() if needed.

✅ You can use any wrapper class (Integer, Double, Character, Boolean, etc.) in a HashSet.
✅ You cannot use primitive types like int, double, char, etc. (Use their wrapper classes instead).
    Set<Integer> numbers = new HashSet<>();
    Set<Double> decimals = new HashSet<>();
    Set<Character> letters = new HashSet<>();
    Set<Boolean> flags = new HashSet<>();
*/

public class MyHashSet {
    public static void main(String[] args) {
        // 1. Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // 2. Adding Elements
        set.add("Nayan");
        set.add("Spider");
        set.add("Zeus");
        set.add("Bitcoin");
        set.add("Nayan"); // Duplicate, won't be added

        // 3. Checking if an Element Exists
        System.out.println(set.contains("Zeus")); // true
        System.out.println(set.contains("World")); // false

        // 4. Removing Elements
        set.remove("Bitcoin");

        // 5. Finding the Size of the HashSet
        System.out.println(set.size()); // prints size of the set

        // 6. Iterating Over Elements (order is unpredictable)
        for (String item : set) {
            System.out.println(item);
        }

        // 7. Using an Iterator
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 8. Clearing the HashSet
        set.clear();
    }
}
