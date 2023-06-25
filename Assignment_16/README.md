# Assignment 16

## 1. What is Encapsulation in Java ? Why is it called Data hiding ?

- **Encapsulation** is a fundamental concept in object-oriented programming (OOP) that refers to the bundling of data and methods that operate on that data within a single unit, which is called a class in Java. Encapsulation is a way of hiding the implementation details of a class from outside access and only exposing a public interface that can be used to interact with the class.
- In Encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as **data hiding**.


## 2. What are the important features of Encapsulation?

- The Important features of Encapsulation are:-
- - By providing only a setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.
- - It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only, you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.
- - It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.
- - The encapsulate class is easy to test. So, it is better for unit testing.

## 3. What are getter and setter methods in Java Explain with an example ?

- For each instance variable, a getter method returns its value while a setter method sets or updates its value. Given this, getters and setters are also known as accessors and mutators, respectively. By convention, getters start with the word "get" and setters with the word "set", followed by a variable name. In both cases the first letter of the variable's name is capitalized:
```
public class Data {
  private String name;
  
  // Getter
  public String getName() {
    return name;
  }
  
  // Setter
  public void setName(String name) {
    this.name = name;
  }
}
```

## 4. What is the use of this keyword explain with an example ?

- In Java, ‘this’ is a reference variable that refers to the cunt object, or can be said “this” in Java is a keyword that refers to the current object instance. It can be used to call current class methods and fields, to pass an instance of the current class as a parameter, and to differentiate between the local and instance variables. Using “this” reference can improve code readability and reduce naming conflicts. Example:-
```
public class Data {
  private String name;
  
  public void setName(String name) {
    this.name = name;
  }
}
```


## 5. What is the advantage of Encapsulation?

- The advantages of Encapsulation are:-
- - Improves security of an object’s internal state by hiding it from the outside world.
- - Increases modularity and maintainability by making it easier to change the implementation without affecting other parts of the code.
- - Enables data abstraction, allowing objects to be treated as a single unit.
- - Allows for easy addition of new methods and fields without affecting the existing code.
- - Supports the object-oriented principle of information hiding, making it easier to change the implementation without affecting the rest of the code.

## 6. How to achieve encapsulation in Java? Give an example.

- In Java, encapsulation is achieved by declaring the instance variables of a class as private, which means they can only be accessed within the class. To allow outside access to the instance variables, public methods called getters and setters are defined, which are used to retrieve and modify the values of the instance variables, respectively. By using getters and setters, the class can enforce its own data validation rules and ensure that its internal state remains consistent. **EXAMPLE:-**
```

class Person {
    private String name;
    private int age;
 
    public String getName(){
        return name;
        }
 
    public void setName(String name){
        this.name = name;
        }
 
    public int getAge(){
        return age;
        }
 
    public void setAge(int age){
        this.age = age;
        }
}
 
public class Main {
    public static void main(String[] args)
    {
        Person person = new Person();
        person.setName("Alex");
        person.setAge(25);
 
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
```