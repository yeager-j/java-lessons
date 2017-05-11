import java.util.Arrays;

public class Lesson02 {
    /*
    Lesson 2: Loops
     */

    public static void main(String[] args) {
        /*
        First let's talk about reassigning variables. You can reassign any declared variable like this:
         */

        int n = 5;
        n = 10;

        System.out.println(n);

        /*
        You don't have to assign a variable a set value. You can simply add to the previous value.
         */

        int j = 5;
        j = j + 1;

        System.out.println(j);

        /*
        There is shorthand for adding a value to a variable. It is exactly the same as above, just quicker.
         */

        int k = 5;
        k += 1;

        System.out.println(k);

        /*
        If you're adding EXACTLY ONE and not any other number, you can do even quicker shorthand.
         */

        int l = 5;
        l++;

        System.out.println(l);

        /*
        Before we get into loops we should talk about arrays. Arrays are simply collections of data OF THE SAME TYPE.
         */

        int[] array = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array));

        /*
        This is a while loop. WHILE the shit inside the parenthesis is true, execute the code within the {}. Be careful
        with these as if the conditional is ALWAYS true you'll end up with an infinite loop and crash your program.
         */

        int i = 0;
        while(i < 10) {
            System.out.println("Value before incrementing: " + i);
            i++;
            System.out.println("Value after incrementing: " + i);
            System.out.println("---------------");
        }
    }
}
