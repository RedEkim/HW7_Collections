package guru.qa;

public class Refridgerator {
    public final boolean biCameral; // двухкамерный
    public final boolean freezer; // морозильная камера
    public int capacity; // вместимость
    String[] products; // продукты

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


}
