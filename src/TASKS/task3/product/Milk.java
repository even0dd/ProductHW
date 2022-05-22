package task3.product;

public class Milk extends Product {
    private String shelfLife = "19/05/22--22/05/22";

    public Milk() {
    }
    @Override
    public String toString() {
        return "Compound - " + this.compound + "\nPrice - " + this.price + "\nName - " + this.name + "\nShelf life - " + this.shelfLife;
    }
}
