/*

(4) Create a method: getPrice(int productId)
that returns the price of the product

if 1 = Pen return price as 10
if 2 = Book return price as 50
else return -1

Create a method: calculateTotal(double price, int qty)
that returns total amount

Also, create overloaded methods named printProduct(...)
- printProduct(int id)
- printProduct(int id, String name)
- printProduct(int id, String name, double price)

Each overloaded method should print the product information it receives
*/

public class ProductSystem {
 
    public static double getPrice(int productId) {
 
        if (productId == 1) {
            return 10;   
        }
        else if (productId == 2) {
            return 50;  
        }
        else {
            return -1; 
        }
    }
 
    public static double calculateTotal(double price, int qty) {
        return price * qty;
    }
 
    public static void printProduct(int id) {
        System.out.println("Product ID: " + id);
    }
 
    public static void printProduct(int id, String name) {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
    }
 
    public static void printProduct(int id, String name, double price) {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }
 
    public static void main(String[] args) {
 
        int productId = 1;
        int quantity = 5;
 
        double price = getPrice(productId);
 
        if (price != -1) {
            double total = calculateTotal(price, quantity);
 
            System.out.println("Total Amount: " + total);
            System.out.println();
 
            printProduct(productId);
            System.out.println();
 
            printProduct(productId, "Pen");
            System.out.println();
 
            printProduct(productId, "Pen", price);
        } else {
            System.out.println("Invalid Product ID");
        }
    }
}
