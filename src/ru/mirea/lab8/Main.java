package ru.mirea.lab8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("C:\\Users\\Alex\\IdeaProjects\\labs\\src\\ru\\mirea\\lab8\\test.txt", false))
        {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            writer.write(str);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
