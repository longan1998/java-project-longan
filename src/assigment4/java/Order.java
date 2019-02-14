package vn.java;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }


}
