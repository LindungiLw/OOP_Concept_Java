package primitive_references_data_types.practices;

public class ProductOrderMain1 {
    public static void main(String[] args) {
        ProductOrder order1 = createOrder("Milk", 20000, 2);
        ProductOrder order2 = createOrder("Coke", 10000, 1);
        ProductOrder order3 = createOrder("Bread", 25000, 2);

        ProductOrder[] orders = {order1, order2, order3};
        int total = 0;
        for(ProductOrder order : orders){
            printOrder(order);
            total += getTotalAmount(order);
        }
        System.out.println("Total Amount: " + total);
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

    static int getTotalAmount(ProductOrder order){
        return order.price * order.quantity;
    }
}
