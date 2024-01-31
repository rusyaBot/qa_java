//package com.example;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import static org.junit.Assert.*;
//
//@RunWith(Parameterized.class)
//public class LionTestParameterizes {
//    private final String sex;
//    private final boolean hasMane;
//    private final boolean hasException;
//
//
//    public LionTestParameterizes(String sex, boolean hasMane, boolean hasException) {
//        this.sex = sex;
//        this.hasMane = hasMane;
//        this.hasException = hasException;
//    }
//
//    @Parameterized.Parameters
//    public static Object[][] getSex() {
//        return new Object[][]{
//                {"Самец", true, false},
//                {"Самка", false, false},
//                {"Недопустимый пол", false, true},
//        };
//    }
//    @Test
//    public void doesHaveMane1() throws Exception {
//        if (hasException) {
//            assertThrows(Exception.class, () -> new Lion(sex));
//        } else {
//            Lion lion = new Lion(sex);
//            assertEquals("Проверка пола животного", hasMane, lion.doesHaveMane());
//        }
//    }
//
//    @Test
//    public void doesHaveMane2() throws Exception {
//        if (hasException) {
//            Exception exception = assertThrows(Exception.class, () -> new Lion(sex));
//            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
//        } else {
//            Lion lion = new Lion(sex);
//            assertEquals("Проверка пола животного", hasMane, lion.doesHaveMane());
//        }
//    }
//    @Test
//    public void doesHaveMane3() {
//        try {
//            Lion lion = new Lion(sex);
//            assertEquals(hasMane, lion.doesHaveMane());
//        } catch (Exception e) {
//            assertEquals(hasException, true);
//        }
//    }
//
//
//}