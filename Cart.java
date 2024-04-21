/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projexttt;

/**
 *
 * @author Ta3MiAAA
 */
public class Cart {

    int customerId;
    int numProduct;
    protected Product[] products;

    public Cart() {
    }

    public Cart(int customerId, int numProduct) {
        this.customerId = customerId;
        this.numProduct = Math.abs(numProduct);
        this.products = new Product[numProduct];
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
        if (customerId < 0) {
            Math.abs(customerId);
        }
    }

    public int getNumProduct() {
        return numProduct;
    }

    public void setNumProduct(int numProduct) {
        this.numProduct = Math.abs(numProduct);

    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Product[] addProduct(Product product, int index) {
        if (products[index] == null) {
            this.products[index] = product;

        }

        return products;
    }

    public Product[] removeProduct(int index) {
        if (products[index] != null) {
            this.products[index] = null;
        }
        return products;
    }

    public double CalculatePrice() {

        double totalPrice = 0;

        for (Product product : products) {
            if (product != null) {
                totalPrice += product.getPrice();

            }

        }
        return totalPrice;

    }

    public void placeOrder() {
        System.out.println("Order place succesfully");

    }
}
