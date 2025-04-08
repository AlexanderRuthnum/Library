/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author alexr
 */
public class Book {
    public String author;
    public String title;
    public int year;

    public Book() {
        this.author = "Unknown";
        this.title = "Unknown";
        this.year = 0000;
    }

    public Book(String author) {
        this.author = author;
        this.title = "Unknown";
        this.year = 0000;
    }
    
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.year = 0000;
    }
    
    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }
    
    public void displayInfo(){
    System.out.println("My Books: ");
    System.out.println("Author: "+author);
    System.out.println("Title: "+title);
    System.out.println("Year: "+year);
    System.out.println("------------------------------");
    }
    
    
}
