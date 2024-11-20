package org.example;
/**
 * In Java, the super keyword is used to refer to the immediate parent class of the current object.
 * It plays a key role in inheritance by allowing a subclass to access properties, methods, and constructors of its parent class.
 * Here are the main uses of the super keyword:
 * */

/* 1. Access Parent Class's Methods */
class Parent{
    void display(){
        System.out.println("Display method of Parent class.");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("Display method of Child class.");
    }
    void show(){
        super.display(); // callig 'display' method of Parent class
    }
}

/* 2. Access Parent Class's Instance Variables */
class Parent2{
    String name = "Parent name";
}
class Child2 extends Parent2{
    String name = "Child name";

    void showName(){
        System.out.println("Parent name: " + super.name);
        System.out.println("Child name: " + this.name);
    }
}

/* 3. Invoke Parent Class's Constructor */
class Parent3{
    Parent3(String message){
        System.out.println("Parent3 constructor: " + message);
    }
}
class Child3 extends Parent3{
    Child3(){
        super("Message from child class");
        System.out.println("Child constructor.");
    }
}


public class cwh_47_ch10_super_keyWord {
    public static void main(String[] args) {
        /* 1. Access Parent Class's Methods */
        Child myChild = new Child();
        myChild.show();
        System.out.println("--------------------------");

        /* 2. Access Parent Class's Instance Variables */
        Child2 myChild2 = new Child2();
        myChild2.showName();
        System.out.println("--------------------------");

        /* 3. Invoke Parent Class's Constructor */
        Child3 myChild3 = new Child3();
        System.out.println(myChild3);
    }
}
