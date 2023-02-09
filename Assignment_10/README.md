# Assignment 10

## 1. What is the default value of Array for different data types ?

- For Integer Data Type its **0** and for String it is **null**.

## 2. Can you pass the nagative number in Array size ?

- No negative number can be passed as an Array size.

## 3. Where does Array stored in JVM  memory ?

- It is stored in Heap area.

## 4. What are the disadvantages of Array ?

- The array is a static data structure with a fixed size so, the size of the array cannot be modified further and hence no modification can be done during runtime.
- Insertion and deletion operations are costly in arrays as elements are stored in contiguous memory.
- If the size of the declared array is more than the required size then, it can lead to memory wastage. 
- Resizing an array can be time-consuming, especially if it needs to be done frequently. This can be especially problematic for large arrays.
- No built-in functionality as weel as Arrays have limited support for object-oriented programming and cannot store objects.

## 5. What is an Anonymous Array in Java ? Give an example ?

- **An array without a name** is known as Anonymous Array in Java.  **For example new int[] {1,2,3,4};** .

## 6. What are the different ways to traverse an Array in java ?

- The different ways to traverse an Array in java are by using **for loop, while loop, do-while loop and enhanced-for loop**.

## 7. What is the difference between length and length() method. Give an Example ?

- The main difference betwwen length and length() is length is used for taking out the capacity size of the array like how many elements are present in array. And length() is used for give the count of the number of elements(individual characters including space) of a string. Example:- 

```
//FOR LENGTH
int arr[]= {12,43,11,6};
int sizeArray= arr.length;

//FOR LENGTH()
String str= "Hello There";
int sizeString= str.length();

```