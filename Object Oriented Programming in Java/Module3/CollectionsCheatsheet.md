# Coding Cheat Sheet

<!-- Reviewer: IMPORTANT! This file is a reading using the instructional lab environment so that the learner can have a table of contents to locate code snippets based on the corresponding video. This reading does not include an estimated time. In this first paragraph please update the first sentence to reflect the description of the course and not necessarily the exact course name (for content reuse across platforms.) -->

This reading provides a reference list of code that you&#39;ll encounter as you work with object-oriented coding in Java. Understanding these concepts will help you write and debug your Java programs. Let\'s explore the following Java coding concepts:

- Java Collections Framework (JCF)
- Working with Lists
- HashSet and TreeSet
- Implementing queues in Java
- Using HashMap and TreeMap
- Using Java collections in the real world

Keep this summary reading available as a reference as you progress through your course, and refer to this reading as you begin object-oriented coding with Java after this course!


## Using an ArrayList array

| Description | Example |
|--------|--------|
| Import `ArrayList` and `List` from the java.util package to use dynamic lists. | <pre>import java.util.ArrayList;<br>import java.util.List;</pre> |
| Define a class `ListExample` that contains the Java `main` method. Create a `List` of type `String` using the `ArrayList` implementation. This list will store fruit names as string elements. Add elements \"Apple\"\, \"Banana\"\, and \"Cherry\" to the list. Print the entire list, showing its elements in the order they were added. Retrieve the first element `Apple` from the list using index 0. Print the retrieved element. | <pre>public class ListExample {<br>    public static void main(String[] args) {<br>	List<String> fruits = new ArrayList<>();<br>	fruits.add("Apple");<br>	fruits.add("Banana");<br>	fruits.add("Cherry");<br>	System.out.println("Fruits: " + fruits);<br>	String firstFruit = fruits.get(0);<br>	System.out.println("First fruit: " + firstFruit);</pre> |
| Close curly braces to end the `ListExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates how to use the `List` interface with an `ArrayList` implementation to store and manipulate a list of fruit names. `ArrayList` is a dynamic array-based implementation of `List`, allowing for flexible resizing. Elements are added in order and accessed using a zero-based index. The `get(index)` method retrieves elements at specific positions.

## Using a LinkedList array

| Description | Example |
|--------|--------|
| Import the `LinkedList` class from the java.util package to use a linked list. | <pre>import java.util.LinkedList;</pre> |
| Define a class `LinkedListExample` that contains the Java `main` method. Create a `LinkedList` of type `String` to store animal names. Add elements \"Dog\"\, \"Cat\"\, and \"Elephant\" to the list. Print the contents of the `LinkedList`, displaying all elements. | <pre>public class LinkedListExample {<br>    public static void main(String[] args) {<br>	LinkedList<String> animals = new LinkedList<>();<br>	animals.add("Dog");<br>	animals.add("Cat");<br>	animals.add("Elephant");<br>	System.out.println("Animals: " + animals);</pre> |
| Close curly braces to end the `LinkedListExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates how to use a `LinkedList` to store and manipulate a list of animal names. `LinkedList` is a doubly linked list implementation in Java, meaning that elements are linked using pointers. In `LinkedList`, insertions and deletions are faster compared to `ArrayList` (especially for large lists).

## Using a HashSet collection

| Description | Example |
|--------|--------|
| Import the `HashSet` class from the java.util package to store a collection of unique elements. | <pre>import java.util.HashSet;</pre> |
| Define a class `HashSetExample` that contains the Java `main` method. Create a `HashSet` of type `String` to store color names. Add elements \"Red\"\, \"Green\"\, and \"Blue\" to the HashSet. Add \"Red\" again to the HashSet. HashSet does not allow duplicate values. If a duplicate is added, it is ignored. Print the contents of the `HashSet`, displaying all elements. | <pre>public class HashSetExample {<br>    public static void main(String[] args) {<br>	HashSet<String> colors = new HashSet<>();<br>	colors.add("Red");<br>	colors.add("Green");<br>	animals.add("Blue");<br>	colors.add("Red");<br>	System.out.println("Colors: " + colors);</pre> |
| Close curly braces to end the `HashSetExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates the usage of a `HashSet`, which is a part of the Java Collections Framework and is used to store a collection of unique elements. `HashSet` does not maintain any specific order and ignores duplicates. It is useful when you need a collection of distinct elements with fast lookup times.

## Using a HashMap collection

| Description | Example |
|--------|--------|
| Import the `HashMap` class from the java.util package to store key-value pairs. | <pre>import java.util.HashMap;</pre> |
| Define a class `HashMapExample` that contains the Java `main` method. Create a `HashMap<String, Integer>` named `ageMap`. The keys are `names` (String), and the values are `ages` (Integer). Add key-value pair to the `HashMap` using the `put()` method. The `System.out.println()` statement prints the entire `HashMap` but does not maintain any order because `HashMap` does not maintain insertion order. The program retrieves Alice&#39;s age using `ageMap.get("Alice")` and stores it in `aliceAge`.| <pre>public class HashMapExample {<br>    public static void main(String[] args) {<br>	HashMap<String, Integer> ageMap = new HashMap<>();<br>	ageMap.put("Alice", 30);<br>	ageMap.put("Bob", 25);<br>	ageMap.put("Charlie", 35);<br>	System.out.println("Age Map: " + ageMap);<br>	int aliceAge = ageMap.get("Alice");<br>	System.out.println("Alice's Age: " + aliceAge);</pre> |
| Close curly braces to end the `HashMapExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates the usage of a `HashMap`, which is a part of the Java Collections Framework and is used to store key-value pairs. Keys are unique (if a duplicate key is added, it replaces the old value). Values can be duplicated. `HashMap` does not maintain any specific order. It provides fast access to values using keys.


::page{title="Working with lists"}

## Creating an ArrayList

| Description | Example |
|--------|--------|
| Import `ArrayList` from the java.util package to use dynamic lists. | <pre>import java.util.ArrayList;</pre> |
| Define a class `ArrayListExample` that contains the Java `main` method. Create an `ArrayList<String>` named `fruits` to store a list of fruit names. This list will store fruit names as string elements. Add elements \"Apple\"\, \"Banana\"\, and \"Cherry\" to the list. Print the entire list, showing its elements in the order they were added. Retrieve the first element `Apple` from the list using index 0 and print the retrieved element. Call `fruits.remove("Banana")` to remove \"Banana\" from the list. Print the remaining elements of `ArrayList`. | <pre>public class ArrayListExample {<br>    public static void main(String[] args) {<br>	ArrayList<String> fruits = new ArrayList<>();<br>	fruits.add("Apple");<br>	fruits.add("Banana");<br>	fruits.add("Cherry");<br>	System.out.println("First fruit: " + fruits.get(0));<br>	fruits.remove("Banana");<br>	System.out.println("Fruits List: " + fruits);</pre> |
| Close curly braces to end the `ArrayListExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates the usage of an `ArrayList`, which is a part of the Java Collections Framework and is used to store a resizable list of elements. `ArrayList` elements are added in order and accessed using a zero-based index. The `get(index)` method retrieves elements at specific positions. `ArrayList` allows duplicates and removing elements shifts subsequent elements left (affecting performance for large lists).

## Creating a LinkedList

| Description | Example |
|--------|--------|
| Import the `LinkedList` class from the java.util package to create a linked list. | <pre>import java.util.LinkedList;</pre> |
| Define a class `LinkedListExample` that contains the Java `main` method. Create a `LinkedList` of type `String` to store a list of color names. Add elements \"Red\"\, \"Green\"\, and \"Blue\" to the list using the `add()` method. Retrieve the first element of the list using `colors.get(0)`. Remove the first occurrence of \"Green\" from the list using `colors.remove("Green")`. Print the remaining elements of the `LinkedList`. | <pre>public class LinkedListExample {<br>    public static void main(String[] args) {<br>	LinkedList<String> colors = new LinkedList<>();<br>	colors.add("Red");<br>	colors.add("Green");<br>	animals.add("Blue");<br>	System.out.println("First color: " + colors.get(0));<br>	colors.remove("Green");<br>	System.out.println("Colors List: " + colors);</pre> |
| Close curly braces to end the LinkedListExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates the usage of a `LinkedList`, which is a part of the Java Collections Framework. `LinkedList` stores elements in nodes, where each node contains a reference to the next node. It allows efficient insertion and removal of elements from both ends: `addFirst()`, `addLast()`, `removeFirst()`, and `removeLast()`. Accessing elements by index `get(index)` is slower than in `ArrayList`, because it requires traversing the list from the beginning. Duplicates are allowed, and order is maintained. Unlike ArrayList, elements are not shifted after removal (only the references are updated), which can improve performance for certain operations.

::page{title="HashSet and TreeSet"}

## Creating a HashSet

| Description | Example |
|--------|--------|
| Import the `HashSet` class from the java.util package to store a collection of unique elements. | <pre>import java.util.HashSet;</pre> |
| Define a class `HashSetExample` that contains the Java `main` method. Create a `HashSet` of type `String` to store fruit names. Add elements \"Apple\"\, \"Banana\"\, and \"Cherry\" to the HashSet. Add \"Banana\" again to the `HashSet`. Since `HashSet` does not allow duplicate values, it is ignored. Print the contents of the `HashSet`, displaying all elements. Checks if \"Apple\" is in the set by calling `fruits.contains("Apple")`. If found, the message \"Apple\" is present in the set is printed. The method `fruits.remove("Cherry")` removes \"Cherry\" from the set. | <pre>public class HashSetExample {<br>    public static void main(String[] args) {<br>	HashSet<String> fruits = new HashSet<>();<br>	fruits.add("Apple");<br>	fruits.add("Banana");<br>	fruits.add("Cherry");<br>	fruits.add("Banana");<br>	System.out.println("Fruits in the HashSet: " + fruits);<br>	if (fruits.contains("Apple")) {<br>	    System.out.println("Apple is present in the set.");<br>	}<br>	fruits.remove("Cherry");<br>	System.out.println("After removal: " + fruits);</pre> |
| Close curly braces to end the `HashSetExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates the usage of a `HashSet`, which is a part of the Java Collections Framework and is used to store a collection of unique elements. The `contains()` method provides fast lookup to check if an element exists. The `remove()` method efficiently removes elements. `HashSet` does not maintain any specific order and ignores duplicates. It is useful when you need a collection of distinct elements with fast lookup times.

## Creating a TreeSet

| Description | Example |
|--------|--------|
| Import the `TreeSet` class from the java.util package to store a collection of unique elements. | <pre>import java.util.TreeSet;</pre> |
| Define a class `TreeSetExample` that contains the Java `main` method. Create a `TreeSet<Integer>` named `numbers` to store a set of integer values. Add the numbers 5, 3, 8, and 1 using the `add()` method. Add 3 again to the `TreeSet`. Since `TreeSet` does not allow duplicate values, it is ignored. Print the contents of the `TreeSet`, displaying all elements. Checks if 5 is in the set by calling `numbers.contains(5)`. If found, the message \"5 is present in the set\" is printed. The method `numbers.remove(8)` removes 8 from the set. | <pre>public class TreeSetExample {<br>    public static void main(String[] args) {<br>	TreeSet<Integer> numbers = new TreeSet<>();<br>	numbers.add(5);<br>	numbers.add(3);<br>	numbers.add(8);<br>	numbers.add(1);<br>	numbers.add(3);<br>	System.out.println("Numbers in the TreeSet: " + numbers););<br>	if (numbers.contains(5)) {<br>	    System.out.println("5 is present in the set.");<br>	}<br>	numbers.remove(8);<br>	System.out.println("After removal: " + numbers);</pre> |
| Close curly braces to end the `HashSetExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates the usage of a `TreeSet`, which is used to store a collection of unique elements. `TreeSet` elements are always sorted in ascending order. The `contains()` method provides fast lookup (uses a Balanced Tree structure). The `remove()` methokd efficiently deletes elements while maintaining order. `TreeSet` is useful when you need a sorted set with fast operations.

## TreeSet versus HashSet: need for order

| Description | Example |
|--------|--------|
| Use TreeSet: When you need the elements to be sorted in a specific order. For example: If you want to store a list of student grades and display them in ascending order, a TreeSet will automatically sort them. | <pre>TreeSet<Integer> grades = new TreeSet<>();<br>grades.add(85);<br>grades.add(90);<br>grades.add(70);<br>// Output: [70, 85, 90]<br>System.out.println(grades);</pre> |
| Use HashSet: When the order of elements does not matter. For example: If you are storing unique user IDs and do not care about their order. | <pre>HashSet<String> userIds = new HashSet<>();<br>userIds.add("user1");<br>userIds.add("user2");<br>userIds.add("user3");<br>// Output: Order may vary<br>System.out.println(userIds);</pre> |

## HashSet versus TreeSet: Need for performance

| Description | Example |
|--------|--------|
| Use HashSet: For faster performance when adding, removing, or searching for elements. For Example: In a game, if you need to quickly check if a player has collected a unique item. | <pre>HashSet<String> collectedItems = new HashSet<>();<br>collectedItems.add("Sword");<br>collectedItems.add("Shield");<br><boolean>boolean hasSword = collectedItems.contains("Sword"); // Fast check</pre> |
| Use TreeSet: Use TreeSet: When you can afford slower operations but need the elements sorted. For Example: If you are maintaining a leaderboard that requires sorted scores, a TreeSet is suitable even if it&#39;s slightly slower. | <pre>TreeSet<Integer> scores = new TreeSet<>();<br>scores.add(300);<br>scores.add(150);<br>scores.add(200);<br>System.out.println(scores); // [150, 200, 300]</pre> |

## HashSet versus TreeSet: Avoidance of duplicates

| Description | Example |
|--------|--------|
| Using HashSet to avoid duplicates. A `HashSet<String>` named `fruits` is created. \"Apple\" and \"Banana\" are added. A duplicate \"Apple\" is added but ignored because `HashSet` does not allow duplicates. The output may appear as [Banana, Apple] or [Apple, Banana], but the order is NOT guaranteed, since `HashSet` is unordered. | <pre>HashSet<String> fruits = new HashSet<>();<br>fruits.add("Apple");<br>fruits.add("Banana");<br>fruits.add("Apple"); // Duplicate will not be added<br>System.out.println(fruits); // Output: [Banana, Apple] </String><br></pre> |
| Using TreeSet to avoid duplicates. A `TreeSet<String>` named `sortedFruits` is created. \"Apple\" and \"Banana\" are added. A duplicate \"Apple\" is added but ignored because `TreeSet` also does not allow duplicates. Unlike `HashSet`, `TreeSet` automatically sorts elements in ascending order. The output is always [Apple, Banana], since `TreeSet` maintains sorted order. | <pre>TreeSet<String> sortedFruits = new TreeSet<>();<br>sortedFruits.add("Apple");<br>sortedFruits.add("Banana");<br>sortedFruits.add("Apple"); // Duplicate will not be added<br>System.out.println(sortedFruits); // Output: [Apple, Banana]</pre> |

::page{title="Implementing queues in Java"}

## Creating a simple queue using LinkedList

| Description | Example |
|--------|--------|
| Import the java.util.LinkedList and java.util.Queue packages to use the `Queue` interface with a `LinkedList` implementation. | <pre>import java.util.LinkedList;<br>import java.util.Queue;</pre> |
| Create an instance of `Queue<String>` named `queue` using new `LinkedList<>()`. Add three elements (\"Apple\"\, \"Banana\"\, \"Cherry\") to the queue using `offer()`, which inserts elements at the end of the queue. Print the queue to show its contents. The `poll()` method removes and returns the front element (\"Apple\") from the queue. Print the removed element (\"Apple\") and display the state of the queue again after removing the front element. | <pre>public class QueueExample {<br>    public static void main(String[] args) {<br>        // Creating a Queue<br>        Queue<String> queue = new LinkedList<>();<br>        // Enqueue operation<br>         queue.offer("Apple");<br>         queue.offer("Banana");<br>         queue.offer("Cherry");<br>         // Displaying the Queue<br>         System.out.println("Queue: " + queue);<br>         // Dequeue operation<br>         String removedItem = queue.poll();<br>         System.out.println("Removed Item: " + removedItem);<br>         // Displaying the Queue after Dequeue<br>         System.out.println("Queue after dequeue: " + queue);<br> </pre> |
| Close curly braces to end the `QueueExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates the use of a Queue data structure using the `LinkedList` class. The method `offer()` adds an element to the queue (enqueue), `poll()` removes and returns the front element (dequeue). `LinkedList` as a queue implements FIFO (First-In-First-Out) behavior.

## Creating a priority queue

| Description | Example |
|--------|--------|
| Import the java.util.PriorityQueue package to use the PriorityQueue class. | <pre>import java.util.PriorityQueue;</pre> |
| Create an instance of `PriorityQueue<Integer>` named `priorityQueue` using new `PriorityQueue<>()`. Add three elements: 20, 15, and 30 using the `offer()` method. The `PriorityQueue` maintains a min-heap structure (smallest element has the highest priority). Print the queue, but its order may not be in the exact insertion order due to the heap-based priority structure. Remove elements in priority order (ascending order for integers). A while loop continuously removes and prints the smallest element until the queue is empty. | <pre>public class PriorityQueueExample {<br>    public static void main(String[] args) {<br>        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();<br>        // Adding elements<br>        priorityQueue.offer(20);<br>        priorityQueue.offer(15);<br>        priorityQueue.offer(30);<br>        // Displaying the Priority Queue<br>        System.out.println("Priority Queue: " + priorityQueue);<br>        // Removing elements in priority order<br>        while (!priorityQueue.isEmpty()) {<br>            System.out.println("Removed Item: " + priorityQueue.poll());<br>        }<br></pre> |
| Close curly braces to end the `PriorityQueueExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates the usage of a PriorityQueue, which is a type of queue where elements are processed based on their priority (natural order by default for numbers). The method `offer()` adds an element to the queue (enqueue), `poll()` removes and returns the element with the highest priority (smallest number in this case). Heap-based Implementation ensures efficient insertions and deletions.

## Implementing a queue in the real world

| Description | Example |
|--------|--------|
| Import the java.util.LinkedList and java.util.Queue packages to create and manage the queue. | <pre>import java.util.LinkedList;<br>import java.util.Queue;</pre> |
| Create an instance of `Queue<String>` named `customerQueue` using new `LinkedList<>()` to store customers. Add \"Customer 1\", \"Customer 2\", and \"Customer 3\" are added to the queue using `offer()`. Prints the queue to show the customers waiting in order. The `poll()` method removes and returns the first customer (\"Customer 1\") from the queue. Display the remaining customers in the queue. Cal `poll()` again to serve the next customer and print the final state of the queue. | <pre>public class CustomerServiceQueue {<br>    public static void main(String[] args) {<br>        // Creating a queue to represent customers waiting for service<br>        Queue<String> customerQueue = new LinkedList<>();<br>        // Customers arrive and join the queue<br>        customerQueue.offer("Customer 1");<br>        customerQueue.offer("Customer 2");<br>        customerQueue.offer("Customer 3");<br>        // Displaying the current queue<br>        System.out.println("Current Customer Queue: " + customerQueue);<br>        // Serving the first customer in the queue<br>        String servedCustomer = customerQueue.poll();<br>        System.out.println("Serving: " + servedCustomer);<br>        // Displaying the queue after serving one customer<br>        System.out.println("Customer Queue after serving one: " + customerQueue);<br>        // Serving another customer<br>        servedCustomer = customerQueue.poll();<br>        System.out.println("Serving: " + servedCustomer);<br>        // Final state of the queue<br>        System.out.println("Final Customer Queue: " + customerQueue);<br></pre> |
| Close curly braces to end the `CustomerServiceQueue` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program simulates a customer service queue using a Queue (FIFO - First In, First Out) implemented with a `LinkedList`. It models how customers arrive, wait, and are served in order. The method `offer()` adds customers to the queue and `poll()` removes customers in FIFO order. `LinkedList` as a queue mimics a real world waiting line. This approach can be extended to simulate bank queues, call centers, or ticket counters.


::page{title="Using HashMap and TreeMap"}

## Creating a HashMap

| Description | Example |
|--------|--------|
| Import the `HashMap` class from the java.util package, which is a part of Java&#39;s Collection Framework. | <pre>import java.util.HashMap;</pre> |
| Initialize a `HashMap<String, Integer>` named `map` to represent `fruit names` as keys and their corresponding `numeric values` as values. Add key-value pairs using the `put` method. \"Apple\" is mapped to 1, \"Banana\" to 2, and \"Cherry\" to 3. Keys are unique: If the same key is added again, its value gets updated. The `map.get("Apple")` method fetches and prints the value associated with \"Apple\". The `keySet()` method returns all the keys in the `HashMap`, and the `for` loop prints each key-value pair. Order is NOT guaranteed in a `HashMap`. The `containsKey()` method checks whether \"Banana\" is present in the map and the `remove()` method deletes \"Cherry\" from the `HashMap`. | <pre>public class HashMapExample {<br>    public static void main(String[] args) {<br>        // Creating a HashMap<br>        HashMap<String, Integer> map = new HashMap<>();<br>        // Adding key-value pairs to the HashMap<br>        map.put("Apple", 1);<br>        map.put("Banana", 2);<br>        map.put("Cherry", 3);<br>        // Accessing values<br>        System.out.println("Value for key 'Apple': " + map.get("Apple")); // Output: 1<br>        // Iterating through the HashMap<br>        for (String key : map.keySet()) {<br>            System.out.println(key + ": " + map.get(key));<br>        }<br>        // Checking if a key exists<br>        if (map.containsKey("Banana")) {<br>            System.out.println("Banana exists in the map.");<br>        }<br>        // Removing a key-value pair<br>        map.remove("Cherry");<br></pre> |
| Close curly braces to end the `TreeMapExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates the usage of a `HashMap`, a data structure that stores key-value pairs and allows fast access to values using keys. `put(K key, V value)` adds or updates a key-value pair, `get(K key)` retrieves the value for a key, `keySet()` returns all keys, `containsKey(K key)` checks if a key exists, and `remove(K key)` deletes a key-value pair.

## Using a HashMap

| Description | Example |
|--------|--------|
| Initialize a `HashMap<String, Integer>` named `wordCount`, where the keys are `words` (Strings) and the values are the `count of occurrences of each word` (Integers). Define the input text containing a string with multiple repeated words. The `split()` method splits the text string into a `words` array based on spaces. A `for` loop iterates over each word in the `words` array. The `wordCount.getOrDefault(word, 0)` method retrieves the current count of the word if it exists. If the word is not yet in the map, it defaults to 0. The +1 increments the count for each occurrence and `put(word, newCount)` updates the count in the `HashMap`. | <pre>HashMap<String, Integer> wordCount = new HashMap<>();<br>String text = "apple banana apple orange banana apple";<br>String[] words = text.split(" ");<br><br>for (String word : words) {<br>    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);<br>}<br></pre> |

**Explanation:** This Java code snippet demonstrates how to use a HashMap to count the occurrences of words in a given text string. This approach is useful for word frequency analysis in text processing. The `split(" ")` function splits text into words. `HashMap` efficiently tracks word occurrences. `getOrDefault(key, defaultValue)` avoids null values.

## Creating a TreeMap

| Description | Example |
|--------|--------|
| Import the `TreeMap` class from the java.util package to store key-value pairs in sorted order. | <pre>import java.util.TreeMap;</pre> |
| Initialize a `TreeMap<String, Integer>` named `treeMap` to store fruit names (keys) and their corresponding values (integers). The `TreeMap` automatically sorts the keys in ascending order (Apple → Banana → Cherry). The `treeMap.get("Apple"))` call fetches and prints the value associated with \"Apple\". The `for` loop calls the `keySet()` method to iterate over all keys (which are sorted) and print their associated values. The `containsKey()` method checks if \"Cherry\" is present and prints a message. The `treemap.remove()` method removes the \"Banana\" entry from the TreeMap. | <pre>public class TreeMapExample {<br>    public static void main(String[] args) {<br>        // Creating a TreeMap<br>        TreeMap<String, Integer> treeMap = new TreeMap<>();<br>        // Adding key-value pairs to the TreeMap<br>        treeMap.put("Banana", 2);<br>        treeMap.put("Apple", 1);<br>        treeMap.put("Cherry", 3);<br>        // Accessing values<br>        System.out.println("Value for key 'Apple': " + treeMap.get("Apple")); // Output: 1<br><br>        // Iterating through the TreeMap<br>        for (String key : treeMap.keySet()) {<br>            System.out.println(key + ": " + treeMap.get(key));<br>        }<br>        // Checking if a key exists<br>        if (treeMap.containsKey("Cherry")) {<br>            System.out.println("Cherry exists in the TreeMap.");<br>        }<br>        // Removing a key-value pair<br>        treeMap.remove("Banana");<br></pre> |
| Close curly braces to end the `TreeMapExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates the use of a TreeMap, a data structure that stores key-value pairs in sorted order based on keys. `TreeMap` maintains sorted order (ascending by default).

## Using a TreeMap

| Description | Example |
|--------|--------|
| Initialize a `TreeMap<String, Integer>` named `leaderboard` where Keys (String) represent `player names` and Values (Integer) represent `player scores`. `TreeMap` automatically sorts keys in ascending order. Add three players and their scores to the `TreeMap`. Since `TreeMap` maintains sorted order by `key (name)`, the stored order will be: Alice → Bob → Charlie. Display the sorted leaderboard using the `keySet()` method. | <pre>TreeMap<String, Integer> leaderboard = new TreeMap<>();<br>leaderboard.put("Alice", 150);<br>leaderboard.put("Bob", 200);<br>leaderboard.put("Charlie", 100);<br>// Displaying sorted leaderboard<br>for (String player : leaderboard.keySet()) {<br>    System.out.println(player + ": " + leaderboard.get(player));<br>}<br></pre> |

**Explanation:** This Java code snippet demonstrates the use of a `TreeMap` to store and display a sorted leaderboard of players and their scores. TreeMap stores entries in key-sorted order (ascending). `put(K key, V value)` adds key-value pairs, `get(K key)` retrieves the value for a given key, and keySet() returns keys in sorted order.


::page{title="Using Java collections in the real world"}

## Managing books in a library management system

| Description | Example |
|--------|--------|
| Import the `ArrayList` class from the `java.util` package, which is a part of Java&#39;s Collection Framework and is used to store a dynamic list. Create the `Library` class to represent a collection of books. The `books` variable is a private ArrayList<String>, meaning it stores book titles as strings and it cannot be accessed directly from outside the class. The `Library()` constructor initializes the books list when a `Library` object is created. The `addBook()` method adds a new book to the books list. The `displayBooks()` method prints all books stored in the `books` list using a for-each loop. The `main` method creates a `Library` object named `myLibrary`, adds two books: \"The Great Gatsby\" and \"To Kill a Mockingbird\"\, and calls the displayBooks() method to print the book list. | <pre>import java.util.ArrayList;<br>public class Library {<br>    private ArrayList<String> books;<br><br>    public Library() {<br>        books = new ArrayList<>();<br>    }<br><br>    public void addBook(String book) {<br>        books.add(book);<br>    }<br><br>    public void displayBooks() {<br>        System.out.println("Books in the Library:");<br>        for (String book : books) {<br>            System.out.println(book);<br>        }<br>    }<br><br>    public static void main(String[] args) {<br>        Library myLibrary = new Library();<br>        myLibrary.addBook("The Great Gatsby");<br>        myLibrary.addBook("To Kill a Mockingbird");<br>        myLibrary.displayBooks();<br></pre> |
| Close curly braces to end the `main` and `Library` class definition. | <pre>    }<br>}</pre> |

## Managing customer orders in an e-commerce application

| Description | Example |
|--------|--------|
| Import the `HashMap` class from the `java.util` package, which is a part of Java&#39;s Collection Framework and is used to store a dynamic list. Create the `OrderManagement` class to manage orders. The `orders` variable is private, meaning it cannot be accessed directly from outside the class. It is encapsulated to ensure data integrity. The Java constructor `OrderManagement()` initializes the orders `HashMap` when an `OrderManagement` object is created. The `addOrder()` method adds a new order using the `.put(orderId, customerName)` method. If the same `orderId` is added again, it overwrites the previous entry. The `displayOrders()` method iterates over the `HashMap` using `keySet()` to get all order IDs, retrieves and prints the corresponding customer names. The `main` method creates an instance of `OrderManagement`, adds two orders: Order #101 for Alice and Order #102 for Bob, and calls the `displayOrders()` method to show all orders. | <pre>import java.util.HashMap;<br><br>public class OrderManagement {<br>    private HashMap<Integer, String> orders;<br><br>    public OrderManagement() {<br>        orders = new HashMap<>();<br>    }<br><br>    public void addOrder(int orderId, String customerName) {<br>        orders.put(orderId, customerName);<br>    }<br><br>    public void displayOrders() {<br>        System.out.println("Customer Orders:");<br>        for (int orderId : orders.keySet()) {<br>            System.out.println("Order ID: " + orderId + ", Customer Name: " + orders.get(orderId));<br>        }<br>    }<br><br>    public static void main(String[] args) {<br>        OrderManagement orderManagement = new OrderManagement();<br>        orderManagement.addOrder(101, "Alice");<br>        orderManagement.addOrder(102, "Bob");<br>        orderManagement.displayOrders();<br></pre> |
| Close curly braces to end the `main` and `OrderManagement` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program implements a basic Order Management system using a HashMap to store and manage customer orders. The program uses `HashMap<Integer, String>`, which stores Keys (Integer) to represent Order IDs and Values (String) to represent Customer Names.

## Managing employee information in an employee management system

| Description | Example |
|--------|--------|
| Import the `HashSet` class from the `java.util` package, which is a part of Java&#39;s Collection Framework and is used to store a dynamic list. Create the `EmployeeManager` class with a private variable named `employee` that stores employee names. Encapsulation ensures the set is only modified via class methods. The constructor `EmployeeManager()` initializes the `employees` set when an `EmployeeManager` objet is created. The `addEmployee()` method adds an employee name to the `HashSet`. If the employee already exists, the `HashSet` prevents duplicate entries. The `displayEmployees()` method iterates over the `HashSet` to display all employees. The order is not guaranteed because `HashSet` does not maintain insertion order. The Java `main` method creates an instance of `EmployeeManager` and adds three employees: \"John Doe\"\, \"Jane Smith\"\, and \"John Doe\". Because \"John Doe\" is a duplicate, it is ignored by `HashSet`. Calling `displayEmployees()` showas all employees. | <pre>import java.util.HashSet;<br><br>public class EmployeeManager {<br>    private HashSet<String> employees;<br><br>    public EmployeeManager() {<br>        employees = new HashSet<>();<br>    }<br><br>    public void addEmployee(String employee) {<br>        employees.add(employee);<br>    }<br><br>    public void displayEmployees() {<br>        System.out.println("Employees in the Company:");<br>        for (String employee : employees) {<br>            System.out.println(employee);<br>        }<br>    }<br><br>    public static void main(String[] args) {<br>        EmployeeManager manager = new EmployeeManager();<br>        manager.addEmployee("John Doe");<br>        manager.addEmployee("Jane Smith");<br>        manager.addEmployee("John Doe"); // Duplicate will not be added<br>        manager.displayEmployees();</pre> |
| Close curly braces to end the `main` and `EmployeeManager` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program implements a basic Employee Management system using a HashSet to store and manage employee names. It uses `LinkedHashSet` to maintain insertion order and `TreeSet` to store employees in sorted order.

## Managing tasks in a task management system

| Description | Example |
|--------|--------|
| Import the `LinkedList` class from the `java.util` package, which is a part of Java&#39;s Collection Framework and is used to store a dynamic list. Create the `TaskManager` class with a private variable named `tasks` that stores tasks. Encapsulation ensures the set is only modified via class methods. The constructor `TaskManager()` initializes the `tasks` list when a `TaskManager` object is created. The `addTask()` method adds a task to the end of the list using `add()` and preserves the insertion order (LinkedList maintains order). The `completeTask()` method removes the first task using `removeFirst()`, prevents errors by checking `isEmpty()` before removal, and printes the completed task. The `displayTasks()` method iterates over the `LinkedList` and prints all taks. Tasks remain ordered by insertion. The Java `main` method creates an instance of `TaskManager`, adds two tasks: \"Finish report\" and \"Email client\"\, displays tasks, completes the first task, and displays remaining tasks. | <pre>import java.util.LinkedList;<br><br>public class TaskManager {<br>    private LinkedList<String> tasks;<br><br>    public TaskManager() {<br>        tasks = new LinkedList<>();<br>    }<br><br>    public void addTask(String task) {<br>        tasks.add(task);<br>    }<br><br>    public void completeTask() {<br>        if (!tasks.isEmpty()) {<br>            String completedTask = tasks.removeFirst();<br>            System.out.println("Completed Task: " + completedTask);<br>        } else {<br>            System.out.println("No tasks to complete.");<br>        }<br>    }<br><br>    public void displayTasks() {<br>        System.out.println("Current Tasks:");<br>        for (String task : tasks) {<br>            System.out.println(task);<br>        }<br>    }<br><br>    public static void main(String[] args) {<br>        TaskManager manager = new TaskManager();<br>        manager.addTask("Finish report");<br>        manager.addTask("Email client");<br>        manager.displayTasks();<br><br>        manager.completeTask();<br>        manager.displayTasks();<br></pre> |
| Close curly braces to end the `main` and `TaskManager` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program implements a simple Task Manager using a LinkedList to store and manage tasks. It supports fast insertions/removals at both ends for addFirst() and removeFirst().

## Managing followers in a social media application

| Description | Example |
|--------|--------|
| Import the `HashSet` class from the `java.util` package, which is a part of Java&#39;s Collection Framework and is used to store a dynamic list. Create the `SocialMedia` class with a `HashMap` where Key (String) represents a user and Value (HashSet<String>) stores a set of followers (ensuring uniqueness). The constructor `SocialMedia()` initializes `userFollowers` as an empty `HashMap`. The `addFoower()` method ensures the user exists in the `HashMap` using the `putIfAbsent(user, new HashSet<>())` method and adds the follower to the user&#39;s `HashSet` (no duplicates allowed). The `displayFollowers()` method checks if the user exists, prints all followers of the user, and handles missing users by displaying \"No followers found\". The Java `main` method creates an instance of `SocialMedia` class, adds followers: \"Bob\" follows \"Alice\"\, \"Charlie\" follows \"Alice\"\, and displays Alice\'s followers. | <pre>import java.util.HashSet;<br><br>public class SocialMedia {<br>    private HashMap<String, HashSet<String>> userFollowers;<br><br>    public SocialMedia() {<br>        userFollowers = new HashMap<>();<br>    }<br><br>    public void addFollower(String user, String follower) {<br>        userFollowers.putIfAbsent(user, new HashSet<>());<br>        userFollowers.get(user).add(follower);<br>    }<br><br>    public void displayFollowers(String user) {<br>        System.out.println("Followers of " + user + ":");<br>        HashSet<String> followers = userFollowers.get(user);<br>        if (followers != null) {<br>            for (String follower : followers) {<br>                System.out.println(follower);<br>            }<br>        } else {<br>            System.out.println("No followers found.");<br>        }<br>    }<br><br>    public static void main(String[] args) {<br>        SocialMedia socialMedia = new SocialMedia();<br>        socialMedia.addFollower("Alice", "Bob");<br>        socialMedia.addFollower("Alice", "Charlie");<br>        socialMedia.displayFollowers("Alice");<br></pre> |
| Close curly braces to end the `main` and `EmployeeManager` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program implements a basic social media follower system using `HashMap` and `HashSet`. `HashSet` ensures no user follows the same person twice. If a user has no followers, it prints \"No followers found\". HashMap provides average time complexity for lookups. Followers cannot be accessed directly, only via class methods.


## Author(s)
Ramanujam Srinivasan
Lavanya Thiruvali Sunderarajan

<br>
<br>
<br>

![SN IBM Footer](https://cf-courses-data.s3.us.cloud-object-storage.appdomain.cloud/jrorbnz20h5VzD06sTlolg/ibmsn-footer-blue.png "SN IBM Footer")

<!--## Changelog
| Date | Version | Changed by | Change Description |
|------|--------|--------|---------|
| 2025-02-28 | 0.1 | P.Kravitz  | Template created |
| 2025-03-06 | 0.2 | A.Narula  | Cheatsheet completed |
| 2025-03-10 | 0.3 | Mercedes Schneider | QA pass with edits |
-->