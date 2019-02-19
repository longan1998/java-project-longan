package assignment5.java;

public class Fashion extends Product {
    private int size;
    private String color;
    private String thuonghieu;

    public Fashion(int id, String name, double price, int quantity, int size, String color, String thuonghieu) {
        super(id, name, price, quantity);
        this.size = size;
        this.color = color;
        this.thuonghieu = thuonghieu;
    }



    public void giat() {
        System.out.println("giặt....");

    }
    public  void lamkho(){
        System.out.println("Làm khô.....");

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getThuonghieu() {
        return thuonghieu;
    }

    public void setThuonghieu(String thuonghieu) {
        this.thuonghieu = thuonghieu;
    }
}
