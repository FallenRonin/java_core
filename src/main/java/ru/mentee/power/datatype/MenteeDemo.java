package ru.mentee.power.datatype;

import java.util.ArrayList;
import java.util.List;

public class MenteeDemo {
    public static void main(String[] args) {
        List<Mentee> menteeList = new ArrayList<>();

        menteeList.add( new Mentee("Alexandr", "Poltavets", 25, 4.7, 1));
        menteeList.add(new Mentee("Ivan", "Ivanov", 23, 3.5, 2));
        menteeList.add( new Mentee("Sveta", "Igoreva", 27, 4.1, 3));

        for (Mentee mentee : menteeList){
            mentee.displayInfo();
            System.out.printf("%s является отличником? %b\n", mentee.getFirstName(), mentee.isExcellent());
            mentee.advanceToNextLevel();
        }


    }
}
