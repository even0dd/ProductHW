package task1;

public class Main {
    public static void main(String[] args) {
        Product products = new Product();
        products.milk("Umut", 60, "21/05/22");
        System.out.println("Name of milk manufacturer- " + products.name + " \nPrice of the product- " + products.price + " \nShelf life of the product- " + products.shelfLife);
    }
}
