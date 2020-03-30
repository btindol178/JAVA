/****************************************************************************************************************************************
 * Programmer: Blake Tindol
 * BroncoNetID: bwy8022
 * Lab #4: UsePackage Java
 * CIS 2600: Java for Business Application
 * Due date: 04/01/2020
 * Date Completed: 03/29/2020
 * ****************************************************************************************************************************************
 * Project Description
 * This project prompts the user to input the weight of a package and based and then prompts the user
 * to input the shipping method type and if the  user would like insurance and based on if the user wants insurance or not
 * the user will get two different prompts a insured package reciept or normal reciept
 ****************************************************************************************************************************/
package usepackage;

import javax.swing.*;
import java.util.*; //exception handling 

public class UsePackage {


    public static void main(String[] args) {
        JFrame f; // assigning jframe to f
        f = new JFrame();  // creating a new frame with f 
        
        int weight = 0; // this weight is for the scope of parent class initialize the weight variable as interger 0 to be able to be used in following statments after  try catch
        boolean success = false;   // declaring success as false
        while(success == false)    // while sucess equals fasle run this while loop
        { 
        String wt = JOptionPane.showInputDialog(f, "Please enter how much the package weights( Any valid integer)"); // prompt user new frame 
        try{  // try and catch errors if weight input from wt isnt intiger
        weight = Integer.parseInt(wt); // parse to see if wt is intiger  
        success = true;   // if true then move on to next secition
         } 
        catch(Exception e){   // if false catch exception out put message and == false so redo while until true
                JOptionPane.showMessageDialog(f, "Invalid insurance type selected");
                success = false;
                }
        }
        
        String method = JOptionPane.showInputDialog(f, "Enter your shipping method: (A)ir; (T)ruck; (M)ail");
        char c = method.charAt(0);
        String insured = JOptionPane.showInputDialog(f, "Would you like your package insured? (Y)es (N)o");
        if (c == 'A' || c == 'a' || c == 'T' || c == 't' || c == 'M' || c == 'm') {
            if (insured.equalsIgnoreCase("Y")) {
                InsuredPackage insuredPackage = new InsuredPackage(weight, c);
                insuredPackage.display2();
            } else if (insured.equalsIgnoreCase("N")) {

                Package simplePackage = new Package(weight, c);
                simplePackage.display();
            } else {
                JOptionPane.showMessageDialog(f, "Invalid insurance type selected");
            }
               
    }
   
}
}