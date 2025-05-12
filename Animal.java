package java;

class Main {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Main {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public  static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // inherited method
        d.bark(); // own method
    }
}
