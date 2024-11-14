package org.example;

/** 01:Create a class Circle and use inheritance to create another Class Cylinder from it **/
/** 03:Create a methods for area and volume in Q-1 **/
class Circle1{
    public double radious;

    public Circle1(double radious) {
        this.radious = radious;
    }
    public double getRadious(){
        return radious;
    }
    /** 03:Create a methods for area and volume in Q-1 **/
    public double cricleArea(){
        double area = Math.PI * radious * radious;
        return area;
    }
}
class Cylinder extends Circle1{
    public double height;
    public Cylinder(double radious, double height){
         super(radious);
         this.height = height;
    }
    public double getHeight(){
        return height;
    }
    /** 03:Create a methods for area and volume in Q-1 **/
    public double cylinderVolume(){
         double volume = super.getRadious() * height;
         return volume;
    }
}

/** 02:Create a class Rectangle and use inheritance to create another class Cuboid. Try to Reep it as close to real world scenario as possible **/
/** 04:Create method for area and volume in Q-2. Also create getters and setters **/
class Rectangle1{
    private double length;
    private double width;
    public Rectangle1(double length, double width){
        this.length = length;
        this.width = width;
    }
    // getter and setter for length
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    // getter and setter for width
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    // Method for calculating area of the rectangle
    public double area(){
        return length*width;
    }
}
class Cuboid extends Rectangle1{
    private double height;
    public Cuboid(double length,double width, double height ){
        super(length,width);
        this.height = height;
    }
    //getter and setter for Height
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        double volume = super.area()*height;
        return volume;
    }
}

public class cwh_46_ch10_constructor_inheritance_ps {
    public static void main(String[] args) {
        /** 01:Create a class Circle and use inheritance to create another Class Cylinder from it **/
        /** 03:Create a methods for area and volume in Q-1 **/
//        Circle1 myCircle1 = new Circle1(4.5);
//        System.out.println("Area : " + myCircle1.cricleArea());
//        Cylinder myCylinder = new Cylinder(myCircle1.getRadious(),5.5);
//        System.out.println("Volume : " + myCylinder.cylinderVolume());
        System.out.println("------------------------------------------");

        /** 02:Create a class Rectangle and use inheritance to create another class Cuboid. Try to Reep it as close to real world scenario as possible **/
        /** 04:Create method for area and volume in Q-2. Also create getters and setters **/
//        Rectangle1 myRectangle1 = new Rectangle1(5,3);
//        System.out.println("Area of Rectangle : " + myRectangle1.area());
//        Cuboid myCuboid = new Cuboid(4.5,4.6,4.7);
//        System.out.println("Volue of Cuboid : "+myCuboid.getVolume());
        System.out.println("------------------------------------------");


        /** 05:What is the order of consturctor execution for the following inheritance hierarchy :
         * Base
         * Derived1
         * Derived2
         * Derived2 obj = new Derived2();
         * Which Constructor will be executed and in what order ?
         * **/
        //System.out.println("Constructor execution order: Base --> Derived1 --> Derived2");
        System.out.println("------------------------------------------");
    }
}
