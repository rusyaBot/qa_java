package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    Lion lion = new Lion("Самец");
    @Mock
    Feline feline;

    public LionTest() throws Exception {
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getKittens() {
        assertEquals("Проверка на количество", 1, lion.getKittens());
        assertNotEquals("Негативная Проверка на количество", 2, lion.getKittens());

    }

    @Test
    public void getFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Проверка списка кем питается хищник", expected, lion.getFood());
    }

    @Test
    public void doesHaveManeTest() {
        Exception exception = assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Котёнок");
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

}