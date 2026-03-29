# Coding Cheat Sheet

<!-- Reviewer: IMPORTANT! This file is a reading using the instructional lab environment so the learner can have a table of contents to locate code snippets based on the corresponding video. This reading does not include an estimated time. In this first paragraph, please update the first sentence to reflect the description of the course and not necessarily the exact course name (for content reuse across platforms.) -->

This reading provides a reference list of code that you\'ll encounter as you work with object-oriented coding in Java. Understanding these concepts will help you write and debug your first Java programs. Let\'s explore the following Java coding concepts:

- Java File Handling / Working with File Input and Output Streams
- Using Java Byte Streams
- Managing Directories in Java

Keep this summary reading available as a reference as you progress through your course, and refer to this reading as you begin coding with Java after this course!


## Using the File class

| Description | Example |
|--------|--------|
| Import the `File` class, which provides methods for file and directory operations. | <pre>import java.io.File;</pre> |
| Define a class `FileExample` that contains the Java `main` method. Create a `File` object representing a file named example.txt. This does not create the actual file, just a reference to it. Call the `exists()` method on the `File` object to check whether the file physically exists in the specified location. If the file exists, prints \"File exists.\", otherwise print \"File does not exist.\". | <pre>public class FileExample {<br>    public static void main(String[] args) {<br>        File myFile = new File("example.txt");<br><br>        // Check if the file exists<br>        if (myFile.exists()) {<br>            System.out.println("File exists.");<br>        } else {<br>            System.out.println("File does not exist.");<br>        }<br></pre> |
| Close curly braces to end the `FileExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates how to check whether a file exists in the filesystem using the `File` class from the java.io package.

## Writing to Files

| Description | Example |
|--------|--------|
| Import the `FileWriter` class for writing character data to a file, the `BufferedWriter` class that wraps `FileWriter` to provide efficient writing operations, and the `IOException` class to handle input/output exceptions. | <pre>import java.io.BufferedWriter;<br>import java.io.FileWriter;<br>import java.io.IOException;</pre> |
| Define a class `WriteToFile` that contains the Java `main` method. Create a `FileWriter` class to write to the file \"output.txt\". A `BufferedWriter` is wrapped around `FileWriter` for more efficient writing. Write text to the file using the `write()` method. The `newLine()` method inserts a newline character (\n). The `close()` method closes the writer to ensure all data is flushed to the file. A confirmation message is printed to the console. The `catch()` call catches `IOException` if any file operation fails (for example, permission issues, disk space) and prints an error message. | <pre>public class WriteToFile {<br>    public static void main(String[] args) {<br>        try {<br>            FileWriter writer = new FileWriter("output.txt");<br>            BufferedWriter bufferedWriter = new BufferedWriter(writer);<br><br>            bufferedWriter.write("Hello, World!");<br>            bufferedWriter.newLine(); // Adds a new line<br>            bufferedWriter.write("This is a Java file handling example.");<br><br>            bufferedWriter.close(); // Always close the writer<br>            System.out.println("Data written to file successfully.");<br>        } catch (IOException e) {<br>            System.out.println("An error occurred: " + e.getMessage());<br>        }</pre> |
| Close curly braces to end the `WriteToFile` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates how to write text to a file using the `FileWriter` and `BufferedWriter` package. It writes multiple lines to the file, handles exceptions properly, and closes the file to prevent resource leaks.

## Reading from Files

| Description | Example |
|--------|--------|
| Import the `FileReader` class that reads character-based data from a file, the `BufferedReader` class that provides efficient reading capabilities by buffering input, and the `IOException` class to handle errors that may occur during file operations. | <pre>import java.io.BufferedReader;<br>import java.io.FileReader;<br>import java.io.IOException;</pre> |
| Define a class `ReadFromFile` that contains the Java `main` method. Create a `FileReader` class to read the file \"output.txt\". A `BufferedReader` is wrapped around `FileReader` for more efficient reading. Call `readLine()` reads one line at a time from the file. The loop continues until `readLine()` returns null (indicating the end of the file). Each line is printed to the console. The `bufferedReader.close()` method ensures the file resource is released after reading is complete. The `catch()` call catches `IOException` if any file operation fails (for example, permission issues, disk space) and prints an error message. | <pre>public class ReadFromFile {<br>    public static void main(String[] args) {<br>        try {<br>            FileReader reader = new FileReader("output.txt");<br>            BufferedReader bufferedReader = new BufferedReader(reader);<br><br>            String line;<br>            while ((line = bufferedReader.readLine()) != null) {<br>                System.out.println(line);<br>            }<br><br>            bufferedReader.close();<br>        } catch (IOException e) {<br>            System.out.println("An error occurred: " + e.getMessage());<br>        }<br></pre> |
| Close curly braces to end the `FileExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program reads a file line by line using `FileReader` and `BufferedReader` and prints its content to the console. It reads and prints lines the file line by line, handles exceptions properly, and closes the file to prevent resource leaks.


::page{title="Using Java Byte Streams"}

## Reading bytes

| Description | Example |
|--------|--------|
| Import the `FileInputStream` class for reading raw byte data from a file and the `IOException` class to handle input/output exceptions. | <pre>import java.io.FileInputStream;<br>import java.io.IOException;</pre> |
| Define a class `ReadBytes` that contains the Java `main` method. Declare a `FileInputStream` variable, but don\'t initialize it. Open \"example.txt\" for reading. Read one byte at a time until the end of the file is reached. The method `byteData()` converts the byte into a character and prints it. If an I/O error occurs, an error stack trace is printed. The `finally` block ensures the file stream is closed, preventing resource leaks. The method `fileInputStream.close()` closes the file to free system resources. | <pre>public class ReadBytes {<br>    public static void main(String[] args) {<br>        FileInputStream fileInputStream = null;<br>        try {<br>            // Create a FileInputStream to read from a file<br>            fileInputStream = new FileInputStream("example.txt");<br><br>            // Variable to hold the byte data<br>            int byteData;<br>            // Read bytes until end of file<br>            while ((byteData = fileInputStream.read()) != -1) {<br>                // Print the byte data as characters<br>                System.out.print((char) byteData);<br>            }<br>        } catch (IOException e) {<br>            e.printStackTrace();<br>        } finally {<br>            // Close the stream to free resources<br>            if (fileInputStream != null) {<br>                try {<br>                    fileInputStream.close();<br>                } catch (IOException e) {<br>                    e.printStackTrace();<br>                }<br>            }<br>        }<br></pre> |
| Close curly braces to end the `FileExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program reads a file byte by byte using `FileInputStream` and prints its contents to the console.

## Writing bytes

| Description | Example |
|--------|--------|
| Import the `FileOutputStream` class for writing raw byte data to a file and the `IOException` class to handle input/output exceptions. | <pre>import java.io.FileOutputStream;<br>import java.io.IOException;</pre> |
| Define a class `WriteBytes` that contains the Java `main` method. Declare an `FileOutputStream` variable but don\'t initialize it. Open a `FileOutputStream` for the file \"output.txt\". If the file does not exist, create a new one. Define a String (\"Hello, World!\") to write to the file. Convert the string into a byte array using `.getBytes()`. Write the byte array to the file using `fileOutputStream.write(byteData)`. The `IOException` method catches and prints any exceptions during file writing. The `finally` block ensures that the `FileOutputStream` is properly closed to free system resources and uses a null check before calling `.close()`, preventing a `NullPointerException`. If closing the stream fails, it prints the exception. | <pre>public class WriteBytes {<br>    public static void main(String[] args) {<br>       FileOutputStream fileOutputStream = null;<br>        try {<br>            // Create a FileOutputStream to write to a file<br>            fileOutputStream = new FileOutputStream("output.txt");<br><br>            // Data to write<br>            String data = "Hello, World!";<br>            // Convert the string to bytes<br>            byte[] byteData = data.getBytes();<br><br>            // Write bytes to the file<br>            fileOutputStream.write(byteData);<br>        } catch (IOException e) {<br>            e.printStackTrace();<br>        } finally {<br>            // Close the stream to free resources<br>            if (fileOutputStream != null) {<br>                try {<br>                    fileOutputStream.close();<br>               } catch (IOException e) {<br>                    e.printStackTrace();<br>                }<br>            }<br>        }<br></pre> |
| Close curly braces to end the `FileExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program, writes the string \"Hello, World!\" to a file named output.txt using a `FileOutputStream`. It uses exception handling to catch possible file operation errors and uses a `finally` block to ensure the file stream is always closed.

## Byte streams example

| Description | Example |
|--------|--------|
| Import the `FileInputStream` class for reading faw byte data from a file, `FileOutputStream` class for writing raw byte data to a file, and the `IOException` class to handle input/output exceptions. | <pre>import java.io.FileInputStream;<br>import java.io.FileOutputStream;<br>import java.io.IOException;</pre> |
| Decleare `FileInputStream` `inputFile` to reads data from source.txt and `FileOutputStream` `outputFile` to write data to destination.txt. The try block initializes `inputFile` to read from source.txt, initializes `outputFile` to write to destination.txt, reads bytes from source.txt one byte at a time using `inputFile.read()`, writes each byte to destination.txt using `outputFile.write(byteData)`, continues until reaching the end of the file (-1), and prints \"File copied successfully!\" after completion. The catch block prints the stack trace if an `IOException` occurs (for example, file not found, read/write error). The `finally` bock ensures both `inputFile` and `outputFile` are closed to free system resources. It uses null checks to prevent `NullPointerException`. | <pre>public class FileCopy {<br>    public static void main(String[] args) {<br>        FileInputStream inputFile = null;<br>        FileOutputStream outputFile = null;<br><br>        try {<br>            // Create FileInputStream to read from "source.txt"<br>            inputFile = new FileInputStream("source.txt");<br>            // Create FileOutputStream to write to "destination.txt"<br>            outputFile = new FileOutputStream("destination.txt");<br><br>            int byteData;<br>            // Read bytes from source and write them to destination<br>            while ((byteData = inputFile.read()) != -1) {<br>                outputFile.write(byteData);<br>            }<br><br>            System.out.println("File copied successfully!");<br><br>        } catch (IOException e) {<br>            e.printStackTrace();<br>        } finally {<br>            // Close both streams<br>            try {<br>                if (inputFile != null) inputFile.close();<br>                if (outputFile != null) outputFile.close();<br>            } catch (IOException e) {<br>                e.printStackTrace();<br>            }<br>        }<br></pre> |
| Close curly braces to end the `FileCopy` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program copies the contents of a file named source.txt into another file named destination.txt using `FileInputStream` and `FileOutputStream`. It reads and writes files one byte at a time and uses `finally` to always close file streams. The program catches `IOException` to prevent crashes.


::page{title="Managing Directories in Java"}

## Creating a directory

| Description | Example |
|--------|--------|
| Import the `java.io.File` package to represent file and directory paths. | <pre>import java.io.File;</pre> |
| Define a class `CreateDirectory` that contains the Java `main` method. The `String directoryPath = "Projects/Java"` specifies the directory to be created. This means that the program will try to create a folder named \"Java\" inside a folder named \"Projects\". Create a `File` object for the directory by calling the `File(directoryPath)` method. The File object represents the directory but does not create it yet. The `if (!directory.exists())` method ensures the directory is created only if it does not already exist. The method `mkdirs()` ensures all parent directories are also created. If creation is successful, the message \"Directory created successfully: Projects/Java\" is printed to the console. If creation fails, the message \"Failed to create directory\" is printed to the console. If the directory already exists, the message \"Directory aready exists: Projects/Java\" is printed to the console. | <pre>public class CreateDirectory {<br>    public static void main(String[] args) {<br>        // Define the directory path<br>        String directoryPath = "Projects/Java";<br><br>        // Create a File object<br>        File directory = new File(directoryPath);<br><br>        // Create the directory<br>        if (!directory.exists()) {<br>            boolean created = directory.mkdirs(); // Use mkdirs() to create nested directories<br>            if (created) {<br>                System.out.println("Directory created successfully: " + directoryPath);<br>            } else {<br>                System.out.println("Failed to create directory.");<br>            }<br>        } else {<br>            System.out.println("Directory already exists: " + directoryPath);<br>        }<br></pre> |
| Close curly braces to end the `CreateDirectory` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program creates a directory (including nested directories) if it does not already exist. It handles success and failure cases gracefully.

## Listing directory contents

| Description | Example |
|--------|--------|
| Import the `java.io.File` package to represent file and directory paths. | <pre>import java.io.File;</pre> |
| Define a class `ListDirectoryContents` that contains the Java `main` method. The `String directoryPath = "Projects/Java"` specifies the directory whose contents will be listed. Create a `File` object for the directory by calling the `File(directoryPath)` method. The File object represents the directory but does not perform any operations yet. The `directory.list()` method returns an array of filenames that exist in the directory. If the directory does not exist or is empty, list() returns null. The `if (contents != null)` method ensures the directory exists and is not empty before proceeding. If contents is null, it prints: \"The directory is empty or does not exist.\" If the directory contains files/subdirectories, the program prints \"Contents of Projects/Java:\", iterates through the `contents` array and prints each filename. | <pre>public class ListDirectoryContents {<br>    public static void main(String[] args) {<br>        String directoryPath = "Projects/Java";<br>        File directory = new File(directoryPath);<br><br>        // List all files and directories in the specified directory<br>        String[] contents = directory.list();<br><br>        if (contents != null) {<br>            System.out.println("Contents of " + directoryPath + ":");<br>            for (String fileName : contents) {<br>                System.out.println(fileName);<br>            }<br>        } else {<br>            System.out.println("The directory is empty or does not exist.");<br>        }<br></pre> |
| Close curly braces to end the `ListDirectoryContents` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program lists all files and subdirectories inside a directory and handles cases where the directory is empty or does not exist
It uses the `File.list()` method to retrieve directory contents efficiently.

## Deleting a directory

| Description | Example |
|--------|--------|
| Import the `java.io.File` package to represent file and directory paths. | <pre>import java.io.File;</pre> |
| Define a class `ListDirectoryContents` that contains the Java `main` method. The `String directoryPath = "Projects/Java"` specifies the directory to be deleted. Create a `File` object for the directory by calling the `File(directoryPath)` method. The File object represents the directory but does not perform any operations yet. The `if (directory.exists()` method ensures the directory exists before attempting deletion. The `.delete()` method deletes the directory only if it is empty. If successful, it prints \"Directory deleted successfully: Projects/Java\". If it fails (for example, because it contains files/subdirectories), it prints \"Failed to delete directory. It may not be empty.\". If the directory is missing, it prints: \"Directory does not exist: Projects/Java\". | <pre>public class ListDirectoryContents {<br>    public static void main(String[] args) {<br>        String directoryPath = "Projects/Java";<br>        File directory = new File(directoryPath);<br><br>        // List all files and directories in the specified directory<br>        String[] contents = directory.list();<br><br>        if (contents != null) {<br>            System.out.println("Contents of " + directoryPath + ":");<br>            for (String fileName : contents) {<br>                System.out.println(fileName);<br>            }<br>        } else {<br>            System.out.println("The directory is empty or does not exist.");<br>        }<br></pre> |
| Close curly braces to end the `ListDirectoryContents` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program uses the `File.delete()` method to delete a specified directory if it exists. The program handles success and failure cases gracefully.

## Creating a directory with NIO

| Description | Example |
|--------|--------|
| Import Java classes `java.nio.file.Files` for file and directory operations, `java.nio.file.Path` to represent file and directory paths in a platform-independent way, `java.nio.file.Paths` to create `Path` instances, and `java.io.IOException` to handle potential I/O errors. | <pre>import java.nio.file.Files;<br>import java.nio.file.Path;<br>import java.nio.file.Paths;<br>import java.io.IOException;<br>  </pre> |
| Define a class `CreateDirectoryNIO` that contains the Java `main` method. The method `Paths.get("Projects/NioExample")` creates a `Path` object representing the directory to be created. The `try` block uses `Files.createDirectories()` instead of `File.mkdirs()` to creates all necessary parent directories if they don\'t exist. It does not throw an error if the directory already exists and stores the created directory path in `createdDir`. The program prints \"Directory created successfully: Projects/NioExample\" if it is successful. The `catch` block catches `IOException` if directory creation fails (for example, insufficient permissions) and prints an error message: \"Failed to create directory: <error_message>\". | <pre>public class CreateDirectoryNIO {<br>    public static void main(String[] args) {<br>        // Define the directory path<br>        Path path = Paths.get("Projects/NioExample");<br><br>        try {<br>            // Create the directory using NIO<br>            Path createdDir = Files.createDirectories(path);<br>            System.out.println("Directory created successfully: " + createdDir);<br>        } catch (IOException e) {<br>            System.out.println("Failed to create directory: " + e.getMessage());<br>        }<br>    }<br>}
</pre> |
| Close curly braces to end the `CreateDirectory` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program creates a directory using Java NIO (New Input/Output) instead of the traditional File class. It handles success and failure cases gracefully and works cross-platform.

## Real World example of Document Management System

| Description | Example |
|--------|--------|
| Import Java class `java.nio.file.Files` for file and directory operations, `java.nio.file.Path` to represent file and directory paths in a platform-independent way, `java.nio.file.Paths` to create `Path` instances, `java.io.IOException` to handle potentila I/O errors, and `java.util.Scanner` for handling user input. | <pre>import java.nio.file.Files;<br>import java.nio.file.Path;<br>import java.nio.file.Paths;<br>import java.io.IOException;<br>import java.util.Scanner;<br></pre> |
| Define a class `DocumentManagementSystem` that contains the Java `main` method. All directory operations will occur within the \"Documents\" folder defined by the String `BASE_DIRECTORY`. The `main` method continuously prompts the user to choose an option and calls the corresponding method based on user input: \"1\" creates a new directory inside \"Documents\", \"2\" lists contents of a specified directory, \"3\" deletes a specified directory, and \"4\" exits the program. | <pre>public class DocumentManagementSystem {<br>    private static final String BASE_DIRECTORY = "Documents";<br><br>    public static void main(String[] args) {<br>        Scanner scanner = new Scanner(System.in);<br>        String command;<br><br>        while (true) {<br>            System.out.println("1. Create directory\n2. List documents\n3. Delete directory\n4. Exit");<br>            command = scanner.nextLine();<br><br>            switch (command) {<br>                case "1": createDirectory(scanner); break;<br>                case "2": listDirectory(scanner); break;<br>                case "3": deleteDirectory(scanner); break;<br>                case "4": scanner.close(); return;<br>                default: System.out.println("Invalid choice."); <br>            }<br>        }<br>    }</pre>
| The `createDirectory()` method creates a new directory and reads directory name from user input. It uses `Files.createDirectories(path)` to create the directory (including missing parent directories). If successful, it prints \"Created: path\". If an error occurs, it prints \"Error: message\". |<pre>    private static void createDirectory(Scanner scanner) {<br>        System.out.print("New directory name: ");<br>        Path path = Paths.get(BASE_DIRECTORY, scanner.nextLine());<br>        try {<br>             System.out.println("Created: " + Files.createDirectories(path));<br>         } catch (IOException e) {<br>             System.err.println("Error: " + e.getMessage());<br>         }<br>    }</pre>
| The `listDirectory()` method lists the contents of a directory and reads directory name from user input. It uses `Files.list(path)` to retrieve the directory and prints each file/subdirectory. If the directory doesn\'t exist or an error occurs, it prints \"Error: message\". |<pre>    private static void listDirectory(Scanner scanner) {<br>        System.out.print("Directory to list: ");<br>        Path path = Paths.get(BASE_DIRECTORY, scanner.nextLine());<br>        try {<br><br>             Files.list(path).forEach(System.out::println);<br>         } catch (IOException e) {<br>             System.err.println("Error: " + e.getMessage());<br>         }<br>    }</pre>
| The `deleteDirectory()` method deletes a directory and reads directory name from user input. It uses `Files.delete(path)` to delete the specified directory. If successful, it prints \"Deleted: path\". The `Files.delete(path)` will fail if the directory is not empty. It only works on empty directories. |<pre>    private static void deleteDirectory(Scanner scanner) {<br>        System.out.print("Directory to delete: ");<br>        Path path = Paths.get(BASE_DIRECTORY, scanner.nextLine());<br>        try {<br>             Files.delete(path);<br>             System.out.println("Deleted: " + path);<br>        } catch (IOException e) {<br>             System.err.println("Error: " + e.getMessage());<br>         }<br></pre> |
| Close curly braces to end the `main` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program provides a simple command-line interface for managing directories inside a \"Documents\" folder. It allows users to create, list, and delete directories using Java NIO (New Input/Output).


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
| 2025-02-28 | 0.1 | P. Kravitz  | Template created |
| 2025-03-10 | 0.2 | A.Narula  | Cheatsheet completed |
| 2025-02-28 | 0.1 | P. Kravitz  | Change log commented out. Corrected one typo. |
| 2025-03-11 | 0.3 | A. Hansis | Content QA |
| 2025-11-03 | 0.4 | Sameep | Changed code snippet for java.nio |
Regenerated. Pages display|-->
