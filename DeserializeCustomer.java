package one;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Customer implements Serializable {
    private String name;
    private long crn;
    private float balance;

    // Constructor
    public Customer(String name, long crn, float balance) {
        this.name = name;
        this.crn = crn;
        this.balance = balance;
    }

    // Getter & Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCrn() {
        return crn;
    }

    public void setCrn(long crn) {
        this.crn = crn;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}

public class DeserializeCustomer {
    public static void main(String[] args) {
        String path = "F:\\one\\customer.ser";  // Serialized file path

        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Customer c = (Customer) ois.readObject();

            System.out.println("Name: " + c.getName());
            System.out.println("CRN: " + c.getCrn());
            System.out.println("Balance: " + c.getBalance());

            ois.close();
            fis.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
