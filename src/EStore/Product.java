package EStore;

public class Product {
    private String name;
    private int price;
    private int quantity;
    public Product(String name, int quantity, int price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    @Override public String toString(){
        return "          "+getName() +"     "+getQuantity()+"      "+ getPrice()+"     "+getPrice() * getQuantity();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}