package ru.mentee.power;

public class TypePuzzle {
    public static void main(String[] args) {

        System.out.println("1) Сравнение двух строк с одинаковым содержанием:");
        System.out.println("Первую строку создаём написанием константы, вторую создаём как новый объект через new");
        String helloString1 = "hello";
        String helloString2 = new String("hello");
        System.out.printf("Содержание первой строки - %s\nСодержание второй строки - %s\n", helloString1, helloString2);
        System.out.println("Сравниваем строки через оператор '==' -> " + (helloString1 == helloString2));
        System.out.println("Решение - использовать метод equals(), который сравнивает содержание, а не ссылки");

        System.out.println("2) Автоматическая конвертация чисел в строку при конкатенации:");
        System.out.println("Если мы хотим сложить два числа в формате 2 + 2 и присоединить их к строке, то получим неожиданный результат");
        System.out.println("Сумма 2 + 2 = " + 2 + 2);
        System.out.println("В данном случае, сложения не произошло, а каждое число просто сконкатенировалось со строкой по отдельности");
        System.out.println("Исправляется данная ошибка с помощью вынесения арифметических операций в скобки");
        System.out.println("Сумма (2 + 2) = " + (2 + 2));

    }
}
