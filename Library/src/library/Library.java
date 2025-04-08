/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library;

/**
 *
 * @author alexr
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book book1 = new Book();
        Book book2 = new Book("C.S. Lewis");
        Book book3 = new Book("J.K. Rowling","Harry Potter and the Chamber of Secrets");
        Book book4 = new Book("R. Riordan","Court of the Dead",2025);
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
        book4.displayInfo();
    }
    
}
