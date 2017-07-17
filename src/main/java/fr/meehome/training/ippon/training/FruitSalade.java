package fr.meehome.training.ippon.training;

import java.util.*;

public class FruitSalade {

    public static final int MAX_FRUITS_IN_SALAD = 3;
    public static final int MIN_FRUITS_IN_SALAD = 2;

    public enum Fruit {
        BANANA, APRICOT, ORANGE, APPLE, PEAR
    }

    public int fruitSalad(EnumMap<Fruit, Integer> fruits) {
        return mixFruits(keepFruitsWithStock(fruits), 0);
    }

    private int mixFruits(EnumMap<Fruit, Integer> fruits, int nbSalad) {

        if (fruits.size() >= MIN_FRUITS_IN_SALAD) {

            List<Fruit> fruitsInSalad = new ArrayList<>();
            nbSalad = fillSalad(fruits, nbSalad, fruitsInSalad);

            EnumMap<Fruit, Integer> inStock = keepFruitsWithStock(fruits);
            if(inStock.size()> 0 && fruitsInSalad.size() < 3){
                fillSalad(fruits, nbSalad, fruitsInSalad);
            }

            return mixFruits(inStock, nbSalad);
        }

        return nbSalad;
    }

    private int fillSalad(EnumMap<Fruit, Integer> fruits, int nbSalad, List<Fruit> fruitsInSalad) {
        for (Map.Entry<Fruit, Integer> entry : fruits.entrySet()) {
            if (!fruitsInSalad.contains(entry.getKey())) {

                fruitsInSalad.add(entry.getKey());
                entry.setValue(entry.getValue() - 1);

                // SI SALADE FAITE ON SORT ET ON RECOMMENCE
                if (fruitsInSalad.size() == MAX_FRUITS_IN_SALAD) {
                    nbSalad++;
                    break;
                }
            }
        }

        EnumMap<Fruit, Integer> inStock = keepFruitsWithStock(fruits);
        if(inStock.size()> 0 && fruitsInSalad.size() < 3){
            return fillSalad(fruits, nbSalad, fruitsInSalad);
        }

        return nbSalad;
    }

    private EnumMap<Fruit, Integer> keepFruitsWithStock(EnumMap<Fruit, Integer> fruits) {
        EnumMap<Fruit, Integer> fruitsEligible = new EnumMap<>(FruitSalade.Fruit.class);
        for (Map.Entry<Fruit, Integer> entry : fruits.entrySet()) {
            if (entry.getValue() > 0) {
                fruitsEligible.put(entry.getKey(), entry.getValue());
            }
        }
        return fruitsEligible;
    }

}
