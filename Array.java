/** *******************************************************************************************************************
 * Programmer: Blake Tindol
 * BroncoNetId: bwy8022
 * Exercise06: Arrays
 * CIS 2600: JAVA for Business Applications
 * Due date: 2/28/2020
 * Date Completed: 2/24/2020
 * ********************************************************************************************************************
 * Program Description
 * This program you declare a string of values and then print it using a enhanced loop then backwards with normal for loop 
 */
package array;

public class Array {

    public static void main(String[] args) {
        String[] colors = {"Red", "Blue", "Green", "Yellow", "Brown", "White", "Black", "Orange", "Azure", "Watermelon", "Bronze", "Byzantium", "Cerise", "Cerulean", "Blush"};

        System.out.println("Strings from first to last element subscript: ");
        for (String val : colors) {
            System.out.println(val);
        }

        System.out.println(" ");
        System.out.println("Strings from last to first element subscript: ");

        //Loop through the array in reverse order  
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i] + " ");

        }

    }
}