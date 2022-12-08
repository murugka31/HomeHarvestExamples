package com.emurugova;

import java.util.HashSet;
import java.util.Set;

public class HomeHarvestSet {

    private static Integer gardenBed = 7;
    public static void main(String[] args) {
        Set<String> harvestSet = new HashSet<>(gardenBed);
        System.out.println("Под урожай мы вскопали грядки - " + gardenBed + " шт.");
        harvestSet.add("картошка");
        harvestSet.add("морковь");
        harvestSet.add("огурцы");
        harvestSet.add("помидоры");
        harvestSet.add("кабачок");
        harvestSet.add("капуста");
        harvestSet.add("картошка");
        System.out.println("Мы посадили несколько овощей: " + harvestSet);
        System.out.println("Под вторую грядку картошки семян не хватило, поэтому ");
        System.out.println("всего грядок получилось " + harvestSet.size() + " шт.");
        System.out.println();
    }
}
