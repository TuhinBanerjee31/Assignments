# Assignment 14

## 1. What is Mutable String in Java. Explain with example ?

- Mutable String in Java states that after creating a object of String class we can change it over time as per the requirement of the program and JVM doesn't create a new object on the change. The Two ways to create mutable strings are **StringBuffer** and **StringBuilder**. Example:-
```
 StringBuffer str1 = new StringBuffer("Hello");
 StringBuilder str2 = new StringBuilder("World");
 ```

## 2. WAP to reverse a String ?

```
public class Qs2 {
    public static void main(String args[]) {
        String str= "PWSKILLS";
        String res= "";
        for(int i=str.length()-1; i>=0; i--){
            res= res+str.charAt(i);
        }

        System.out.println(res);
    }
}
```

## 3. WAP to reverse a sentence while preserving the position ?
```
public class Qs3{
    public static void main(String args[]) {
        String str= "Think Twice";
        String arr[]= str.split(" ");
        String res= "";

        for(int i=0; i<arr.length; i++){
            for(int j=arr[i].length()-1; j>=0; j--){
                res= res+arr[i].charAt(j);
            }

            res=res+" ";
        }

        System.out.println(res);
    }
}
```

## 4. WAP to sort a String alphabetically .
```
import java.util.*;

public class pw3 {
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);

        String str= in.nextLine();

        char arr[]= str.toCharArray();

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    char temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
```