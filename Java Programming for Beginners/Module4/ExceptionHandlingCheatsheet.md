# Coding Cheat Sheet: Robust Exception Handling

This reading provides a reference list of code that you&#39;ll encounter as you learn exception handling, a critical part of the Java Collections framework. You will learn to handle errors using try-catch blocks, implement custom exceptions, and run code regardless of exceptions using blocks. Understanding these concepts will help you write and debug your first Java programs. Let\'s explore the following Java coding concepts:


- An Introduction to Exceptions
- Using Finally Block
- Using Multiple Try Catch
- Checked and Runtime Exceptions Compared

Keep this summary reading available as a reference as you progress through your course, and refer to this reading as you begin coding with Java after this course!



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
| Runtime exceptions do not need to be explicitly caught or declared. They usually indicate programming errors, such as logic errors or improper use of APIs.| <pre>public class RuntimeExceptionExample {   <br>  public static void main(String[] args) {    <br>    int numerator = 10; <br>    int denominator = 0;    <br>    try {  <br>      int result = numerator / denominator; // This will cause an ArithmeticException    <br>      System.out.println("Result: " + result);  <br>    } catch (ArithmeticException e) {      <br>         System.out.println("An error occurred: Cannot divide by zero.");  <br>    } <br>  } <br>} </pre> </pre></pre>

## Author(s)
Deepti Adukia
Ramanujam Srinivasan

### Other Contributors
Patsy Kravitz


![SN IBM Footer](https://cf-courses-data.s3.us.cloud-object-storage.appdomain.cloud/jrorbnz20h5VzD06sTlolg/ibmsn-footer-blue.png "SN IBM Footer")

<p>
<p>
<p>

<!--
## Changelog
| Date | Version | Changed by | Change Description |
|------|--------|--------|---------|
| 2025-02-15 | 0.1 | P.Kravitz  | Template created |
| 2025-02-19 | 0.2 | Deepti Adukia | Code Summary created |
| 2025-02-19 | 0.3 | Leah Hanson | QA reviewed |
| 2025-02-19 | 0.4 |P. Kravitz | ID review for structure.  |
| 2025-04-02 | 0.5 |P. Kravitz | ID review for title and correct footer. Both updated.  |
--->

