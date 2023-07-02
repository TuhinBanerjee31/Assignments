# Assignment 15

## 1. Why do we need static keyword in Java Explain with an example?

- The static keyword in Java is mainly used for memory management. The static keyword in Java is used to share the same variable or method of a given class. The users can apply static keywords with variables, methods, blocks, and nested classes. The static keyword belongs to the class than an instance of the class. The static keyword is used for a constant variable or a method that is the same for every instance of a class.
```
EXAMPLE:- static int a=12;

static{
    System.out.print("Static Block");
}
```

## 2. What is class loading and how does the Java program actually executes?

- **Class loading** are responsible for loading Java classes dynamically to the JVM (Java Virtual Machine) during runtime. They're also part of the JRE (Java Runtime Environment). Therefore, the JVM doesn't need to know about the underlying files or file systems in order to run Java programs thanks to class loaders.
- A special application called a compiler, **executes our Java program** on what is known as a virtual Java machine (JVM). The compiler transforms source code into so-called JVM bytecode, or machine code read by JVM. In addition, the compiler should check the code for lexical and semantic issues and optimise it.

## 3. Can we mark a local variable as static.

- In Java, a static variable is a class variable (for whole class). So if we have static local variable (a variable with scope limited to function), it violates the purpose of static. Hence compiler does not allow static local variable. 

## 4. Why is the static block executed before the main method in java?

- The static blocks always execute first before the main() method in Java because the compiler stores them in memory at the time of class loading and before the object creation.

## 5. Why is a static method also called a class method ?

- A static method is a method that belongs to a class rather than an instance of a class. This means you can call a static method without creating an object of the class.

## 6. What is the use of static blocks in java ?

- Static block in java is used for changing the default value of static variables, initializing static variables of the class, write a set of codes that you want to execute during the class loading in memory.

## 7. Difference between Static and Instance variables ?

- **Static Variable:-**
- - Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block.
- - Static variables are created when the program starts and destroyed when the program stops.
- - Static variables can be accessed by calling with the class name ClassName.VariableName.
- - There would only be one copy of each class variable per class, regardless of how many objects are created from it.
- **Instance Variable:-**
- - Instance variables are declared in a class, but outside a method, constructor or any block.
- - Instance variables are created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed.
- - Instance variables can be accessed directly by calling the variable name inside the class. However, within static methods (when instance variables are given accessibility), they should be called using the fully qualified name. ObjectReference.VariableName.
- - Instance variables hold values that must be referenced by more than one method, constructor or block, or essential parts of an object's state that must be present throughout the class.

## 8. Difference between static and non static members?

- A static member is a class method and belongs to the class itself. This means you do not need an instance in order to use a static member. A non-static member is an instance method and belongs to each object that is generated from the class.
