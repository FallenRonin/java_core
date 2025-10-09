package ru.mentee.power.datatypes;

public class DataTypesExample {
    public static void main(String[] args) {
        int intNum = 1500;
        short shortNum = 55;
        double doubleNum = 3.3;
        String word = "Hello";
        String stringNumber = "269";
        int[] intArray = new int[]{1, 3, 6, 221};
        String[] stringArray = new String[]{"Map", "Stem", "Lamp"};

        // Преобразуем неявно int в double через деление
        System.out.println("int " + intNum + " / double " + doubleNum + " = double " + (intNum + doubleNum));
        // Преобразуем в int явно через кастинг типа
        System.out.println("short " + shortNum + " / double " + doubleNum + " -> int " + (int) (intNum + doubleNum));
        // Преобразуем String в int через метод класса String
        System.out.println("string " + stringNumber + " into int type -> " + Integer.parseInt(stringNumber));
    }
}
