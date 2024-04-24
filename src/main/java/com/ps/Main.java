package com.ps;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;




public class Main {
    public static void main(String[] args) {

        ArrayList<Book> libraryInventory = new ArrayList<>();

        // // Insert data Application
            Book book1 = new Book("1-111-111-1", "Title One");
            Book book2 = new Book("1-111-111-1", "Title One");
            Book book3 = new Book("1-111-111-1", "Title One");

            libraryInventory.add(book1);
            libraryInventory.add(book2);
            libraryInventory.add(book3);

            // Insert data via Scanner
            Scanner scanner  = new Scanner(System.in);
            System.out.println("PLease enter details for the fourth book");

            System.out.println("ISBN: ");
            String isbn = scanner.nextLine();

            System.out.println("Title: ");
            String title = scanner.nextLine();

            Book book4 = new Book(isbn, title);
            libraryInventory.add(book4);

        // Insert data via a file

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("books.txt"));
            String input;

            while ((input = bufReader.readLine()) != null) {
                String[] split
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}