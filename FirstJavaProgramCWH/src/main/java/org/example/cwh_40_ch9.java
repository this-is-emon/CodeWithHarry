package org.example;
/** Access levels from most to least restrictive:
 * private → default → protected → public
 * Private : Only within the class
 * Default: Only within the package
 * Protected : Beteween package through INHERITANCE
 * Public : Between different package and classes
 * **/

/* Example 01: On excess modifier */
class MyEmployee{
    private int id;
    private String name;

    public void setId(int num){ this.id = num; }
    public int getId(){ return id; }

    public void setName(String name){ this.name = name; }
    public String getName(){ return name; }
}

/* Example 02: On excess modifier */
class MyCircle{
    private double radius;

    public void setRadious(double radius){
        if(radius <= 0){
            System.out.println("Radious must be greater then zero and a positive number.");
        }else
            this.radius = radius;
    }

    public double getRadius(){ return radius;}

    public double getArea(){
        double area = 3.1416 * this.radius * this.radius;
        return area;
    }
}

public class cwh_40_ch9 {
    public static void main(String[] args) {
        System.out.println("Hi!");

        /** Quick Quiz : myEmployee the getter and setter from the main method **/
        MyEmployee emon = new MyEmployee();
//        emon.id = 15;
//        emon.name = "Harry!"; // Thows and error due to private access modifires

//        emon.setId(15);
//        System.out.println(emon.getId());
//
//        emon.setName("Emon");
//        System.out.println(emon.getName());

        /** Quick Quiz : User the getter and setter from the main method **/
        MyCircle small = new MyCircle();
        small.setRadious(4.5);
        System.out.println("Radius is : " + small.getRadius());
        System.out.println("Area : " + small.getArea());


    }
}
