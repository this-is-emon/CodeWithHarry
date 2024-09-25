package org.example;

/** Inherirance Theory **/
class Base{
    int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

/** Quick Quiz :
 * Create a class Animal and derive another class Dog form it
 * **/
class Animal{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal{
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Woof! Woof!");
    }
}


public class cwh_45_ch10_inheritance_theory {
    public static void main(String[] args) {
        /** Inherirance Theory **/
        // Creating Object of 'Base'
        Base b = new Base();
        b.setX(1);
        System.out.println("Base value : " + b.getX());

        //Creating Object of 'Derived'
        Derived d = new Derived();
        d.setY(2);
        System.out.println("Derived value : " + d.getY());

        // Inheritance : setting and getting value form the SuperClass 'Base'
        // Using the object of the SubClass 'Derived'
        d.setX(99);
        System.out.println("Getting value from Base class : " + d.getX());

        System.out.println("---------------------------------------------");

        /** Quick Quiz :
         * Create a class Animal and derive another class Dog form it
         * **/
        Dog dog = new Dog();
        dog.setName("Theodor");
        dog.setAge(5);

        System.out.println("Hi " + dog.getName() + "!");
        System.out.println("Your age is " + dog.getAge() + "?");
        dog.makeSound();

    }
}
