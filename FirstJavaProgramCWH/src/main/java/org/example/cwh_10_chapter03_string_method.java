package org.example;
/* Java String Methods : length(), loLowerCase(), toUpperCase(), trim(), substring(), replace(), startsWith(), endsWith(), charAt(), indexOf(), lastIndexOf(), equals(), equalsIgnoreCase()*/
public class cwh_10_chapter03_string_method {
    public static void main(String[] args) {
        String name = "Harry";

        /*-- length() --*/
        System.out.println(name.length());  // 5

        System.out.println("--------------");

        /*-- toLowerCase() --*/
        String lName = name.toLowerCase();
        System.out.println(name); // Harry
        System.out.println(lName); // harry, **Returns a new copy of the original string in lower case

        System.out.println("----------------");

        /*-- toUpperCase() --*/
        String Uname = name.toUpperCase();
        System.out.println(name); // Harry
        System.out.println(name.toUpperCase()); // HARRY

        System.out.println("--------------");

        /*-- trim() --*/
        String nonTrimedString = "  Harry  ";
        String trimedString = nonTrimedString.trim();
        System.out.println(nonTrimedString); //     Harry
        System.out.println(trimedString);   //Harry

        System.out.println("-------------");

        /*-- substring() --*/
        String subsString1 = name.substring(1);
        String subsString2 = name.substring(1,3);
        System.out.println(subsString1); // arry
        System.out.println(subsString2); // ar

        System.out.println("------------");

        /*-- replace() --*/
        String replacedString1 = name.replace('r','p');
        String replacedString2 = name.replace("arry", "i!");
        System.out.println(replacedString1); //Happy
        System.out.println(replacedString2); // Hi!

        System.out.println("------------");

        /*-- startWith(), endsWith() --*/
        System.out.println(name.startsWith("Pa")); //false
        System.out.println(name.endsWith("ry")); //true

        System.out.println("-------------");

        /*-- charAt() --*/
        System.out.println(name.charAt(3)); //r

        System.out.println("-------------");

        /*-- indexOf() --*/
        String modifiedName = "Harryrryrry";
        System.out.println(modifiedName.indexOf("r")); // 2
        System.out.println(modifiedName.indexOf("rry",1)); //2
        System.out.println(modifiedName.indexOf("rry",4)); //5
        System.out.println(modifiedName.indexOf("rry",9)); //-1
        /*-- lastIndexOf() --*/
        System.out.println(modifiedName.lastIndexOf("rry")); // 8 -- counting index in reverse way
        System.out.println(modifiedName.lastIndexOf("rry",4)); // 2
        System.out.println(modifiedName.lastIndexOf("rry",7)); // 5

        System.out.println("-------------");

        /*-- equals(), equalsIgnoreCase() --*/
        System.out.println(name.equals("Harry")); //true
        System.out.println(name.equalsIgnoreCase("hArRy")); //true

        System.out.println("-------------");

        /*-- Escape sequence: '\' --*/
        System.out.println("I am a \"double quote.\" ");
        System.out.println("I am a, \n New line.");
        System.out.println("I am a \'single quote\'.");
        System.out.println("1\t Tap, 2\t \t Tap");
        System.out.println("Which fruit do you prefer? Mango\\Jack fruit?");

        System.out.println("-------------");


    }
}
