package Assign3;

public class Dog {
    int ID;
    String ChungLoai;
    int age;
    String Color;
    double Weight;
    public void Sủa(){
        System.out.println("Dog đang sủa ");
    }
    public void Eat(){
        System.out.println("chó đang ăn");

    }
    public void Run(){
        System.out.println("chó đang chạy");

    }

    public Dog(int ID, String chungLoai, int age, String color, double weight) {
        this.ID = ID;
        ChungLoai = chungLoai;
        this.age = age;
        Color = color;
        Weight = weight;
    }
}

