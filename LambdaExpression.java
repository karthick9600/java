package project6789;
//File: LambdaExample.java
import java.util.*;

@FunctionalInterface
interface MathOperation {
 int operate(int a, int b);
}

public class LambdaExpression {
 public static void main(String[] args) {
     
     // 1. Lambda Expression with Functional Interface
     MathOperation addition = (a, b) -> a + b;
     MathOperation multiplication = (a, b) -> a * b;

     System.out.println("Addition: " + addition.operate(10, 5));
     System.out.println("Multiplication: " + multiplication.operate(10, 5));

     // 2. Lambda Expression for sorting a list
     List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
     System.out.println("Before sorting: " + names);

     // Sort using lambda
     Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
     System.out.println("After sorting: " + names);

     // 3. Lambda Expression with Thread
     Thread thread = new Thread(() -> {
         System.out.println("Thread is running using Lambda Expression!");
     });

     thread.start();
 }
}



