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

    public Refridgerator(boolean biCameral, boolean freezer, int capacity, String products) {
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

    // печатает содержимое холодильника
    public void printProducts() {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

}
