package com.emurugova;

import java.util.Map;
import java.util.TreeMap;

public class HomeHarvestMap {

    private static Integer badGround;
    public static void main(String[] args) {
        Map<Integer, String> harvestMap = new TreeMap <>();
        harvestMap.put(2, "картошка");
        harvestMap.put(4, "морковь");
        harvestMap.put(5, "огурцы");
        harvestMap.put(3, "помидоры");
        harvestMap.put(1, "капуста");
        harvestMap.put(6, "кабачок");
        System.out.println("Посадили мы урожай в несколько грядок: ");
        for (Map.Entry<Integer, String> entry : harvestMap.entrySet()) {
            System.out.println(entry.getKey()+"я грядка это " + entry.getValue() + ".");
        }
        System.out.println();

        badGround = 6;
        System.out.println("На " + badGround + " грядке оказалась плохая земля, не прижилось. Поставили беседку на это место.");
        harvestMap.remove(badGround);
        System.out.println("Снесли пристрой, новое место для посадок.");
        harvestMap.put(8, "груши");
        harvestMap.put(7, "яблоки");
        System.out.println("Теперь у нас грядок " + harvestMap.size()
                           + " шт. Дополнительно посадили " + harvestMap.get(8) + " и " + harvestMap.get(7) + ".");
        System.out.println();
        System.out.println("Оcенью собрали урожай, а зимой на столе у нас были: " + harvestMap.values());
    }
}
