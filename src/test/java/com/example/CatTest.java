package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CatTest {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void getSound() {
        assertEquals("Проверка на Мяу", "Мяу", cat.getSound());
        assertNotEquals("Негативная проверка на Мяу", "Гав", cat.getSound());
    }

    @Test
    public void getFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> notExpected = List.of("Трава", "Различные растения");
        assertEquals("Проверка списка кем питается хищник", expected, cat.getFood());
        assertNotEquals("Негативная проверка списка кем питается хищник", notExpected, cat.getFood());
    }


}
