package Assign3;

public class Cat {
    int ID;
    String ChungLoai;
    int age;
    String Color;
    double Weight;
    public void Cào(){
        System.out.println("Cat dang cào ");
    }
    public void Eat(){
        System.out.println("Cát đang ăn");

    }
    public void Run(){
        System.out.println("chó đang chạy");

    }

    public Cat(int ID, String chungLoai, int age, String color, double weight) {
        this.ID = ID;
        ChungLoai = chungLoai;
        this.age = age;
        Color = color;
        Weight = weight;
    }
}
