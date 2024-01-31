package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CatTest {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void getSoundTrue() {
        assertEquals("Проверка на Мяу", "Мяу", cat.getSound());
    }

    @Test
    public void getSoundFalse() {
        assertNotEquals("Негативная проверка на Мяу", "Гав", cat.getSound());
    }

    @Test
    public void getFoodTrue() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Проверка списка кем питается хищник", expected, cat.getFood());
    }

    @Test
    public void getFoodFalse() throws Exception {
        List<String> notExpected = List.of("Трава", "Различные растения");
        assertNotEquals("Негативная проверка списка кем питается хищник", notExpected, cat.getFood());
    }


}
