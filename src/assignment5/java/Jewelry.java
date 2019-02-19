package assignment5.java;

public class Jewelry extends Product {
private float weight;
private String type;

    public Jewelry(int id, String name, double price, int quantity, float weight, String type) {
        super(id, name, price, quantity);
        this.weight = weight;
        this.type = type;
    }

    public void lammoi(){
        System.out.println("Làm mới....");
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}



