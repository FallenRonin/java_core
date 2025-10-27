package ru.mentee.power.datatype;

public class Mentee {
    private String name;
    private String surname;
    private int age;
    private double avgGrade;
    private int level;

    public Mentee(String name, String surname, int age, double avgGrade, int level) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.avgGrade = avgGrade;
        this.level = level > 5 || level < 1 ? 1 : level;
    }

    public void displayInfo() {
        System.out.printf("Менти: %s %s\n Возраст: %d\n Средний балл: %f\n Уровень: %d\n"
                , this.name, this.surname, this.age, this.avgGrade, this.level);

    }

    public boolean isExcellent() {
        return avgGrade >= 4.5;
    }

    public boolean advanceToNextLevel() {
        if (level < 5) {
            level++;
            return true;
        }
        return false;
    }

    public int calculateScholarship() {
        if (avgGrade >= 4.5)
            return 2000;
        else if (avgGrade >= 4.0)
            return 1500;
        else return 1000;
    }

    // Геттеры и сеттеры для доступа к приватным полям
    public String getFirstName() {
        return name;
    }

    public String getLastName() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getAverageGrade() {
        return avgGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.avgGrade = averageGrade;
    }

    public int getLevel() {
        return level;
    }

}
