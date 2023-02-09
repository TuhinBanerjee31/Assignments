# Assignment 9

## 1. What do you mean by an Array ?

- It is an Data Structure where we store elements of similar data type in a contiguous memory location.

## 2. How to create an Array ?

- Syntax :- **int arr[] = new int[size]**, it represents an array of integer type.

## 3. Can we change the size of an array at run time ?

- After initialization of size once we cannot change it .

## 4. Can you declare an array without assigning the size of an array ?

- Yes. We can declare an array without size but before using it needs to be initialized.

## 5. What is the default value of Array ?

- The Default value of array is 0.

## 6. What is a 1D array with an example ?

- Data Structure which deals with storage of similar type of data in contiguous mannner and it has only one parameter. Example:- **int num[]= new int[3];** .

## 7. Write a program on a 2D array ?

- A Program to Print the values inside 2D array :-
  ```

  class assignment8 {

    public static void main(String[] args){
        int arr[][]= { {1,2,3}, {4,5,6}, {7,8,9} };

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
  }

  ```