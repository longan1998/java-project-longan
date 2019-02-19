package assignment5.java;

import java.util.ArrayList;
import java.util.List;

public class Order {
    int id;
    int total;
    List<Product> listProduct = new ArrayList<>();

    public void addProduct(Product product, int discount) {
        if (product != null && product.getQuantityInProduct() > 0) {
            listProduct.add(product);
            product.setPrice(product.getPrice() - product.getPrice()*discount/100);

            System.out.println("Them sp thanh cong" + product.getName());
        } else {
            System.out.println("Them sp that bai");
        }
    }





}
