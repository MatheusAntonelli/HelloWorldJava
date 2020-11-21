/*

 */
package SingleCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Adonis");
        list.add("John Doe");
        list.add("Maria Johnson");
        list.add("James Belford");
        list.add("Killer Bee");
        list.add("Adriano");

        list.add(2,"Hannah Thompson");

        System.out.println(list.size());

        for(String x: list){
            System.out.println(x);
        }
        System.out.println("--------------------");

       list.removeIf(x -> x.charAt(0) == 'M');

       for (String x:list){
           System.out.println(x);
       }
        System.out.println("--------------------");
        System.out.println("Index of James: " + list.indexOf("James"));
        System.out.println("Index of Killer" + list.indexOf("Killer"));

        List<String> result = list.stream().filter(x-> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println("--------------------");
        for (String x:result){
            System.out.println(x);
        }
        System.out.println("--------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);


    }
}
