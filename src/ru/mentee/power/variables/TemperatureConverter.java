package ru.mentee.power.variables;

public class TemperatureConverter {
    public static void main(String[] args) {

        final double kelvinAbsoluteZero = 0;

        double celsiumTemp = 36.6;
        double kelvinTemp = 320;
        double fahrenheitTemp = 50;

        System.out.println(celsiumTemp + " Цельсия в Фаренгейт = " + ((celsiumTemp * 9/5) + 32));
        System.out.println(fahrenheitTemp + " Фаренгейт в Цельсий = " + ((fahrenheitTemp - 32) * 5/9));
        System.out.println(celsiumTemp + " Цельсий в Кельвин = " + (celsiumTemp + 273.15));
        System.out.println(kelvinTemp + " Кельвин в Цельсий = " + (kelvinTemp - 273.15));


    }
}
