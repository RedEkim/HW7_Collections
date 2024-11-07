package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class Car {
    public Map<String, String> carPassport;
    public Car() {
        carPassport = new HashMap<String, String>();
    }

    // посмотреть данные по машине
    public void printCarData() {
        for (Map.Entry<String, String> carPassport : carPassport.entrySet()) {
            System.out.println(carPassport.getKey() + carPassport.getValue());
        }
    }

    // добавить данные по машине
    public void addData(String key, String value) {
        carPassport.put(key, value);
    }
}
