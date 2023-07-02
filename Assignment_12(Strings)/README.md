# Assignment 12

## 1. Write a simple String program to take input from user

```
import java.util.*;

class InputString{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str= sc.nextLine();
        System.out.println(str);
    }
}
```
## 2. How do you concatenate two strings in Java? Give an example?

- We can concatenate rather join two strings either by using "+" operator or by using inbuild string functions. Example:-
```
String str1= "Hello";
String str2= "World";
String res= str1+str2;
```

## 3. How do you find the length of a string in Java Explain with an example?

- We can find the length of a string in java mostly with the help of .length() function also we can do it with the help of an loop (least prefered way). Example:-
```
import java.util.*;

class CountString{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str= sc.nextLine();
        int len= str.length();
        System.out.println(len);
    }
}
```

## 4. How do you compare two strings in Java? Give an Example.

- We can find the length of a string in java mostly with the help of .equals() and .compareTo() method. Example:-
```
String str1="Hello";
String str2="Hello";

System.out.println(str1.equals(str2));
```

## 5. Write a program to find the length of the string "refrigerator".

```
class CountString{
    public static void main(String[] args) {

        String str= "refrigerator";
        int len= str.length();
        System.out.println(len);
    }
}
```

## 6. Write a program to check if the letter 'e' is present in the word "Umbrella".

```
class CheckString{
    public static void main(String[] args) {

        String str= "Umbrella";
        int flag=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'e'){
                flag=1;
                break;
            }
        }

        if(flag == 1){
            System.out.println("'e' is present in the string..");
        }
        else{
            System.out.println("'e' is not present in the string..");
        }
    }
}
```
## 6. Write a program to delete all consonants from the string "Hello, have a good day".

```
public class DelConsonants {
    public static void main(String[] args) {

        String str= "Hello, have a good day";
        String res= "";

        for(int i=0; i<str.length(); i++){

            if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u'){
                res=res+str.charAt(i);
            }
        }

        System.out.println(res);
    }
}
```
