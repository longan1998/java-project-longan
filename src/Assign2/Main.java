package Assign2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList();
        MyGenericArrayList array = new MyGenericArrayList(data);
        // nhập số
        for (int i = 0; i < 10; i++) {
            System.out.println("Nhập số");
            x = sc.nextInt();
            array.array.add(x);
        }
        for (int i = 0; i < array.array.size(); i++) {
            System.out.println(array.array.get(i));
        }
    }
}
