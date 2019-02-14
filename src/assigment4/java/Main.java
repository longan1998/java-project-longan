package assigment4.java;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        assigment4.java.Product product1 = new vn.java.Product(1,"sp 1", 10000, 5);
        assigment4.java.Product product2 = new vn.java.Product(2,"sp 2", 20000, 2);
        assigment4.java.Product product3 = new vn.java.Product(3,"sp 3", 30000, 0);

        assigment4.java.Order order1 = new vn.java.Order();
        order1.addProduct(product1, 0);  //0
        order1.addProduct(product2, 20); //1
        order1.addProduct(product3, 0);  //2

        // In ra danh sach sp
        List<assigment4.java.Product> listProduct = order1.getListProduct();
        double total = 0;
        for (int i = 0; i < listProduct.size(); i++) {
            assigment4.java.Product sp = listProduct.get(i);
            System.out.println(sp.getName());
            total = total + sp.getPrice()*sp.getQuantityInProduct();
        }

        // In tong tien
        System.out.println("Tong tien:" + total);
    }
}
