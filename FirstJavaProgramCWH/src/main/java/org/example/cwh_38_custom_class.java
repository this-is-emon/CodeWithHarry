package org.example;

class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My Id is: " + id);
        System.out.println("And my name is: " + name);
    }
    public int getSalary(){
        return salary;
    }
}

public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("HI! ");

        Employee emon = new Employee(); //Instantiating a new Object
        Employee harry = new Employee(); //Instantiating a new Object
        //Setting Attributes for emon
        emon.id = 12;
        emon.name = "Emon Mbs";
        emon.salary = 34;

        //Setting Attributes for harry
        harry.id = 50;
        harry.name = "Harry Puttar";
        harry.salary = 45;

        //Printing Attributes using Class method
        emon.printDetails();
        harry.printDetails();
        int emon_salary = emon.getSalary();
        System.out.println(emon_salary);
        int hary_salary = harry.getSalary();
        System.out.println(hary_salary);

    }
}
