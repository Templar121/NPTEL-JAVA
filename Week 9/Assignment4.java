import java.util.Scanner;
class ElectronicsProduct {
    // Attributes for the product ID, name, and price
    private String productId;
    private String name;
    private double price;

    // Constructor to initialize the ElectronicsProduct object
    public ElectronicsProduct(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Method to apply a discount to the product price
    public void applyDiscount(double discountPercentage) {
        // Calculate the discount amount
        double discountAmount = price * discountPercentage / 100;
        // Subtract the discount amount from the original price
        price -= discountAmount;
    }

    // Method to calculate the final price after discount
    public double getFinalPrice() {
        // Return the current price which may have been discounted
        return price;
    }

    // Getter for product ID
    public String getProductId() {
        return productId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }
}
class WashingMachine extends ElectronicsProduct {
    // Additional attribute for the warranty period
    private int warrantyPeriod; // in months

    // Constructor to initialize the WashingMachine object
    public WashingMachine(String productId, String name, double price, int warrantyPeriod) {
        // Call the superclass constructor to initialize common attributes
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    // Method to extend the warranty period
    public void extendWarranty(int additionalMonths) {
        // Add the additional months to the current warranty period
        warrantyPeriod += additionalMonths;
    }

    // Getter for warranty period
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    // Override the display method to include warranty period
    @Override
    public void applyDiscount(double discountPercentage) {
        // Call the superclass method to apply the discount
        super.applyDiscount(discountPercentage);
        // Display a message indicating the discount was applied
        System.out.println("Discount applied to Washing Machine: " + getName());
    }
}
public class Assignment4{
    public static void main(String[] args) {
        // Create an ElectronicsProduct object
        ElectronicsProduct product = new ElectronicsProduct("WM123", "Washing Machine", 1.00);
        // Apply a discount and display the final price
        product.applyDiscount(10);
        //System.out.println("Product ID: " + product.getProductId());
        //System.out.println("Name: " + product.getName());
        //System.out.println("Price after discount: $" + product.getFinalPrice());
        //System.out.println();

        // Create a WashingMachine object
        Scanner in = new Scanner(System.in);

        String productId = in.nextLine();     
        String name = in.nextLine();
        int price = in.nextInt();
        int warrantyPeriod = in.nextInt();
        
        int discountPercentage = in.nextInt();

        WashingMachine washingMachine = new WashingMachine(productId,name,price,warrantyPeriod);
        // Apply a discount and display the final price
        washingMachine.applyDiscount(discountPercentage);
        System.out.println("Product ID: " + washingMachine.getProductId());
        System.out.println("Name: " + washingMachine.getName());
        System.out.println("Price after discount: $" + washingMachine.getFinalPrice());
        // Display the warranty period
        System.out.println("Warranty period: " + washingMachine.getWarrantyPeriod() + " months");

        // Extend the warranty period and display the new warranty period
        washingMachine.extendWarranty(12);
        System.out.print("Warranty period after extension: " + washingMachine.getWarrantyPeriod() + " months");
    }
}