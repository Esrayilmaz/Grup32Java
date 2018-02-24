package com.temelt.grup32java.ders7;

import java.util.ArrayList;
import java.util.List;

public class Listeler {

    public void listeOrnegi(){

        List<Integer> list=new ArrayList();

        list.add(45);

        list.add(55);

        System.out.println(list.size());
        System.out.println(list.contains(55));
        System.out.println(list.get(1));
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.size());
        list.add(25);
        list.add(75);
        System.out.println(list.remove(0));
        System.out.println(list.size());
        System.out.println(list.set(0,100));
        System.out.println(list.indexOf(100));


    }
}
