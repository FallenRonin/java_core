package ru.mentee.power;

public class SmartCalculator {
    public static void main(String[] args) {

        // int + double автоматически приводит результат в double
        System.out.printf("Сложение: 213 + 111.5 = %.2f - double\n", 213 + 115.5);
        // int - int оставляют тип int
        System.out.printf("Вычитание: 99 - 9 = %d - int\n", 99 - 9);
        // int * double автоматически приводит результат в double
        System.out.printf("Умножение: 12 * 2.5 = %.2f - double\n", 12 * 2.5);
        // int / int оставляет тип int и отбрасывает остаток, но мы его сохраняем с помощью кастинга
        System.out.printf("Деление: 100 / 11 = %.2f - double\n", (double) 100 / 11);
        // int / int оставляет тип int, остаток отброшен
        System.out.printf("Деление целочисленное: 75 / 15 = %d - int\n", 75 / 15);
        // int % int возвращает нам только остаток от деления
        System.out.printf("Остаток от деления: 80 / 15 = %d - int\n", 80 % 15);
        // Метод возведения в степень принимает и возвращает только тип double
        System.out.printf("Возведение в степень: 11 ^ 5  = %.3f\n", Math.pow(11, 5));
        System.out.println("Обработка особых случаев:");
        // Выводим результат деления переменной типа double на 0
        System.out.println("Попытка деления на ноль (для double): " + 2.0 / 0);
        // Пытаемся поделить на ноль, ловим исключение и выводим его сообщение
        try {
            int a = 2 / 0;
        } catch (Exception e) {
            System.out.println("Попытка деления на ноль (для int): " + e.getMessage());
        }


    }
}
