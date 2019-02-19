package assignment4.java;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product(1,"sp 1", 10000, 5);
        Product product2 = new Product(2,"sp 2", 20000, 2);
        Product product3 = new Product(3,"sp 3", 30000, 0);

        Order order1 = new Order();
        order1.addProduct(product1, 0);  //0
        order1.addProduct(product2, 20); //1
        order1.addProduct(product3, 0);  //2

        // In ra danh sach sp
        List<Product> listProduct = order1.getListProduct();
        double total = 0;
        for (int i = 0; i < listProduct.size(); i++) {
            Product sp = listProduct.get(i);
            System.out.println(sp.getName());
            total = total + sp.getPrice()*sp.getQuantityInProduct();
        }

        // In tong tien
        System.out.println("Tong tien:" + total);
    }
}
