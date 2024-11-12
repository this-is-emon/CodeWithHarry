package org.example;

/** Main concepts of OOP(Object Oriented Programming) : **/

/** 1.Classes and Objects : **/
//Class definition
class Car{
    //instance variables(attributes)
    private String brand;
    private int year;

    //Constructor
    public Car(String brand,int year){
        this.brand = brand;
        this.year = year;
    }

    //Method
    public void start(){
        System.out.println(brand + " of year " + year + " is starting...");
    }
}

/** 2.INHERITANCE : Allows a class to inherit attributes and methods from another class **/
// Parent Class
class Animal1{
    protected String name;

    public void eat(){
        System.out.println("The animal is eating!");
    }
}
//Child Class
class Dog1 extends Animal1{
    public void bark(){
        System.out.println("Woff! Woff!");
    }
}

/** 3.ENCAPSULATION : Hiding internal details and provide public interface **/
class BankAccount{
    private double balance; // Private variable

    // public method
    public void addBalance(double amount){
        if (amount > 0) {
            balance = balance+amount;
        }
    }
    //getter
    public double getBalance(){
        return balance;
    }
}

/** 4.POLYMORPHISM : Same interface, different implementations **/
class Shape{
    public double getArea(){
        return 0;
    }
}

class Circle2 extends Shape{
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square1 extends Shape{
    private double side;

    @Override
    public double getArea() {
        return side * side;
    }
}

/** 5.ABSTRACTION : Using abstract classes and interfaces **/
abstract class Vehicle{
    abstract void move(); // abstract method
    public void stop(){ // concrete method
        System.out.println("The vehicle is stopped");
    }
}

//interface
interface Flyable{
    void fly();
    void land();
}

//implementing class
class Airplane extends Vehicle implements Flyable{

    @Override
    public void move(){
        System.out.println("Airplane is moving on runway");
    }

    @Override
    public void fly(){
        System.out.println("Airplane is flying");
    }

    @Override
    public void land(){
        System.out.println("Airplane is landing");
    }

}




public class cwh_36_oop_intro {
    public static void main(String[] args) {
        /** 1. Classes and Objects : **/
        Car myCar = new Car("Toyota",1924); // Creating Objects
        myCar.start(); // Calling method of 'Created Object'

        System.out.println("------------------------------------");

        /** 2.INHERITANCE **/
        Dog1 myDog = new Dog1();
        myDog.eat();
        myDog.bark();

        System.out.println("------------------------------------");

        /** 3.ENCAPSULATION **/
        BankAccount myBalance = new BankAccount();
        myBalance.addBalance(50.50);
        System.out.println(myBalance.getBalance());
        myBalance.addBalance(50.50);
        System.out.println(myBalance.getBalance());

        System.out.println("------------------------------------");

        /** 4.POLYMORPHISM **/
        Circle2 myCircle = new Circle2();
        System.out.println(myCircle.getArea());

        Square1 mySqare = new Square1();
        System.out.println(mySqare.getArea());

        System.out.println("------------------------------------");

        /** 5.ABSTRACTION **/
        Airplane myAirplane = new Airplane();
        System.out.println(myAirplane.fly());

    }
}
