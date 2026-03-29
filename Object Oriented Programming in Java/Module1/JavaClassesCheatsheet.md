# Coding Cheat Sheet

<!-- Reviewer: IMPORTANT! This file is a reading using the instructional lab environment so the learner can have a table of contents to locate code snippets based on the corresponding video. This reading does not include an estimated time. In this first paragraph, please update the first sentence to reflect the description of the course and not necessarily the exact course name (for content reuse across platforms.) -->

This reading provides a reference list of code that you&#39;ll encounter as you work with object-oriented coding in Java. Understanding these concepts will help you write and debug object-oriented Java programs. Let\'s explore the following Java coding concepts:

- Working with classes and objects
- Working with access and non-access modifiers
- Using encapsulation
- Using constructors

Keep this summary reading available as a reference as you progress through your course, and refer to it when you begin coding object-oriented Java programming after this course!



## Creating a class

| Description | Example |
|--------|--------|
| Create a `Car` class, which serves as a blueprint for creating Car objects. | <pre>public class Car {</pre> |
| Define attributes of the `Car` class. The variables `color`, `model`, and `year` store the car\'s color, model, and year, respectively. |<pre>String color;<br>String model;<br>int year;</pre> |
| Include the method `displayInfo()` to print car objects. | <pre>void displayInfo() { |
| Print the car details to the console using the `System.out.println()` function. | <pre>System.out.println("Car Model: " + model);<br>System.out.println("Car Color: " + color);<br>System.out.println(>System.out.println("Car Year: " + year);</pre> |
| Close curly braces to end the `Car` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This example creates a class named `Car` and defines three attributes for the `Car` class: `model`, `color`, and `year`. The `displayInfo()` method prints the car details.

## Creating an object

| Description | Example |
|--------|--------|
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main { </pre> |
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. |<pre>public static void main(String[] args) {</pre> |
| Create an object of the `Car` class. | <pre>Car myCar = new Car();</pre> |
| Assign values to the object\'s attributes. | <pre>myCar.color = "Red";<br>myCar.model = "Toyota";<br>myCar.year = 2020;</pre> |
| Call the `displayInfo()` method to print the object details. | <pre>myCar.displayInfo();</pre> |
| Close curly braces to end the `main` method and class definition. | <pre>    }<br>}</pre> |

**Explanation:** This example declares a reference variable named `myCar` of type `Car`. `new Car()` creates a new object of the `Car` class and assigns values to the object\'s attributes: `color`, `model` and `year`. The `displayInfo()` method prints the car details.


::page{title="Working with access and non-access modifiers"}

## Public access modifier

| Description | Example |
|--------|--------|
| A Java statement used to define a class named `Car`, which acts as a blueprint for creating `Car` objects. The variable model is declared as `public`, meaning it can be accessed directly from outside the class.| <pre>public class Car {</pre> |
| A Java statement to declare a `String` variable named `model` to store the car\'s model name. | <pre>    public String model;</pre> |
| Close curly braces to end the class definition. | <pre>}</pre> |

## Private access modifier

| Description | Example |
|--------|--------|
| A Java statement used to define a class named `Car`, which acts as a blueprint for creating `Car` objects. The variable model is declared as `public`, meaning that it can be accessed directly from outside the class.| <pre>public class Car {</pre> |
| A Java statement to declare a private `String` variable named `color` to store the car\'s color. The private modifier ensures the `color` variable can be accessed and modified only within the `Car` class. | <pre>    private String color;</pre> |
| Call the `displayColor()` method with the private access modifier. This ensures the method can be called only within the `Car` class and not from other classes. | <pre>    private void displayColor() {</pre> |
| Print the car\'s color to the console using the `System.out.println()` function. | <pre>	System.out.println("Car Color: " + color); </pre> |
| Close curly braces to end the class definition. | <pre>    }<br>}</pre> |

## Protected access modifier

| Description | Example |
|--------|--------|
| A Java statement used to define a class named `Car`, which acts as a blueprint for creating `Car` objects. The variable model is declared as `public`, meaning that it can be accessed directly from outside the class.| <pre>public class Car {</pre> |
| A Java statement to declare a protected `int` variable named `year` to store the car\'s year. The protected modifier ensures the `year` variable is accessible within the same package (default package access) and by subclasses, even if they are in different packages. | <pre>    private String year;</pre> |
| Call the `displayYear()` method with the protected access modifier. This ensures the method can be called within the same package and by subclasses, even if they are in different packages. | <pre>    private void displayYear() {</pre> |
| Print the car\'s year to the console using the `System.out.println()` function. | <pre>	System.out.println("Car Year: " + year); </pre> |
| Close curly braces to end the class definition. | <pre>    }<br>}</pre> |

## Default access modifier

| Description | Example |
|--------|--------|
| A Java statement used to define a class named `Car`, which acts as a blueprint for creating `Car` objects. | <pre>class Car {</pre> |
| A Java statement to declare a `String` variable named `model` without any access modifier. If no access modifier is used, the variable is considered default. Default variables are accessible only within their own package. | <pre>    String model;</pre> |
| Call the `displayModel()` method without any access modifier. | <pre>    void displayModel() {</pre> |
| Print the car\'s model to the console using the `System.out.println()` function. | <pre>	System.out.println("Car Model: " + model); </pre> |
| Close curly braces to end the class definition. | <pre>    }<br>}</pre> |

## Static non-access modifier

| Description | Example |
|--------|--------|
| A Java statement used to define a class named `Car`, which acts as a blueprint for creating `Car` objects. The variable model is declared as `public`, meaning that it can be accessed directly from outside the class.| <pre>public class Car {</pre> |
| A Java statement to declare a static `int` variable named `numberOfCars` to keep track of the total number of `Car` objects created. Since it\'s static, its value is shared among all instances of `Car`. | <pre>    static int numberOfCars = 0;</pre> |
| A Java statement to declare a constructor. Every time a new `Car` object is created, this constructor runs. | <pre>    public Car() {</pre> |
| A Java statement to increment the `numberOfCars` variable that keeps track of how many cars have been instantiated. | <pre>	numberOfCars++; </pre> |
| Close curly braces to end the class definition. | <pre>    }</pre> |
| Call the `displayCount()` method without creating an instance of the `Car` class. This method can only access static variables like `numberOfCars`, not instance variables. | <pre>    private void displayCount() {</pre> |
| Print the total number of cars to the console using the `System.out.println()` function. | <pre>	System.out.println("Total Cars: " + numberOfCars); </pre> |
| Close curly braces to end the class definition. | <pre>    }<br>}</pre> |

## Final non-access modifier

| Description | Example |
|--------|--------|
| A Java statement used to define a final class named `Vehicle`, which acts as a blueprint for creating `Car` objects. The final class cannot be extended (inherited) by any other class. This means no subclasses can be created from `Vehicle`. | <pre>public final class Vehicle {</pre> |
| A Java statement to declare a final `int` variable named `maxSpeed` with the value 120. The final variable is a constant, meaning that its value cannot be changed once it is assigned. Trying to modify `maxSpeed` later in the code will cause a compilation error. | <pre>    final int maxSpeed = 120;</pre> |
| A Java statement to declare a final method named `displayMaxSpeed()`. The final method cannot be overridden by subclasses. This ensures the behavior of `displayMaxSpeed` remains the same in all instances. | <pre>    final void displayMaxSpeed() {</pre> |
| Print the maximum car speed to the console using the `System.out.println()` function. | <pre>	System.out.println("Max Speed: " + maxSpeed); </pre> |
| Close curly braces to end the class definition. | <pre>    }<br>}</pre> |

## Abstract non-access modifier

| Description | Example |
|--------|--------|
| A Java statement used to define an abstract class named `Shape`. This is an abstract class, meaning that it cannot be instantiated (you cannot create `Shape` objects directly). It works as a blueprint from which other classes can inherit. | <pre>public abstract class Shape {</pre> |
| A Java statement used to define a final class named `Vehicle`, which acts as a blueprint for creating `Car` objects. The final class cannot be extended (inherited) by any other class. This means no subclasses can be created from `Vehicle`. | <pre>    abstract void draw(); </pre> |
| Close curly braces to end the class definition. | <pre>}</pre> |
| A Java statement to describe `Circle` that extends the `Shape` class and provides an implementation of the `draw()` method. | <pre>public class Circle extends Shape {</pre> |
| A Java annotation to tell the compiler the draw() method in `Circle` is an override of the abstract method in `Shape`. | <pre>    @Override</pre> |
| A Java statement saying the `draw` method is now fully implemented. | <pre>    void draw()</pre> |
| Print the string `Drawing Circle` to the console using the `System.out.println()` function. | <pre>	System.out.println("Drawing Circle"); </pre> |
| Close curly braces to end the class definition. | <pre>    }<br>}<br>}</pre> |


::page{title="Using encapsulation"}

## Creating an encapsulated class

| Description | Example |
|--------|--------|
| Create the `Person` class, which serves as a blueprint for creating Person objects.  | <pre>class Person { </pre> |
| Create private attributes `name` and `age` to store the person\'s name and age. The `name` and `age` attributes cannot be accesse diretly from outside the class. | <pre>    private String name;<br>    private int age; </pre> |
| Use the Java constructor to initialize the `name` and `age` variables when a `Person` object is created.  | <pre>    public Person(String name, int age) {</pre> |
| The keyword `this` refers to the current object\'s instance variables. It differentiates instance variables from method parameters. | <pre>	this.name = name;<br>	this.age = age; </pre> |
| Close curly braces to end the class definition. | <pre>    }</pre> |
| Use the Java public method (Getter) to obtain read access to private variables.  | <pre>    public String getName() {</pre> |
| `getName()` returns the value of `name`. | <pre>	return name; </pre> |
| Close curly braces to end the class definition. | <pre>    }</pre> |
| Use the Java public method (Setter) to obtain write access to private variables.  | <pre>    public void setName(String name) {</pre> |
| `setName()` updates `name`. | <pre>	this.name = name; </pre> |
| Use the Java public method (Getter) to obtain read access to private variables.  | <pre>    public int getAge() {</pre> |
| `getAge()` returns the value of `age`. | <pre>	return age; </pre> |
| Close curly braces to end the class definition. | <pre>    }</pre> |
| Use the Java public method (Setter) to obtain write access to private variables.  | <pre>    public void setAge(int age) {</pre> |
| Use the Java `if` statement to ensure `age` is not negative before assigning. | <pre>	if (age >= 0) { </pre> |
| Update the `age` variable. | <pre>	    this.age = age; </pre> |
| Use the Java `else` statement to specify what to do when the age is negative. | <pre>	} else { </pre> |
| Print the string `Age cannot be negative` to the console using the `System.out.println()` function. | <pre>	    System.out.println("Age cannot be negative."); </pre> |
| Close curly braces to end the class definition. | <pre>    }<br>}</pre> |

**Explanation:** This example creates a `Person` class in which the `name` and `age` attributes are declared as private, meaning they cannot be accessed directly from outside the `Person` class. The constructor `Person(String name, int age)` initializes the attributes when a new object of the class is created. `getName()` and `getAge()` are getter methods that allow other classes to read the values of `name` and `age`. `setName(String name)` and `setAge(int age)` are setter methods that allow other classes to modify the values of `name` and `age`. The setter for `age` includes validation to ensure `age` cannot be set to a negative number.

## Using an encapsulated class

| Description | Example |
|--------|--------|
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main { </pre> |
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. | <pre> public static void main(String[] args) {</pre> |
| Create a new instance of the `Person` class. Assign the value \"Alice\" to the `name` attribute and the value \"30\" to the `age` attribute. | <pre>    Person person = new Person("Alice", 30); </pre> |
| Use the `getName()` getter to obtain and print the value of the `name` attribute. | <pre>    System.out.println("Name: " + person.getName()); </pre> |
| Use the `getAge()` getter to obtain and print the value of the `age` attribute. | <pre>    System.out.println("Age: " + person.getAge()); </pre> |
| Use the `setName()` setter to assign the value of `name` attribute to \"Bob\" and `age` attribute to \"25\". | <pre>    person.setName("Bob");<br>    person.setAge(25); </pre> |
| Use the `getName()` getter to obtain and print the updated value of the `name` attribute. | <pre>    System.out.println("Updated Name: " + person.getName()); </pre> |
| The `setAge(-5)` call attempts to set an invalid age. Since `setAge()` has validation logic, it will print \"Age cannot be negative.\" | <pre>    System.out.println("Updated Age: " + person.getAge()); </pre> |
| Close curly braces to end the class definition. | <pre>    }<br>}</pre> |

**Explanation:** This example creates an instance of the `Person` class with the `name` \"Alice\" and `age` \"30\". We call the `getName()` and `getAge()` getter methods to print the values. We then update the `name` and `age` attributes usint the `setName()` and `setAge()` setter methods. When we attempt to set a negative age with setAge(-5), it prints an error message because of validation included in the setter method.


::page{title="Using constructors"}

## Creating a default constructor

| Description | Example |
|--------|--------|
| A Java statement used to define a class named `Dog`, which acts as a blueprint for creating `Dog` objects. | <pre>class Dog {</pre> |
| A Java statement to declare a `String` variable named `name` without any access modifier. If no access modifier is used, the variable is considered default. Default variables are accessible only within their own package. | <pre>    String name;</pre> |
| This is the default constructor. It takes no arguments. | <pre>    Dog() {</pre> |
| The default constructor initializes the `name` variable with the value \"Unknown\". This ensures every new `Dog` object always hasa name, even if the user doesn\'t provide one. | <pre>	name = "Unknown"; </pre> |
| Close curly braces to end the class definition. | <pre>    }</pre> |
| Call the `display()` method without any access modifier. | <pre>    void display() {</pre> |
| Print the dog\'s name to the console using the `System.out.println()` function. Since `name` was initialized in the constructor, it always has a value. | <pre>	System.out.println("Dog\'s name: " + name); </pre> |
| Close curly braces to end the class definition. | <pre>    }<br>}</pre> |
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main { </pre> |
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. |<pre>public static void main(String[] args) {</pre> |
| Create an instance of the `Dog` class using the default constructor. The `name` variable is automatically set to \"Unknown\". | <pre>	Dog myDog = new Dog(); </pre> |
| Call the `display()` method to print the dog\'s name. | <pre>	myDog.display(); </pre> |
| Close curly braces to end the class definition. | <pre>    }<br>}</pre> |

**Explanation:** This example creates an instance of the `Dog` class  with a default constructor that initializes the `name` attribute to \"Unknown\". When we create the instance, the default constructor is invoked automatically.

## Creating a parameterized constructor

| Description | Example |
|--------|--------|
| A Java statement used to define a class named `Dog`, which acts as a blueprint for creating `Dog` objects. | <pre>class Dog {</pre> |
| A Java statement to declare a `String` variable named `name` without any access modifier. If no access modifier is used, the variable is considered default. Default variables are accessible only within their own package. | <pre>    String name;</pre> |
| This is the parameterized constructor that takes one argument `dogName`. | <pre>    Dog(String dogName) { </pre> |
| When the `Dog` object is created, the provided dogName value is assigned to the `name` variable. Parameterized constructors let you assign a unique name to each `Dog` object when it is created. | <pre>	name = dogName; </pre> |
| Close curly braces to end the class definition. | <pre>    }</pre> |
| Call the `display()` method without any access modifier. | <pre>    void display() {</pre> |
| Print the dog\'s name to the console using the `System.out.println()` function. Since `name` was initialized in the constructor, it always has a value. | <pre>	System.out.println("Dog\'s name: " + name); </pre> |
| Close curly braces to end the class definition. | <pre>    }<br>}</pre> |
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main { </pre> |
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. |<pre>public static void main(String[] args) {</pre> |
| Create an instance of the `Dog` class. \"Buddy\" is passed as an argument to the constructor, setting name to \"Buddy\". | <pre>	Dog myDog = new Dog("Buddy"); </pre> |
| Call the `display()` method to print the dog\'s name. | <pre>	myDog.display(); </pre> |
| Close curly braces to end the class definition. | <pre>    }<br>}</pre> |

**Explanation:** This example creates an instance of the `Dog` class  with a parameterized constructor that takes a `string` parameter `dogName`. When we create a `Dog` instance with the name \"Buddy\", the constructor initializes the name attribute with that value.

## Creating a no-arg constructor

| Description | Example |
|--------|--------|
| A Java statement used to define a class named `Car`, which acts as a blueprint for creating `Car` objects. | <pre>class Car {</pre> |
| A Java statement to declare a `String` variable named `model` and an `int` variable named `year` without any access modifier. If no access modifier is used, the variable is considered default. Default variables are accessible only within their own package. | <pre>    String model;<br>    int year;</pre> |
| This is a no-argument constructor that takes no parameters. | <pre>    Car() { </pre> |
| When the `Car` object is created, it automatically assigns the value \"Default Model\" to `model` and 2020 to `year`. | <pre>	model = "Default Model";<br>	year = 2020;  </pre> |
| Close curly braces to end the class definition. | <pre>    }</pre> |
| Call the `display()` method without any access modifier. | <pre>    void display() {</pre> |
| Print the car\'s model and year to the console using the `System.out.println()` function. | <pre>	System.out.println("Car Model: " + model + ", Year: " + year); </pre> |
| Close curly braces to end the class definition. | <pre>    }<br>}</pre> |
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main { </pre> |
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. |<pre>public static void main(String[] args) {</pre> |
| Create an instance of the `Car` class. The no-argument constructor is called, setting `model` = \"Default Model\" and `year` = 2020. | <pre>	Car myCar = new Car(); </pre> |
| Call the `display()` method to print the model and year of the car. | <pre>	myCar.display(); </pre> |
| Close curly braces to end the class definition. | <pre>    }<br>}</pre> |

**Explanation:** This example creates an instance of the `Car` class with two attributes `model` and `year`. The Car() constructor initializes the model to \"Default Model\" and year to 2020. When we create an instance of the `Car` class with `new Car()`, the no-arg constructor is called automatically, and the default values are assigned to the attributes. The `display(`) method prints the `model` and `year` of the car.

## Constructor overloading

| Description | Example |
|--------|--------|
| A Java statement used to define a class named `Dog`, which acts as a blueprint for creating `Dog` objects. | <pre>class Dog {</pre> |
| A Java statement to declare a `String` variable named `name` and an `int` variable named `age` without any access modifier. If no access modifier is used, the variable is considered default. Default variables are accessible only within their own package. | <pre>    String name;<br>    int age;</pre> |
| This is the default constructor. It takes no arguments. | <pre>    Dog() {</pre> |
| The default constructor initializes the `name` variable with the value \"Unknown\" and `age` variable with the value 0. This ensures every new `Dog` object always has a name and age, even if the user doesn\'t provide one. | <pre>	name = "Unknown";<br>	age = 0; </pre> |
| Close curly braces to end the class definition. | <pre>    }</pre> |
| This is the parameterized constructor that takes one argument `dogName`. | <pre>    Dog(String dogName) { </pre> |
| When the `Dog` object is created, the provided dogName value is assigned to `name` while keeping the `age` as 0 by default. Parameterized constructors let you assign a unique name to each `Dog` object when it is created. | <pre>	name = dogName;<br>	age = 0; </pre> |
| Close curly braces to end the class definition. | <pre>    }</pre> |
| This is the parameterized constructor that takes two arguments `dogName` and `dogAge`. | <pre>    Dog(String dogName, int dogAge) { </pre> |
| When the `Dog` object is created, the constructor allows the user to specify both `name` and `age`. | <pre>	name = dogName;<br>	age = dogAge; </pre> |
| Close curly braces to end the class definition. | <pre>    }</pre> |
| Call the `display()` method without any access modifier. | <pre>    void display() {</pre> |
| Print the dog\'s `name` and `age` to the console using the `System.out.println()` function. Since `name` and `age` were initialized in the constructor, they always have a value. | <pre>	System.out.println("Dog's name: " + name + ", Age: " + age); </pre> |
| Close curly braces to end the class definition. | <pre>    }<br>}</pre> |
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main { </pre> |
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. |<pre>public static void main(String[] args) {</pre> |
| Create the `dog1` object using the default constructor `Dog()`. So, name = \"Unknown\" and age = 0. | <pre>	Dog dog1 = new Dog();  </pre> |
| Create the `dog2` object using the one-parameter constructor `Dog("Charlie")`. So, name = \"Charlie\" and age = 0 (default). | <pre>	Dog dog2 = new Dog();  </pre> |
| Create the `dog3` object using the two-parameter constructor `Dog("Max", 5)`. So, name = \"Max\" and age = 5. | <pre>	Dog dog3 = new Dog();  </pre> |
| Call the `display()` method on each object to print their details. | <pre>	dog1.display();<br>	dog2.display();<br>	dog3.display(); </pre> |
| Close curly braces to end the class definition. | <pre>    }<br>}</pre> |

**Explanation:** This example has three constructors of the `Dog` class. Depending on the number of parameters provided when creating an object, the corresponding constructor is called.

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
| 2025-03-03 | 0.2 | A.Narula  | Cheatsheet completed |
| 2025-03-04 | 0.3 | A.Hansis  | Content QA |
-->