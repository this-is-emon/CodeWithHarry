package org.example;

/** 01. Create a class Employee with the following properties and methods :
 * Salary (property int)
 * getSalary (method returning int)
 * name (property String)
 * getName(method returning String)
 * setName (method changing name)
 * **/
class Employee2{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String setName(String newName){
         name = newName;
         return name;
    }
}

/** 02. Create a class Cell with the following properties and methods :
 * ringing
 * vibrating
 * **/
class CellPhone{
    boolean ring;
    boolean vibrate;

    public void ringing(){
        if (ring == true) {
            System.out.println("Ringing!");
        }else{
            System.out.println("Not Ringing");
        }
    }
    public void vibrating(){
        if (vibrate == true) {
            System.out.println("Vibrating!");
        }else {
            System.out.println("Not Vibrating");
        }
    }

}

/** 03. Create a class Square with the following properties and methods :
 * side
 * calculateArea
 * calculatePerimeter
 * **/
class Square{
    double side;
    public double calculateArea(){
        return side*side;
    }
    public double calculatePerimeter(){
        return 4*side;
    }
}

/** 04. Create a class Rectangle with the following properties and methods :
 * side
 * calculateArea
 * calculatePerimeter
 * **/
class Rectangle{
    double side1;
    double side2;

    public double calculateArea(){
        return side1*side2;
    }
    public double calculatePerimeter(){
        return 2*(side1+side2);
    }

}

/** 05. Create a class TommyVecetti for Rockstar Games which capable of :
 * hitting (print hitting)
 * running
 * fireing etc
 * **/
class Tommy{
    public void hitting(){
        System.out.println("Hitting!");
    }
    public void running(){
        System.out.println("Running!");
    }
    public void fireing(){
        System.out.println("Fireing");
    }
}

/** 06. Create a class Circle with the following properties and methods :
 * radious
 * calculateArea
 * calculateCircumference
 * **/
class Circle{
    double radious;

    public double calculateArea(){
        return 3.14*radious*radious;
    }
    public double calculateCircumference(){
        return 2*3.14*radious;
    }
}

public class cwh_39_classItor_practice {
    public static void main(String[] args) {
        System.out.println("HI! Problem Solving starts");
        /** 01: **/
//        Employee2 emon = new Employee2();
//        emon.salary = 100;
//        emon.name = "Emon Mbs";

//        System.out.println("My Salary : " + emon.getSalary());
//        System.out.println("My Name : " + emon.getName());
//        System.out.println("My new Name : " + emon.setName("Md Islam"));
        System.out.println("---------------------------");

        /** 02: **/
//        CellPhone myPhone = new CellPhone();
//        myPhone.ring = false;
//        myPhone.vibrate = true;
//
//        myPhone.ringing();
//        myPhone.vibrating();

        System.out.println("---------------------------");

        /** 03: **/
//        Square mySquare = new Square();
//        mySquare.side = 5.00;
//
//        System.out.println(mySquare.calculateArea());
//        System.out.println(mySquare.calculatePerimeter());

        System.out.println("---------------------------");

        /** 04: **/
//        Rectangle myRectangle = new Rectangle();
//        myRectangle.side1 = 5.6;
//        myRectangle.side2 = 7.8;
//
//        System.out.println(myRectangle.calculateArea());
//        System.out.println(myRectangle.calculatePerimeter());

        System.out.println("---------------------------");

        /** 05: **/
//        Tommy myTommy = new Tommy();
//
//        myTommy.fireing();
//        myTommy.hitting();
//        myTommy.running();
//
        System.out.println("---------------------------");

        /** 06: **/
//        Circle myCircle = new Circle();
//        myCircle.radious = 4.5;
//
//        System.out.println(myCircle.calculateArea());
//        System.out.println(myCircle.calculateCircumference());

        System.out.println("---------------------------");
    }
}
