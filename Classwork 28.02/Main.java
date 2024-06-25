package Hashset;
import  java.util.*;
public class Main {
    public static void main(String[] args) {
        /*Set<String> names = new LinkedHashSet<>();
        names.add("Georgi");
        names.add("Ivan");
        names.add("Stoyan");
        names.add("Dragan");
        names.add("Georgi");
        names.forEach(e->System.out.println(e));*/


        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Georgi");
        names.add("Dragan");
        names.add("Ivan");

        System.out.println(names.get(2));


        Map<String,Double> grades = new LinkedHashMap<>();
        grades.put("Ivan",5.50);
        grades.put("Ivan",6.00);
        grades.put("Georgi",5.50);
        grades.put("Stoyan",5.00);
        grades.put("Dragan",5.00);

        System.out.println(grades.get("Georgi"));

        Set<String> keys =  grades.keySet();
        for(String key:keys)
        {
            System.out.println(key+ " - " + grades.get(key));
        }
        Collection<Double>values = grades.values();
        for(Double value:values)
        {
            System.out.println(value);
        }
    }
}
