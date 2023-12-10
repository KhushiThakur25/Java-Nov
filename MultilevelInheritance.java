class Animal {
    void eat() {
        System.out.println("eating..");
    }

    void locomotion() {
        System.out.println("Movements of animals...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking..");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.locomotion();
    }
}
