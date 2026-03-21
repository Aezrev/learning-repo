# Course Level Coding Cheat Sheet

Welcome to this course-level coding sheet.  This coding cheat sheet contains all of the code and explanations provide in the module-level cheat sheets. Like the module-level coding cheat sheets, you\'ll find code and explanations for all videos in the course that presented code. Within each video section, you\'ll find the code, organized by topics from within each video.

You can expand the hamburger menu in the upper left corner of this window to locate code by video name.

Here\'s list of the videos with code included in this reading.


- Structuring Java Code and Comments
- Exploring Data Types in Java
- Introduction to Operators in Java
- Using Advanced Operators in Java
- Working with Arrays
- Using Conditional Statements
- Introduction to Loops in Java
- Working with Strings in Java
- Using Packages and Imports
- Implementing Functions and Methods
- An Introduction to Exceptions
- Using Finally Block
- Using Multiple Try Catch
- Checked and Runtime Exceptions Compared


## Types of comments

| Description | Code Example |
|--------|--------|
| A Java statement used to print text or other data to the standard output, typically the console. | <pre>System.out.println("Hello, World!")</pre> |
| Use two forward slashes to precede a single line comment in Java | <pre>// This is a single-line comment.</pre | 
| All text after the  two forward slash marks on this line is treated as a comment|  <pre>int number = 10; // This variable stores the number 10 </pre>   |
|These comments start with `/*` and end with `*/`. They can span multiple lines.|<pre>/* This is a multi-line comment It can be used to explain a block of code or provide detailed information </pre> 
|This also is a multiline comment.  Multiline comments start with `/*` and end with `*/`. They can span multiple lines. | <pre>*/ int sum = 0;<br> */ This variable will hold the sum of numbers */. </pre>
| The documentation comments start with `/*` and ends with `*/` . These comments are used for generating documentation using tools like Javadoc. | <pre>/*<br> This method calculates the square of a number.  <br> @param number The number to be squared  <br> @return The square of the input number  <br> */ <br>public int square(int number) { <br> return number * number; <br> } </pre> |

## Creating a package

| Description | Code Example |
|--------|--------|
| To create a package, use the package keyword at the top of your Java source file. | <pre>package com.example.myapp; // Declare a package <br>public class MyClass { <br> // Class code goes here<br> } </pre> |  

## Folder structure for a package
| Description | Folder Structure Example |
|--------|--------|
| The folder structure on your filesystem should match the package declaration. For instance, if your package is com.example.myapp, your source file should be located in the following path example. | <pre>/src<br>└── com <br>└── example <br>└──>└──><br>└──>└── └──>myapp<br>└──>└── └──>└── MyClass.java </pre> |  

## Class and Methods Structure

| Description | Code Example |
|--------|--------|
| In Java, a class is a blueprint for creating objects and can contain methods (functions) that define behaviors. For instance, the second line of this code displays the public class `library`, with methods like calculatePrice() or applyDiscount(). | <pre> package com.example.library;  <br> public class Library  <br>{<br>private List <Book> books; // Private attribute to hold books  <br> public Library()  <br>{<br>books = new ArrayList<>(); // Initialize the list in the constructor <br> } <br>}public void addBook(Book book) {<br>books.add(book); // Method to add a book to the library <br>} <br } <br>|


## Creating methods

| Description | Code Example |
|--------|--------|
| Every Java application needs an entry point, which is typically a main method within a public class. In this code, the second line of code identifies the method named Main in the public class.|<pre>package com.example.library;<br><br>public class Main {<br><br>public static void main(String[] args) {<br><br>Library library = new Library(); // Create an instance of Library<br><br>// Add books to the library<br> library.addBook(new Book("1984", "George Orwell"));<br>library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));<br><br>// Display all books<br> library.displayBooks();<br>}<br>}<br>
</pre> |

## Organizing source files in directories

| Description | Directory Structure |
|--------|--------|
| As your project grows, organizing your source files into directories can keep  your code manageable. The following example illustrates typical Java organizaton. | <pre> MyProject/<br>└── src/     # Source code goes here<br>└── lib/     # External libraries/JARs<br>└── resources/     # Configuration files, images, and others <br>└── doc/     # Documentation<br>└── test/    # Test files<br>
</pre>  |

## Using imports

| Description | Code Example |
|--------|--------|
|When you need to use classes from other packages, you need to import them at the top of your source file. These examples illustrate two examples of importing classes.|<pre>import java.util.List;</pre><pre>import java.util.ArrayList; // Importing classes from Java's standard library </pre|>|

::page{title="Exploring Data Types in Java"}

## Primitive data types
| Description | Code Example |
|--------|--------|
|Use the `byte` data type when you need to save memory in large arrays where the memory savings are critical, and the values are between -128 and 127.| <pre>byte age = 25; // Age of a person </pre> |
|Use the `short` small integers data type for numbers from −32,768 to 32,767.  |<pre>short temperature = -5; // Temperature in degrees </pre> |
|Use the `int` integer data type to store whole numbers larger than what byte and short can hold. This is the most commonly used integer type.   |<pre>int population = 1000000; // Population of a city </pre>   |
|Use the `long` data type when you need to store very large integer values that exceed the range of `int`. |<pre>long distanceToMoon = 384400000L; // Distance in meters </pre>  |
|Use the `float` when you need to store decimal numbers but do not require high precision (for example, up to 7 decimal places). |<pre>float price = 19.99f; // Price of a product </pre> |
|Use the `double` data type when you need to store decimal numbers and require high precision (up to 15 decimal places). |<pre> double pi = 3.141592653589793; // Value of Pi </pre>|
|Use the `char` data type when you need to store a single character such as a single letter or an initial. |<pre> char initial = 'A'; // Initial of a person's name </pre>|
|Use `boolean` when you need to represent a true/false value. Boolean is often used for conditions and decisions. |<pre>boolean isLoggedIn = true; // User login status </pre> |

## Reference data types
| Description | Code Example |
|--------|--------|
|A `string` data type is a sequence of characters. The `string` data type  is very useful for handling text in your programs.|<pre>String greeting = "Hello, World!"; </pre>|
|An `array` is a collection of multiple values stored under a single variable name. All the values in an array must be of the same type. Arrays are great for storing lists of items, like student scores or names. The following code defines an integer array type of scores that include 85, 90, 78, and 92.|<pre>int[] scores = {85, 90, 78, 92};</pre> |
|The reference data type `class` is like a blueprint for creating objects. You can see the class identified in the first line of code. |<pre>class Car { <br> String color; <br> int year; <br> void displayInfo() {<br> System.out.println("Color: " + color + ", Year: " + year); <br> }  <br>}  </pre> |
|Objects are classes that contain both data and functions. In this code, `Car myCar = new Car();` is the object. |<pre>public class Main { <br> public static void main(String[] args) { <br>    Car myCar = new Car();<br>     myCar.color = "Red";<br>     myCar.year = 2026;<br>     myCar.displayInfo(); // Output: Color: Red, Year: 2026<br>   }<br>}</pre>|
|When you create an interface, you only declare the methods without providing their actual code. All methods in an interface are empty by default. Here&#39;s an example of an interface called MyInterfaceClass with three methods. |<pre>// The interface class <br>interface MyInterfaceClass {<br>     void methodExampleOne();<br>     void methodExampleTwo();</br>     void methodExampleThree();<br>}</pre>
|An `enum` is a special data type that defines a list of named values. An enum is useful for representing fixed sets of options, such as days of the week or colors. |<pre>enum DaysOfWeek {<br>MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;<br>}</pre> |


::page{title="Introduction to Operators in Java"}

## Arithemtic operators
The following operators perform basic mathematical functions.
In these code examples `int a = 10;` and `int b = 5;`

| Description | Example |
|--------|--------|
|The plus symbol `+` performs addition operations. | <pre>System.out.println("Addition: " + (a + b));         // 15</pre>|
|The minus symbol `-` performs subtraction operations. | <pre>System.out.println("Subtraction: " + (a - b));      // 5</pre>|
|The asterisk symbol `*` performs multiplication operations. | <pre>System.out.println("Multiplication: " + (a * b));   // 50</pre>|
|The division symbol `/` performs division operations. |<pre>System.out.println("Division: " + (a / b));          // 2</pre>|
|The percentage symbol `%` performs modulus (percentage) operations.|<pre>ystem.out.println("Modulus: " + (a % b));           // 0</pre>|

## Relational operators
You use relational operators to compare two values. These operators return a boolean result (true or false).

In the following examples `int a = 10;` and `int b = 5;`.

| Description | Example |
|--------|--------|
|The double equal symbols `==` check for equality. | <pre>System.out.println("Is a equal to b? " + (a == b));      // false</pre>|
|The exclamation point and equal symbol together `!=` check for a not equal result. | <pre>System.out.println("Is a not equal to b? " + (a != b));  // true </pre>|
|The greater than symbol `>` checks for the greater than result. | <pre>System.out.println("Is a greater than b? " + (a > b));   // true 0</pre>|
|The less than symbol `<` checks if the result for a less than state. |<pre>System.out.println("Is a less than  b? " + (a < b)); // false</pre>|
|The greater than equal symbols `>= ` compares the values to check for a greater than or equal to result.|<pre>System.out.println("Is a greater than or equal to b? " + (a >= b)); // true </pre>|
|The less than equal symbols `<= ` compares the values to check for a less than or equal to result.|<pre>System.out.println("Is a less than or equal to b? " + (a <= b)); // false</pre>|

## Logical operators
You can use logical operators to combine boolean expressions. The following code examples use ` boolean x = true; ` and  ` boolean y = false; `.

| Description | Example |
|--------|--------|
|The double ampersands ` && ` combines two boolean expressions (both must be true). | <pre>if (a > b && b < c) { ... }  </pre>|
|The double vertical bar symbols <code>&#124;&#124;</code> used with boolean values always evaluates both expressions, even if the first one is true. | <pre>if (a > b &#124;&#124; b < c) { ... }</pre>|
|The single exclamation point symbol ` ! ` operator in Java is the logical NOT operator. This operator  is used to negate a boolean expression, meaning it reverses the truth value. | <pre>if (!(a > b)) { ... } </pre>|


::page{title="Using Advanced Operators in Java"}


## Assignment operators
You can use assignment operators to assign values to a variable.

| Description | Example |
|--------|--------|
|The single equal symbol `=` assigns the right operand to left | <pre>a = 10 </pre>|
|The plus sign and equal symbols combined `+=` adds and assigns values to variables | <pre>a += 5</pre>|
|The minus sign and equal symbols combined `-=` subtracts values to variables | <pre>a -= 2</pre>|
|The asterisk sign and equal symbols combined `*=` multipies and assigns values to variables | <pre>a *= 3</pre>|
|The forward slash sign and equal symbols combined `/=` divides and assigns values to variables | <pre>a /= 2</pre>|
|The percentage and equal symbols combined `%=` take the modulus (percentage) and assigns values to the variables | <pre>a %= 4</pre>|



## Unary operators
A unary operation is a mathematical or programming operation that uses only one operand or input. Developers use unary operations to manipulate data and perform calculations. You would use the following assignment operators to assign values to variables.

| Description | Example |
|--------|--------|
|Use the plus symbol to indicate a positive value. |<pre>int positive = +a; </pre> <br> <pre>int a = 10; <br>System.out.println("Unary plus: " + (+a));   // 10 </pre> |
|

## Ternary operators
Ternary operators are a shorthand form of the conditional statement. They can use three operands.

| Description | Example |
|--------|--------|
|Ternary operators uses the Syntax: condition ? expression1 : expression2;. In the following code, `int max = (a > b) ? a : b;` |<pre>int a = 10;<br>int b = 20;<br>int max = (a > b) ? a : b; // If a is greater than b, assign a; otherwise assign b<br>System.out.println("Maximum value is: " + max); // 20 </pre>

::page{title="Working with Arrays"}

## Declaring an array

| Description | Example |
|--------|--------|
| To declare an array in Java, you use the following syntax: `dataType[] arrayName;`. The following doce displays the data type of int and creates an array named `numbers`.| <pre>int[] numbers;</pre> |

## Initializing an array

After you declare an array, you need to initialize the array to allocate memory for it.

| Description | Example |
|--------|--------|
|These code samples display three methods used to create an array of 5 integers. You can initialize an array using the `new` keyword. You can also declare and initialize an array in a single line. Alternatively, you can create an array and directly assign values using curly braces.| <pre>numbers = new int[5]; </pre><br><pre>int[] numbers = new int[5];</pre><br><pre>int[] numbers = {1, 2, 3, 4, 5};</pre> |


## Accessing an array
You can access individual elements in an array by specifying the index inside square brackets.

| Description | Example |
|--------|--------|
|Remember that indices start at zero. Here are two examples:  | <pre>System.out.println(numbers[0]);System.out.println(numbers[0]); // Outputs: 1</pre> <pre>System.out.println(numbers[4]); // Outputs: 5</pre> |

##  Modifying array elements

| Description | Example |
|--------|--------|
|Modify the array element value by accessing it within its index.|<pre>numbers[2] = 10; // Changing the third element to 10</pre><br> <pre>System.out.println(numbers[2]);>System.out.println(numbers[2]); // Outputs: 10</pre> |

## Verify the array length

| Description | Example |
|--------|--------|
|Verify the array length by using the length property. |<pre>System.out.println("The length of the array is: " + numbers.length);</pre>|


## Using a for loop to iterate through an array

| Description | Example |
|--------|--------|
|You can use a `for` loop for to iterarate through and array. Here\'s an example that prints all elements in the numbers array.  The `for` loop includes this code `for (int i = 0` in the following code snippet.|<pre>for (int i = 0; i < numbers.length; i++) {<br>      System.out.println(numbers[i]);<br>}</pre>

## Using a for each loop to iterate through an array

| Description | Example |
|--------|--------|
| You can also use the enhanced `for` loop, known as the \"for-each\" loop. The enhanced `for each` loop code include this portion, `for (int ` of the following code snippet.|<pre> for (int number : numbers) {<br>     System.out.println(number);<br>}</pre> |


## Declare and intialize a multidimensional array

Java supports multi-dimensional arrays, which are essentially arrays of arrays. The most common type is the two-dimensional array.

| Description | Example |
|--------|--------|
| Here&#39;s how to declare and initialize a 2D array. You will declare the integer data type and create the matrix array. | <pre> int[][] matrix = {<br>     {1,{1, 2, 3},<br>     {4, 5, 6},<br>    {7, 8, 9}<br>}; </pre>|
| You can access elements in a two-dimensional array by specifying both indices, which are shown in this code inside of the square brackets. |<pre>System.out.println(matrix[0][1]); // Outputs: 2</pre>

Iterating Through a 2D Array

| Description | Example |
|--------|--------|
|You can use nested loops to iterate through all elements of a 2D array.|<pre>for (int i = 0; i < matrix.length; i++) {<br>     for (int j = 0; j <    matrix[i].length; j++) {<br>         System.out.print(matrix[i][j]>System.out.print(matrix[i][j] + " ");<br>} <br>     System.out.println(); // Move to the next line after each row</pre>|  

::page{title="Using Conditional Statements"}

## if statement
The `if` statement checks a condition. If the condition is `true`, it executes the code inside the block. If the condition is `false`, the program skips the `if` block.

| Description | Example |  
|--------|--------|  
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main {</pre> |  
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. | <pre>public static void main(String[] args) {</pre> |  
| A variable `number` of type `int` is declared and initialized with the value `10`. | <pre>int number = 10;</pre> |  
| The `if` statement checks if `number` is greater than `5`. If `true`, it prints \"The number is greater than 5.\" | <pre>if (number > 5) {<br>    System.out.println("The number is greater than 5.");<br>}</pre> |  
| Closing curly braces to end the `main` method and class definition. | <pre>    }<br>}</pre> |  

**Explanation:** Since `number` is `10`, which is greater than `5`, the condition evaluates to `true`, and the program prints `"The number is greater than 5."`.

---

## if-else statement
The `if-else` statement gives an alternative if the condition is `false`.

| Description | Example |  
|--------|--------|  
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main {</pre> |  
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. | <pre>public static void main(String[] args) {</pre> |  
| A variable `number` of type `int` is declared and initialized with the value `3`. | <pre>int number = 3;</pre> |  
| The `if` statement checks if `number` is greater than `5`. If `true`, it prints \"The number is greater than 5.\". | <pre>if (number > 5) {<br>    System.out.println("The number is greater than 5.");<br>}</pre> |  
| The `else` block executes when the `if` condition is `false`, printing \"The number is not greater than 5.\". | <pre>else {<br>    System.out.println("The number is not greater than 5.");<br>}</pre> |  
| Closing curly braces to end the `main` method and class definition. | <pre>    }<br>}</pre> |  

---

## else if statement
You can check multiple conditions using `else if`.

| Description | Example |  
|--------|--------|  
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main {</pre> |  
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. | <pre>public static void main(String[] args) {</pre> |  
| A variable `number` of type `int` is declared and initialized with the value `5`. | <pre>int number = 5;</pre> |  
| The `if` statement checks if `number` is greater than `5`. If `true`, it prints \"The number is greater than 5.\". | <pre>if (number > 5) {<br>    System.out.println("The number is greater than 5.");<br>}</pre> |  
| The `else if` statement checks if `number` is exactly `5`. If `true`, it prints \"The number is equal to 5.\". | <pre>else if (number == 5) {<br>    System.out.println("The number is equal to 5.");<br>}</pre> |  
| The `else` block executes when none of the above conditions are met, printing \"The number is less than 5.\". | <pre>else {<br>    System.out.println("The number is less than 5.");<br>}</pre> |  
| Closing curly braces to end the `main` method and class definition. | <pre>    }<br>}</pre> |  

**Explanation:** Since `number` is exactly `5`, the program prints `"The number is equal to 5."`.

---

## switch statement
A `switch` statement checks a single variable against multiple values.

| Description | Example |  
|--------|--------|  
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main {</pre> |  
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. | <pre>public static void main(String[] args) {</pre> |  
| A variable `day` of type `int` is declared and initialized with the value `3`. | <pre>int day = 3;</pre> |  
| The `switch` statement checks the value of `day` and compares it against the `case` labels. If `day` is `3`, it prints `"Wednesday"`. | <pre>switch (day) {<br>    case 1: <br>        System.out.println("Monday");<br>        break;<br>    case 2: <br>        System.out.println("Tuesday");<br>        break;<br>    case 3: <br>        System.out.println("Wednesday");<br>        break;<br>    case 4: <br>        System.out.println("Thursday");<br>        break;<br>    case 5: <br>        System.out.println("Friday");<br>        break;<br>    default: <br>        System.out.println("Weekend");<br>}</pre> |  
| Closing curly braces to end the `main` method and class definition. | <pre>    }<br>}</pre> |  
---

## default case in a switch statement
When using a `switch` statement, it\'s a good practice to specify  a `default` case. This case runs if none of the specified cases match, acting as a fallback option.

| Description | Example |  
|--------|--------|  
| A `switch` statement checks the value of a variable `color`. | <pre>switch (color) {</pre> |  
| A `case` checks if `color` is `"red"`, printing `"Color is red."`. | <pre>    case "red":<br>        System.out.println("Color is red.");<br>        break;</pre> |  
| A `case` checks if `color` is `"blue"`, printing `"Color is blue."`. | <pre>    case "blue":<br>        System.out.println("Color is blue.");<br>        break;</pre> |  
| The `default` case prints `"Unknown color."` if `color` doesn\'t match `"red"` or `"blue"`. | <pre>    default:<br>        System.out.println("Unknown color.");<br>}</pre> |  

---

## Nested Conditional Statements
You can place conditional statements within each other to create more complex decisions. The process of placing conditional statements within other conditional statements is called nesting.

| Description | Example |  
|--------|--------|  
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main {</pre> |  
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. | <pre>public static void main(String[] args) {</pre> |  
| A variable `age` of type `int` is declared and initialized with the value `20`. | <pre>int age = 20;</pre> |  
| The `if` statement checks if `age` is greater than or equal to `18`. If `true`, it prints `"You are an adult."`. | <pre>if (age >= 18) {<br>    System.out.println("You are an adult.");<br>}</pre> |  
| Another `if` statement checks if `age` is greater than or equal to `65`, printing `"You are a senior citizen."` if true. | <pre>if (age >= 65) {<br>    System.out.println("You are a senior citizen.");<br>}</pre> |  
| The `else` block executes if `age` is less than `18`, printing `"You are a minor."`. | <pre>else {<br>    System.out.println("You are a minor.");<br>}</pre> |  
| Closing curly braces to end the `main` method and class definition. | <pre>    }<br>}</pre> |  

::page{title="Introduction to Loops in Java"}

## for Loop
The for loop is used when the number of iterations is known beforehand. It consists of three parts:
- Initialization: This sets a counter variable.
- Condition: This checks if the loop should continue executing.
- Increment/Decrement: This updates the counter variable after each iteration.

| Description | Example |  
|-------------|---------|  
| A Java class named `ForLoopExample` with a `main` method. The `main` method is the entry point of the program. | <pre>public class ForLoopExample {</pre> |  
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. | <pre>public static void main(String[] args) {</pre> |  
| A for loop is initialized with `int i = 1`, which starts the counter at 1. The counter variable `i` is incremented by `i++` after each iteration. | <pre>for (int i = 1; i <= 5; i++) {</pre> |  
| The loop checks if `i <= 5`, and if true, it prints the value of `i`. | <pre>System.out.println(i);</pre> |  
| Close the `for` loop. | <pre>        }</pre> |
| Close the `main` method. | <pre>    }</pre> |
| Close the `ForLoopExample` class. | <pre>}</pre> |

## while Loop
The while loop is used when the number of iterations is not known in advance. It continues executing as long as the specified condition remains true.

| Description | Example |  
|-------------|---------|  
| A Java class named `WhileLoopExample` with a `main` method. The `main` method is the entry point of the program. | <pre>public class WhileLoopExample {</pre> |  
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. | <pre>public static void main(String[] args) {</pre> |  
| A variable `i` is initialized to `1`. | <pre>int i = 1;</pre> |  
| The while loop continues as long as `i <= 5`. | <pre>while (i <= 5) {</pre> |  
| Inside the loop, the value of `i` is printed, then incremented by `i++`. | <pre>System.out.println(i);<br>i++;</pre> |  
| The `main` method and class are closed with curly braces. | <pre>}<br>}</pre> |  

## do-while Loop
The do-while loop is similar to the while loop but guarantees that the code block executes at least once before checking the condition.

| Description | Example |  
|-------------|---------|  
| A Java class named `DoWhileLoopExample` with a `main` method. The `main` method is the entry point of the program. | <pre>public class DoWhileLoopExample {</pre> |  
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. | <pre>public static void main(String[] args) {</pre> |  
| A variable `i` is initialized to `1`. | <pre>int i = 1;</pre> |  
| The do-while loop starts and executes at least once before checking if `i <= 5`. | <pre>do {</pre> |  
| Inside the loop, the value of `i` is printed, then incremented by `i++`. | <pre>System.out.println(i);<br>i++;</pre> |  
| The condition `i <= 5` is checked after each iteration. | <pre>} while (i <= 5);</pre> |  
| The `main` method and class are closed with curly braces. | <pre>}<br>}</pre> |  

## Nested loops
You can also use loops inside other loops, known as nested loops. This is useful for working with multi-dimensional data structures, like arrays or matrices.

| Description | Example |  
|-------------|---------|  
| A Java class named `NestedLoopsExample` with a `main` method. The `main` method is the entry point of the program. | <pre>public class NestedLoopsExample {</pre> |  
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. | <pre>public static void main(String[] args) {</pre> |  
| The outer loop controls the rows, running 10 times. | <pre>for (int i = 1; i <= 10; i++) {</pre> |  
| The inner loop controls the columns, also running 10 times for each row. | <pre>for (int j = 1; j <= 10; j++) {</pre> |  
| The product of `i * j` is printed for each combination of rows and columns. | <pre>System.out.print(i * j + "\t");</pre> |  
| After the inner loop, a newline is printed to separate the rows. | <pre>System.out.println();</pre> |  
| The `main` method and class are closed with curly braces. | <pre>}<br>}</pre> |  

## break statement
The break statement is used to terminate a loop immediately, regardless of the loop\'s condition. This can be useful when you want to exit a loop based on a specific condition that may occur during its execution.

| Description | Example |  
|-------------|---------|  
| A Java class named `BreakExample` with a `main` method. The `main` method is the entry point of the program. | <pre>public class BreakExample {</pre> |  
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. | <pre>public static void main(String[] args) {</pre> |  
| An array `numbers` is declared and initialized. | <pre>int[] numbers = {1, 3, 5, 7, 9, 2, 4};</pre> |  
| The loop iterates through the array, checking if any number is greater than 5. | <pre>for (int num : numbers) {</pre> |  
| When a number greater than 5 is found, the loop exits with the `break` statement. | <pre>if (num > 5) {<br>    break;</pre> |  
| The `main` method and class are closed with curly braces. | <pre>}<br>}</pre> |  

## continue statement
The continue statement is used to skip the current iteration of a loop and move to the next iteration. It\'s useful when you want to skip certain conditions but continue executing the rest of the loop.

| Description | Example |  
|-------------|---------|  
| A Java class named `ContinueExample` with a `main` method. The `main` method is the entry point of the program. | <pre>public class ContinueExample {</pre> |  
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. | <pre>public static void main(String[] args) {</pre> |  
| The loop iterates through the numbers from 1 to 10. | <pre>for (int i = 1; i <= 10; i++) {</pre> |  
| When `i == 5`, the `continue` statement is executed, skipping the `System.out.println(i);` statement for that iteration. | <pre>if (i == 5) {<br>    continue;</pre> |  
| The value of `i` is printed for all numbers except 5. | <pre>System.out.println(i);</pre> |  
| The `main` method and class are closed with curly braces. | <pre>}<br>}</pre> |

::page{title="Working with Strings in Java"}

## Creating strings

You can create a string in Java in two main ways:

**Using string literals**: This means writing the string directly inside double quotes.

| Description | Example |  
|-------------|---------|  
| Create a string using string literal. | <pre>String greeting = "Hello, World!";</pre> |  

In this example, we created a string called greeting that contains \"Hello, World!\".

**Using the new Keyword**: This method involves using the new keyword to create a string object.

| Description | Example |  
|-------------|---------|  
| Create a string using the new keyword. | <pre>String message = new String("Hello, World!");</pre> |  

Although this works, it\'s more common to use string literals because it\'s simpler.

---

## String length

To find out how many characters are in a string, you can use the length() method. This method tells you the total number of characters in the string.

| Description | Example |  
|-------------|---------|  
| Create a string and use length() to get the number of characters. | <pre>String text = "Java Programming";</pre> |  
| Use the length() method to find the string length. | <pre>int length = text.length();</pre> |  
| Print the length of the string. | <pre>System.out.println("Length of the string: " + length); // Output: 16</pre> |  

Here, we created a string called text and then checked its length. The output tells us that there are 16 characters in \"Java Programming\".

---

## Accessing characters

If you want to look at individual characters in a string, you can use the charAt() method. This method allows you to get a character at a specific position in the string.

| Description | Example |  
|-------------|---------|  
| Create a string and access a character using charAt(). | <pre>String word = "Java";</pre> |  
| Access the first character of the string. | <pre>char firstChar = word.charAt(0);</pre> |  
| Print the first character of the string. | <pre>System.out.println("First character: " + firstChar); // Output: J</pre> |  

In this example, we accessed the first character of the string \"Java\". Remember that counting starts at 0, so charAt(0) gives us \'J\'.

---

## Concatenating strings

Sometimes you might want to combine two or more strings together. You can do this easily using the + operator or the concat() method.

| Description | Example |  
|-------------|---------|  
| Combine two strings using the + operator. | <pre>String firstName = "John";</pre> |  
| Combine two strings using the + operator. | <pre>String lastName = "Doe";</pre> |  
| Concatenate first and last names using the + operator. | <pre>String fullName = firstName + " " + lastName;</pre> |  
| Print the full name. | <pre>System.out.println("Full Name: " + fullName); // Output: John Doe</pre> |  

Here, we combined firstName and lastName using the + operator and added a space between them.

You can also use the concat() method:

| Description | Example |  
|-------------|---------|  
| Combine strings using the concat() method. | <pre>String anotherFullName = firstName.concat(" ").concat(lastName);</pre> |  
| Print the concatenated string. | <pre>System.out.println("Another Full Name: " + anotherFullName); // Output: John Doe</pre> |  

---

## String comparison

When you want to check if two strings are the same, use the equals() method. This checks if both strings have identical content.

| Description | Example |  
|-------------|---------|  
| Create three strings to compare. | <pre>String str1 = "Hello";</pre> |  
| Create another string to compare. | <pre>String str2 = "Hello";</pre> |  
| Create a third string to compare. | <pre>String str3 = "World";</pre> |  
| Check if str1 is equal to str2. | <pre>boolean isEqual = str1.equals(str2);</pre> |  
| Print comparison result. | <pre>System.out.println("str1 equals str2: " + isEqual); // Output: true</pre> |  
| Check if str1 is equal to str3. | <pre>boolean isNotEqual = str1.equals(str3);</pre> |  
| Print comparison result. | <pre>System.out.println("str1 equals str3: " + isNotEqual); // Output: false</pre> |  

In this example, isEqual returns true because both strings are \"Hello\". However, isNotEqual returns false since \"Hello\" and \"World\" are different.

---

## String immutability

One important thing to know about strings in Java is that they are immutable. This means that once a string is created, it cannot be changed. If you try to change it, you will actually create a new string instead.

| Description | Example |  
|-------------|---------|  
| Create an original string. | <pre>String original = "Hello";</pre> |  
| Add to the string (creates a new string). | <pre>original = original + " World";</pre> |  
| Print the new string. | <pre>System.out.println(original); // Output: Hello World</pre> |  

In this case, we added \"World\" to original, but instead of changing the original string, we created a new string that combines both parts.

---

## Finding substrings

You may want to get a smaller part of a string. You can do this using the substring() method, which allows you to specify where to start and where to stop.

| Description | Example |  
|-------------|---------|  
| Create a string and extract a substring. | <pre>String phrase = "Java Programming";</pre> |  
| Extract a substring from the string. | <pre>String sub = phrase.substring(5, 16);</pre> |  
| Print the extracted substring. | <pre>System.out.println("Substring: " + sub); // Output: Programming</pre> |  

In this example, we started at index 5 and went up to (but did not include) index 16 to extract \"Programming\".

---

## String methods

Java has many built-in methods for strings that help you manipulate and process them. Here are some useful ones:

**toUpperCase()**: This method converts all letters in a string to uppercase.

| Description | Example |  
|-------------|---------|  
| Create a string. | <pre>String text = "hello";</pre> |  
| Convert the string to uppercase. | <pre>System.out.println(text.toUpperCase()); // Output: HELLO</pre> |  

**toLowerCase()**: This converts all letters in a string to lowercase.

| Description | Example |  
|-------------|---------|  
| Create a string. | <pre>String text = "WORLD";</pre> |  
| Convert the string to lowercase. | <pre>System.out.println(text.toLowerCase()); // Output: world</pre> |  

**trim()**: This method removes any extra spaces at the beginning or end of a string.

| Description | Example |  
|-------------|---------|  
| Create a string with extra spaces and trim it. | <pre>String textWithSpaces = "   Hello   ";</pre> |  
| Remove spaces from the string. | <pre>System.out.println(textWithSpaces.trim()); // Output: Hello</pre> |  

**replace()**: If you want to change all instances of one character or substring to another, use this method.

| Description | Example |  
|-------------|---------|  
| Create a sentence and replace a word. | <pre>String sentence = "I like cats.";</pre> |  
| Replace a word in the sentence. | <pre>String newSentence = sentence.replace("cats", "dogs");</pre> |  
| Print the new sentence. | <pre>System.out.println(newSentence); // Output: I like dogs.</pre> |  

---

## Splitting strings

You can break a string into smaller pieces using the split() method. This is useful when you have data separated by commas or spaces.

| Description | Example |  
|-------------|---------|  
| Create a CSV string and split it. | <pre>String csv = "apple,banana,cherry";</pre> |  
| Split the string at each comma. | <pre>String[] fruits = csv.split(",");</pre> |  
| Print each fruit in the array. | <pre>for (String fruit : fruits) {<br>    System.out.println(fruit);<br>}</pre> |  
| Output: | <pre>apple<br>banana<br>cherry</pre> |  


---

## Joining strings

If you have an array of strings and want to combine them back into one single string, you can use the String.join() method.

| Description | Example |  
|-------------|---------|  
| Create an array of strings. | <pre>String[] colors = {"Red", "Green", "Blue"};</pre> |  
| Join the strings with a separator. | <pre>String joinedColors = String.join(", ", colors);</pre> |  
| Print the joined string. | <pre>System.out.println(joinedColors); // Output: Red, Green, Blue</pre> |  

::page{title="Using Packages and Imports"}

## Creating a package

To create a package, you simply declare it at the top of your Java source file using the package keyword followed by the package name. For example:

| Description | Example |  
|-------------|---------|  
| Declare a package at the top of the file. | <pre>package com.example.myapp;</pre> |  

In this example, com.example.myapp is the name of the package. It\'s common practice to use a reverse domain name as the package name to ensure uniqueness.

| Description | Example |  
|-------------|---------|  
| Define a class inside the package. | <pre>public class MyClass {<br>    // Class code here<br>}</pre> |  

---

## Creating and using a package

| Description | Example |  
|-------------|---------|  
| Define a class inside the shapes package. | <pre>package shapes;</pre> |  
| Create the Circle class with a constructor and a method. | <pre>public class Circle {<br>    private double radius;<br><br>    public Circle(double radius) {<br>        this.radius = radius;<br>    }<br><br>    public double area() {<br>        return Math.PI * radius * radius;<br>    }<br>}</pre> |  

To use this class in another Java file, you need to import it.

---

## Importing classes

To import a specific class from a package, use the following syntax:

| Description | Example |  
|-------------|---------|  
| Import a specific class from a package. | <pre>import package_name.ClassName;</pre> | 

## Importing all classes from a package

You can also import all classes from a package using an asterisk (*).

| Description | Example |  
|-------------|---------|  
| Import all classes from the shapes package. | <pre>import shapes.*;</pre> |  

This imports all classes in the shapes package, allowing you to use any class without needing to import them individually.

::page{title="Implementing Functions and Methods"}

## Function structure

| Description | Example |  
|-------------|---------|  
| The structure of a function in Java. | <pre>returnType functionName(parameter1Type parameter1, parameter2Type parameter2) {<br>    // code to be executed<br>    return value; // optional<br>}</pre> |  

---

## Example of a Simple Function

Let\'s create a simple function that adds two numbers:

| Description | Example |  
|-------------|---------|  
| Create a function that adds two numbers. | <pre>public static int add(int a, int b) {<br>    return a + b;<br>}</pre> |  
| Call the add function in the main method and print the result. | <pre>int sum = add(5, 3);<br>System.out.println("The sum is: " + sum);</pre> |  


## Example of a simple method

Let\'s create a method within a class:

| Description | Example |  
|-------------|---------|  
| Define a multiply method inside the Calculator class. | <pre>public class Calculator</pre> |
| The multiply method takes two integers and returns their product. |<pre> public int multiply(int x, int y) {</pre>|
| Close the multiply method.|<pre> }</pre>|
| Define the main method, which is the program\'s entry point.|<pre> public static void main(String[] args) {</pre>|
|Create an instance of the Calculator class in the main method. | <pre> Calculator calc = new Calculator();</pre> |
|Call the multiply method with 4 and 5 and store the result.|<pre> int product = calc.multiply(4, 5)</pre> |
|Print the result to the screen. |<pre> System.out.println("The product is: " + product);</pre> |

---

## Parameters and arguments

Parameters are the inputs to functions or methods, while arguments are the values passed when calling these functions or methods.

| Description | Example |  
|-------------|---------|  
| Define a method with multiple parameters. | <pre>public void greet(String name, int age) {<br>    System.out.println("Hello " + name + ", you are " + age + " years old.");<br>}</pre> |  
| Call the greet method with arguments in the main method. | <pre>Greeting greeting = new Greeting();<br>greeting.greet("Alice", 30);</pre> |  

---

## Return values

Functions and methods can return values or perform actions without returning anything.

| Description | Example |  
|-------------|---------|  
| Define a method that returns a value. | <pre>public double area(double length, double width) {<br>    return length * width;<br>}</pre> |  
| Call the area method and print the returned value. | <pre>Rectangle rect = new Rectangle();<br>double area = rect.area(4.5, 3.0);<br>System.out.println("The area of the rectangle is: " + area);</pre> |  

---

## Overloading methods

Java allows defining multiple methods with the same name but different parameters. This is known as method overloading.

| Description | Example |  
|-------------|---------|
| Define the `Display` class. | <pre>public class Display {</pre> |
| Define an overloaded method that takes an `int`. | <pre>    public void show(int number) {</pre> |
| Print the number. | <pre>        System.out.println("Number: " + number);</pre> |
| Close the first method. | <pre>    }</pre> |
| Define an overloaded method that takes a `String`. | <pre>    public void show(String text) {</pre> |
| Print the text. | <pre>        System.out.println("Text: " + text);</pre> |
| Close the second method. | <pre>    }</pre> |
| Close the `Display` class. | <pre>}</pre> |
| Define the `main` method to call the overloaded methods. | <pre>public static void main(String[] args) {</pre> |
| Create a `Display` object. | <pre>    Display display = new Display();</pre> |
| Call `show(int)` and `show(String)`. | <pre>    display.show(10);<br>    display.show("Hello World");</pre> |
| Close the `main` method. | <pre>}</pre> 

---

## Scope of identifiers

The scope of an identifier refers to the part of the program where the identifier can be accessed.

| Description | Example |  
|-------------|---------|  
| Local Scope: Identifiers are accessible only within the method or block. | <pre>int x = 10; // x is local to this block</pre> |  
| Instance Scope: Variables are accessible by all methods in the class. | <pre>private int x; // x is accessible by all methods</pre> |  
| Static Scope: Static variables belong to the class and are accessible throughout the class. | <pre>private static int count;</pre> |  

---

## Void methods

A void method does not return a value.

| Description | Example |  
|-------------|---------|  
| Define a void method that prints a message. | <pre>public void printMessage() {<br>    System.out.println("Hello, World!");<br>}</pre> |  

---

## Empty parameter lists

An empty parameter list means the method does not take any parameters.

| Description | Example |  
|-------------|---------|  
| Define a method with an empty parameter list. | <pre>public void show() {<br>    System.out.println("No parameters here.");<br>}</pre> |  


::page{title="An Introduction to Exceptions"}

## Basic exception handling

| Description | Example |
|--------|--------|
| Java provides a robust mechanism for handling exceptions using the try, catch, and finally blocks. | <pre>public class ExceptionExample { <br>  public static void main(String[] args) { <br>    int numerator = 10; <br>    int denominator = 0; // This will cause an ArithmeticException <br>    try { <br>      int result = numerator / denominator; // This line may throw an exception <br>      System.out.println("Result: " + result); <br>    } catch (ArithmeticException e) { <br>      System.out.println("Error: Cannot divide by zero."); <br>  } finally { <br>      System.out.println("This block executes regardless of an exception."); <br>   } <br>  } <br>} </pre> 

## Creating custom exceptions

| Description | Example |
|--------|--------|
| Sometimes, you may want to create your own exception types. You can do this by extending the Exception class. | <pre>class MyCustomException extends Exception {  <br>  public MyCustomException(String message) {  <br>    super(message); // Pass the message to the parent Exception class  <br>  } <br>} <br>public class CustomExceptionExample {  <br>   public static void main(String[] args) {  <br> try {  <br>   throw new MyCustomException("This is a custom exception message.");  <br> } catch (MyCustomException e) {  <br>   System.out.println(e.getMessage());  <br>   } <br>  } <br>} </pre> 

::page{title="Using Finally Block"}

## The structure of exception-handling


| Description | Example |
|--------|--------|
| One important feature of Java is its exception handling mechanism, which includes the try, catch, and finally blocks. | <pre>try { <br>   // Code that may throw an exception  <br>} catch (ExceptionType e) {  <br>   // Code to handle the exception  <br>} finally {  <br>   // Code that will always execute <br>} </pre> 


## Understanding the finally block

| Description | Example |
|--------|--------|
| The code within the finally block always runs after the try and catch blocks, regardless of whether an exception was thrown or caught. It is commonly used for resource management. | <pre>public class FinallyExample {  <br>  public static void main(String[] args) {   <br>    try {  <br>      System.out.println("In try block");  <br>    } catch (ArithmeticException e) {   <br>      int result = 10 / 0; // This line will throw an exception   <br>   } catch (ArithmeticException e) {  <br>      System.out.println("Caught an exception: " + e.getMessage());   <br>   } finally {   <br> System.out.println("Finally block executed");    <br>   } <br>  } <br>} </pre>

## Correct usage of the finally block

| Description | Example |
|--------|--------|
|   Always executing cleanup code: The primary purpose of the finally block is to ensure that the cleanup code runs regardless of whether an exception was thrown or not.| <pre>public class CorrectFinallyUsage {   <br>  public static void main(String[] args) {   <br>    FileReader file = null;   <br>    try {  <br>      file = new FileReader("example.txt"); <br>      // Code to read from the file   <br>    } catch (IOException e) {  <br>    System.out.println("Error reading file: " + e.getMessage());    <br>   } finally {   <br>       try {   <br>         if (file != null) { <br>           file.close(); <br>     System.out.println("File closed successfully."); <br>         } <br>     } catch (IOException e) { <br>          System.out.println("Error closing file: " + e.getMessage()); <br>   } <br>  } <br>} </pre>
|  Releasing database connections: Using the finally block to close database connections is another correct practice.| <pre>import java.sql.Connection;   <br>import java.sql.DriverManager;  <br>import java.sql.SQLException; <br>public class DatabaseConnectionCorrectUsage {  <br>  public static void main(String[] args) { <br>     Connection connection = null;    <br>     try {   <br>       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");   <br>       // Perform database operations    <br>     } catch (SQLException e) {  <br>           System.out.println("Database error: " + e.getMessage());  <br>     } finally {  <br>   try {        <br>     if (connection != null) {  <br>          connection.close();  <br>          System.out.println("Database connection closed.");  <br>      } <br>   } catch (SQLException e) { <br>      System.out.println("Error closing connection: " + e.getMessage()); <br>   } <br>  } <br>}  </pre>

## Incorrect usage of the finally block

| Description | Example |
|--------|--------|
|   Not handling exceptions in finally: If an exception occurs in the finally block, it may suppress exceptions thrown in the try or catch blocks. | <pre>public class IncorrectFinallyUsage {    <br>  public static void main(String[] args) {    <br>       try {  <br>          int result = 10 / 0; // This will throw an exception  <br>       } catch (ArithmeticException e) {   <br>          System.out.println("Caught an exception: " + e.getMessage());   <br>       } finally {    <br>         int x = 10 / 0; // This will throw another exception    <br>         System.out.println("Finally block executed");   <br>    } <br>  } <br>} </pre>
|  Using return statements in finally: This can lead to unexpected behavior, as it overrides any return statements from the try or catch blocks.| <pre>public class ReturnInFinally {    <br>  public static void main(String[] args) {  <br>      System.out.println(testMethod());  <br>  } <br>  public static int testMethod() {  <br>     try {     <br>       return 1; // Return from try block   <br>     } catch (Exception e) {   <br>       return 2; // Return from catch block    <br>     } finally {   <br>       return 3; // This will override previous returns   <br>    } <br>  } <br>}  </pre>
|  Assuming finally will not execute: This is incorrect; the finally block will always execute unless the program crashes or is forcibly terminated.| <pre>public class FinallyAlwaysExecutes {    <br>  public static void main(String[] args) {   <br>      try {  <br>         System.out.println("Trying risky operation...");  <br>         int result = 10 / 0; // Throws ArithmeticException  <br>      } catch (ArithmeticException e) {    <br>         System.out.println("Caught an ArithmeticException.");   <br>         // Not exiting or terminating the program here    <br>      }    <br>     // Assuming finally won't execute (this is wrong) <br>   }    <br>   // The finally block should be here to ensure it executes.   <br>}  </pre>

::page{title="Using Multiple Try Catch"}

## Basic try-catch structure


| Description | Example |
|--------|--------|
| Multiple try-catch blocks allow developers to handle different types of exceptions in a structured way. In Java, the basic structure of a try-catch block looks like this. | <pre>try {  <br>   // Code that may throw an exception   <br>} catch (ExceptionType e) {   <br>   // Code to handle the exception   <br>} </pre> 

## Multiple try-catch

| Description | Example |
|--------|--------|
| Multiple try-catch refers to the use of more than one catch block within a single try statement or multiple try-catch statements in the code.| <pre>public class MultipleCatchExample { <br>  public static void main(String[] args) {    <br>    int[] numbers = {1, 2, 3};    <br>    int index = 5; // Invalid index    <br>    try { <br>      // Trying to access an invalid index    <br>    System.out.println("Number: " + numbers[index]);  <br>    // Trying to divide by zero     <br>   int result = 10 / 0;    <br>       } catch (ArrayIndexOutOfBoundsException e) {  <br>           System.out.println("Error: Index out of bounds."); <br>       } catch (ArithmeticException e) { <br>           System.out.println("Error: Division by zero.");  <br>    } <br>  } <br>} </pre>

## Throws keyword

| Description | Example |
|--------|--------|
| The throws keyword is used in method declarations to indicate that a method can throw one or more exceptions. | <pre>public class ThrowsExample {  <br>  public static void main(String[] args) {     <br>    try {     <br>      readFile("nonexistentfile.txt");    <br>    } catch (IOException e) {   <br>      System.out.println("Error: " + e.getMessage());     <br>    }     <br>  }  <br>  // Method that declares an exception  <br>  static void readFile(String fileName) throws IOException {  <br>    FileReader file = new FileReader(fileName);  <br>    BufferedReader fileInput = new BufferedReader(file);  <br>    // Reading the file <br>    System.out.println(fileInput.readLine()); <br>    fileInput.close();  <br>  } <br>} </pre></pre>

::page{title="Checked and Runtime Exceptions Compared"}

## Checked exceptions
| Description | Example |
|--------|--------|
| Checked exceptions are exceptions checked at compile time. They usually represent recoverable conditions, such as file not found or network issues.| <pre>import java.io.File;  <br>import java.io.FileNotFoundException;     <br>import java.util.Scanner; <br>public class CheckedExceptionExample {    <br>   public static void main(String[] args) { <br>      try {   <br>         File myFile = new File("nonexistentfile.txt"); <br>         Scanner myReader = new Scanner(myFile);      <br>         while (myReader.hasNextLine()) {     <br>            String data = myReader.nextLine();  <br>            System.out.println(data);  <br>         }  <br>         myReader.close();   <br>   } catch (FileNotFoundException e) {  <br>         System.out.println("An error occurred: " + e.getMessage());  <br>    } <br>  } <br>} </pre> </pre>

## Runtime exceptions
| Description | Example |
|--------|--------|
| Runtime exceptions do not need to be explicitly caught or declared. They usually indicate programming errors, such as logic errors or improper use of APIs.| <pre>public class RuntimeExceptionExample {   <br>  public static void main(String[] args) {    <br>    int numerator = 10; <br>    int denominator = 0;    <br>    try {  <br>      int result = numerator / denominator; // This will cause an ArithmeticException    <br>      System.out.println("Result: " + result);  <br>    } catch (ArithmeticException e) {      <br>         System.out.println("An error occurred: Cannot divide by zero.");  <br>    } <br>  } <br>} </pre> </pre></pre> |


## Summary

In addition to viewing this resource here, you can select the printer icon located at the top of the screen to print this information or save this information to a PDF file, based on your computer\'s capabilities.  Also, return to the course itself to  access the PDF file within the course for direct downloading.



## Author(s)

[Ramanujam Srinivasan](https://www.linkedin.com/in/ramanujamrs/)
[Lavanya Thiruvali Sunderarajan](https://www.linkedin.com/in/lavanya-sunderarajan-199a445/)

<br>
<br>

![SN IBM Footer](https://cf-courses-data.s3.us.cloud-object-storage.appdomain.cloud/jrorbnz20h5VzD06sTlolg/ibmsn-footer-blue.png "SN IBM Footer")


<!-- ## Changelog
| Date | Version | Changed by | Change Description |
|------|--------|--------|---------|
| 2025-04-09 | 0.1 | P. Kravitz| Initial version created |
| 2025-04-10 | 0.2 | Leah Hanson | QA reviewed |
| 2025-04-11 | 0.3 | P. Kravitz| Post UXQA change to remove the linked TOC and replace it with a bullet list of videos covered in the reading. The ToC was opening a new lab with each instance. We can troubleshoot this for future enhancement but we need to publish.|
|   |   |   |   |
