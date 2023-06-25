# Assignment 17

## 1. What is Constructor?

- Constructor in java is used to create the instance of the class. Constructors are almost similar to methods except for two things - its name is the same as the class name and it has no return type. Sometimes constructors are also referred to as special methods to initialize an object.

## 2. What is Constructor Chaining?

- Constructor chaining is the process of calling a sequence of constructors. We can do it in two ways: by using this() keyword for chaining constructors in the same class. by using super() keyword for chaining constructors from the parent class.

## 3. Can we call a subclass constructor from a superclass constructor?

- No, we cannot call subclass constructor from a superclass constructor.

## 4. What happens if you keep a return type for a constructor?

- If we add a return type to a constructor, then it will become a method of the class. This is the way java runtime distinguish between a normal method and a constructor. 

## 5. What is No-arg constructor?

- No-Arg Constructor - a constructor that does not accept any arguments.

## 6. How is a No-argument constructor different from the default Constructor?

- Default Constructor is a constructor that is automatically created by the Java compiler if it is not explicitly defined whereas, No-argument constructor is created by the programmer.

## 7. What do we need Constructor Overloading?

- If we want to have different ways of initializing an object using a different number of parameters, then we must do constructor overloading as we do method overloading when we want different definitions of a method based on different parameters.

## 8. What is Default constructor Explain with an Example?

- Default Constructor is a constructor that is automatically created by the Java compiler if it is not explicitly defined. When the Object is created in the main method that time inside the Data class Default Constructor gets created automatically. Example:-
```
class Data{
    public Data(){

    }
} 

public class test{
    public static void main(String args[]){
        Data obj= new Data();
    }
}