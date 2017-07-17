package fr.meehome.training.ippon.training;

import org.junit.Assert;
import org.junit.Test;

import java.util.EnumMap;

public class FruitSaladeTest {

    @Test
    public void fruitSalad_should_do(){
        FruitSalade fruitSalade = new FruitSalade();
        Assert.assertEquals(2, fruitSalade.fruitSalad(buildEnum(1, 1, 0, 4, 2)));
    }

    private static EnumMap<FruitSalade.Fruit, Integer> buildEnum(int banana, int abricot, int orange, int apple, int pear) {
        EnumMap<FruitSalade.Fruit, Integer> fruits = new EnumMap<>(FruitSalade.Fruit.class);
        fruits.put(FruitSalade.Fruit.BANANA, banana);
        fruits.put(FruitSalade.Fruit.APRICOT, abricot);
        fruits.put(FruitSalade.Fruit.ORANGE, orange);
        fruits.put(FruitSalade.Fruit.APPLE, apple);
        fruits.put(FruitSalade.Fruit.PEAR, pear);
        return fruits;
    }


}