package com.emurugova;

import java.util.HashSet;
import java.util.Set;

public class HomeHarvestSet {

    private static Integer gardenBed = 7;
    public static void main(String[] args) {
        Set<String> harvest = new HashSet<>(gardenBed);
        System.out.println("Под урожай мы вскопали грядки - " + gardenBed + " шт.");
        harvest.add("картошка");
        harvest.add("морковь");
        harvest.add("огурцы");
        harvest.add("помидоры");
        harvest.add("кабачок");
        harvest.add("капуста");
        harvest.add("картошка");
        System.out.println("Мы посадили несколько овощей: " + harvest);
        System.out.println("Под вторую грядку картошки семян не хватило, поэтому ");
        System.out.println("всего грядок получилось " + harvest.size() + " шт.");
        System.out.println();
    }
}
