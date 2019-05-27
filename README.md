# VTU Design and Analysis of Algorithms Lab
Subject Code: CSL47
- I chose ***Atom*** for the editor but i highly recommend you to use ***IntelliJ*** or ***Eclipse***.
- Include ***package*** while using any IDE other than Atom.

### Compile Code
```java
javac filename.java 
```
### Run Code
```java
java filename
```

## Programs

### 1A
Create a Java class called Student with the following details as variables within it. (i)	USN (ii)	Name (iii)	Branch (iv) Phone Write a Java program to create n Student objects and print the USN, Name, Branch, and Phone of these objects with suitable headings.
https://github.com/Euno257/VTU-Design-and-Analysis-of-Algorithm-Lab/blob/master/prog1a/Student.java

---
### 1B
Write a Java program to implement the Stack using arrays.Write Push(), Pop(), and Display() methods to demonstrate its working.
https://github.com/Euno257/VTU-Design-and-Analysis-of-Algorithm-Lab/blob/master/prog1b/StackMethods.java

---
### 2A
Design a superclass called Staff with details as StaffId, Name, Phone, Salary. Extend this class by writing three subclasses namely Teaching (domain, publications), Technical (skills), and Contract (period). Write a Java program to read and display at least 3 staff objects of all three categories.
https://github.com/Euno257/VTU-Design-and-Analysis-of-Algorithm-Lab/blob/master/prog2a/Staff.java

---
### 2B
Write a Java class called Customer to store their name and date_of_birth. The date_of_birth format should be dd/mm/yyyy. Write methods to read customer data as <name, dd/mm/yyyy> and display as <name, dd, mm, yyyy> using StringTokenizer class considering the delimiter character as “/”.
https://github.com/Euno257/VTU-Design-and-Analysis-of-Algorithm-Lab/blob/master/prog2b/Customer.java

---
### 3A
Write a Java program to read two integers a and b. Compute a/b and print, when b is not zero. Raise an exception when b is equal to zero.
https://github.com/Euno257/VTU-Design-and-Analysis-of-Algorithm-Lab/blob/master/prog3a/Test.java

---
### 3B
Write a Java program that implements a multi-thread application that has three threads. First thread generates a random integer for every 1 second; second thread computes the square of the number and prints; third thread will print the value of cube of the number.
https://github.com/Euno257/VTU-Design-and-Analysis-of-Algorithm-Lab/blob/master/prog3b/Mythread.java

---
### 4 
Sort a given set of n integer elements using Quick Sort method and compute its time complexity. Run the program for varied values of n> 5000 and record the time taken to sort. Plot a graph of the time taken versus non graph sheet. The elements can be read from a file or can be generated using the random number generator. Demonstrate using Java how the divide-and-conquer method works along with its time complexity analysis: worst case, average case and best case.
https://github.com/Euno257/VTU-Design-and-Analysis-of-Algorithm-Lab/blob/master/prog4/QuickSort.java

---
### 5
Sort a given set of n integer elements using Merge Sort method and compute its time complexity. Run the program for varied values of n> 5000, and record the time taken to sort. Plot a graph of the time taken versus non graph sheet. The elements can be read from a file or can be generated using the random number generator. Demonstrate using Java how the divide-and-conquer method works along with its time complexity analysis: worst case, average case and best case.
https://github.com/Euno257/VTU-Design-and-Analysis-of-Algorithm-Lab/blob/master/prog5/MergeSort.java

---
### 6A
Implement in Java, the 0/1 Knapsack problem using Dynamic Programming method.
https://github.com/Euno257/VTU-Design-and-Analysis-of-Algorithm-Lab/blob/master/prog6a/knapsack1.java

---
### 6B
Implement in Java, the 0/1 Knapsack problem using Greedy method.
https://github.com/Euno257/VTU-Design-and-Analysis-of-Algorithm-Lab/blob/master/prog6b/knapsack2.java

---
### 7
From a given vertex in a weighted connected graph, find shortest paths to other vertices using Dijkstra's algorithm. Write the program in Java.
https://github.com/Euno257/VTU-Design-and-Analysis-of-Algorithm-Lab/blob/master/prog7/Dijkstras.java

---
### 8
Find Minimum Cost Spanning Tree of a given connected undirected graph using Kruskal's algorithm. Use Union-Find algorithms in your program.
https://github.com/Euno257/VTU-Design-and-Analysis-of-Algorithm-Lab/blob/master/prog8/Kruskal.java

---
### 9
Find Minimum Cost Spanning Tree of a given connected undirected graph using Prim's algorithm.
https://github.com/Euno257/VTU-Design-and-Analysis-of-Algorithm-Lab/blob/master/prog9/Prims.java

---
### 10A 
Write Java programs to implement All-Pairs Shortest Paths problem using Floyd's algorithm.
https://github.com/Euno257/VTU-Design-and-Analysis-of-Algorithm-Lab/blob/master/prog10a/Floyds.java

---
### 10B
Write Java programs to implement Travelling Sales Person problem using Dynamic programming.
https://github.com/Euno257/VTU-Design-and-Analysis-of-Algorithm-Lab/blob/master/prog10b/TSP.java

---
### 11 
Design and implement in Java to find a subset of a given set S = {Sl, S2,.....,Sn} of n positive integers whose SUM is equal to a given positive integer d. For example, if S ={1, 2, 5, 6, 8} and d= 9, there are two solutions {1,2,6}and {1,8}. Display a suitable message, if the given problem instance doesn't have a solution.
https://github.com/Euno257/VTU-Design-and-Analysis-of-Algorithm-Lab/blob/master/prog11/Subset.java

---
### 12 
Design and implement in Java to find all Hamiltonian Cycles in a connected undirected Graph G of n vertices using backtracking principle.
