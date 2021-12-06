package ru.mirea.lab2;

public class BookTest {
    public static void main(String[] args) {
        Book emptyBook = new Book();
        System.out.println("Empty book: " + emptyBook.toString()); // Explicit toString() can be omitted

        Book second = new Book("Some cool name", "Best author", 1888, "Nonfiction");
        System.out.println("The coolest book ever: " + second);
    }
}
