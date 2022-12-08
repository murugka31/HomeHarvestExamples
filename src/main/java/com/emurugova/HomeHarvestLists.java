package com.emurugova;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeHarvestLists {

    public static void main(String[] args) {
        System.out.println("Посадили мы урожай.");
        List<String> harvest = new ArrayList<>();
        harvest.add("картошка");
        harvest.add("морковь");
        harvest.add("огурцы");
        harvest.add("помидоры");
        harvest.add("кабачок");
        harvest.add("капуста");

        Iterator<String> iterator = harvest.iterator();
        while (iterator.hasNext()) {
           String harvestElement = iterator.next();
            System.out.println("Теперь у нас есть грядка: " + harvestElement + ".");
        }
        System.out.println("Всего грядок получилось " + harvest.size() + " шт.");
        System.out.println();

        System.out.println("Потом решили добавить еще 1 грядку картошки");
        harvest.add(1,"картошка");
        System.out.println("Теперь грядок " + harvest.size() + " шт.");
        System.out.println();

        System.out.println("Прошло время. Так получилось, что " + harvest.get(5) + " и " + harvest.get(6) + " не прижились. Пришлось их убирать.");
        harvest.remove(5);
        harvest.remove(6-1);
        System.out.println();

       System.out.println("Осенью собирали наш урожай по грядкам:");
        Iterator<String> iterator2 = harvest.iterator();
        while (iterator2.hasNext()) {
            String harvestElement = iterator2.next();
            System.out.println("Собрали: " + harvestElement + ".");
        }
        System.out.println();
    }
}
