package ru.mentee.power;

public class DataTypesInAction {
    public static void main(String[] args) {
        int intNum1 = 29;
        int intNum2 = 5;
        int intNum3 = 74;
        short shortNum = 250;
        double doubleNum = 3.3;
        float floatNum = 4.5f;
        byte byteNum1 = 70;
        byte byteNum2 = 68;

        System.out.println("Целочисленное деление:");
        System.out.printf("%d / %d = %d\n", intNum1, intNum2, intNum1 / intNum2);
        System.out.println("Деление с плавающей точкой:");
        System.out.printf("%d / %f = %f\n", intNum1, doubleNum, intNum1 / doubleNum);
        System.out.println("Явное приведение типов:");
        System.out.printf("float %f к int %d - отбрасывание дробной части\n", floatNum, (int) floatNum);
        System.out.printf("int %d к char %c - конвертация в символ с таким же кодом\n", intNum3, (char) intNum3);
        System.out.printf("short %d к byte %d - сужение типа\n", shortNum, (byte) shortNum);
        System.out.println("Автоматическое повышение типа:");
        System.out.printf("byte + byte = int: %d + %d = %d\n", byteNum1, byteNum2, byteNum1 + byteNum2);
        System.out.printf("int + double = double: %d + %f = %f\n", intNum1, doubleNum, intNum1 + doubleNum);
        System.out.println("Операции с boolean:");
        System.out.printf("false && false = %b\n", false && false);
        System.out.printf("false && true = %b\n", false && true);
        System.out.printf("true || false = %b\n", true || false);
        System.out.println("Работа с символами:");
        System.out.printf("Код символа 'K' = %d\n", (int) 'K');
        System.out.printf("Символ кода 78 = %c\n", (char) 78);
        System.out.printf("'K' + 5 = %c\n", 'K' + 5);

    }
}
