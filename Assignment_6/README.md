# Assignment 6

## 1. What are the Conditional Operators in Java ?

- In Java, conditional operators check the condition and decides the desired result on the basis of both conditions. It consists of **logical AND operator( && )**, **logical OR operator( || )** and **ternary operator**. 

## 2. What are the types of operators based on the number of operands ?

- The types of operators based on the number of operands are **Arithmetic operators, Unary operators, Assignment operator, Logical Operators and Relational Operators**.

## 3. What is the use of Switch case in Java programming ?

- The switch statement is a **multi-way branch statement**. The Java switch statement is use to **executes one statement from multiple conditions**. It is like an **if-else-if ladder statement**. It provides an easy way to dispatch execution to different parts of code based on the value of the expression. Basically, the expression can be a **byte, short, char, and int primitive data types**. It basically tests the equality of variables against multiple values.

## 4. What are the priority levels of arithmetic operation in Java ?

- The priority levels of arithmetic operation in Java are stated next in the **higher priority to lower priority order** :-  
- ** Parentheses( )**
- **Multiplication * , Division / , Modulus %**
- **Addition + , Subtraction -**
- **Assignment =**

## 5. What are the conditional Statements and use of conditional statements in Java ?

- Conditional statements are mostly **used in decision-making scenarios** which means these statements take a decision on the basis of some conditions. The conditional statements are also referred as **branching statements** because the program takes a decision based on the result of the assessed condition. Conditional statements which are present in Java are **if-elseif-else**, **switch-case** and **ternary operator**.

## 6. What is the syntax of if else statement ?

- Stating the if else statement syntax by a simple code snippet :-
 ```
if(true){
    System.out.println("TRUE");
}

else{
    System.out.println("FALSE");
}

 ```
 - The above snippet states that if the condition inside if statement is true the only it will print TRUE and if its not true then it will go to the else part and print FALSE.

## 7. What are the 3 types of iterative statements in java ?

- The 3 types of iterative statements in java are **for loop**, **while loop** and **do-while loop**.

## 8. Write the difference between for loop and do-while loop ?

- **For Loop:-** Statement is executed once the condition is checked, It might be that statement gets executed zero times, For the single statement, bracket is not compulsory, Initialization may be outside or in condition box, for loop is entry controlled loop.

- **do-while loop:-** Condition is checked after the statement is executed, Statement is executed at least once, Brackets are always compulsory, Initialization may be outside or within the loop, do-while is exit controlled loop.

## 9. Write a program to print numbers from 1 to 10.

```
class assignment {

    public static void main(String[] args){
        int n=10;

        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}
```