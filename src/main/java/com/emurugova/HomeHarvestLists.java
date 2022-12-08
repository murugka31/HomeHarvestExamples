package com.emurugova;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeHarvestLists {

    public static void main(String[] args) {
        System.out.println("Посадили мы урожай.");
        List<String> harvestList = new ArrayList<>();
        harvestList.add("картошка");
        harvestList.add("морковь");
        harvestList.add("огурцы");
        harvestList.add("помидоры");
        harvestList.add("кабачок");
        harvestList.add("капуста");

        Iterator<String> iterator = harvestList.iterator();
        while (iterator.hasNext()) {
           String harvestElement = iterator.next();
            System.out.println("Теперь у нас есть грядка: " + harvestElement + ".");
        }
        System.out.println("Всего грядок получилось " + harvestList.size() + " шт.");
        System.out.println();

        System.out.println("Потом решили добавить еще 1 грядку картошки");
        harvestList.add(1,"картошка");
        System.out.println("Теперь грядок " + harvestList.size() + " шт.");
        System.out.println();

        System.out.println("Прошло время. Так получилось, что " + harvestList.get(5) + " и " + harvestList.get(6) + " не прижились. Пришлось их убирать.");
        harvestList.remove(5);
        harvestList.remove(6-1);
        System.out.println();

       System.out.println("Осенью собирали наш урожай по грядкам:");
        Iterator<String> iterator2 = harvestList.iterator();
        while (iterator2.hasNext()) {
            String harvestElement = iterator2.next();
            System.out.println("Собрали: " + harvestElement + ".");
        }
        System.out.println();
    }
}
