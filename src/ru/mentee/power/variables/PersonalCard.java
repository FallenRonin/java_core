package ru.mentee.power.variables;

public class PersonalCard {
    /*

    Имя: Иван
Фамилия: Иванов
Возраст: 25 лет
Город: Москва
Рост: 180 см
Вес: 75.5 кг
Студент: true
Первая буква имени: И
     */
    public static void main(String[] args) {
        String name = "Alexandr";
        String surname = "Poltavets";
        String city = "Nizhniy Novgorod";
        int height = 187;
        int weight = 70;
        int age = 25;
        boolean isStudent = false;
        char firstNameChar = 'A';

        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Возраст: " + age);
        System.out.println("Город: " + city);
        System.out.println("Рост: " + height);
        System.out.println("Вес: " + weight);
        System.out.println("Студент: " + isStudent);
        System.out.println("Первая буква имени: " + firstNameChar);
    }
}
