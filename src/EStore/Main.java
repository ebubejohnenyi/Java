package EStore;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner keyboardInput = new Scanner(System.in);
    private static String customerName, itemName, cashierName;
    private static int itemQuantity, itemPrice, amountPaid;
    private static double customerDiscount;
    private static double vat = 17.50/100;
    private static List<Product> newProductList = new ArrayList<>();
    private static LocalDateTime dateTime = LocalDateTime.now();
    public static void main(String[] args) {
        customerNameDisplay();
        mainBlock();
    }
    private static void customerNameDisplay(){
        display("What is Customer's Name: ");
        customerName = keyboardInput.nextLine().toUpperCase();
    }
    private static void mainBlock(){
        Product product = new Product(itemName, itemQuantity, itemPrice);
        display("What did the user buy? : ");
        itemName = keyboardInput.next().toUpperCase();
        display("How many Pieces: ");
        itemQuantity = keyboardInput.nextInt();
        display("How much per unit?:  ");
        itemPrice = keyboardInput.nextInt();
        product.setName(itemName);
        product.setQuantity(itemQuantity);
        product.setPrice(itemPrice);
        newProductList.add(product);
        display("Add item? : ");
        String addOption = keyboardInput.next().toLowerCase();
        promptNext(addOption);
    }

    private static void invoiceBlock() {
        display("Whats is your name? : ");
        cashierName = keyboardInput.next().toUpperCase();
        display("How much discount will Customer get? : ");
        customerDiscount = keyboardInput.nextDouble();
        display("How much paid? : ");
        amountPaid = keyboardInput.nextInt();
        boolean amountPaid_IsLess = amountPaid < bill_Total();
        if(amountPaid_IsLess){
            prompt_InsufficientFund();
        }
        else printReceipt();
    }

    private static void prompt_InsufficientFund() {
        System.out.println("INSUFFICIENT FUNDS, Try again..");
        invoiceBlock();
    }

    private static void printReceipt(){
        System.out.println("\n");
        display("""
                JON-SNOW STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS
                TEL: 12345678901
                """);
        display("DATE: " + dateTime);
        display("CASHIER'S NAME: "+ cashierName);
        display("CUSTOMER NAME: "+ customerName);
        display("================================================="); // 50
        System.out.print("          ITEM   "+ "   QTY    "+"PRICE      "+"TOTAL(NGN)\n");
        displayAll_Products();
        System.out.println();
        System.out.println("--------------------------------------------------");
        display("                           SUB TOTAL: "+ subTotal());
        display("                           DISCOUNT: "+ discount(customerDiscount));
        System.out.println("                           VAT @ 17.5%: " + vat());
        System.out.println("=================================================");
        display("                           BILL TOTAL: "+ bill_Total());
        display("                           AMOUNT PAID: "+ amountPaid);
        display("                           BALANCE: "+ balance(amountPaid));
        System.out.println();
        System.out.println("=================================================");
        display("THIS IS NOT AN RECEIPT KINDLY PAY ");
        System.out.println("=================================================");
    }
    public static double subTotal() {
        double subTotal_Price =0;
        for (Product products: newProductList) {
            subTotal_Price += (products.getPrice() * products.getQuantity());
        }
        return subTotal_Price;
    }
    public static double discount(double discount) {
        return subTotal() * discount/100;
    }
    public static double vat() {
        return subTotal() * vat;
    }
    public static double bill_Total() {
        return subTotal() - discount(7) + vat();
    }
    public static double balance(int amountPaid) {
        return amountPaid - bill_Total();
    }
    private static void displayAll_Products() {
        for (Product products : newProductList) {
            System.out.println(products);
        }
    }
    private static void promptNext(String option){
        switch (option){
            case "yes": mainBlock();
                break;
            case "no": invoiceBlock();
                break;
            default: {
                System.out.println("INCORRECT OPTION TRY AGAIN.");
            }
            break;
        }
    }

    private static void exist() {
        System.exit(1);
    }

    private static void display(String display){
        System.out.printf(display);
        System.out.print("\n");
    }

}
