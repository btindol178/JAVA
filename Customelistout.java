/** **************************************************************************************************************************************
 * Programmer: Blake Tindol
 * BroncoNetID: bwy8022
 * Exercise 0: File Out
 * CIS 2600: Java for Business Application
 * Due date: 04/0/2020
 * Date Completed: 40/06/2020
 * ****************************************************************************************************************************************
 * Project Description
 * Write out a file using user input first you input user input and as long as the user doesnt decide to choose quit then
 * the user will continue to put more info in and then you can print out the info to file
 *************************************************************************************************************************** */
package customerlistout;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.io.*;
import java.util.Scanner;

public class Customelistout {

    public static void main(String[] args) {

        int Idnumber;  
        double Balanceowed;
        String Firstname;
        String Lastname;

        Scanner input = new Scanner(System.in); // initialize scanner up top enter a number  
        Path file = Paths.get("CustomerList.txt");  // get the path for the file and when output name as custommerlist.txt
        String info = "";  // use this later for seperation
        String delimiter = ",";  // use this later for seperation
        final int QUIT = 999;  // use this to exit out of while loop

        try {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file));  // here we assign the file to the output stream object
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output)); // here we create the bufferwriteer object and assign to the output stream object
            System.out.println("Please enter the id number: "); // prompted put in first digit for id number
            Idnumber = input.nextInt();     
            input.nextLine();            // add next line because last line was next Int

            while (Idnumber != QUIT) {            // while idnumber does not equl 999 then 
                System.out.println("Please enter your firstname: ");        // get name 
                Firstname = input.nextLine(); 
                System.out.println("Please enter your lastname: ");        // get last name
                Lastname = input.nextLine();
                System.out.println("Please enter your balance owed: ");      // get balance
                Balanceowed = input.nextDouble();
                input.nextLine();
                info = Idnumber + delimiter + Firstname + delimiter + Lastname + delimiter + Balanceowed;        // put all of the info in this format for the file output
                writer.write(info, 0, info.length()); // wright info 
                writer.newLine();        // move on to next line 
                System.out.print("Enter next Idnumber or " + QUIT + " to quit >> "); // promted to quit and output or continue adding more things 
                Idnumber = input.nextInt();
                input.nextLine();
            }
            writer.close();       // close out the writing and send file 

        } catch (Exception e) {             // catch any general exceptions not specific
            System.out.println("Message" + e);
        }
    }
}
