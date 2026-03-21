# Coding Cheat Sheet: Building Blocks of Java Programming

 <!--This code summary is for module 2-->
This reading provides a reference list of code that you&#39;ll encounter as you begin to learn and use Java. Understanding these concepts will help you write and debug your first Java programs. Let&#39;s explore the following Java coding concepts:

- Structuring Java Code and Comments
- Exploring Data Types in Java
- Introduction to Operators in Java
- Using Advanced Operators in Java
- Working with arrays

Keep this summary reading available as a reference as you progress through your course and refer to this reading as you begin coding with Java after this course!


## Types of comments

| Description | Code Example |
|--------|--------|
| A Java statement used to print text or other data to the standard output, typically the console. | <pre>System.out.println("Hello, World!")</pre> |
| Use two forward slashes to precede a single line comment in Java | <pre>// This is a single-line comment.</pre> | 
| All text after the  two forward slash marks on this line is treated as a comment|  <pre>int number = 10; // This variable stores the number 10 </pre>   |
|These comments start with `/*` and end with `*/`. They can span multiple lines.|<pre>/* This is a multi-line comment It can be used to explain a block of code or provide detailed information </pre> 
|This also is a multiline comment.  Multiline comments start with `/*` and end with `*/`. They can span multiple lines. | <pre>/* int sum = 0;<br>   This variable will hold the sum of numbers */. </pre>
| The documentation comments start with `/*` and ends with `*/` . These comments are used for generating documentation using tools like Javadoc. | <pre>/**<br> *This method calculates the square of a number.  <br> *@param number The number to be squared  <br> *@return The square of the input number  <br> */ <br>public int square(int number) { <br> return number * number; <br> } </pre> |

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
| In Java, a class is a blueprint for creating objects and can contain methods (functions) that define behaviors. For instance, the second line of this code displays the public class `library`, with methods like calculatePrice() or applyDiscount(). | <pre> package com.example.library;  <br> public class Library  <br>{<br>private List <Book> books; // Private attribute to hold books  <br> public Library()  <br>{<br>books = new ArrayList<>(); // Initialize the list in the constructor <br> } <br>public void addBook(Book book) {<br>books.add(book); // Method to add a book to the library <br>} <br> } <br>|


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
|Objects are classes that contain both data and functions. In this code `Car myCar = new Car();` is the object. |<pre>public class Main { <br> public static void main(String[] args) { <br>    Car myCar = new Car();<br>     myCar.color = "Red";<br>     myCar.year = 2026;<br>     myCar.displayInfo(); // Output: Color: Red, Year: 2026<br>   }<br>}</pre>|
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
|The double vertical bar symbols <code>&#124;&#124;</code> used with boolean values do not evaluate the second expression if the first one is true; referred as short-circuit evaluation. | <pre>if (a > b &#124;&#124; b < c) { ... }</pre>|
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
|Verify the array length by using the length property |<pre>System.out.println("The length of the array is: " + numbers.length);</pre>|


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
| Here&#39;s how to declare and initialize a 2D array. You will declare the integer data type and create the matrix array. | <pre> int[][] matrix = {<br>     {1, 2, 3},<br>     {4, 5, 6},<br>    {7, 8, 9}<br>}; </pre>|
| You can access elements in a two-dimensional array by specifying both indices, which are shown in this code inside of the square brackets. |<pre>System.out.println(matrix[0][1]); // Outputs: 2</pre>

Iterating Through a 2D Array

| Description | Example |
|--------|--------|
|You can use nested loops to iterate through all elements of a 2D array|<pre>for (int i = 0; i < matrix.length; i++) {<br>     for (int j = 0; j <    matrix[i].length; j++) {<br>         System.out.print(matrix[i][j]>System.out.print(matrix[i][j] + " ");<br>} <br>     System.out.println(); // Move to the next line after each row</pre>|


## Author(s)
Ramanujam Srinivasan
Lavanya Thiruvali Sunderarajan


![SN IBM Footer](https://cf-courses-data.s3.us.cloud-object-storage.appdomain.cloud/jrorbnz20h5VzD06sTlolg/ibmsn-footer-blue.png "SN IBM Footer")

<p>
<p>
<p>


<!-- ## Changelog
| Date | Version | Changed by | Change Description |
|------|--------|--------|---------|
| 2025-02-14 | 0.1 | P.Kravitz  | Template created |
| 2025-02-17 | 0.1 | P.Kravitz  | Content completed |
| 2025-02-18 | 0.2 | Mercedes Schneider | QA pass with edits  |
| 2025-02-18 | 0.3 | P.Kravitz| Line edits 63 and 84. |
| 2025-02-24 | 0.4 | P.Kravitz|  Remove copyright add footer using instructional template |
| 2025-02-24 | 0.4 | P.Kravitz| To fix the table layout, I removed extra space before the back tik in the first data row of the Logical operators table. Other extra spaces were also removed. |
| 2025-09-15 | 0.5 | Sameep Punjani| Fixed the typos in single and multiline comments and java class method |
| 2025-10-27 | 0.6 | Sameep Punjani| Fixed the instruction for logical operators |
| 2026-02-02 | 0.7 | Rajashree Patil | Fixed the syntax error in Declare and intialize a multidimensional array  |
-->