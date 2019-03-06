package Assign3;

public class Main {
    public static void main(String[] args) {
        Dog bigbull = new Dog(1,"Chó bigbull",20,"đen",5);
        Cat meoTom = new Cat(2,"Mèo jerry",10,"vàng",3);
        if(bigbull.age > meoTom.age){
            System.out.println("Chó cắn mèo chạy mất người");
        }
        else {
            System.out.println("WOw chó bị mèo cắn kìa");
        }
    }
}
