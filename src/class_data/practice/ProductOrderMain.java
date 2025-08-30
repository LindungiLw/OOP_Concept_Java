package class_data.practice;

public class ProductOrderMain {
    public static void main(String[] args) {
        Product_order product1 = new Product_order();
        product1.name = "Milk";
        product1.price = 20000;
        product1.quantity = 2;

        Product_order product2 = new Product_order();
        product2.name = "Coke";
        product2.price = 10000;
        product2.quantity = 1;

        Product_order product3 = new Product_order();
        product3.name = "Bread";
        product3.price = 25000;
        product3.quantity = 2;
        Product_order[] products = {product1, product2, product3};

        int total = 0;
        for (int i = 0; i < products.length; i++) {
            System.out.println("Product Name: " + products[i].name + ", Price: " + products[i].price + ", Qty: " + products[i].quantity);
            total += products[i].price * products[i].quantity;
        }
        System.out.println("Total Price: " + total);
    }
}
