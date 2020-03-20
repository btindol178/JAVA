/** ***************************************************************************************************************************************
 * Programmer: Blake Tindol
 * BroncoNetID: bwy8022
 * Exercise05 random number
 * CIS 2600 Java for Business Applicaiton
 * Due date: 2/21/2020
 * Date completed: 2/17/2020
 *****************************************************************************************************************************************
 * Program description:
 * This program uses the java.util.scanner package to read the users input. The class Random number holds the main method where inside the
 * main method is a do while loop that has and if else statement. The two values guess and real answer are initialized first thing in the main method
 * Then the system prints out for you to pick a number from 1-5. Then the user prints a number from 1-5 in the system. If the number is greater than the real answer
 * Then the system will print out the number is too high. Else if the number is too small it will say too small. The while statement keeps the loop running until the number is met */
package randomnumber;

import java.util.Scanner; //importing the package that allows you to input data from user side

public class RandomNumber { // the class is named random number

    public static void main(String[] args) { // public static void initializes the main to hold no space(void)
        final int realanswer = 3; // here we initialize realanswer as 3 and as an intiger
        int guess; // here the answer that the user inputs is called guess

        System.out.println("Pick a number from 1 ~ 5"); // first the system will print out this statemetn
        Scanner input = new Scanner(System.in); // then you put in your number
        guess = input.nextInt(); // this holds the number you input
        do { // this starts the do while loop
            if (guess > realanswer) { // if what you guess is greater than the real answer in this case 3 then it will print this next statement
                System.out.println("The number you entered is too high"); // if true this will print out
                System.out.println("Please try again"); // as well as this
                guess = input.nextInt(); // this promps the user to input it iagain
            } else if (guess < realanswer) { // else if the guess is less than real answer or 3
                System.out.println("The number you entered is too small"); // then this will be output
                System.out.println("Please try again"); // this as well
                guess = input.nextInt(); // then promps the user to try again and input another value
            } else if (guess == realanswer) { // else if the users guess does equal real answer then print you

            }
        } while (guess != realanswer); // this will repeat as long as guess does not equal real answer
        System.out.println("You correctly entered " + guess); // if it is the same this will output
    }

}
