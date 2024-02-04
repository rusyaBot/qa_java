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
    public void eatMeatTrue() throws Exception {
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));  // Создал стаб, который возвращает нужное значение для метода
        List<String> expected = List.of("Животные", "Птицы", "Рыба"); // создание и заполнение списка
        assertEquals("Проверка кем питается хищник", expected, animal.getFood("Хищник"));
    }
    @Test
    public void eatMeatFalse() throws Exception {
        List<String> notExpected = List.of("Трава", "Различные растения"); // создание и заполнение списка
        assertNotEquals("Негативная Проверка кем питается хищник", notExpected, feline.getFood("Хищник"));
    }

    @Test
    public void getFamilyTrue() {
        assertEquals("Проверка на Кошачьи", "Кошачьи", feline.getFamily());
    }
    @Test
    public void getFamilyFalse() {
        assertNotEquals("Негативная Проверка на Кошачьи", "Медвежьи", feline.getFamily());
    }

    @Test
    public void getKittensTrue() {
        Feline feline = new Feline();
        assertEquals("Проверка на количество", 1, feline.getKittens());
        assertEquals("Проверка на количество с передачей параметра", 5, feline.getKittens(5));
    }
    @Test
    public void getKittensFalse() {
        Feline feline = new Feline();
        assertNotEquals("Негативная Проверка на количество", 2, feline.getKittens());
        assertNotEquals("Негативная Проверка на количество с передачей параметра", 5, feline.getKittens(8));
    }

}