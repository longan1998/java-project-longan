package test;

public class Item {
    private int itemID;
    private String name;
    String producter;
    double price;

    public Item(int itemID, String name, String producter, double price) {
        this.itemID = itemID;
        this.name = name;
        this.producter = producter;
        this.price = price;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducter() {
        return producter;
    }

    public void setProducter(String producter) {
        this.producter = producter;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.itemID+" "+this.name+" "+this.producter+" "+this.price;

        }

}
