package org.example;

class Base1{
    public int x;
    public int getX() {return x;}
    public void setX(int x) {this.x = x;}

    Base1(){
        System.out.println("I am a 'Base1-class' constructor");
    }
    Base1(int x){
        System.out.println("I am a 'Base1-class' overloaded-constructor with value of 'x' as : " + x);
    }
}

class Derived1 extends Base1{
    public int y;
    public int getY() {return y;}
    public void setY(int y) {this.y = y;}

    Derived1(){
//        super(5);
        System.out.println("I am a 'Derived1-class' constructor");
    }
    Derived1(int x, int y){
//        super(x);
        System.out.println("I am a 'Derived1-class' overloaded-constructor with value y as : " + y);
    }
}

class ChildOfDerived1 extends Derived1{
    ChildOfDerived1(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived1(int x, int y, int z){
//        super(x,y);
        System.out.println("I am a overloaded constructor of Derived with value of z as: " + z);
    }
}

public class cwh_46_ch10_constructor_inheritance_theory {
    public static void main(String[] args) {
//        Base1 b = new Base1(); // Calls only the 'Base1' class constructor
//        Derived1 d = new Derived1(); // Calls the 'Base1' class first, then 'Derived1' class constructor
//        Derived1 d = new Derived1(10,20);
//        ChildOfDerived1 cd = new ChildOfDerived1();
//        ChildOfDerived1 cd = new ChildOfDerived1(30,40,50);
    }
}
