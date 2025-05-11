package java;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Karthick");
        p.setAge(21);

        System.out.println("Name: " + p.getName());  // Fix: Print name
        System.out.println("Age: " + p.getAge());
    }
}
