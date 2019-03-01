import test.Item;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ac = new Scanner(System.in);
        System.out.println("Nhập vào Item");

        int ID = sc.nextInt();
        System.out.println("Vui lòng nhập tên");
        String name = ac.nextLine();
        System.out.println("Vui lòng nhập nhà sản xuất");
        String product = ac.nextLine();
        System.out.println("Vui lòng nhập giá");
        double price = sc.nextDouble();
         Item item = new Item(ID,name,product,price);
        System.out.println("----------------------------");
        System.out.println(item.toString());


    }
}
