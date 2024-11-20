package org.example;

/** Below are the examples of the use of "this" keyword in Java **/

/** 1. Referencing Instance Variables **/
class ThisKeyWord{
    int x;

    ThisKeyWord(int x){
        this.x = x; // Refers to the instance variable x
        //Without this, x = x would assign the parameter to itself, leaving the instance variable unchanged
    }
}

/** 2. Calling Another Constructor(Constructor Chaining) in the same class **/
class Employee1 {
    String name;
    int age;
    String department;

    // Constructor for basic employee details
    Employee1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor for full-time employee details
    Employee1(String name, int age, String department) {
        this(name, age); // Reuse the basic constructor
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (department != null) {
            System.out.println("Department: " + department);
        } else {
            System.out.println("Department: Not Assigned");
        }
    }
}

/** 3. Passing the Current Object **/
/*this example demonstrates the concept of passing the 'current object' to another method to enable interaction between methods in the same class.*/
class Customer {
    void requestService() {
        System.out.println("Customer service requested.");
    }

    void referToSpecialist() {
        Specialist specialist = new Specialist();
        specialist.handleCustomer(this); // Passes the current customer to the specialist
    }
}

class Specialist {
    void handleCustomer(Customer customer) {
        customer.requestService(); // The specialist processes the customer's request
    }
}


/** 4. Returning the Current Object(Method Chaining) **/
class MobilePhone {
    int brightness;

    // The method's return type is MobilePhone, meaning it will return an object of the same class (MobilePhone)
    MobilePhone setBrightness(int level) {
        this.brightness = level; // Assign brightness level
        return this;             // Return the current object
    }

    void displaySettings() {
        System.out.println("Brightness level = " + brightness);
    }
}


/** 5. Referring to the Current Class's Method **/
class RestaurantWaiter {
    void takeOrder() {
        System.out.println("Order is taken and confirmed with the customer.");
        this.notifyKitchen(); // Inform the kitchen about the order
    }

    void notifyKitchen() {
        System.out.println("Order is sent to the kitchen for preparation.");
    }
}



public class cwh_47_ch10_this_keyWord {
    public static void main(String[] args) {
        /** 2. Calling Another Constructor(Constructor Chaining) in the same class **/
        // Create an intern with only name and age
        Employee1 intern = new Employee1("Alice", 22);

        // Create a full-time employee with name, age, and department
        Employee1 fullTime = new Employee1("Bob", 30, "Engineering");

        // Display details of both employees
        intern.displayDetails();
        System.out.println("---------------");
        fullTime.displayDetails();

        System.out.println("-----------------------------------------------");

        /** 3. Passing the Current Object **/
        Customer customer = new Customer();
        customer.referToSpecialist();

        System.out.println("-----------------------------------------------");

        /** 4. Returning the Current Object(Method Chaining) **/
        MobilePhone phone = new MobilePhone();
        // Set brightness using method chaining and display the settings
        phone.setBrightness(75).displaySettings();

        System.out.println("-----------------------------------------------");

        /** 5. Referring to the Current Class's Method **/
        RestaurantWaiter order = new RestaurantWaiter();
        order.takeOrder();

    }
}
