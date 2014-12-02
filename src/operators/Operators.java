/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author ilovesoccer127
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        incrementAndModulus();
    }

    public static void incrementAndModulus() {
        int i = 10;
        int n = i++ % 5;
       // System.out.println("n = " + n); // it will print out "n = 0" 5/11 and return the remainder but it cant print out a decimal so it returns 0 
        // System.out.println("i = " + i); // it will print out "i = 11"  10 + 1 

        i = 10;
        int m = ++i % 5;
       // System.out.println("m = " + m); // it will print out "m = 1" because of order of operations and 5/10 = 0.5, returns 0, adds 1 
        // System.out.println("i = " + i); // it will print out "i = 11" i has been changed to = 11

    }

    public static void compoundAssignmentTest() {
        int result = 1 + 2; // result is now 3

        System.out.println(result);

        result = result - 1; // result is now 2

        System.out.println(result);

        result = result * 2; // result is now 4

        System.out.println(result);

        result = result / 2; // result is now 2

        System.out.println(result);

        result = result + 8; // result is now 10

        result = result % 7; // result is now 3

        System.out.println(result);

    }
    public static boolean toggleValue(boolean myValue){

          //write your code here
        return toggleValue(myValue);

     }
    
    public static void toggleValueTest (){

          //write your code here

          //declare a boolean variable called "bValue", and assign the value "false" to it
        boolean bValue = false;

          //print out the value of "bValue"
        System.out.println("bVlaue" + bValue);


        //call the toggleValue method using "bValue" as the parameter, and assign the result back into "bValue"
        toggleValue(bValue);
        //print out the value of "bValue" (note: this should now be "true")
        System.out.println("bValue" + bValue);
        //again call the toggleValue method using "bValue" as the parameter, and assign the result back into "bValue"
        toggleValue(bValue);
        //print out the value of "bValue" (note: this should now be "false")
        System.out.println("bValue" + bValue);
     }
}
