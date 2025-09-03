package packages.shop.com.order;

import packages.a.User;
import packages.shop.com.product.Product;

public class OrderService {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
