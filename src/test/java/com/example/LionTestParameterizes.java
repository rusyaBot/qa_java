package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTestParameterizes {
    private final String sex;
    private final boolean hasMane;

    public LionTestParameterizes(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(sex);
        try {
            assertEquals("Проверка пола животного", hasMane, lion.doesHaveMane());
        } catch (Exception e) {
        }
    }

}