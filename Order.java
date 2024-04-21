/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projexttt;

/**
 *
 * @author Ta3MiAAA
 */
public class Order {

    int customerId;
    int orderId;
    double totalPrice;
    Product[] products;

    public Order() {
    }

    public Order(int customerId, int orderId, Product[] products) {
        this.customerId = customerId;
        this.orderId = orderId;
        this.products = products;
    }

    public Order(int customerId, int orderId, double totalPrice, Product[] products) {
        this.customerId = customerId;
        this.orderId = orderId;
        this.totalPrice = totalPrice;
        this.products = products;
    }

    private double calculateTotalPrice() {
        double totalPriceM = 0;
        for (Product product : products) {
            if (product != null) {
                totalPriceM += product.getPrice();
            }
        }
        this.totalPrice = totalPriceM;
        return this.totalPrice;
    }

    public void printOrderInfo() {
        System.out.println("Order ID is " + orderId);
        System.out.println("Customer Id is " + customerId);
        System.out.println("===Here is your products===");
        for (Product product : products) {
            if (product != null) {
                System.out.println("- " + product.getName() + ", Price $" + product.getPrice());
            }

        }
        System.out.println("Total Price $ " + calculateTotalPrice());

    }
}
