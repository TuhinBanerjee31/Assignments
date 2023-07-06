# Assignment 21

## 1. What do you mean by Multithreading? Why is it important ?

- Multithreading means multiple threads and is considered one of the most important features of Java. As the name suggests, it is the ability of a CPU to execute multiple threads independently at the same time but share the process resources simultaneously. Its main purpose is to provide simultaneous execution of multiple threads to utilise the CPU time as much as possible. It is a Java feature where one can subdivide the specific program into two or more threads to make the execution of the program fast and easy.

## 2. What are the benefits of using Multithreading ?

- There are various benefits of multithreading as given below: 
- - Allow the program to run continuously even if a part of it is blocked.
- - Improve performance as compared to traditional parallel programs that use multiple processes.
- - Allows to write effective programs that utilize maximum CPU time.
- - Improves the responsiveness of complex applications or programs.
- - Increase use of CPU resources and reduce costs of maintenance.
- - Saves time and parallelism tasks.
- - If an exception occurs in a single thread, it will not affect other threads as threads are independent.
- - Less resource-intensive than executing multiple processes at the same time.

## 3. What is Thread in Java ?

- Threads are basically the lightweight and smallest unit of processing that can be managed independently by a scheduler. Threads are referred to as parts of a process that simply let a program execute efficiently with other parts or threads of the process at the same time. Using threads, one can perform complicated tasks in the easiest way. It is considered the simplest way to take advantage of multiple CPUs availble in a machine. They share the common address space and are independent of each other.

## 4. What are the two ways of implementing thread in Java ?

- The two ways of implementing thread in Java are:-
- - **Extending the Thread class ~**
```
class MultithreadingDemo extends Thread
{
public void run()
{
System.out.println("My thread is in running state.");
}
public static void main(String args[])
{
MultithreadingDemo obj=new MultithreadingDemo();
obj.start();
}
}
```
- - **Implementing Runnable interface in Java ~**
```
class MultithreadingDemo implements Runnable
{
public void run()
{
System.out.println("My thread is in running state.");
}
public static void main(String args[])
{
MultithreadingDemo obj=new MultithreadingDemo();
Thread Obj =new Thread(obj);
tobj.start();
}
}
```

## 5. What's the difference between thread and process ?

- **Thread:** It simply refers to the smallest units of the particular process. It has the ability to execute different parts (referred to as thread) of the program at the same time.
- **Process:** It simply refers to a program that is in execution i.e, an active program. A process can be handled using PCB(Process Control Block).

## 6. How can we create daemon threads ?

- We can create daemon threads in java using the thread class setDaemon(true). It is used to mark the cureent thread as daemon thread or user thread.isDaemon() method is generally used to check whether the current thread is daemon or not. If the thread is a daemon, it will return otherwise it returns false.

## 7. What are the wait() and sleep() methods ?

- **wait():** As the name suggests, it is a non-static method that causes the current thread to wait and go to sleep until some other threads call the notify() or notifyAll() method for the object's monitor (lock). It simply releases the lock and is mostly used for inter-thread communication. It is defined in the object class, and should only be called from a synchronized context.
- **sleep():** As the name suggests, it is a static method that pauses or stops the execution of the current thread for some specified period. It doesn't release the lock while waiting and is mostly used to introduce pause on execution. It is defined in thread class, and no need to call from a synchronized context.