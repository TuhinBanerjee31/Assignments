# Assignment 22

## 1. What is the Collection framework in Java ?

- Collection Framework is a combination of classes and interface, which is used to store and maipulate the data in the form of objects. It provides various classes such as Arraylist, Vector, Stack, and HashSet, etc. and interface such as List, Queue, Set, etc. for this purpose.

## 2. What is the difference  between ArrayList and LinkedList?

- **ArrayList:-** ArrayList uses a dynamic array and is not efficient for manipulation. It is better to store and fetch data. Provides random access and takes less memory overhead as it stores only object.
- **LinkedList:-** LinkedList uses a doubly linked list and is efficient for manipulation. Doesn't provides random access and takes more memory overhead, as it stores the object as well as the address of that object.

## 3. What is the difference  between Iterator and ListIterator?

- **Iterator:-** The Iterator traverses the elements in the forward direction only. It can be used in List, Set and Queue. Also can perform a remove operation while traversing the collection.
- **ListIterator:-** ListIterator traverses the elements in backward and forward directions both. It can be used in List only. Also can perform add, remove and set operations while traversing the collection.

## 4. What is the difference  between Iterator and Enumeration?

- **Iterator:-** The Iterator can traverse legacy and non-legacy elements. It follows fail-fast and is slower than Enumeration. Also can perform a remove operation while traversing the collection.
- **Enumeration:-** Enumeration can traverse legacy elements. It doesn't follows fail-fast and is faster than Iterator. It can perform only traverse operations on the collection.

## 5. What is the difference  between List and Set?

- The List and Set both extend the collection interface. However, there are some differences between the two which are listed below:-
- - The List can contain duplicate elements whereas Set includes unique items.
- - The List is an ordered collection which maintains the insertion order whereas Set is an unordered collection which does not preserve the insertion order.
- - The List interface contains a single legacy class which is Vector class whereas the Set interface does not have any legacy class.
- - The List interface can allow a number of null values whereas Set interface only allows a single null value.

## 6. What is the difference  between HashSet and TreeSet?

- Both HashSet and TreeSet are implementations of the Set interface in java, but they have some differences in terms of their properties and usage:
- - **Ordering:-** HashSet is an unordered collection of elements, while TreeSet is a sorted set of elements based on their natural order or a custom comparator.
- - **Duplication:-** HashSet does not allow duplicate elements, while TreeSet does not allow duplicates as well.
- - **Implementation:-** HashSet is implemented using a hash table, while TreeSet is implemented using a self-balancing binary search tree (Red-Black tree).
- - **Performance:-** HashSet has constant-time complexity O(1) for adding, removing, and testing the existence of an element, while TreeSet has a logarithmic-time complexity O(log n) for these operations due to the self-balancing property.
- - **Memory Usage:-** HashSet uses less memory than TreeSet because it only stores the elements, while TreeSet stores additional information for maintaining the order.
- - **Iteration:-** HashSet provides no guarantees regarding the order of iteration, while TreeSet guarantees the elements are iterated in sorted order.
- **Usage:-** HashSet is suitable when ordering is not important, and fast access and membership tests are needed. TreeSet is suitable when elements need to be sorted or accessed in a specific order.

## 7. What is the difference  between Array and ArrayList?

- Both arrays and ArrayLists are used to store collections of elements in java, but they have some differences in terms of their properties and usage:-
- - **Type:-** Arrays can store elements of primitive data types as well as objects, while ArrayList can only store objects.
- - **Mutability:-** Arrays are mutable, meaning that you can modify the elements in an array after it has been created. ArrayList is also mutable, but the only way to modify it is by adding, removing or modifying elements.
- - **Performance:-** Arrays have better performance than ArrayLists for certain operations, such as accessing elements by index, because they are implemented as a continuous block of memory. ArrayLists, on the other hand, use dynamic memory allocation and are implemented as a dynamic array, which may result in more memory overhead and slower performance for certain operations.
- - **Methods:-** Arrays have a limited set of methods compared to ArrayLists, which provides more methods for manipulating the collection, such as adding, removing, and sorting elements.
- - **Initialization:-** Arrays can be initialized with values at the time of creation, while ArrayList requires the use of methods to add elements to the collection.
- - **Compatibility:-** Arrays are compatible with traditional for-loops and can be easily passed to other methods, while ArrayList requires the use of a special for-each loop and may require more code to be passed to other methods.