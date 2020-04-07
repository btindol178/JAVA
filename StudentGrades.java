/** **************************************************************************************************************************************
 * Programmer: Blake Tindol
 * BroncoNetID: bwy8022
 * Lab 5: Student Grades
 * CIS 2600: Java for Business Application
 * Due date: 04/15/2020
 * Date Completed: 04/07/2020
 * ****************************************************************************************************************************************
 * Project Description
 * This project takes the student input and then stores it also uses execption handling to make sure that the user follows instructions
 * This project takes file and file 2 then  uses them to write a file to folder for good and bad students putting everything in a while loop and try catch block
 * we prompt the user to input information and the loop keeps it going until the user inputs 999 the input information will be  uploaded to files then read and filtered to two different arrays then
 * we can output the display methods
 *************************************************************************************************************************** */
package studentgrades;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentGrades {

    private static ArrayList<StudentInfo> GoodStudentinfo = new ArrayList<StudentInfo>(); // this initializes goods student info good student array

    private static ArrayList<StudentInfo> BadStudentinfo = new ArrayList<StudentInfo>();  // holds all the bad students in this array 

    public static void main(String[] args) {
        displayTitle();

        Scanner input = new Scanner(System.in); // initialize scanner up top enter a number  
        Path file = Paths.get("SudentsGoodStanding.txt");
        Path file2 = Paths.get("SudentsAcidemicProbation.txt");// get the path for the file and when output name as custommerlist.txt
        String info = "";  // use this later for seperation
        String delimter = ",";    // will use this later to seperate and make file format neat
        String delimiter2 = "|";// use this later for seperation
        String s = "";      // blank variable alue
        int QUIT = 999;  // use this to exit out of while loop

        boolean success = true;

        try {
            while (success) {     // while true run all of this 
                OutputStream output = new BufferedOutputStream(Files.newOutputStream(file));  // here we assign the file to the output stream object
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));  // here we create buffer writer object for output file 1

                OutputStream output2 = new BufferedOutputStream(Files.newOutputStream(file2));  // here we assign the file to the output stream object for file 2
                BufferedWriter writer2 = new BufferedWriter(new OutputStreamWriter(output2));// here we create the bufferwriteer object and assign to the output stream object for output file 2

                while (true) { // while true
                    System.out.println("Please enter the WIN number or 999 to : "); // prompted put in first digit for win if 999 the program will stop
                    String WIN = input.nextLine();

                    if (WIN.equalsIgnoreCase("999")) {
                        break;
                    }
                    if (WIN.length() != 9) {       // if the WIN is not 9 digits long prompt to do again 
                        System.out.println("WIN must be 9 digits long.");
                        continue;
                    }

                    System.out.println("Please enter the firstname for WIN: ");        // get name input
                    String FirstName = input.nextLine();
                    System.out.println("Please enter the lastname for WIN: ");        // get last name input
                    String LastName = input.nextLine();
                    System.out.println("Please enter the GPA for WIN: ");      // get GPA input
                    double GPA = input.nextDouble();
                    input.nextLine();

                    StudentInfo newStudent = new StudentInfo(WIN, FirstName, LastName, GPA); // get win first last and gpa 
                    if (newStudent.getGPA() >= 2.0) {             // if gpa greater than 2 write file to good student file in folder
                        writer.write(newStudent.toCSVString());
                        writer.newLine();// if gpa above 2.0 add to this file writer 
                    } else {
                        writer2.write(newStudent.toCSVString()); // output to other file using writer 2 to bad student file
                        writer2.newLine();
                    }

                }

                writer.close();    // stop writing so we can read
                writer2.close();   // stop writing 

                InputStream Input = new BufferedInputStream(Files.newInputStream(file));  // here we assign the file to the input stream object to file we output
                BufferedReader reader = new BufferedReader(new InputStreamReader(Input));   // hear we read that file 

                InputStream Input2 = new BufferedInputStream(Files.newInputStream(file2));  // here we assign the file to the input stream object to file we output
                BufferedReader reader2 = new BufferedReader(new InputStreamReader(Input2)); // hear we read that file 

                String items[];      // initialize item for holding new student info in the files being read
                StudentInfo newStudent2;  // initialize student info new student 2

                s = reader.readLine();  // first read line if there is info 
                while (s != null) {     // then while s is not null 
                    items = s.split(",");    // split items by column 
                    newStudent2 = new StudentInfo(items[0], items[1], items[2], Double.parseDouble(items[3]));  // store the split informatinon like this
                    GoodStudentinfo.add(newStudent2);      // send it to good student info array 
                    s = reader.readLine();    // read next lne 
                }

                // do the same thing above except for file 2 now
                s = reader2.readLine(); // first read line and if valid
                while (s != null) {
                    items = s.split(",");         // split and read 
                    newStudent2 = new StudentInfo(items[0], items[1], items[2], Double.parseDouble(items[3]));
                    BadStudentinfo.add(newStudent2); // else add to this array
                    s = reader2.readLine();
                }

                displayTitle();   // display title using method
                displayStandingsgood();    // display good student array using method
                displayStandingbad();    // display bad student array using method

                reader.close();    // end reader
                reader2.close();

                success = false;     // stop while loop 
            }

        } catch (Exception e) {       // find any execption and print out where it occurs for fixing!!!!!!
            System.out.print(e + e.getMessage());
            e.printStackTrace();  // find what line exception happens on
        }

    }

    private static void displayTitle() {

        System.out.println("************************************************************");
        System.out.println("***************Western Michigan University******************");
        System.out.println("*********************GPA Checker****************************");
        System.out.println("**************** 1903 W Michigan Ave ***********************");
        System.out.println("****************** Kalamazoo, MI 49008 *********************");
        System.out.println("************************************************************");
    }

    private static void displayStandingsgood() {
        System.out.println("*************************************************************");
        System.out.println("*********************Good Standing **************************");
        for (int i = 0; i < GoodStudentinfo.size(); ++i) { // for each value in the array we will print in the format using the method decared in salesperson class
            System.out.println(GoodStudentinfo.get(i).toString());
        } /// turn that assigned value to string to print out for display and repeat  (DONT NEED TO STRING)JUST NEED METHOD
        System.out.println("*************************************************************");
        System.out.println("*************************************************************");

    }

    private static void displayStandingbad() {
        System.out.println("*******************Probationary Standing*********************");
        System.out.println("*************************************************************");
        for (int i = 0; i < BadStudentinfo.size(); ++i) { // for each value in the array we will print in the format using the method decared in salesperson class
            System.out.println(BadStudentinfo.get(i).toString());
        }/// turn that assigned value to string to print out for display and repeat  (DONT NEED TO STRING)JUST NEED METHOD
        System.out.println("*************************************************************");
        System.out.println("*************************************************************");

    }
}
