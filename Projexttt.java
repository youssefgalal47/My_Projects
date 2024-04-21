/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projexttt;

/**
 *
 * @author Ta3MiAAA
 */
import java.util.Scanner;

public class Projexttt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product electronic = new ElectronicProduct(1, "smartphone", 599.9, "Samsung", 1);
        Product clothing = new ClothingProduct(2, "T - Shirt", 19.99, "Medium", "Cotton");
        Product book = new BookProduct(3, "OOP", 39.99, "O `Reilly", "X publisher");

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our EcommerceSystem ");
        System.out.println("  ");
        System.out.println("Please Enter your ID");
        int ID = input.nextInt();
        input.nextLine();
        System.out.println("Please Enter your name");

        String name = input.nextLine();

        System.out.println("Please Enter your Adress ");

        String Adress = input.next();

        Customer customer = new Customer(ID, name, Adress);

        System.out.println("How many products you want to add to your cart");
        int n = input.nextInt();
        Cart c1 = new Cart(ID, n);

        for (int i = 0; i < n; i++) {
            System.out.println("Please choose what you want to add to cart :");
            System.out.println("1 - Electronic , 2- Clothing, 3- Book ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    c1.addProduct(electronic, i);

                    break;

                case 2:
                    c1.addProduct(clothing, i);
                    break;

                case 3:
                    c1.addProduct(book, i);
                    break;

                default:
                    System.out.println("Invalid product type");

            }
        }

        System.out.println("Do you want to place order ?  (1- yes/2- no)");
        String answer = input.nextLine();
        Order o1 = new Order(ID, 12345, c1.getProducts());

        if ("Yes".equals(answer) || "yes".equals(answer) || "Y".equals(answer) || "y".equals(answer)) {
            o1.printOrderInfo();

        } else if ("No".equals(answer) || "no".equals(answer) || "N".equals(answer) || "n".equals(answer)) {
            System.out.println("You want to remove any product?");
            answer = input.next();

            if ("Yes".equals(answer) || "yes".equals(answer) || "Y".equals(answer) || "y".equals(answer)) {
                System.out.println("Enter the index you want to remove");
                int index = input.nextInt();
                c1.removeProduct(index - 1);
                o1.printOrderInfo();
            } else {
                System.out.println("Order cancled, thank you for using our system");
            }
        }

    }

}
