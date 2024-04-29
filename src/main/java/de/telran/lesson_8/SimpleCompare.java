package de.telran.lesson_8;

import java.util.*;

public class SimpleCompare {
    public static void main(String[] args) {
        TreeSet<Integer> set= new TreeSet<>();

        Auto audi = new Auto("AK2403DD", "Audi", 2010);
        Auto volvo = new Auto("AB2403OO", "Volvo", 2018);
        Auto toyota = new Auto("BK2453DD", "Toyota", 2020);
        Auto volga = new Auto("AL2403II", "Volga", 2000);

        TreeSet<Auto> setAuto = new TreeSet<>();
        setAuto.add(audi);
        setAuto.add(volvo);
        setAuto.add(toyota);
        setAuto.add(volga);


        Comparator<Auto> comparator2 = new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o1.getManufactureYear() - o2.getManufactureYear();
            }
        };
        TreeSet<Auto> setAutoReverse = new TreeSet<>(comparator2);
        setAutoReverse.addAll(setAuto);
        System.out.println(setAutoReverse);

        TreeSet<Auto> setAutoNatural = new TreeSet<>(setAuto);
        System.out.println(setAutoNatural);


        Set<Auto> sets =new HashSet<>();
        sets.addAll(setAuto);
        System.out.println(sets);

       setAutoNatural = new TreeSet<>(sets);
        System.out.println(setAutoNatural);

        Set<Auto> setsLinked = new LinkedHashSet<>();
        setsLinked.add(audi);
        setsLinked.add(toyota);
        setsLinked.add(volvo);
        setsLinked.add(volga);
        System.out.println("---------");
        System.out.println(setsLinked);

    }



}
