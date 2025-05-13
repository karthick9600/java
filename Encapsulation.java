package com.Project;

// This class is properly encapsulated
class Encapsulation1 {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String newName) {
        name = newName;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

// Public class with main method
public class Encapsulation {
    public static void main(String[] args) {
        Encapsulation1 E = new Encapsulation1();
        E.setName("Karthick");
        E.setAge(25);

        System.out.println("Name: " + E.getName());
        System.out.println("Age: " + E.getAge());
    }
}
