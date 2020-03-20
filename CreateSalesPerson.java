/** ************************************************************************************************
 * Programmer: Blake Tindol
 * BroncoID: bwy8022
 * Lab 03: Create Sales Person (RECIPT)
 * CIS 2600: Business Application Programming
 * Spring 2020
 * Due date: 3/15/2020
 * Date completed: 3/13/2020
 * ***********************************************************************************
 * Program Explanation
 * This program uses a while loop to loop over program options Add a record,Change a record ,and Quit program. The user inputs an id that has to be all numbers that is verified through a method and has to be 8 characters long while not having been used
 * then the user has to input a name and a sales amount these values. if the user picks Change record instead of add record the user is asked to put in an id if it is not in system it will be prompted and if it is then the user can proceed to change the sales value the user will use method to check if id is in array
 * if the user decides to hit Q then the program quits and prints out the database
 * if the user wants to see the database at any time he can use P for print
 * set and get methods are used to store and compare values to find values in array
 * this is done like this because i though while loop would be easiest
 * ********************************************************************************************************************************************************************************
 */
package createsalesperson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CreateSalesPerson {

    private static final int MAX_ENTRIES = 20; // intiger that you cannot adjust that is the max limit of entries in an array 

    private static ArrayList<Salesperson> salespersons; // declarying an array Salesperson and assigning it to salespersons

    private static final int MAX_ID_CHAR_COUNT = 8; // this is the max character count variable holder will be used to see if the id is 8 characters long

    private static int CURRENT_SALESERSONS_COUNT = 0; // this will hold the count variable of sales persons

    public static void main(String[] args) {

        salespersons = new ArrayList<Salesperson>(MAX_ENTRIES); // if new sales person array is not as long as max entries (20) values then display()

        boolean choice = true; // this will be the users choice a variable to hold the value 
        while (choice) {
            displayMenu(); // displaying the display menu method that holds what you want to do 
            System.out.print("Please enter your choice : ");
            Scanner scanner = new Scanner(System.in); //Calling built in Scanner method from scanner package and assiging user input to scanner
            String option = scanner.nextLine(); //Calling built in Scanner method from scanner package and assiging user input to scanner
            if (option.equalsIgnoreCase("A")) { // if the option you pick is lowercase A then ignore and accept
                if (CURRENT_SALESERSONS_COUNT >= MAX_ENTRIES) { // if the sales persons count in array is larger or equal to max entries then the array is full 
                    System.out.println("Database (array) is full"); // print this message
                } else { // else
                    System.out.print("Please enter your ID : "); //if the choice is valid then this message to prompt user to enter id pops up
                    String ID = scanner.nextLine(); // prompt user to input the id

                    if (ID.toCharArray().length != MAX_ID_CHAR_COUNT) { // take the id and conver the string to character array and if the length is not equal to max id character coutn then
                        System.out.print("Please enter eight digits of your ID : "); // print this because its not 8 digits
                        ID = scanner.nextLine();  // prompt user to input value again 
                    }
                    boolean ifValid = validateID(ID); // validate that all of the characters in the id string is valid so make a boolean value that calls the method validate ID that checks to see if ID has letters or not
                    if (!ifValid) { // if ID does contain letters continue this loop
                        System.out.print("Id cannot contain letters. Please enter eight digits of your ID : "); //print this out if it does contain letters
                        ID = scanner.nextLine(); // promt user to try again 
                    }

                    boolean exists = checkIfIDExists(ID); // make a boolean value for loop by calling method that checks if ID is already in database array 
                    if (exists) { // if the id already exists the boolean value is true and this messgage pops up saying it already exists 
                        System.out.print("ID already exists in the database. Please try again.");
                    } else {
                        System.out.print("Please enter your name : "); // ask for the users name 
                        String name = scanner.nextLine(); // prompt them to put in a name 
                        System.out.print("Please enter sales value : "); // promt to ask sales value
                        float salesValue = scanner.nextFloat(); // ask user to enter the float

                        Salesperson salesperson = new Salesperson(name, ID.toCharArray(), salesValue); // calling the method Salesperson that add a new sales person to array

                        if (salespersons.add(salesperson)) { // if add the new sales person to the sales person array
                            CURRENT_SALESERSONS_COUNT += 1; // this takes the  variable before + current value and what is on the right of the equals sign to the current value of what is before the + sign
                        }
                        System.out.print("Would you like to see the records? Y/N: "); // print this thread to ask if you want to see the records
                        String input = scanner.next(); // input string record prompt user 
                        if (input.equalsIgnoreCase("Y")) { // if the user inputs the wrong case the loop will ignore it
                            displayRecords(); // display the database here
                        } else if (input.equalsIgnoreCase("N")) { // same thing here 

                        } else {
                            System.out.println("Invalid Input "); //if input is neither Y or N or y or n then its invalid 
                        }
                    }
                }
            } else if (option.equalsIgnoreCase("C")) { // If the user puts in C for the first choice also ignore the case
                if (salespersons.size() == 0) { //if the user has not input a value before then this message will show up that the database is empty
                    System.out.println("Database (array) is empty"); // print this message
                } else {
                    System.out.print("Please enter your ID : "); // print this id if the database is not empty
                    String ID = scanner.nextLine(); // prompt user to input values
                    boolean exists = checkIfIDExists(ID); // initialize a boolean variable called exists that uses a method to check to see if the id exists in the dataframe 
                    if (exists) { // if the id does exists the boolean will be true and print the value below
                        System.out.print("Please enter new sales value : ");
                        float newSalesValue = scanner.nextFloat(); // then enter new sales value to replace old value

                        for (int i = 0; i < salespersons.size(); i++) { // initialize i equal to zero and as long as i is smaller than the sales person array length iterate incrementally through it
                            if (convertToString(salespersons.get(i).getID()).equals(ID)) { // if the value i of the id value using get method equals ID value above then 
                                salespersons.set(i, new Salesperson(salespersons.get(i).getName(), salespersons.get(i).getID(), newSalesValue)); // set that value i to the new sales person value after matching the ID and Name using getID and Get name Method and then putting new salesValue ontop of it 
                            }
                        }
                    } else {
                        System.out.print("Salesperson does not exist "); //if the id doesnt exist then you print this message
                    }
                }
                System.out.print("Would you like to see the records? Y/N: "); // print this thread to ask if you want to see the records
                        String input = scanner.next(); // input string record prompt user 
                        if (input.equalsIgnoreCase("Y")) { // if the user inputs the wrong case the loop will ignore it
                            displayRecords(); // display the database here
                        } else if (input.equalsIgnoreCase("N")) { // same thing here 

                        } else {
                            System.out.println("Invalid Input "); //if input is neither Y or N or y or n then its invalid 
                        }
            } else if (option.equalsIgnoreCase("Q")) {  // If you choose Q then then ignore the case
                displayRecords(); // if chosen display records to see what is in the database 
                System.out.print("Quitting Bye");  // after displaying display print quitting 
                choice = false; // if choice equals false then break 
                break;
            } else if (option.equalsIgnoreCase("P")) { // give the user the ability to see the the database when needed
                displayRecords(); // display here 
            } else {
                System.out.print("Invalid Option"); // 
            }

        }
    }

    private static boolean validateID(String iD) { // this method checks to see if there is letters in the array
        char[] chars = iD.toCharArray();  // initializing a variable that is a array holding chars which is the input value turned into character array from string
        for (char c : chars) { // for each value in the inpuut
            if (!Character.isDigit(c)) { // if it is not a digit 
                return false;  // it will return false
            }
        }
        return true; // else true
    }

    private static void displayRecords() {
        System.out.println("****************BLAKE TINDOLS COMPANY************************");
        System.out.println("***************Current Sales Database************************");
        for (int i = 0; i < salespersons.size(); ++i) { // for each value in the array we will print in the format using the method decared in salesperson class
            System.out.println(salespersons.get(i).toString()); /// turn that assigned value to string to print out for display and repeat  (DONT NEED TO STRING)JUST NEED METHOD 

        }
        System.out.println("*************************************************************");
        System.out.println("*************************************************************");
    }

    private static boolean checkIfIDExists(String ID) { //  /// here in loop we will check to see if id exists
        for (int i = 0; i < salespersons.size(); ++i) {  // for i = 0  we use every value in salespersons array and iterate over it
            if (convertToString(salespersons.get(i).getID()).equals(ID)) {  // then we compare the sales persons get id and make sure it is string to compare with the getID method
                return true; // if they match return true else false 
            }
        }
        return false;
    }

    private static String convertToString(char[] input) {  //this converts to string
        StringBuilder sb = new StringBuilder(input.length); //using the string builder method declare a sb variable and make a new string builder and get the input.length
        for (char c : input) { // for each value in input.length
            sb.append(c); // append each value to string
        }
        return sb.toString(); // return ouput
    }

    public static void displayMenu() {  // when this is called it will show all text below
        System.out.println(" What would you like to do today?");
        System.out.println("(A)dd a Record");
        System.out.println("(C)hange a Record");
        System.out.println("(Q)uit");
        System.out.println("(P)rint");
    }
}
