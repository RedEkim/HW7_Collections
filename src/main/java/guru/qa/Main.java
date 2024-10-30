package guru.qa;

import guru.qa.practic.Human;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Human misha = new Human(
                "Misha",
                30,
                true
        );

        List<String> stacks = new ArrayList<>();
        stacks.add("git");
        stacks.add("java");
        stacks.add("files");
        stacks.add("junit");

        Set<String> stacksSet = Set.of(// new HashSet<>();
            "git", "java", "files", "junit"
        );

        Map<String, Human> humans = new HashMap<>();
        humans.put("524343", misha);
        humans.put("624343", misha);
        humans.put("724343", misha);
        humans.put("824343", misha);
        humans.put("924343", misha);

        for (Map.Entry<String, Human> entry : humans.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

        for (String key : humans.keySet()) {

        }

        for (Human value : humans.values()) {

        }

        int  hours = 12;
        String hello = "Hello";

        misha.printSomeValues(
                hours,
                hello,
                stacks
        );
    }
}