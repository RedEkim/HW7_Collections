package guru.qa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Refridgerator {
    public final boolean biCameral; // двухкамерный
    public final boolean freezer; // морозильная камера
    public int capacity; // вместимость
    String[] products; // продукты
    Map<String, Refridgerator> weightOfProducts = new HashMap<>();

    public Refridgerator(boolean biCameral, boolean freezer, int capacity) {
        this.biCameral = biCameral;
        this.freezer = freezer;
        this.capacity = capacity;
        this.products = new String[capacity];
    }

    @Override
    public String toString() {
        return "Refridgerator{" +
                "isBicameral: " + biCameral +
                ", isFreezer: " + freezer +
                ", capacity: " + capacity +
                "}";
    }

    // распечатать содержимое холодильника
    public void printProducts() {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    // добавить продукт в холодильник
    public void addProduct(String value) {
        for (int i = 0; i < products.length; i++) {
            if (products != null && i == capacity - 1) {
                System.out.println("Холодильник полон");
            }
            if (products[i] == null) {
                products[i] = value;
                break;
            }
        }
    }

    // удалить продукт из холодильника
    public void deleteProduct(String value) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(value)) {
                System.out.println("Удаление продукта "+ products[i]);
                products[i] = null;
            }
        }
    }

    // найти продукт в холодильнике
    public void searchProduct(String value) {
        int done = 0;
        for (int i = 0; i < products.length; i++) {
            if(products[i] != null) {
                if (products[i].equals(value)) {
                    System.out.println("i = " + i + ": " + products[i]);
                    done = 1;
                    break;
                }
            }
        }
        if (done == 0) {
            System.out.println("Продукт не найден");
        }
    }
}
