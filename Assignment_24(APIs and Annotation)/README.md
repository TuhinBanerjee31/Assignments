# Assignment 24

## 1. Program to display current date and time in Java ?

```
import java.time.*;

public class DateTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time=LocalTime.now();
        System.out.println(time);
        }
    }
```

## 2. Write a program to convert a date to a string in the format "MM/dd/yyyy" .

```
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateToString {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 4, 4);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
        }
}
```

## 3. What is the difference between collections and streams ? Explain with an Example.

- **Collections:** It stores/holds all the data that the data structure currently has in a particular data structure like Set, List or Map. They don't use functionsl interface and are non-consumable i.e; can be traversable multiple times without creating it again. It supports parallel processing and can be very helpful in achieving high performance. Collections are iterated externally using loops. Example:-
```
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> CompanyList = new ArrayList<>();
        CompanyList.add("Google");
        CompanyList.add("Apple");
        CompanyList.add("Microsoft");
        Comparator<String> com = (String o1, String o2) -> o1.compareTo(o2);
        Collections.sort(CompanyList, com);
        for (String name : CompanyList) {
            System.out.println(name);
            }
        }
    }
```

- **Streams:** It doesn't store data, it operates on the source data structure i.e collection. They use functional interfaces like lambda which makes it a good fit for programming languages and are consumable i.e; to traverse the stream, it needs to be created every time. Java streams support both sequential and parallel processing. Streams are iterated internally by just mentioning the operations. Example:-
```
import java.io.*;
import java.util.*;

class Demo {
    public static void main(String[] args){
        List<String> CompanyList = new ArrayList<>();
        CompanyList.add("Google");
        CompanyList.add("Apple");
        CompanyList.add("Microsoft");
        CompanyList.stream().sorted().forEach(System.out::println);
        }
}
```

## 4. What is enums in Java ? Explain with an example.

- We can use enum to define a group of named constants.Enums are used to represent a collection of related constants that have a common purpose. Each constant in an enum is an instance of the enum type, and they are typically defined as public static final fields. Here's an example of how to define an enum in Java:
```
class EnumDemo{
public enum DayOfWeek {
MONDAY,
TUESDAY,
WEDNESDAY,
THURSDAY,
FRIDAY,
SATURDAY,
SUNDAY
}

public static void main(String args[]){
    for(DayOfWeek d:DayOfWeek.values())
    System.out.println(d);
    }
}
```

## 5. What are in built annotations in Java ?

- The built-in annotations in Java are:-
- - @Override
- - @Deprecated
- - @SuppressWarnings
- - @FunctionalInterface
- - @Retention
- - @Target
- - @Documented
- - @Inherited