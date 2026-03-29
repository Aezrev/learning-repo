# Coding Cheat Sheet

<!-- Reviewer: IMPORTANT! This file is a reading using the instructional lab environment so the learner can have a table of contents to locate code snippets based on the corresponding video. This reading does not include an estimated time. In this first paragraph, please update the first sentence to reflect the description of the course and not necessarily the exact course name (for content reuse across platforms.) -->

This reading provides a reference list of code you\'ll encounter as you work with object-oriented coding in Java. Understanding these concepts will help you write and debug your first Java programs. Let\'s explore the following Java coding concepts:

- Inheritance in Java
- Polymorphism in Java
- Interfaces and abstract classes in Java
- Inner classes in Java

Keep this summary reading available as a reference as you progress through your course, and refer to this reading as you begin coding with Java after this course!


## Creating a superclass

| Description | Example |
|--------|--------|
| Create a superclass named `Animal`, which serves as a base class for other classes that might inherit from it. | <pre>class Animal {</pre> |
| Define a String variable `name` to store the name of the animal. |<pre>    String name;</pre> |
| Include a method `eat()` to print the message that the animal is eating. |<pre>    void eat() {</pre> |
| Print the message to the console using the `System.out.println()` function. The animal `name` is displayed dynamically. | <pre>	System.out.println(name + " is eating.");</pre> |
| Close curly braces to end the `Animal` class definition. | <pre>    }<br>}</pre> |

## Creating a subclass

| Description | Example |
|--------|--------|
| The `Dog` class inherits from the `Animal` class, meaning it automatically gets all properties and methods from `Animal`. | <pre>class Dog extends Animal {</pre> |
| Include a method `bark()` to print the message that the dog is barking. |<pre>    void bark() {</pre> |
| Print the message to the console using the `System.out.println()` function. The animal `name` is displayed dynamically. | <pre>	System.out.println(name + " says woof!");</pre> |
| Close curly braces to end the `Animal` class definition. | <pre>    }<br>}</pre> |

## Using inheritance

| Description | Example |
|--------|--------|
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main {</pre> |
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. |<pre>    public static void main(String[] args) {</pre> |
| Creates an instance of the `Dog` class. The `Dog` class inherits from the `Animal` class. | <pre>	Dog myDog = new Dog();</pre> |
| Assigns \"Buddy\" to the `name` variable inherited from `Animal`. | <pre>	myDog.name = "Buddy";</pre> |
| Calls the `eat()` method from the `Animal` class, which prints \"Buddy is eating.\". | <pre>	myDog.eat();</pre> |
| Calls the `bark()` method from the `Dog` class, which prints \"Buddy says woof!\". | <pre>	myDog.bark();</pre> |
| Close curly braces to end the `Main` class definition. | <pre>    }<br>}</pre> |

## Using multilevel inheritance

| Description | Example |
|--------|--------|
| The `Puppy` class inherits from the `Dog` class. Since `Dog` already inherits from `Animal`, `Puppy` indirectly inherits all properties and methods from `Animal` as well. | <pre>class Puppy extends Dog {</pre> |
| This method adds a new behavior specific to the `Puppy` class. |<pre>    void weep() {</pre> |
| Print the message to the console using the `System.out.println()` function. The animal `name` is displayed dynamically. | <pre>	System.out.println(name + " is weeping.");</pre> |
| Close curly braces to end the `Puppy` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This is an example of multilevel inheritance. Animal (Superclass) → Dog (Subclass) → Puppy (Subclass of Dog). The `Animal` class has attribute `name` and method `eat()`. The `Dog` class inherits from `Animal` and adds the `bark()` method. `Puppy` inherits from `Dog` and adds the `weep()` method.

## Using hierarchical inheritance

| Description | Example |
|--------|--------|
| The `Cat` class inherits from the `Animal` class. Since `Animal` contains the `name` variable and `eat()` method, `Cat` inherits those properties. | <pre>class Cat extends Animal {</pre> |
| This method adds a new behavior specific to the `Cat` class. |<pre>    void meow() {</pre> |
| Print the message to the console using the `System.out.println()` function. The animal `name` is displayed dynamically. | <pre>	System.out.println(name + " says meow!");</pre> |
| Close curly braces to end the `Cat` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This is an example of hierarchical inheritance because multiple subclasses (`Dog` and `Cat`) inherit from the same superclass (`Animal`). `Animal` has attribute `name` and method `eat()`. `Dog` and `Cat` inherit from `Animal`, but each adds unique behaviors. `Dog` adds the `bark()` method and `Cat` adds the `meow()` method.

## Method overriding

| Description | Example |
|--------|--------|
| Create a superclass named `Animal`, which serves as a base class for other classes that might inherit from it. | <pre>class Animal {</pre> |
| Include a `sound()` method. This method is meant to be overridden by subclasses that define more specific behavors. |<pre>    void sound() {</pre> |
| Print the message \"Animal makes a sound\" to the console using the `System.out.println()` function. | <pre>	System.out.println("Animal makes a sound");</pre> |
| Close curly braces to end the `Animal` class definition. | <pre>    }<br>}</pre> |

| Description | Example |
|--------|--------|
| The `Dog` class inherits from the `Animal` class. | <pre>class Dog extends Animal {</pre> |
| `Dog` overrides the `sound()` method to provide a specific implementation: \"Dog barks\". The @Override annotation tells the compiler that this method replaces the `sound()` method from `Animal`. | <pre>    @Override</pre> |
| Include a `sound()` method to print the message \"Dog barks\". |<pre>    void sound() {</pre> |
| Print the message to the console using the `System.out.println()` function. | <pre>	System.out.println("Dog barks");</pre> |
| Close curly braces to end the `Dog` class definition. | <pre>    }<br>}</pre> |

**Explanation:** In this example, `Dog` provides its own implementation of `sound()`, replacing the one in `Animal`. Method overriding occurs when a subclass provides a specific implementation of a method already defined in its superclass. The method in the subclass must have the same name, return type, and parameters as the method in the superclass.

## Using overridden methods

| Description | Example |
|--------|--------|
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main {</pre> |
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. |<pre>    public static void main(String[] args) {</pre> |
| Creates an instance of `Animal` and stores it in a variable `myAnimal`. | <pre>	Animal myAnimal = new Animal();</pre> |
| The `Dog` object is stored in an `Animal` reference. Since Dog overrides the sound() method, Java uses dynamic method dispatch to call the overridden method in `Dog`, not in `Animal`. | <pre>	Animal myDog = new Dog();</pre> |
| Since `myAnimal` is a regular `Animal` object, calling `myAnimal.sound()` executes the `sound()` method from the `Animal` class. | <pre>	myAnimal.sound();</pre> |
| Since `myDog` refers to a `Dog` object (even though it\'s declared as Animal), it calls the overridden `sound()` method in `Dog` due to polymorphism. | <pre>	myDog.sound();</pre> |
| Close curly braces to end the `Main` class definition. | <pre>    }<br>}</pre> |

**Explanation:** The `Dog` class inherits from `Animal`, meaning it gets all non-private properties and methods of `Animal`. `Dog` overrides the `sound()` method from `Animal`, providing a more specific implementation. Even though `myDog` is declared as an `Animal`, Java determines the method to call at runtime, not compile time. When calling `myDog.sound()`, Java looks at the actual object type (Dog) and calls `sound()` from `Dog`, not `Animal`.


::page{title="Polymorphism in Java"}

## Compile-time polymorphism

| Description | Example |
|--------|--------|
| Create a class `MathOperations` that contains multiple methods for performing addition. | <pre>class MathOperations {</pre> |
| Include an `add` method that accepts two `int` values (a and b). |<pre>    int add(int a, int b) {</pre> |
| Add the values of `a` and `b` and return the sum to the calling method as an `int`. | <pre>	return a + b;</pre> |
| Close curly braces to end the method. | <pre>    }</pre> |
| Include an `add` method that accepts three `int` values (a, b, and c). |<pre>    int add(int a, int b, int c) {</pre> |
| Add the values of `a`, `b`, and `c` and return the sum to the calling method as an `int`. This method overloads the first `add()` method because it has different number of parameters. | <pre>	return a + b + c;</pre> |
| Close curly braces to end the method. | <pre>    }</pre> |
| Include an `add` method that accepts two `double` values (a and b). |<pre>    int add(double a, double b) {</pre> |
| Add the values of `a` and `b` and return the sum to the calling method as a `double`. This method overloads both of the previous `add()` methods, but it works with double values instead of int. | <pre>	return a + b;</pre> |
| Close curly braces to end the method and the `MathOperations` class definition. | <pre>    }<br>}</pre> |
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main {</pre> |
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. |<pre>    public static void main(String[] args) {</pre> |
| Create an instance of the `MathOperations` class and assign it to the `math` object. |<pre>  	MathOperations math = new MathOperations();</pre> |
| Calls the method `add(int a, int b)` to add two integers (2 + 3) and print the result to the console. |<pre>  	System.out.println("Sum of 2 and 3: " + math.add(2, 3));</pre> |
| Calls the method `add(int a, int b, int c)` to add three integers (2 + 3 + 4) and print the result to the console. |<pre>  	System.out.println("Sum of 2, 3 and 4: " + math.add(2, 3, 4));</pre> |
| Calls the method `add(double a, double b)` to add two double values (2.5 + 3.5) and print the result to the console. |<pre>  	System.out.println("Sum of 2.5 and 3.5: " + math.add(2.5, 3.5));</pre> |
| Close curly braces to end the `Main` class definition. | <pre>    }<br>}</pre> |

**Explanation:** The `add()` method is overloaded three times in the `MathOperations` class. Different number of parameters (int a, int b) versus (int a, int b, int c) and different types of parameters (int versus double). In Java, overloading is based on the method signature, which includes the number and types of parameters. It does not depend on the return type. The correct method is selected at compile time based on the arguments passed to the `add()` method. This is an example of compile-time polymorphism (or static polymorphism).

## Using compile-time polymorphism

| Description | Example |
|--------|--------|
| Create a class `MathOperations` that contains multiple methods for performing addition. | <pre>class MathOperations {</pre> |
| Include an `add` method that accepts two `int` values (a and b). |<pre>    int add(int a, int b) {</pre> |
| Add the values of `a` and `b` and return the sum to the calling method as an `int`. | <pre>	return a + b;</pre> |
| Close curly braces to end the method. | <pre>    }</pre> |
| Include an `add` method that accepts two `double` values (a and b). |<pre>    int add(double a, double b) {</pre> |
| Add the values of `a` and `b` and return the sum to the calling method as a `double`. This method overloads both of the previous `add()` methods, but it works with double values instead of int. | <pre>	return a + b;</pre> |
| Close curly braces to end the method. | <pre>    }</pre> |
| Include an `add` method that accepts three `int` values (a, b, and c). |<pre>    int add(int a, int b, int c) {</pre> |
| Add the values of `a`, `b`, and `c` and return the sum to the calling method as an `int`. This method overloads the first `add()` method because it has different number of parameters. | <pre>	return a + b + c;</pre> |
| Close curly braces to end the method and the `MathOperations` class definition. | <pre>    }<br>}</pre> |
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main { </pre> |
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. |<pre>    public static void main(String[] args) {</pre> |
| Create an instance of the `MathOperations` class and assign it to the `math` object. |<pre>  	MathOperations math = new MathOperations();</pre> |
| Calls the method `add(int a, int b)` to add two integers (2 + 3) and print the result to the console. |<pre>  	System.out.println("Sum of 2 and 3: " + math.add(2, 3));</pre> |
| Calls the method `add(double a, double b)` to add two double values (2.5 + 3.5) and print the result to the console. |<pre>  	System.out.println("Sum of 2.5 and 3.5: " + math.add(2.5, 3.5));</pre> |
| Calls the method `add(int a, int b, int c)` to add three integers (2 + 3 + 4) and print the result to the console. |<pre>  	System.out.println("Sum of 1, 2 and 3: " + math.add(2, 3, 4));</pre> |
| Close curly braces to end the `Main` class definition. | <pre>    }<br>}</pre> |

**Explanation:** In this example, the `MathOperations` class has three overloaded `add` methods. Depending on the number and type of arguments passed to `add`, Java determines which method to invoke at compile time. This makes our code more flexible and easier to read.

## Using runtime polymorphism

| Description | Example |
|--------|--------|
| Create a superclass named `Animal`, which serves as a base class for other classes that might inherit from it. | <pre>class Animal {</pre> |
| Include a `sound()` method. This method is meant to be overridden by subclasses that define more specific behavors. |<pre>    void sound() {</pre> |
| Print the message \"Animal makes a sound\" to the console using the `System.out.println()` function. | <pre>	System.out.println("Animal makes a sound");</pre> |
| Close curly braces to end the `Animal` class definition. | <pre>    }<br>}</pre> |

| Description | Example |
|--------|--------|
| The `Dog` class inherits from the `Animal` class. | <pre>class Dog extends Animal {</pre> |
| `Dog` overrides the `sound()` method to provide a specific implementation: \"Dog barks\". The @Override annotation tells the compiler that this method replaces the `sound()` method from `Animal`. | <pre>    @Override</pre> |
| Include a `sound()` method to print the message \"Dog barks\". |<pre>    void sound() {</pre> |
| Print the message to the console using the `System.out.println()` function. | <pre>	System.out.println("Dog barks");</pre> |
| Close curly braces to end the `Dog` class definition. | <pre>    }<br>}</pre> |

| Description | Example |
|--------|--------|
| The `Cat` class inherits from the `Animal` class. | <pre>class Cat extends Animal {</pre> |
| `Cat` overrides the `sound()` method to provide a specific implementation: \"Cat meows\". The @Override annotation tells the compiler that this method replaces the `sound()` method from `Animal`. | <pre>    @Override</pre> |
| Include a `sound()` method to print the message \"Cat meows\". |<pre>    void sound() {</pre> |
| Print the message to the console using the `System.out.println()` function. | <pre>	System.out.println("Cat meows");</pre> |
| Close curly braces to end the `Cat` class definition. | <pre>    }<br>}</pre> |

| Description | Example |
|--------|--------|
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main {</pre> |
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. |<pre>    public static void main(String[] args) {</pre> |
| Creates an instance of `Animal` and stores it in a variable `myAnimal`. | <pre>	Animal myAnimal = new Animal();</pre> |
| The `Dog` object is stored in an `Animal` reference. Since Dog overrides the sound() method, Java uses dynamic method dispatch to call the overridden method in `Dog`, not in `Animal`. | <pre>	myAnimal = new Dog();</pre> |
| Since `myAnimal` is a regular `Animal` object, calling `myAnimal.sound()` executes the `sound()` method from the `Animal` class. | <pre>	myAnimal.sound();</pre> |
| The `Cat` object is stored in an `Animal` reference. Since Cat overrides the sound() method, Java uses dynamic method dispatch to call the overridden method in `Cat`, not in `Animal`. | <pre>	myAnimal = new Cat();</pre> |
| Since `myAnimal` is a regular `Animal` object, calling `myAnimal.sound()` executes the `sound()` method from the `Animal` class. | <pre>	myAnimal.sound();</pre> |
| Close curly braces to end the `Main` class definition. | <pre>    }<br>}</pre> |

**Explanation:** In this example, `Animal` is a superclass with a method called `sound()`. Both `Dog` and `Cat` classes extend `Animal`, providing their own implementation of the `sound()` method. When we create an `Animal` reference and assign it to different subclasses (Dog and Cat), the appropriate `sound()` method is called at runtime based on the object type. This allows for more dynamic and flexible code.


## Creating virtual methods

| Description | Example |
|--------|--------|
| Create a superclass named `Animal`, which serves as a base class for other classes that might inherit from it. | <pre>class Animal {</pre> |
| Include a `sound()` method. This method is meant to be overridden by subclasses that define more specific behavors. |<pre>    void sound() {</pre> |
| Print the message \"Animal makes a sound\" to the console using the `System.out.println()` function. | <pre>	System.out.println("Animal makes a sound");</pre> |
| Close curly braces to end the `Animal` class definition. | <pre>    }<br>}</pre> |

| Description | Example |
|--------|--------|
| The `Dog` class inherits from the `Animal` class. | <pre>class Dog extends Animal {</pre> |
| `Dog` overrides the `sound()` method to provide a specific implementation: \"Dog barks\". The @Override annotation tells the compiler that this method replaces the `sound()` method from `Animal`. | <pre>    @Override</pre> |
| Include a `sound()` method to print the message \"Dog barks\". |<pre>    void sound() {</pre> |
| Print the message to the console using the `System.out.println()` function. | <pre>	System.out.println("Dog barks");</pre> |
| Close curly braces to end the `Dog` class definition. | <pre>    }<br>}</pre> |

| Description | Example |
|--------|--------|
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main {</pre> |
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. |<pre>    public static void main(String[] args) {</pre> |
| Creates an instance of `Animal` and stores it in a variable `myAnimal`. | <pre>	Animal myAnimal = new Dog();</pre> |
| Since `myAnimal` is a regular `Animal` object, calling `myAnimal.sound()` executes the `sound()` method from the `Animal` class. | <pre>	myAnimal.sound();</pre> |
| Close curly braces to end the `Main` class definition. | <pre>    }<br>}</pre> |

**Explanation:** In this example, even though `myAnimal` is an `Animal`, the `sound()` method from the `Dog` class is called, demonstrating virtual method behavior.


::page{title="Designing interfaces and abstract classes"}

## Creating an interface

| Description | Example |
|--------|--------|
| Declare an `Animal` interface. | <pre>interface Animal {</pre> |
| Include a method `sound()`. Any class that implements this interface must provide an implementation of `sound()`. |<pre>    void sound();</pre> |
| Close curly braces to end the interface definition. | <pre>}</pre> |

| Description | Example |
|--------|--------|
| Create a `Dog` class that implements the `Animal` interface. | <pre>class Dog implements Animal {</pre> |
| Include a `sound()` method for the class. |<pre>    public void sound() {</pre> |
| Calling `sound()` prints \"Bark\" to the console using the `System.out.println()` function. | <pre>	System.out.println("Bark");</pre> |
| Close curly braces to end the `Dog` class definition. | <pre>    }<br>}</pre> |

| Description | Example |
|--------|--------|
| Create a `Cat` class that implements the `Animal` interface. | <pre>class Cat implements Animal {</pre> |
| Include a `sound()` method for the class. |<pre>    public void sound() {</pre> |
| Calling `sound()` prints \"Meow\" to the console using the `System.out.println()` function. | <pre>	System.out.println("Meow");</pre> |
| Close curly braces to end the `Cat` class definition. | <pre>    }<br>}</pre> |

| Description | Example |
|--------|--------|
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main {</pre> |
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. |<pre>    public static void main(String[] args) {</pre> |
| Create the `Dog` object and assign it to the variable `dog`. |<pre>    	Animal dog = new Dog();</pre> |
| Create the `Cat` object and assign it to the variable `cat`.  |<pre>    	Animal cat = new Cat();</pre> |
| Call `sound()` on the `dog` object. This prints the message \"Bark\". |<pre>    	dog.sound();</pre> |
| Call `sound()` on the `cat` object. This prints the message \"Meow\".  |<pre>    	cat.sound();</pre> |
| Close curly braces to end the `Main` class definition. | <pre>    }<br>}</pre> |

**Explanation:** In this example, we define an interface `Animal` with a method `sound()`. The `Dog` and `Cat` classes implement the `Animal` interface and provide their own versions of the `sound()` method. In the `Main` class, we create instances of `Dog` and `Cat`, calling the `sound()` method on each to demonstrate polymorphism.

## Creating an abstract class

| Description | Example |
|--------|--------|
| Create an abstract class `Shape` that cannot be instantiated directly. | <pre>abstract class Shape {</pre> |
| Include an abstract method `draw()` that must be implemented by any subclass. |<pre>    abstract void draw();</pre> |
| Include a concrete method `display()` that has a default implementation. |<pre>    void display() {</pre> |
| Calling the `display()` method prints \"This is a shape.\" to the console using the `System.out.println()` function. | <pre>	System.out.println("This is a shape.");</pre> |
| Close curly braces to end the `Dog` class definition. | <pre>    }<br>}</pre> |

| Description | Example |
|--------|--------|
| Create a `Circle` class that extends the `Shape` class. | <pre>class Circle extends Shape {</pre> |
| Include a `draw()` method for the class. |<pre>    public void draw() {</pre> |
| Calling the `draw()` method prints \"Drawing Circle\" to the console using the `System.out.println()` function. | <pre>	System.out.println("Drawing Circle");</pre> |
| Close curly braces to end the `Dog` class definition. | <pre>    }<br>}</pre> |

| Description | Example |
|--------|--------|
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main {</pre> |
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. |<pre>    public static void main(String[] args) {</pre> |
| The `shape` object is instantiated from the `Shape` class but it refers to a `Circle` object. |<pre>    	Shape shape = new Circle();</pre> |
| Calling `draw()` on the `shape` object prints \"Drawing Circle\". |<pre>    	shape.draw();</pre> |
| Calling `display()` on the `shape` object prints \"This is a shape.\"  |<pre>    	shape.display();</pre> |
| Close curly braces to end the `Main` class definition. | <pre>    }<br>}</pre> |

**Explanation:** In this example, we define an abstract class `Shape` with an abstract method `draw()` and a concrete method `display()`. The `Circle` class extends the `Shape` class and provides an implementation for the `draw()` method. In the `Main` class, we create an instance of `Circle` using the `Shape` reference type to show how it works. The `draw()` method executes the overridden version from `Circle`. The `display()` method is inherited from `Shape` and is called as is.


::page{title="Inner classes in Java"}

## Creating inner classes

| Description | Example |
|--------|--------|
| Create an `OuterClass` that works as a container for the inner class. | <pre>class OuterClass {</pre> |
| Set the value of the `int` `outerVariable` to 10. | <pre>    int outerVariable = 10;</pre> |
| Create a classs `InnerClass` inside the `OuterClass`. | <pre>    class InnerClass {</pre> |
| Include a method `display()` that accesses `OuterVariable` from the outer class. Inner classes have direct access to the outer class\'s members (including private ones). |<pre>	void display();</pre> |
| Calling the `display()` method prints the `outerVariable` value to the console using the `System.out.println()` function. The `outerVariable` value is generated dynamically. | <pre>	   System.out.println("Outer variable value: " + outerVariable);</pre> |
| Close curly braces to end the `OuterClass` class definition. | <pre>    	}<br>    }<br>}</pre> |

**Explanation:** In this example, `OuterClass` contains a variable `outerVariable`. `InnerClass` is defined inside `OuterClass` and has a method `display()`. This method can access `outerVariable` directly.

## Using inner classes

| Description | Example |
|--------|--------|
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main {</pre> |
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. |<pre>    public static void main(String[] args) {</pre> |
| Create an instance of the `OuterClass`. This is necessary because non-static inner classes require an instance of the outer class to be created first. | <pre>    	OuterClass outer = new OuterClass();</pre> |
| Create a classs `InnerClass` inside the `OuterClass`. Since `InnerClass` is a non-static inner class, it must be created using an instance of `OuterClass`. | <pre>    	OuterClass.InnerClass inner = outer.new InnerClass();</pre> |
| Call the `display()` method inside `InnerClass`. | <pre>    	inner.display();</pre> |
| Close curly braces to end the `Main` class definition. | <pre>    }<br>}</pre> |

**Explanation:** In this example, `InnerClass` is nested inside `OuterClass` and has access to all outer class\'s members. The `display()` method will print the value of the `outerVariable`. The code demonstrates encapsulation in Java.

## Creating a static nested classes

| Description | Example |
|--------|--------|
| Create an `OuterClass` that works as a container for the inner class. | <pre>class OuterClass {</pre> |
| Set the value of the `int` `outerVariable` to 20. | <pre>    static int staticVariable = 20;</pre> |
| Create a classs `InnerClass` inside the `OuterClass`. | <pre>    static class StaticNestedClass {</pre> |
| Include a method `show()` that accesses `OuterVariable` from the outer class. Inner classes have direct access to the outer class\'s members (including private ones). |<pre>	void show();</pre> |
| Calling the `show()` method prints the `outerVariable` value to the console using the `System.out.println()` function. The `outerVariable` value is generated dynamically. | <pre>	    System.out.println("Static variable value: " + staticVariable);</pre> |
| Close curly braces to end the `OuterClass` class definition. | <pre>    	}<br>    }<br>}</pre> |

**Explanation:** In this example, `OuterClass` contains a static variable named `staticVariable` with a value of 20. Since the variable is static, it belongs to the class itself rather than an instance. Static nested classes do not require an instance of the outer class. It can access `staticVariable` without an instance of `OuterClass`. The nested class keeps related logic inside `OuterClass`, improving organization.

## Using a static nested classes

| Description | Example |
|--------|--------|
| A Java class named `Main` with a `main` method. The `main` method is the entry point of the program. | <pre>public class Main {</pre> |
| The `main` method is declared using `public static void main(String[] args)`. This method is required for execution in Java programs. |<pre>    public static void main(String[] args) {</pre> |
| Create an instance of `StaticNestedClass` inside the `OuterClass`. | <pre>    	OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();</pre> |
| Include a method `nested.show()` that prints the value of the `staticVariable` from `OuterClass`. |<pre>	nested.show();</pre> |
| Close curly braces to end the `OuterClass` class definition. | <pre>    	}<br>    }<br>}</pre> |

## Creating a method-local inner class

| Description | Example |
|--------|--------|
| Create an `OuterClass` with a method myMethod() that will define and use a method-local inner class.| <pre>class OuterClass {<br>    void myMethod() {</pre> |
| Define a class `MethodLocalInner` inside `myMethod()`. `MethodLocalInner` is local to the method, meaning that it cannot be accessed outside of `myMethod()`. Calling `MethodLocalInner` prints the message \"Inside Method Local Inner Class\" to the console using the `System.out.println()` function. | <pre>    	class MethodLocalInner {<br>	    void display() {<br>	    	System.out.println("Inside Method Local Inner Class");<br>	    }<br>	}<br></pre> |
| The inner class is instantiated within the method where it is defined. |<pre>	MethodLocalInner inner = new MethodLocalInner();</pre> |
| `inner.display()` calls the `display()` method, printing \"Inside Method Local Inner Class\". |<pre>	inner.display();</pre> |
| Close curly braces to end the `OuterClass` class definition. | <pre>    }<br>}</pre> |

## Creating an anonymous inner class

| Description | Example |
|--------|--------|
| The `Greeting` interface defines a single method `greet()`, which must be implemented by any class that uses this interface.| <pre>interface Greeting {<br>void greet();<br>}</pre> |
| This creates an anonymous inner class that implements the `Greeting` interface. The anonymous class provides an implementation for the `greet()` method at the moment of object creation. | <pre>public class Main {<br>    public static void main(String[] args) {<br>	Greeting greeting = new Greeting() {<br>	    public void greet() {<br>		System.out.println("Hello from Anonymous Inner Class!");<br>	    }<br>	};<br></pre> |
| This calls the overridden `greet()` method in the anonymous inner class, printing \"Hello from Anonymous Inner Class!\". |<pre>	greeting.greet(); </pre> |
| Close curly braces to end the `Main` class definition. | <pre>    }<br>}</pre> |

## Using inner classes in the real world

| Description | Example |
|--------|--------|
| The `Library` class represents a library and has a private variable `libraryName` to store its name. A constructor initializes `libraryName`. | <pre>class Library {<br>    private String libraryName;<br>    public Library(String name) {<br>	this.libraryName = name;<br>    }</pre> |
| Nested inside `Library`, this class represents a book. It has two private attributes: `title` and `author`. The `Book` class has a constructor to initialize these attributes. The `displayBookInfo()` method prints the book\'s title and author. It also accesses `libraryName` from `Library`, demonstrating how inner classes can access private members of the outer class. | <pre>class Book {<br>    private String title;<br>    private String author;<br>    public Book(String title, String author) {<br>	this.title = title;<br>	this.author = author;<br>    }<br>    public void displayBookInfo() {<br>	System.out.println("Library: " + libraryName);<br>	System.out.println("Book Title: " + title);<br>	System.out.println("Author: " + author);<br>    }<br>}</pre> |
| This creates a `Library` instance named \"City Library\" and creates a `Book` instance associated with that library. Since `Book` is a non-static inner class, it must be created using an instance of Library. The `displayBookInfo()` method in the `Book` inner class prints out the name of the library along with the book\'s title and author.|<pre>public class Main {<br>    public static void main(String[] args) {<br>	Library myLibrary = new Library("City Library");<br>	Library.Book myBook = myLibrary.new Book("1984", "George Orwell");<br>	myBook.displayBookInfo();</pre> |
| Close curly braces to end the `Main` class definition. | <pre>    }<br>}</pre> |


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
| 2025-03-04 | 0.2 | A.Narula  | Cheatsheet completed |
| 2025-03-05 | 0.3 | A.Hansis  | Content QA |
-->
