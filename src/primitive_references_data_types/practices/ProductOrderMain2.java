package primitive_references_data_types.practices;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of orders: ");
        int order = scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[order];

        for (int i = 0; i < orders.length; i++) {
            System.out.println("(" + (i + 1) + ") " + "Enter order information.");
            System.out.print("Product Name: ");
            String name = scanner.next();
            System.out.print("Price: ");
            int price = scanner.nextInt();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            orders[i] = createOrder(name, price, quantity);
            System.out.println();
        }
        int total = 0;
        for (ProductOrder productOrder : orders) {
            printOrder(productOrder);
            total += getTotalAmount(productOrder);
        }
        System.out.println("Total Price: " + total);
    }
        static ProductOrder createOrder(String name, int price, int quantity){
            ProductOrder order = new ProductOrder();
            order.name = name;
            order.price = price;
            order.quantity = quantity;
            return order;
        }

        static void printOrder(ProductOrder order){
            System.out.println("Product Name: " + order.name + ", Price: " + order.price + ", Qty: " + order.quantity);
        }

        static int getTotalAmount(ProductOrder order) {
            return order.price * order.quantity;
        }
}
