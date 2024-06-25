/*package Noname;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Gosho");
        names.add("Tosho");
        names.add("Ivan");
        for(String name: names){
            System.out.println(name);
        }
        names.forEach(e -> System.out.println(e));

        CustomList<String> customNames = new CustomList<>();
        customNames.add("Ivan");
        customNames.add("Gosho");
        customNames.add("Tosho");
        customNames.add("Patkan");

        for(String name: customNames){
            System.out.println(name);
        }

        customNames.forEach(e -> System.out.println(e));

        //testVarargs("dasdad", "sadadasda", "sadsadsa");
    }

    /*public static void testVarargs(String... text) {
        for(String t : text){
            System.out.println(t + " ");
        }
        System.out.println();
    }
}*/