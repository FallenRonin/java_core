package ru.mentee.power.variables;

public class TypeCalculator {
    public static void main(String[] args) {
        byte byteNum = 125;
        short shortNum = 250;
        int intNum = Integer.MAX_VALUE;
        int intNum2 = 3;
        long longNum = 1234567L;
        float floatNum = 123.4f;
        double doubleNum = 12.5;

        System.out.println("byte " + byteNum + " + " + "short " + shortNum + " = int " + (byteNum + shortNum));
        System.out.println("int " + intNum + " * " + "long " + longNum + " = long " + (intNum * longNum));
        System.out.println("float " + floatNum + " / " + "double " + doubleNum + " = double " + (floatNum / doubleNum));
        System.out.println("int " + intNum + " / " + "int " + intNum2 + " = int " + (intNum / intNum2));
        System.out.println("double " + doubleNum + " / " + "int " + intNum2 + " = double " + (doubleNum / intNum2));
    }
}