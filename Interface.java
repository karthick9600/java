package project6789;

import java.util.Scanner;

interface Calculator {
    void add();
    void sub();
}

class Mycalculator1 implements Calculator {
    public void add() {
        int a = 200;
        int b = 100;
        System.out.println(a + b); // fixed: a=b → a + b
    }

    public void sub() {
        int a = 200;
        int b = 100;
        System.out.println(a - b);
    }
}

class Mycalculator2 implements Calculator {
    public void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();
        System.out.println("Result: " + (a + b));
    }

    public void sub() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();
        System.out.println("Result: " + (a - b));
    }
}

class Mycalculator3 implements Calculator {
    public void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();

        if (a == b || b == 0) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Result: " + (a + b));
        }
    }

    public void sub() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Result: " + (a - b));
        }
    }
}

public class Interface {
    public static void main(String[] args) {
        Mycalculator1 mc1 = new Mycalculator1();
        Mycalculator2 mc2 = new Mycalculator2();
        Mycalculator3 mc3 = new Mycalculator3();

        mc1.add();
        mc1.sub();

        mc2.add();
        mc2.sub();

        mc3.add();
        mc3.sub();
    }
}
