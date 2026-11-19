package com.dailytask.blc_elc.librarybookmanagement;

public class Library_ELC {
    static void main() {
        Book_BLC book1 = new Book_BLC();
        Book_BLC book2 = new Book_BLC();

        book1.setBookId(1);
        book1.setTitle("Encounters in the edges of the world");
        book1.setAuthor("Goutham");
        book1.setPrice(500.33);

        book2.setBookId(2);
        book2.setTitle("Project Hail Mary");
        book2.setAuthor("Ryan Gosling");
        book2.setPrice(799.99);

        System.out.println("Book ID: "+book1.getBookId());
        System.out.println("Book Title: "+book1.getTitle());
        System.out.println("Book Author: "+book1.getAuthor());
        System.out.println("Price: "+book1.getPrice());
        System.out.println("==================================================");
        System.out.println("Book ID: "+book2.getBookId());
        System.out.println("Book Title: "+book2.getTitle());
        System.out.println("Book Author: "+book2.getAuthor());
        System.out.println("Price: "+book2.getPrice());
    }
}
