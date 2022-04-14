package lv.tsi.lamda;

import java.util.ArrayList;

public class exercice2 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        //Instantiating an ArrayList object
        list.add("a1");
        list.add("c3");
        list.add("a2");
        list.add("a3");
        list.add("b3");
        list.add("b2");
        list.add("c1");
        list.add("c2");
        list.add("b1");


        for (int i = 0; i < list.size(); i++) {
            String newValue = list.get(i).toUpperCase();
            list.set(i, newValue);
        }

        System.out.println(list);


    }



}
