/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreatePurchase;

import java.util.Scanner;
        
public class CreatePurchase {

    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in); // scanner to read input from user
   String name;
   System.out.print("Please enter the Name of the product: ");
   name = sc.nextLine();
   
   // ask for sale amount
   double sale_amount;
   System.out.print("Please enter the Sale amount: ");
   sale_amount = sc.nextDouble();
   
   //if sales amount is not less than 0, user will be prompted again until input is valid 
   while(sale_amount < 0){
        System.out.print("Please enter a number greater than 0 for sale amount : ");
        sale_amount = sc.nextDouble();
}
   // ask for sale invoice number 
    int invoice_number;

    System.out.print("Please enter the Sales invoice number: ");
    invoice_number = sc.nextInt();
   
    while(invoice_number < 1000 || invoice_number > 8000) {
        System.out.print("Please enter a value between 1000 and 8000: ");
        invoice_number = sc.nextInt();
    }
     Purchase Invoice = new Purchase(name,invoice_number,sale_amount,sale_amount * .06);
     Invoice.display();
             
    }
    
}
