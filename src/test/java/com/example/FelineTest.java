package com.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void getNutritionFeline() throws Exception {
        Feline feline = new Feline();
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = feline.getFood("Хищник");
        assertEquals(expectedEatMeat, actualEatMeat);
    }

    @Test
    public void getGenealogyFelineTest() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittenValueFelineTest() {
        Feline feline = new Feline();
        int expectedCount = 1;
        int actualCount = feline.getKittens();
        assertEquals(expectedCount, actualCount);
    }
}