package org.example;
/* Example 01: On excess modifier */
class MyNewEmployee{
    private int id;
    private String name;

    // "Constructor" is a "Member function used to intialize an object while creating it
    /** Basic Constructor **/
//    public MyNewEmployee(){
//        this.id = 5;
//        this.name = "Jasim";
//    }

    /** Constructor taking parameters **/
//    public MyNewEmployee(int myId, String myName){
//        this.id = myId;
//        this.name = myName;
//    }

    /** Constructor Overloading **/
//    public MyNewEmployee(){
//        this.id = 5;
//        this.name = "Jasim";
//    }
//
//    public MyNewEmployee(int myId, String myName){
//        this.id = myId;
//        this.name = myName;
//    }

    public void setId(int num){ this.id = num; }
    public int getId(){ return id; }

    public void setName(String name){ this.name = name; }
    public String getName(){ return name; }
}

public class cwh_42_ch9_constructor {
    public static void main(String[] args) {
        /** For access modifier "Private" : **/
        MyNewEmployee emon = new MyNewEmployee();
        // Every time you have to call the setter function to set values for a new object
        // But if you use a "Constructor" which is a "Member function used to intialize an object while creating it
        emon.setId(10);
        emon.setName("Jerry");
        System.out.println(emon.getName());
        System.out.println(emon.getId());

        /** Basic Constructor **/
//        MyNewEmployee emon = new MyNewEmployee();
//        System.out.println(emon.getId());
//        System.out.println(emon.getName());

        /** Constructor taking parameters **/
//        MyNewEmployee emon = new MyNewEmployee(5,"Harry");
//        System.out.println(emon.getName());
//        System.out.println(emon.getId());

        /** Constructor overloading **/
//        MyNewEmployee emon = new MyNewEmployee();
//        System.out.println(emon.getId());
//        System.out.println(emon.getName());
//
//        MyNewEmployee emon2 = new MyNewEmployee(5,"Harry");
//        System.out.println(emon2.getName());
//        System.out.println(emon2.getId());


    }
}
