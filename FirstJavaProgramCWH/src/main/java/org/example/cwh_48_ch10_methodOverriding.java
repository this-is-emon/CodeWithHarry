package org.example;

class Animal2{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog2 extends Animal2{
    @Override
    void sound(){
        System.out.println("Dog barks!");
    }
    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

public class cwh_48_ch10_methodOverriding {
    public static void main(String[] args) {
        Animal2 myAnimal = new Dog2(); // Upcasting : "SuperClass obj = new SubClass"
        myAnimal.sound();
        // myAnimal.fetch(); // Error: fetch() is not defined in Animal class
    }
}
