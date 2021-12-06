package ru.mirea.lab4;

public class Main {

    public static void main(String[] args) {
        Nameable nameable = new Person("Александр", "Пушкин");
        System.out.println(nameable.getName());
        nameable = new Pet("учебник");
        System.out.println(nameable.getName());
    }
}
