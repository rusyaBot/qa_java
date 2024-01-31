package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    Feline feline = new Feline();
    @Mock
    Animal animal;
    @Test
    public void eatMeat() throws Exception {
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));  // Создал стаб, который возвращает нужное значение для метода
        List<String> expected = List.of("Животные", "Птицы", "Рыба"); // создание и заполнение списка
        List<String> notExpected = List.of("Трава", "Различные растения"); // создание и заполнение списка
        assertEquals("Проверка кем питается хищник", expected, animal.getFood("Хищник"));
        assertNotEquals("Негативная Проверка кем питается хищник", notExpected, feline.getFood("Хищник"));
    }

    @Test
    public void getFamily() {
//        Mockito.when(feline.getFamily()).thenReturn("Кошачьи"); // Создал стаб, который возвращает нужное значение для метода
        assertEquals("Проверка на Кошачьи", "Кошачьи", feline.getFamily());
        assertNotEquals("Негативная Проверка на Кошачьи", "Медвежьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        assertEquals("Проверка на количество", 1, feline.getKittens());
        assertNotEquals("Негативная Проверка на количество", 2, feline.getKittens());
        assertEquals("Проверка на количество с передачей параметра", 5, feline.getKittens(5));
        assertNotEquals("Негативная Проверка на количество с передачей параметра", 5, feline.getKittens(8));
    }

}