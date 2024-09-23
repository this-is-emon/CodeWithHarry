package org.example;

/** 01.Create a class Cylinder and use getter and seeter to set it's radious and height **/
//class Cylinder{
//    private double radious;
//    private double height;
//
//    public void setRadious(double radious){
//        this.radious = radious;
//    }
//    public double getRadious(){
//        return radious;
//    }
//
//    public void setHeight(double height){
//        this.height = height;
//    }
//    public double getHeight(){
//        return height;
//    }
//}
/** 03.Use a constructor and repeat (Q-1) **/
//class Cylinder{
//    private double radious;
//    private double height;
//
//    public Cylinder(double radious, double height){
//        this.radious = radious;
//        this.height = height;
//    }

//    // In Case you want to change the 'radious' value further
//    public void setRadious(double radious){
//        this.radious = radious;
//    }
//    public double getRadious(){
//        return radious;
//    }
//    // In Case you want to change the 'height' value further
//    public void setHeight(double height){
//        this.height = height;
//    }
//    public double getHeight(){
//        return height;
//    }
//}

/** 04.Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameteres **/
//class Rectangle2{
//    private int length;
//    private int breadth;
//
//    public Rectangle2(){
//        this.length = 4;
//        this.breadth = 5;
//    }
//
//    public Rectangle2(int l, int b){
//        this.length = l;
//        this.breadth = b;
//    }
//
//    public int getLength(){
//        return this.length;
//    }
//    public int getBreadth(){
//        return this.breadth;
//    }
//}

/** 05.Repeat (Q-1) for a sphere
 * Create a class Sphere and use getter and seeter to set it's radious and height
 * **/
class Sphere{
    private double radious;

    //Constructor
    public Sphere(){
        this.radious = 5.5;
    }
    // Setter
    public void setRadious(double radious){
        this.radious = radious;
    }
    // Getter
    public double getRadious(){
        return radious;
    }

    public double getArea(){
        double surfaceArea = 4 * 3.1416 * this.radious * this.radious;
        return surfaceArea;
    }

    public double getVolume(){
        double volume = 4/3 * 3.1416 * this.radious * this.radious * this.radious;
        return volume;
    }

}



public class cwh_44_ch09_ps {
    public static void main(String[] args) {
        /** 01.Create a class Cylinder and use getter and seeter to set it's radious and height **/
        // See UP
        System.out.println("----------------------------------");

        /** 02.Use (Q-1) to calculate surface area and volume of the cylinder **/
//        Cylinder myCylinder = new Cylinder();
//        myCylinder.setRadious(4.5);
//        double r = myCylinder.getRadious();
//        myCylinder.setHeight(6.5);
//        double h = myCylinder.getHeight();
//
//        System.out.println("Surface area of the Cylinder: " + (2*3.1416*r*(r + h)));
//        System.out.println("Volume of the Cylinder: " + (3.1416*r*r*h));

        System.out.println("----------------------------------");

        /** 03.Use a constructor and repeat (Q-1) **/
//        Cylinder myCylinder = new Cylinder(3.5,5.6);
//        double r = myCylinder.getRadious();
//        double h = myCylinder.getHeight();
//        System.out.println("Surface Area : " + (2*3.1416*r*(r + h)));
//        System.out.println("Volume : " + (3.1416*r*r*h));
        System.out.println("----------------------------------");

        /** 04.Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameteres **/
//        Rectangle2 myRectangle2 = new Rectangle2();
//        System.out.println("Length : " + myRectangle2.getLength());
//        System.out.println("Breadth : " + myRectangle2.getBreadth());
//        System.out.println("----Length and Breadth after 'Constructor Overloading'----");
//        Rectangle2 yourRectangle2 = new Rectangle2(45,55);
//        System.out.println("Length : " + yourRectangle2.getLength());
//        System.out.println("Bredth : " + yourRectangle2.getBreadth());
//        System.out.println("----------------------------------");

        /** 05.Repeat (Q-1) for a sphere **/
        Sphere sphere = new Sphere();
        System.out.println("Using 'constructor value', sphere radious : " + sphere.getRadious());
        sphere.setRadious(10.5);
        System.out.println("Using 'Setter method', sphere radious : "  + sphere.getRadious());
        System.out.println("Surace Area : " + sphere.getArea());
        System.out.println("Volume : " + sphere.getVolume());
        System.out.println("----------------------------------");
    }
}
