
package usepackage;

import javax.swing.*;

public class Package {

    
    protected int weight;           // this will be input of package weight
    protected char shippingMethod;  // this will be the character of shipping method 
    protected double shippingCost;  // this will be the calculated shipping cost 

    public Package(int weight, char shippingMethod) {  //creating method package that can be used as parent class to extended insurance class
        this.weight = weight; 
        this.shippingMethod = shippingMethod; 
        calculateCost();
    }

    
    public double calculateCost() {

        if (shippingMethod == 'A' || shippingMethod == 'a') {      // if the shipping input is lower case or upper case 
            if (1 <= weight && weight < 8) {            // and if  weight is less than or equal to 1 and weight is less than 8
                shippingCost = 2;                       // the cost will be 2
            } else if (8 <= weight && weight <= 16) {   // else if weight is 8 to 16
                shippingCost = 3;                      // cost is 3 
            } else {                                    /// else its 4.5
                shippingCost = 4.5;
            }
        } else if (shippingMethod == 'T' || shippingMethod == 't') {  // if you didnt choose a  then t for this shipping method
            if (1 <= weight && weight < 8) {                  // same process as above for shippping method air
                shippingCost = 1.5;
            } else if (8 <= weight && weight <= 16) {
                shippingCost = 2.35;
            } else {
                shippingCost = 3.25;
            }

        } else if (shippingMethod == 'M' || shippingMethod == 'm') {   // else if mail (m) then same proceess as air
            if (1 <= weight && weight < 8) {
                shippingCost = 0.5;
            } else if (8 <= weight && weight <= 16) {
                shippingCost = 1.5;
            } else {
                shippingCost = 2.15;
            }
        } else {
            shippingCost = 0.0;
        }
        return shippingCost;
    }
    

    public void display() { // make display method 
        String description = "***Blake's Package Service***\n"; // this method takes description variable and adds this texdt then moves to next line
        description += "           Regular Package\n"; // using descrition then adding the previous onto new text then moving to next line 
        description += String.format("%-15s%-5d oz\n", "Weight:", weight); // format this whol thing as string and add some spaces
        if (shippingMethod == 'A' || shippingMethod == 'a')     // if you picked air then print air 
            description += String.format("%-15s%-5s\n", "Ship Method:", "Air");  
        if (shippingMethod == 'T' || shippingMethod == 't')   // if you picked t then truck
            description += String.format("%-15s%-5s\n", "Ship Method:", "Truck");
        if (shippingMethod == 'M' || shippingMethod == 'm')  // if you picked m then mail 
            description += String.format("%-15s%-5s\n", "Ship Method:", "Mail");
        description += String.format("%-15s$%-5.2f\n", "Shipping Cost:", shippingCost);  // just print the cost 
      

        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, description);  // show output in message dialog
    } 
    
    

}