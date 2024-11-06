package guru.qa;

import java.util.ArrayList;
import java.util.List;

public class TypeOfCollections {
    // We have interface with name Collection
    // Collection include three type
    // One - List
    // Two - Set
    // Three - Queue

    // List
    List<Integer> numList = List.of(1, 2, 3);



    public static void addNewItemInCollection(List<String> stack, String value) {
        stack.add(value);
    }

}
