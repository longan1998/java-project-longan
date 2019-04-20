package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class PriorityQueue {
    ArrayList<ThongTinKhachHang> array = new ArrayList<>();
    public void Add(ArrayList array){
        Scanner sc = new Scanner(System.in);
        Scanner ac = new Scanner(System.in);
        System.out.println("Input ID ");
        int id = sc.nextInt();
        System.out.println("Input Tên");
        String name = ac.nextLine();
        System.out.println("Input Address");
        String address = ac.nextLine();
        System.out.println("Input sdt");
        String phone = ac.nextLine();
        System.out.println("Ngày đi");
        String ngaydi = ac.nextLine();
        System.out.println("Ngày trở về");
        String ngayTrove = ac.nextLine();
        ThongTinKhachHang khachhang = new ThongTinKhachHang(id,name,address,phone,ngaydi,ngayTrove);
        array.add(khachhang);
    }

    public PriorityQueue(ArrayList<ThongTinKhachHang> array) {
        this.array = array;
    }

    public void EditKhachHang(int id){
        Scanner sc = new Scanner(System.in);
        Scanner ac = new Scanner(System.in);
        for(int i =0;i<array.size();i++){
            if(array.get(i).ReservationID == id){
                System.out.println("Input Tên muốn sửa");
                String name = ac.nextLine();
                System.out.println("Input Address muốn sửa");
                String address = ac.nextLine();
                System.out.println("Input sdt muốn sửa");
                String phone = ac.nextLine();
                System.out.println("Ngày đi muốn sửa");
                String ngaydi = ac.nextLine();
                System.out.println("Ngày trở về muốn sửa");
                String ngayTrove = ac.nextLine();
                array.get(i).PasbahName = name;
                array.get(i).Address = address;
                array.get(i).Phone = phone;
                array.get(i).ngayKhoiHang = ngaydi;
                array.get(i).ngayComback = ngayTrove;
            }
        }
    }
    public void DisplayAll(){
        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i).ReservationID + "-"+ array.get(i).PasbahName+"-"+array.get(i).Phone);
        }
    }
}
