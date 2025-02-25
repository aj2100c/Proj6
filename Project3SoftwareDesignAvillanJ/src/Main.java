import java.util.ArrayList;
import java.util.List;

/**
 * Represents a product in the shopping system.
 */
class Product {
    private String name;
    private double price;
    private int quantity;

    /**
     * Constructor to initialize a product with name, price, and quantity.
     * @param name The name of the product.
     * @param price The price of the product.
     * @param quantity The available stock quantity of the product.
     */
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Gets the product name.
     * @return The name of the product.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the product price.
     * @return The price of the product.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Checks if the product is in stock.
     * @return True if the product is available, otherwise false.
     */
    public boolean isAvailable() {
        return quantity > 0;
    }
}

/**
 * Represents a shopping cart containing multiple products.
 */
class ShoppingCart {
    private List<Product> items;

    /**
     * Constructor to initialize an empty shopping cart.
     */
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    /**
     * Adds a product to the shopping cart.
     * @param product The product to add.
     */
    public void addItem(Product product) {
        items.add(product);
    }

    /**
     * Calculates the total price of all items in the cart.
     * @return The total cost of products in the shopping cart.
     */
    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    /**
     * Gets the list of products in the cart.
     * @return List of products in the cart.
     */
    public List<Product> getItems() {
        return items;
    }
}

/**
 * Represents a customer with a shopping cart.
 */
class Customer {
    private String name;
    private ShoppingCart cart;

    /**
     * Constructor to initialize a customer with a name and a shopping cart.
     * @param name The name of the customer.
     */
    public Customer(String name) {
        this.name = name;
        this.cart = new ShoppingCart();
    }

    /**
     * Gets the customer's name.
     * @return The name of the customer.
     */
    public String getName() {
        return name;
    }

    /**
     * Adds a product to the customer's shopping cart.
     * @param product The product to add.
     */
    public void addProductToCart(Product product) {
        cart.addItem(product);
    }

    /**
     * Retrieves the customer's shopping cart.
     * @return The shopping cart of the customer.
     */
    public ShoppingCart getCart() {
        return cart;
    }
}

/**
 * Main class to demonstrate the shopping system.
 */
public class Main {
    public static void main(String[] args) {
        // Creating a product instance
        Product book = new Product("Java Programming", 25.99, 10);

        // Creating a customer instance
        Customer john = new Customer("John Doe");

        // Adding product to customer's cart
        john.addProductToCart(book);

        // Displaying customer details and cart total
        System.out.println("Customer: " + john.getName());
        System.out.println("Cart Total: $" + john.getCart().calculateTotal());
    }
}
