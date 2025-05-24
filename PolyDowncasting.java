class Plane {
    void fly() {
        System.out.println("Plane is flying");
    }
}

class CargoPlane extends Plane {
    void fly() {
        System.out.println("Cargo plane is flying at low height");
    }

    void carryCargo() {
        System.out.println("Cargo plane is carrying cargo");
    }
}

class PassengerPlane extends Plane {
    void fly() {
        System.out.println("Passenger plane is flying at medium height");
    }

    void carryPassenger() {
        System.out.println("Passenger plane is carrying passengers");
    }
}

class FighterPlane extends Plane {
    void fly() {
        System.out.println("Fighter plane is flying at great height");
    }

    void carryWeapons() {
        System.out.println("Fighter plane is carrying weapons");
    }
}

public class PolyDowncasting {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        Plane ref;

        // 1. CargoPlane
        ref = cp;
        ref.fly();
        if (ref instanceof CargoPlane) {
            ((CargoPlane) ref).carryCargo();
        }

        // 2. PassengerPlane
        ref = pp;
        ref.fly();
        if (ref instanceof PassengerPlane) {
            ((PassengerPlane) ref).carryPassenger();
        }

        // 3. FighterPlane
        ref = fp;
        ref.fly();
        if (ref instanceof FighterPlane) {
            ((FighterPlane) ref).carryWeapons();
        }
    }
}
