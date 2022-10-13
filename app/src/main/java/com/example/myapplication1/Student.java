package com.example.myapplication1;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private String groupNumber;

public Student(String name, String groupNumber){
    this.name = name;
    this.groupNumber=groupNumber;
}
public String getName() {
    return name;
}
public String getGroupNumber() {
    return groupNumber;
}
private final static ArrayList<Student> students=new ArrayList<Student>(
        Arrays.asList(
                new Student("Єлизавета Рубан","301"),
                new Student("Маргарита Качан","301"),
                new Student("Іван Романов","302"),
                new Student("Роман Іванов","302"),
                new Student("Марія Качур","308"),
                new Student("Ілона Рясик","308"),
                new Student("Назар Гунько","309"),
                new Student("Микита Мартинюк","309")

        )
);
public static ArrayList<Student> getStudents(String groupNumber){
    ArrayList<Student> stList = new ArrayList<>();
    for (Student s: students){
        if (s.getGroupNumber().equals(groupNumber)){
            stList.add(s);
        }
    }
    return stList;
}
}