package CreatePurchase;

public class Purchase {

    private String name; // to store name
    private int invoice_number; // this stores invoice number
    private double sale_amount; // this stores sales amount
    private double sale_amount_tax; // this stores sale tax amount

    public Purchase(String name, int invoice_number, double sale_amount, double sale_amount_tax)
    {
        this.name = name;
        this.invoice_number = invoice_number;
        this.sale_amount = sale_amount;
        this.sale_amount_tax = sale_amount_tax; 
 
    }
            
    // sets and gets invoice number , name and sale amount
    public int getInvoice_number() {
        return invoice_number;
    }

    public void setInvoice_number(int invoice_number) {
        this.invoice_number = invoice_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSale_amount() {
        return sale_amount;
    }

    public void setSale_amount(double sale_amount) {
        sale_amount_tax = 0.06 * sale_amount; //sale amount tax is calculaed based on the sale amount 
        this.sale_amount = sale_amount;
    }

    public double getSale_amount_tax() {
        return sale_amount_tax;
    }

    public void setSale_amount_tax(double sale_amount_tax) {
        this.sale_amount_tax = sale_amount_tax;
    }

    // display method to display all details on sale
    public void display() {
        System.out.println("==============================================================");
        System.out.println("=======================I N V O I C E==========================");
        System.out.println("==============================================================");
        System.out.println("The Audio Warehouse");
        System.out.println("4256 Amplifier Lane");
        System.out.println("Grand Rapids, Mi 49858");
        System.out.println("123-867-5309");
        System.out.println("==============================================================");
        System.out.println("Details for your purchase:");
        System.out.println("Invoice number is:" + getInvoice_number());
        System.out.println("Sale amount is:" + getSale_amount());
        System.out.println("Sales tax is: " + getSale_amount_tax());
        System.out.println("Total bill is: " + (getSale_amount() + getSale_amount_tax()));
        System.out.println("==============================================================");

    }
}
