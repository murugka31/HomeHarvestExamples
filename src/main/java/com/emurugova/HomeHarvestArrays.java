package com.emurugova;

import java.util.Arrays;

public class HomeHarvestArrays {

    public static void main(String[] args) {
        String[] previousHarvest = {"петрушка", "укроп", "базилик"};
        System.out.println("В прошлом году мы сажали зелень.");
        for (String element : previousHarvest) {
            System.out.println("У нас была грядка: " + element + ".");
        }
        System.out.println();

        String[] presentHarvest = new String[5];
        System.out.println("В этом году мы решили посадить овощи. У нас 5 грядок.");
        presentHarvest[0] = "картошка";
        presentHarvest[1] = "морковь";
        presentHarvest[2] = "огурцы";
        presentHarvest[3] = "капуста";
        presentHarvest[4] = "кабачок";
        for (int i = 0; i < presentHarvest.length; i++) {
            System.out.println("Теперь у нас есть грядка: " + presentHarvest[i] + ".");
        }
        System.out.println();

        String[] futureHarvest = new String[3];
        futureHarvest[0] = "яблоки";
        futureHarvest[1] = "груши";
        futureHarvest[2] = "абрикосы";
        System.out.println("В следующем году будем сажать фрукты. Пока не знаем, какие, наверное: " + Arrays.toString(futureHarvest) +".");
    }
}
