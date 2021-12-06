package ru.mirea.prac2;

public class AuthorTest {

    public static void main(String[] args) {
        Author author1 = new Author("Name", "noname@protonmail.com", 'U');
        System.out.println(author1.toString());
        author1.setEmail("noname@protonmail.com");
        System.out.println(author1.toString());
    }
}
