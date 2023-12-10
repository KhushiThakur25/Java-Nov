class Animal{
    void eat(){
        System.out.println("eating..");
    }
    void locomotion(){
        System.out.println("Movements of animals...");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("barking..");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = new Animal();
        d.bark();
        d.eat();
        d.locomotion();
        a.locomotion();

    }
}
