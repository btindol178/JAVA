package usepackage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InsuredPackage extends Package {  // use the information from package class through inheritance

    double shippingCharges;  //declare the shipping charges 
    double totcost;          //decalre totcost

    public InsuredPackage(int weight, char shippingMethod) {    // make method insured package that uses the values from parent method using super
        super(weight, shippingMethod);   // grabing the values from the parent class package

        if(shippingCost > 0 && shippingCost <= 1)        // if shipping cost from package is greather than 0 but less than 1 then 
        {
            totcost = shippingCost + 2.45;   // it will cost 2.45
        }
        else if(shippingCost > 1 && shippingCost <= 3)  // else if its greater than 1 and less than 3 then 
        {
            totcost = shippingCost + 3.95;  // cost will be 3.95
        }
        else if(shippingCost > 3){            // else total cost is shipping cost plus 5.55
            totcost = shippingCost + 5.55;
        }
    }
    public InsuredPackage(int weight)  // make this method callinngn the super class for the 
    {
         super(weight); // just for fun not needed just to hold if we needed to only pass this variable 
        
        
    }
    
    
     public void display2() {  // same as regular display except add the fact that if
        String description = "***Blake's Package Service***\n";
        description += "           Insured Package\n";
        description += String.format("%-10s%-1d oz\n", "Weight:", weight);  // add some spaces infront of string output
        if (shippingMethod == 'A' || shippingMethod == 'a')
            description += String.format("%-15s%-5s\n", "Ship Method:", "Air");
        if (shippingMethod == 'T' || shippingMethod == 't')
            description += String.format("%-15s%-5s\n", "Ship Method:", "Truck");
        if (shippingMethod == 'M' || shippingMethod == 'm')
            description += String.format("%-15s%-5s\n", "Ship Method:", "Mail");
        if(shippingCost > 0 && shippingCost <= 1)                               // add this if shipping cost 0 to 1 then print the insurance cost
            description += String.format("%-15s%-5s\n", "Insurance Cost:", 2.45);  // print this cost
        if(shippingCost > 1 && shippingCost <= 3)                                  // if shipping cost in this range then 3.95
            description += String.format("%-15s%-5s\n", "Insurance Cost:", 3.95);
        if(shippingCost > 3)
            description += String.format("%-15s%-5s\n", "Insurance Cost:", 5.55);      // else 5.55
            description += String.format("%-15s$%-5.2f\n", "Shipping Cost:", shippingCost);   // the shipping cost is the cost from previous parent class
            description += String.format("%-15s$%-5.2f\n", "Total Cost:", totcost );     // this is value of insurance plus previous parent package


        JFrame f = new JFrame();             
        JOptionPane.showMessageDialog(f, description);       // show the output in messge diolag 
    }
    
}
