public class Lesson01 {
    /*
    Lesson 1: Variables and if statements
     */

    public static void main(String[] args) {
        /*
        Basic variables. You can assign a single value or you can assign the result of an operation.
         */

        int number = 10;
        boolean test = false;
        int add = 5 + 2;
        double decimal = 5.424 + 84.3;

        /*
        Printing out a value. You can print out a String (shit within quotes) or you can print out a variable.
         */

        System.out.println("Hello World!"); // "Hello World!"
        System.out.println(add); // 7


        /*
        Some basic if statements. The shit inside the parenthesis is what is being tested. If the result is true, then
        the code inside the {} gets executed.
         */

        if (number > add) {
            System.out.println("number > 20"); // Will print
        }

        if (number < decimal) {
            System.out.println("number < decimal"); // Will print
        }

        if (number <= decimal && add + 3 == 10) {
            System.out.println("number <= decimal AND add + 3 == 10"); // Will print
        }

        if (decimal + add == 102 || test) {
            System.out.println("decimal + add == 102 OR false"); // Will not print
        }

        /*
        These are if/else statements. As above, if the shit inside the parenthesis is true, the code below the if statement
        will be executed. However, if the shit inside the parenthesis is false, the code below the else statement will
        be executed.
         */

        if (decimal + add == 102 || test) {
            System.out.println("decimal + add == 102 OR false"); // Will not print
        } else {
            System.out.println("Ruh roh, the conditional is false!!"); // Will print
        }

        /*
        These are if/else if statements. Same concept as above, but slightly more advanced.
         */

        if (decimal + add == 102 || test) {
            System.out.println("decimal + add == 102 OR false"); // Will not print
        } else if (add + 3 == 10){
            System.out.println("Ruh roh, the conditional is false!!"); // Will print
        }

        /*
        You can chain if/else if/else statements together. However, you MUST put the else at the end if you choose to
        include it.
         */

        if (decimal + add == 102 || test) {
            System.out.println("decimal + add == 102 OR false"); // Will not print
        } else if (add + 3 > 10) {
            System.out.println("Ruh roh, the conditional is false!!"); // Will not print
        } else {
            System.out.println("Everything is false!! :(");
        }
    }
}