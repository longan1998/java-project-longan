package Assign8;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static void Menu() {
        System.out.println("1:Add student");
        System.out.println("2:Edit student by id");
        System.out.println("3:Delete student by gpa");
        System.out.println("4:Sort student by name");
        System.out.println("5:Show student");
        System.out.println("0:Exit");}


    public static void main(String[] args) {

        int id=0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        List<SinhVien> Data = new ArrayList<>();
        Menu();
        while(flag){
            int chon = sc.nextInt();
            switch(chon){
                case 1 : {
                    id++;
                    System.out.println("Nhập tên");
                    String name = sc.nextLine();
                    System.out.println("Nhập tuổi");
                    int age = sc.nextInt();
                    System.out.println("Nhập địa chỉ");
                    String address = sc.nextLine();
                    System.out.println("Nhập điểm trung bình");
                    float gpa = sc.nextFloat();
                    Data.add(new SinhVien(id,name,address,age,gpa));
                    Menu();
                    break;
                }
                case 2 : {
                    System.out.println("Nhập id bạn muốn sửa");
                    int nhap = sc.nextInt();
                    for(SinhVien value : Data){
                        if(nhap == value.id){
                            System.out.println("Nhập tên muốn sửa");
                            String name = sc.nextLine();
                            System.out.println("Nhập tuổi muốn sửa");
                            int age = sc.nextInt();
                            System.out.println("Nhập địa chỉ muốn sửa");
                            String address = sc.nextLine();
                            System.out.println("Nhập điểm trung bình muốn sửa");
                            float gpa = sc.nextFloat();
                            value.name = name;
                            value.age = age;
                            value.address=address;
                            value.gpa=gpa;
                            Menu();
                        }
                        else {
                            System.out.println("Không tìm thấy id bạn vừa nhập");
                            Menu();
                        }
                    }
                    break;
                }
                case 3 : {
                    System.out.println("Nhập điểm tb của student muốn xoá");
                    float gpa = sc.nextFloat();
                    for(int i =0;i<Data.size();i++){
                        if(Data.get(i).gpa == gpa){
                            Data.remove(Data.get(i));
                            System.out.println("Xoá thành công");
                            Menu();
                        }
                        else {
                            System.out.println("Không tìm thấy gpa này");
                            Menu();
                        }
                    }
                }
                case 4 : {
                    Collections.sort(Data);
                    System.out.println("Danh sách sinh viên");
                    for(SinhVien value : Data){
                        System.out.println("Tên sv :"+value.name + " Điểm GPA :" +value.gpa);
                    }
                    Menu();
                    break;
                }
                case 5 : {
                    for(SinhVien value : Data){
                        System.out.println("Tên sv :"+value.name + " Điểm GPA :" +value.gpa);
                    }
                    Menu();
                    break;
                }
                case 0 :
                    flag = false;
            }
        }
    }


    }

