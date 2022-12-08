package com.emurugova;

import java.util.Map;
import java.util.TreeMap;

public class HomeHarvestMap {

    private static Integer badGround;
    public static void main(String[] args) {
        Map<Integer, String> harvest = new TreeMap <>();
        harvest.put(2, "картошка");
        harvest.put(4, "морковь");
        harvest.put(5, "огурцы");
        harvest.put(3, "помидоры");
        harvest.put(1, "капуста");
        harvest.put(6, "кабачок");
        System.out.println("Посадили мы урожай в несколько грядок: ");
        for (Map.Entry<Integer, String> entry : harvest.entrySet()) {
            System.out.println(entry.getKey()+"я грядка это " + entry.getValue() + ".");
        }
        System.out.println();

        badGround = 6;
        System.out.println("На " + badGround + " грядке оказалась плохая земля, не прижилось. Поставили беседку на это место.");
        harvest.remove(badGround);
        System.out.println("Снисли пристрой, новое место для посадок.");
        harvest.put(8, "груши");
        harvest.put(7, "яблоки");
        System.out.println("Теперь у нас грядок " + harvest.size()
                           + " шт. Дополнительно посадили " + harvest.get(8) + " и " + harvest.get(7) + ".");
        System.out.println();
        System.out.println("Оcенью собрали урожай, а зимой на столе у нас были: " + harvest.values());
    }
}
