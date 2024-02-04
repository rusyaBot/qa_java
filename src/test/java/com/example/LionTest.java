package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private Lion lion;
    private Feline feline;

    @Before
    public void setUp() throws Exception {
        feline = Mockito.mock(Feline.class);
        lion = new Lion("Самец", feline);
        lion.feline = feline;
    }

    @Test
    public void getKittensTrue() {
        Mockito.when(feline.getKittens()).thenReturn(5);
        assertEquals(5, lion.getKittens());
    }

    @Test
    public void getKittensFalse() {
        Mockito.when(feline.getKittens()).thenReturn(5);
        assertNotEquals(1, lion.getKittens());

    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Проверка списка кем питается хищник", expected, lion.getFood());
    }

    @Test(expected = Exception.class)
    public void doesHaveManeException() throws Exception {
        Lion lion = new Lion("Недопустимое значение", new Feline());
    }


}