class Vehicle {
    void engine() {
        System.out.println("this is vehicle engine..");
    }
}

class Bike extends Vehicle {
    void engine() {
        System.out.println("this is a bike engine..");
    }
}

class Car extends Vehicle {
    void engine() {
        System.out.println("this is a car engine..");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Bike splendor = new Bike();
        splendor.engine();
        Car tata = new Car();
        tata.engine();

    }
}
