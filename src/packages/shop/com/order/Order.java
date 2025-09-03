package packages.shop.com.order;

import packages.a.User;
import packages.shop.com.product.Product;

public class Order {
    User user;
    Product product;
    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
