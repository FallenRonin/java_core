package ru.mentee.power.variables;

public class StringOperations {
    public static void main(String[] args) {
        int number = 33;
        String stringNumber = "33";
        String sentence = "A cat sat on the map";
        String word = "A bowl";
        char letterA = 'A';

        System.out.println("Конкатенация: " + word + " + " +  letterA + " = " + word + letterA);
        System.out.println("Символ в строку: " + letterA + " -> " + letterA + "");
        System.out.println("Число в строку: " + number + " -> " + number + "");
        System.out.println("Строку в число: " + stringNumber + " -> " + Integer.parseInt(stringNumber));
        System.out.println("Символ из строки " + word + ": " + "индекс 5 ->" + word.charAt(5));

    }
}
