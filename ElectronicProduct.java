/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projexttt;

/**
 *
 * @author Ta3MiAAA
 */
public class ElectronicProduct extends Product {

    protected String brand;
    protected int warrantyPeriod;

    public ElectronicProduct() {
    }

    public ElectronicProduct(String brand, int warrantyPeriod) {
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public ElectronicProduct(int productId, String name, double price, String brand, int warrantyPeriod) {
        super(productId, name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
        if (warrantyPeriod < 0) {
            Math.abs(warrantyPeriod);
        }
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
