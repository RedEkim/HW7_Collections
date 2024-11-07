package guru.qa;

import guru.qa.practic.Human;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Human misha = new Human(
//                "Misha",
//                30,
//                true
//        );
//
//        List<String> stacks = new ArrayList<>();
//        stacks.add("git");
//        stacks.add("java");
//        stacks.add("files");
//        stacks.add("junit");
//
//        Set<String> stacksSet = Set.of(// new HashSet<>();
//            "git", "java", "files", "junit"
//        );
//
//        Map<String, Human> humans = new HashMap<>();
//        humans.put("524343", misha);
//        humans.put("624343", misha);
//        humans.put("724343", misha);
//        humans.put("824343", misha);
//        humans.put("924343", misha);
//
//        for (Map.Entry<String, Human> entry : humans.entrySet()) {
//            entry.getKey();
//            entry.getValue();
//        }
//
//        for (String key : humans.keySet()) {
//
//        }
//
//        for (Human value : humans.values()) {
//
//        }
//
//        int  hours = 12;
//        String hello = "Hello";
//
//        misha.printSomeValues(
//                hours,
//                hello,
//                stacks
//        );
//        List<String> listTest = new ArrayList<>();
//        listTest.add("one");
//        listTest.add("two");
//        listTest.add("three");
//
//        System.out.println(listTest);

        // We have interface with name Collection
        // Collection include three type
        // One - List
        // Two - Set
        // Three - Queue
//
//        // List
//        List<Integer> numList = List.of(1, 2, 3);
//        System.out.println("List of: " + numList);
//
//        List<Integer> numListArray = new ArrayList<>();
//        numListArray.add(1);
//        numListArray.add(2);
//        numListArray.add(3);
//        System.out.println("ArrayList: " + numListArray);
//
//        // Set
//        Set<String> setUnique = new HashSet<>();
//        setUnique.add("one");
//        setUnique.add("two");
//        setUnique.add("three");
//
//        Set<String> setUnique2 = new HashSet<>();
//        setUnique.add("one");
//        setUnique.add("two");
//        setUnique.add("three");
//
//        System.out.println("Set: " + setUnique);
//
//        // Queue
//        Queue<String> queueOne = new ArrayDeque<>();
//        queueOne.add("first");
//
//        System.out.println(queueOne);
//
//        Deque<Integer> queueTwo = new ArrayDeque<>();


        Refridgerator homesFridge = new Refridgerator(true,true, 5);

        System.out.println(homesFridge.toString());
        homesFridge.printProducts();
        homesFridge.addProduct("milk");
        homesFridge.addProduct("meat");
        homesFridge.addProduct("apples");
        homesFridge.addProduct("water");
        homesFridge.addProduct("eggs");
//        homesFridge.addProduct("oranges");
        homesFridge.printProducts();

        homesFridge.deleteProduct("milk");

        homesFridge.printProducts();

        homesFridge.searchProduct("eggs");

        Car lacetti = new Car();
        lacetti.addData("Марка: ", "Chevrolet");
        lacetti.printCarData();
    }
}