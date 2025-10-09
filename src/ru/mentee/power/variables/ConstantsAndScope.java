package ru.mentee.power.variables;

public class ConstantsAndScope {

    static final int CLASS_VARIABLE = 15;

    public static void main(String[] args) {
       int mainVariableInt = 5;
       final int MAIN_VARIABLE = 10;

        {
            int codeVariableInt = 22;
            String codeVariableString = "Test word";
        }

        System.out.println(CLASS_VARIABLE); // Переменная класса - её видим
        System.out.println(MAIN_VARIABLE); // Тоже
        System.out.println(mainVariableInt); // Переменная метода в котором мы находимся - тоже работает
        // System.out.println(codeVariableInt); - переменная блока кода, из которого уже вышли - не сработает
        // System.out.println(methodInt); - тоже не сработает, данная переменная есть только внутри метода

    }

    public static void someMethod() {
        int methodInt = 333;
    }
}
