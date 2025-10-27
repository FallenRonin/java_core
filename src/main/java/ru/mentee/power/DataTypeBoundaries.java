package ru.mentee.power;

public class DataTypeBoundaries {
    public static void main(String[] args) {
        System.out.printf("Byte minimum = %d, Byte maximum = %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Short minimum = %d, Short maximum = %d\n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Integer minimum = %d, Integer maximum = %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Long minimum = %d, Long maximum = %d\n", Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("Float minimum = %f, Float maximum = %f\n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Double minimum = %f, Double maximum = %f\n", Double.MIN_VALUE, Double.MAX_VALUE);

        short testValue = Short.MAX_VALUE;
        System.out.printf("Short type overflow when adding 1 to max value -> %d + 1 = %d", testValue, (short) (testValue + 1) );
    }
}
