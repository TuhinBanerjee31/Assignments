# Assignment 18

## 1. What is an interface in Java ?

- An interface in Java is a mechanism that is used to achieve complete abstraction. It is basically a kind of class that contains only constants and abstract methods.

## 2. Which modifiers are allowed for methods in an interface ? Explain with an example.

- Only abstract and public modifiers are allowed for methods in interfaces.

## 3. What is use of interface in Java? Or, why do we use an interface in Java ?

- There are many reasons to use interfaces in java. They are as follows:
- - An interface is used to achieve full abstraction.
- - Using interfaces is the best way to expose our project's API to some other project.
- - Programmers use interfaces to customise features of software differently for different objects.
- - By using interface, we can achieve the functionality of multiple inheritance.

## 4. What is the difference between abstract class and interface in Java?

- **Abstract Class**:- Abstract class can have abstract and non-abstract methods. Abstract class doesn't support multiple inheritance. Abstract class can have final, non-final, static and non-static variables. Abstract class can provide the implementation of interface. The abstract keyword is used to declare abstract class. An abstract class can extend another java class and implement multiple Java interfaces. An abstract class can be extented using the keyword "extends". A Java abstract class can have class members like private, protected, etc.
- **Interface**:- Interface can have only abstract methods. Since Java 8, it can have default and static methods also. Interface supports multiple inheritance. Interface has only static and final variables. Interface can't provide the implementation of abstract class. The interface keyword is used to declare the interface. An interface can extend another Java interface only. An interface can be implemented using the keyword "implements". Members of a Java interface are public by default.