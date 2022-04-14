package lv.tsi.lamda;

import java.util.ArrayList;

public class exercice4 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        // we creat an array list
        list.add("a1");
        list.add("c3");
        list.add("a2");
        list.add("a3");
        list.add("b3");
        list.add("b2");
        list.add("c1");
        list.add("c2");
        list.add("b1");


        list.stream()
                .filter(item -> item.substring(0,1).matches("c"))
                .map(item -> item.toUpperCase())
                .sorted()
                .forEach(System.out::println);

    }



}
