package task2;

import task2.product.Milk;
import task2.product.Tea;

public class Main {
    //there's error, because Tea class has default modifier and we have access to the file inly on file level,
    // that's why I changed it to public
    //-----------------------------------------
    public static void main(String[] args) {
        Milk milk = new Milk();
        Tea tea = new Tea();
    }
}